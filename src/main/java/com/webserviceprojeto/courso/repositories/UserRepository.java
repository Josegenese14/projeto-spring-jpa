package com.webserviceprojeto.courso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webserviceprojeto.courso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
