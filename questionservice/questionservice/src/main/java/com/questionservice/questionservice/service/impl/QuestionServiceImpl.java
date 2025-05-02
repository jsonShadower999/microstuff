//package com.questionservice.questionservice.service.impl;
//
//public class QuestionServiceImpl {
//
//}
package com.questionservice.questionservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.questionservice.questionservice.entity.Question;
import com.questionservice.questionservice.repository.QuestionRepository;
import com.questionservice.questionservice.service.QuestionService;
@Service
public class QuestionServiceImpl implements QuestionService{
	 private QuestionRepository questionRepository;
	 public QuestionServiceImpl(QuestionRepository questionRepository) {
	        this.questionRepository = questionRepository;
	    }

	@Override
	public Question createQues(Question question) {
		
		return questionRepository.save(question);
		
		
		
	}

	@Override
	public List<Question> getQuestions() {
		return  questionRepository.findAll();
		
	}

	@Override
	public Optional<Question> getQuestionById(Long id) {
		return questionRepository.findById(id);
		
	}

	@Override
	public List<Question> getQuestionOfQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuizId(quizId);
	}
	
	
	

}
