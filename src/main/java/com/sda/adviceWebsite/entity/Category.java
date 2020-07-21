package com.sda.adviceWebsite.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId")
    private Integer categoryId;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "categoryQuestions", fetch = FetchType.EAGER)
    private List<Question> categoryAndQuestions;

    public Category() {
    }

    public Category(Integer categoryId, String type) {
        this.categoryId = categoryId;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", type='" + type + '\'' +
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

    public List<Question> getCategoryAndQuestions() {
        return categoryAndQuestions;
    }

    public void setCategoryAndQuestions(List<Question> categoryAndQuestions) {
        this.categoryAndQuestions = categoryAndQuestions;
    }
}
