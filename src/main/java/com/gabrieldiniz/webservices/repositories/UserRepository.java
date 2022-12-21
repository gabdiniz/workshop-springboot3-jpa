package com.gabrieldiniz.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldiniz.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
