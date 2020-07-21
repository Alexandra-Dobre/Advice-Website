package com.sda.adviceWebsite.entity.DTO.category;

import com.sda.adviceWebsite.entity.DTO.question.QuestionDTO;
import com.sda.adviceWebsite.entity.Question;

import java.util.ArrayList;
import java.util.List;

public class CategoryDTO {

    private Integer categoryId;
    private String type;
    private List<Question> questionsList;

    public CategoryDTO() {
    }

    public CategoryDTO(Integer categoryId, String type) {
        this.categoryId = categoryId;
        this.type = type;
        this.questionsList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryId=" + categoryId +
                ", type='" + type + '\'' +
                ", questionsList=" + questionsList +
                '}';
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Question> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Question> questionsList) {
        this.questionsList = questionsList;
    }
}
