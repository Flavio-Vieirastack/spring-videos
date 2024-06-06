package com.project1.project_study.Repositories;

import com.project1.project_study.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<UserModel, Long> {
}
