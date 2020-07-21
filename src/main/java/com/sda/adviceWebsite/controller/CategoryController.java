package com.sda.adviceWebsite.controller;

import com.sda.adviceWebsite.entity.Category;
import com.sda.adviceWebsite.entity.DTO.category.CategoryDTO;
import com.sda.adviceWebsite.entity.Question;
import com.sda.adviceWebsite.repository.CategoryRepository;
import com.sda.adviceWebsite.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "/questionsCategory/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDTO> findQuestionCateg (@PathVariable Integer categoryId){
        Optional<Category> categoryIdOptional = categoryRepository.findAllByCategoryId(categoryId);

        if(!categoryIdOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        Category myCategory = categoryIdOptional.get();

        CategoryDTO categoryIdDTO = new CategoryDTO(myCategory.getCategoryId(), myCategory.getType());
        categoryIdDTO.setQuestionsList(myCategory.getCategoryAndQuestions());

        return new ResponseEntity<>(categoryIdDTO, HttpStatus.OK);
    }


}
