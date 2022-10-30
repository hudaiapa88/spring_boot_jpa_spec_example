package com.uc.jpaspec.repository;



import com.uc.jpaspec.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CategoryRepository extends JpaRepository<Category, Long> , JpaSpecificationExecutor<Category> {
}
