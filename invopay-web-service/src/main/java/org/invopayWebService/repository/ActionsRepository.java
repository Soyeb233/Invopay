package org.invopayWebService.repository;

import org.invopayWebService.entity.Actions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ActionsRepository extends JpaRepository<Actions, Integer>,
    JpaSpecificationExecutor<Actions> {

}