package org.invopayWebService.repository;

import org.invopayWebService.entity.QuantityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface QuantityTypeRepository extends JpaRepository<QuantityType, Integer>,
    JpaSpecificationExecutor<QuantityType> {

}