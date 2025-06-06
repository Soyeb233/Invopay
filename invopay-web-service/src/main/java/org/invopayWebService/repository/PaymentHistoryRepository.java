package org.invopayWebService.repository;

import org.invopayWebService.entity.PaymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Integer>,
    JpaSpecificationExecutor<PaymentHistory> {

}