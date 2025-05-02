package com.questionservice.questionservice.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long quesId;
	private String question;
	private  Long quizId;
	public Question() {
		
	}
	public Question( String question,Long quizId) {
		
		this.question=question;
		this.quizId=quizId;
	}
	public Question(Long quesid, String question,Long quizId) {
		this.quesId=quesid;
		this.question=question;
		this.quizId=quizId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Long getQuesId() {
		return quesId;
	}
	public void setQuesId(Long quesId) {
		this.quesId = quesId;
	}
	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}

}
