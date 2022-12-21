package com.gabrieldiniz.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrieldiniz.webservices.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
