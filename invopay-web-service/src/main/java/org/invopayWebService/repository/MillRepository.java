package org.invopayWebService.repository;

import org.invopayWebService.entity.Mill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MillRepository extends JpaRepository<Mill, Integer>,
    JpaSpecificationExecutor<Mill> {

}