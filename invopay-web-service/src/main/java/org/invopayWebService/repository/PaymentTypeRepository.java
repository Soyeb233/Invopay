package org.invopayWebService.repository;

import org.invopayWebService.entity.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Integer>,
    JpaSpecificationExecutor<PaymentType> {

}