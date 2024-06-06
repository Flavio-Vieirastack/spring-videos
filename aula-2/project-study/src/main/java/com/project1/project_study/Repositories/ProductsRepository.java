package com.project1.project_study.Repositories;

import com.project1.project_study.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Category, Long> {
}
