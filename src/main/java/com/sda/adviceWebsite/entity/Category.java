package com.sda.adviceWebsite.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId")
    public int categoryId;

    @Column(name = "type")
    public String type;

    @OneToMany(mappedBy = "categoryQuestions")
    public List<Question> categoryAndQuestions;

    public Category() {
    }

    public Category(int categoryId, String type) {
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
