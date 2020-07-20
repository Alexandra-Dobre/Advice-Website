package com.sda.adviceWebsite.repository;

import com.sda.adviceWebsite.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByUserId (Integer userId);

    Optional<User> findUsersByNameContaining (String name);

    Optional<User> findUsersByEmailContaining (String testEmail);



}
