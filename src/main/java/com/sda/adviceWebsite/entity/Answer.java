package com.sda.adviceWebsite.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answerId")
    private Integer answerId;

    @Column(name = "answer")
    private String answer;

    @Column(name = "answerDateTime")
    private Date answerDateTime;

    @ManyToOne
    @JoinColumn(name = "submitterId")
    private User userAnswers;

    @ManyToOne
    @JoinColumn(name = "questionId")
    private Question oneQuestion;

    public Answer() {
    }

    public Answer(Integer answerId, String answer, Date answerDateTime) {
        this.answerId = answerId;
        this.answer = answer;
        this.answerDateTime = answerDateTime;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", answer='" + answer + '\'' +
                ", answerDateTime=" + answerDateTime +
                '}';
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getAnswerDateTime() {
        return answerDateTime;
    }

    public void setAnswerDateTime(Date answerDateTime) {
        this.answerDateTime = answerDateTime;
    }

}
