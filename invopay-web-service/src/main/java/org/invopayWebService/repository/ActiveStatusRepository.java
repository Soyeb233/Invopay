package org.invopayWebService.repository;

import org.invopayWebService.entity.ActiveStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ActiveStatusRepository extends JpaRepository<ActiveStatus, Integer>,
    JpaSpecificationExecutor<ActiveStatus> {

}