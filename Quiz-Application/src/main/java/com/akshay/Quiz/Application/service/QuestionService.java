package com.akshay.Quiz.Application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.Quiz.Application.Question;
import com.akshay.Quiz.Application.dao.QuestionDao;


@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
 
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category){
        return questionDao.findByCategory(category.toLowerCase());
    }

    public String addQuestion(Question question){
        questionDao.save(question);
        return "success";
    }
    
    public String deleteQuestionById(Integer id) {
        questionDao.deleteById(id);
        return "success";
    }
}
