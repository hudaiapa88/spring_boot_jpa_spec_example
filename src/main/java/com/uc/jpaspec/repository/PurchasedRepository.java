package com.uc.jpaspec.repository;

import com.uc.jpaspec.model.entity.Purchased;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PurchasedRepository extends JpaRepository<Purchased,Long> , JpaSpecificationExecutor<Purchased> {
}
