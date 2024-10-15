package org.invopayWebService.repository;

import org.invopayWebService.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StatusRepository extends JpaRepository<Status, Integer>,
    JpaSpecificationExecutor<Status> {

}