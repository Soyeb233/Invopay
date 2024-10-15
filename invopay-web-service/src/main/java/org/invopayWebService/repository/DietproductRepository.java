package org.invopayWebService.repository;

import org.invopayWebService.entity.Dietproduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DietproductRepository extends JpaRepository<Dietproduct, Integer>,
    JpaSpecificationExecutor<Dietproduct> {

}