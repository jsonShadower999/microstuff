package com.quizservice.quizservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quizservice.quizservice.dto.QuestionDTO;
import com.quizservice.quizservice.entity.Question;
import com.quizservice.quizservice.entity.Quiz;
import com.quizservice.quizservice.repository.QuizRepository;
import com.quizservice.quizservice.service.QuestionClient;
import com.quizservice.quizservice.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;
    
    private QuestionClient questionClient;


    public QuizServiceImpl(QuizRepository quizRepository,QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient=questionClient;
       
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }
    @Override
    public List<Quiz> get() {
        List<Quiz> quizzes = quizRepository.findAll();

        List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
            // Use DTO returned from Feign client
            List<QuestionDTO> externalQuestions = questionClient.getQuestionOfQuiz(quiz.getId());

            // Map external DTO to internal entity
            List<Question> internalQuestions = externalQuestions.stream().map(eq -> {
                Question q = new Question();
                q.setQuesId(eq.getQuesId());
                q.setQuestion(eq.getQuestion());
                q.setQuizId(quiz.getId()); // associate with current quiz
                return q;
            }).collect(Collectors.toList());

            quiz.setQuestions(internalQuestions);
            return quiz;
        }).collect(Collectors.toList());

        return newQuizList;
    }

  

   

    //@Override
//    public List<Quiz> get() {
//        List<Quiz> quizzes = quizRepository.findAll();
//
//        List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
//            quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
//            return quiz;
//        }).collect(Collectors.toList());
//
//        return newQuizList;
//    }


    @Override
    public Quiz get(Long id) {

        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
//        quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
        return quiz;
    }
}