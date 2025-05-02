package com.questionservice.questionservice.service;

import java.util.List;
import java.util.Optional;

import com.questionservice.questionservice.entity.Question;

public interface QuestionService {
	Question createQues(Question question);
	List<Question> getQuestions();
	Optional<Question> getQuestionById(Long id);
	List<Question> getQuestionOfQuiz(Long quizId);

}
