package com.sda.adviceWebsite.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionId")
    private Integer questionId;

    @Column(name = "question")
    private String question;

    @Column(name = "questionDateTime")
    private Date questionDateTime;

    @ManyToOne
    @JoinColumn(name = "submitterId")
    private User userQuestions;

    @OneToMany(mappedBy = "oneQuestion")
    private List<Answer> questionAndAnswers;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category categoryQuestions;

    public Question() {
    }

    public Question(Integer questionId, String question, Date questionDateTime) {
        this.questionId = questionId;
        this.question = question;
        this.questionDateTime = questionDateTime;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", questionDateTime=" + questionDateTime +
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

    public Date getQuestionDateTime() {
        return questionDateTime;
    }

    public void setQuestionDateTime(Date questionDateTime) {
        this.questionDateTime = questionDateTime;
    }

    public Category getCategoryQuestions() {
        return categoryQuestions;
    }

    public void setCategoryQuestions(Category categoryQuestions) {
        this.categoryQuestions = categoryQuestions;
    }
}
