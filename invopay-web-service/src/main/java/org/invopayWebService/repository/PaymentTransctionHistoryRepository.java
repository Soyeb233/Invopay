package org.invopayWebService.repository;

import org.invopayWebService.entity.PaymentTransctionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymentTransctionHistoryRepository extends
    JpaRepository<PaymentTransctionHistory, Integer>,
    JpaSpecificationExecutor<PaymentTransctionHistory> {

}