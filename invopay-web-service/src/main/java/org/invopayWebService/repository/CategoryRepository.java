package org.invopayWebService.repository;

import org.invopayWebService.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryRepository extends JpaRepository<Category, Integer>,
    JpaSpecificationExecutor<Category> {

}