package com.cleilson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilson.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
