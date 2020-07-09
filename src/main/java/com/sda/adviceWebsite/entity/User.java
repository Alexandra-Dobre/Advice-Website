package com.sda.adviceWebsite.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    public int userId;

    @Column(name = "Name")
    public String Name;

    @Column(name = "Email")
    public String Email;

    @Column(name = "Password")
    public String Password;

    @OneToMany(mappedBy = "userQuestions")
    public List<Question> questionList;

    @OneToMany(mappedBy = "userAnswers")
    public List<Answer> answerList;

    public User() {
    }

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        Name = name;
        Email = email;
        Password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
