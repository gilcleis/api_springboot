package com.gilclei.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gilclei.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
