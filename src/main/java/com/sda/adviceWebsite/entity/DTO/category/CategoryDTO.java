package com.sda.adviceWebsite.entity.DTO.category;

import com.sda.adviceWebsite.entity.Question;

public class CategoryDTO {

    private Integer categoryId;
    private String type;
    private Question questionType;

    public CategoryDTO() {
    }

    public CategoryDTO(Integer categoryId, String type) {
        this.categoryId = categoryId;
        this.type = type;
        this.questionType = new Question();
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryId=" + categoryId +
                ", type='" + type + '\'' +
                ", questionType=" + questionType +
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

    public Question getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Question questionType) {
        this.questionType = questionType;
    }
}
