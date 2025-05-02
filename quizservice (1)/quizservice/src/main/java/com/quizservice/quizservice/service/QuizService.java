package com.quizservice.quizservice.service;

import java.util.List;

import com.quizservice.quizservice.entity.Quiz;

public interface QuizService {
	Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
}
