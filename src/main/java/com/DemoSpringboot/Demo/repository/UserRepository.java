package com.DemoSpringboot.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DemoSpringboot.Demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
