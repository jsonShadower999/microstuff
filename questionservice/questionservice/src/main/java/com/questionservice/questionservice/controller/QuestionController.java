package com.questionservice.questionservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questionservice.questionservice.entity.Question;
import com.questionservice.questionservice.service.QuestionService;

@RestController
@RequestMapping("/ques")
public class QuestionController {
	
	
	private QuestionService questionService;
	public QuestionController(QuestionService questionService) {
		this.questionService=questionService;
		
	}
	@PostMapping
	public Question createQuestion(@RequestBody Question question) {
		return questionService.createQues(question);
		
	}
	@GetMapping
	public List<Question> getQuestionList(){
		return questionService.getQuestions();
	}
	@GetMapping("/{questionId}")
	public Optional<Question> getQuestionById(@PathVariable Long questionId) {
		return questionService.getQuestionById(questionId);
	}
	//get all question of specific quiz
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionOfQuiz(@PathVariable Long quizId){
		return questionService.getQuestionOfQuiz(quizId);
		
	
		
	}
	

}
