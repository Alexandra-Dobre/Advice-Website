package com.sda.adviceWebsite.service;

import com.sda.adviceWebsite.entity.Question;
import com.sda.adviceWebsite.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.requireNonNull;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    public List<Question> findQuestionByCategoryId(Integer categoryId) {

        return questionRepository.findAllByCategoryQuestionsCategoryId(categoryId);
    }

    public Question saveQuestion(Question question) {
        requireNonNull(question.getQuestion());

        if (!question.getQuestion().trim().isEmpty()){
            return questionRepository.save(question);
        }else {
            throw new RuntimeException("Question should have a content");
        }
    }

}
