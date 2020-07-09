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
    public int questionId;

    @Column(name = "question")
    public String question;

    @Column(name = "questionDateTime")
    public Date questionDateTime;

    @ManyToOne
    @JoinColumn(name = "submitterId")
    public User userQuestions;

    @OneToMany(mappedBy = "oneQuestion")
    public List<Answer> questionAndAnswers;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    public Category categoryQuestions;

    public Question() {
    }

    public Question(int questionId, String question, Date questionDateTime) {
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

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
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
}
