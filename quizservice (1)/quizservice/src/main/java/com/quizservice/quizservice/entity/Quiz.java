package com.quizservice.quizservice.entity;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    @Transient
	    private List<Question> questions;
    public Quiz() {
    	
    }
    public Quiz( String title) {
    	
    	this.title=title;
    	
    }
    public Quiz(Long id, String title) {
    	this.id=id;
    	this.title=title;
    	
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	  public List<Question> getQuestions() {
	        return questions;
	    }

	    public void setQuestions(List<Question> questions) {
	        this.questions = questions;
	    }
	
	public Long getId() {
		return id;
	}
}