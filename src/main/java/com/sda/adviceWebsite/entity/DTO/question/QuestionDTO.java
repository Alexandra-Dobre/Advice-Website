package com.sda.adviceWebsite.entity.DTO.question;
import com.sda.adviceWebsite.entity.Category;

import java.util.Date;

public class QuestionDTO {
    private Integer questionId;
    private String question;
    private Date creationDate;
    private String categoryName;

    public QuestionDTO() {
    }

    public QuestionDTO(String question) {
        this.question = question;
        this.creationDate = new Date();
    }

    public QuestionDTO(Integer questionId, String question) {
        this.questionId = questionId;
        this.question = question;
        this.creationDate = new Date();
    }


    @Override
    public String toString() {
        return "QuestionDTO{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", creationDate=" + creationDate +
                ", categoryQuestion=" + categoryName +
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

    public String getCategoryQuestion() {
        return categoryName;
    }

    public void setCategoryQuestion(String categoryQuestion) {
        this.categoryName = categoryQuestion;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}
