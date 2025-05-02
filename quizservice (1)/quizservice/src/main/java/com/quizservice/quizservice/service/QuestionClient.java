package com.quizservice.quizservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.questionservice.questionservice.entity.Question;
import com.quizservice.quizservice.dto.QuestionDTO;

@FeignClient(url="http://localhost:8082",value="Question-Client")
public interface QuestionClient {
	@GetMapping("/ques/quiz/{quizId}")
	List<QuestionDTO> getQuestionOfQuiz(@PathVariable Long quizId);
	

}
