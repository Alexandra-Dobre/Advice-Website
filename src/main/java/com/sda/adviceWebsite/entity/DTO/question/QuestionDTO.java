package com.sda.adviceWebsite.entity.DTO.question;

import com.sda.adviceWebsite.entity.Category;

import java.util.Date;

public class QuestionDTO {
    private Integer questionId;
    private String question;
    private Date creationDate;
    private Category categoryQuestion;

    public QuestionDTO() {
    }

    public QuestionDTO(String question) {
        this.question = question;
        this.creationDate = new Date();
    }

    public QuestionDTO(Integer questionId, String question) {
        this.questionId = questionId;
        this.question = question;
        this.categoryQuestion = new Category();
        this.creationDate = new Date();
    }


    @Override
    public String toString() {
        return "QuestionDTO{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", creationDate=" + creationDate +
                ", categoryQuestion=" + categoryQuestion +
                '}';
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Category getCategoryQuestion() {
        return categoryQuestion;
    }

    public void setCategoryQuestion(Category categoryQuestion) {
        this.categoryQuestion = categoryQuestion;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
