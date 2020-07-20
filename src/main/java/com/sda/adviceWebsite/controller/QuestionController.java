package com.sda.adviceWebsite.controller;

import com.sda.adviceWebsite.entity.Category;
import com.sda.adviceWebsite.entity.DTO.question.QuestionDTO;
import com.sda.adviceWebsite.entity.Question;
import com.sda.adviceWebsite.repository.QuestionRepository;
import com.sda.adviceWebsite.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    QuestionService questionService;

    @GetMapping(value = "/questionId/{questionId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<QuestionDTO> findQuestionId(@PathVariable Integer questionId){
        Optional<Question> questionIdOptional = questionRepository.findQuestionByQuestionId(questionId);

        if(!questionIdOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        Question question = questionIdOptional.get();

        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setQuestion(question.getQuestion());
        questionDTO.setQuestionId(question.getQuestionId());
        questionDTO.setCategoryQuestion(question.getCategoryQuestions());

        return new ResponseEntity<>(questionDTO, HttpStatus.OK);
    }
    
}
