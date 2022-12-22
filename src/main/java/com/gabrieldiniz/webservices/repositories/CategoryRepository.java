package com.gabrieldiniz.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrieldiniz.webservices.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
