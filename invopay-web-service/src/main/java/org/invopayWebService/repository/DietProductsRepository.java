package org.invopayWebService.repository;

import org.invopayWebService.entity.DietProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DietProductsRepository extends JpaRepository<DietProducts, Integer>,
    JpaSpecificationExecutor<DietProducts> {

}