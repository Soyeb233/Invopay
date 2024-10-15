package org.invopayWebService.repository;

import org.invopayWebService.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DiscountRepository extends JpaRepository<Discount, Integer>,
    JpaSpecificationExecutor<Discount> {

}