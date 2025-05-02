package com.quizservice.quizservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizservice.quizservice.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
}