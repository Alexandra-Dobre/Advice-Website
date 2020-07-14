package com.sda.adviceWebsite.entity.DTO;

import java.time.LocalDateTime;

public class UserDTO {
    private Integer userId;
    private String userName;
    private String email;
    private String password;
    private LocalDateTime dateAndTimeUser;

    public UserDTO() {

    }

    public UserDTO(Integer userId, String userName, String email, String password) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.dateAndTimeUser = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateAndTimeUser=" + dateAndTimeUser +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateAndTimeUser() {
        return dateAndTimeUser;
    }

    public void setDateAndTimeUser(LocalDateTime dateAndTimeUser) {
        this.dateAndTimeUser = dateAndTimeUser;
    }
}
