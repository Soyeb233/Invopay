package org.invopayWebService.repository;

import org.invopayWebService.entity.DiscountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DiscountTypeRepository extends JpaRepository<DiscountType, Integer>,
    JpaSpecificationExecutor<DiscountType> {

}