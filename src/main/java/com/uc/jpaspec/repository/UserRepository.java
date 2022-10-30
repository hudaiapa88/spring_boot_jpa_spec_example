package com.uc.jpaspec.repository;

import com.uc.jpaspec.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
