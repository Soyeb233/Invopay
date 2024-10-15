package org.invopayWebService.repository;

import org.invopayWebService.entity.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymentStatusRepository extends JpaRepository<PaymentStatus, Integer>,
    JpaSpecificationExecutor<PaymentStatus> {

}