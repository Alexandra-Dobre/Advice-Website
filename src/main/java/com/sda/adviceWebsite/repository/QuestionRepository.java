package com.sda.adviceWebsite.repository;

import com.sda.adviceWebsite.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    Optional<Question> findQuestionByQuestionId (Integer questionId);

    List<Question> findAllByCategoryQuestionsCategoryId (Integer categoryId);

   // List<Question> findQuestionsByUserQuestions(User userQuestions);

   // List<Question> findQuestionsByCategoryQuestionsIsContaining(Category categoryQuestions);

}
