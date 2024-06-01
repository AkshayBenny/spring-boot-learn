package com.akshay.Quiz.Application.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.Quiz.Application.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
    
}
