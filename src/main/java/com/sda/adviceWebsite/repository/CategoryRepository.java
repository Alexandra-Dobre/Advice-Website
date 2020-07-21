package com.sda.adviceWebsite.repository;

import com.sda.adviceWebsite.entity.Category;
import com.sda.adviceWebsite.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {


   Optional<Category> findAllByCategoryId(Integer categoryId);

}
