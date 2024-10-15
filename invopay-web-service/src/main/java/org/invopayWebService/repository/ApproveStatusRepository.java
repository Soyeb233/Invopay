package org.invopayWebService.repository;

import org.invopayWebService.entity.ApproveStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ApproveStatusRepository extends JpaRepository<ApproveStatus, Integer>,
    JpaSpecificationExecutor<ApproveStatus> {

}