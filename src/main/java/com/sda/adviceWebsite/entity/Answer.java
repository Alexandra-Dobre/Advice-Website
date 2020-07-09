package com.sda.adviceWebsite.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answerId")
    public int answerId;

    @Column(name = "answer")
    public String answer;

    @Column(name = "answerDateTime")
    public Date answerDateTime;

    @ManyToOne
    @JoinColumn(name = "submitterId")
    public User userAnswers;

    @ManyToOne
    @JoinColumn(name = "questionId")
    public Question oneQuestion;

    public Answer() {
    }

    public Answer(int answerId, String answer, Date answerDateTime) {
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

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
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
