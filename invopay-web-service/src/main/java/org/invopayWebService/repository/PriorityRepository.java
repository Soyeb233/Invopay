package org.invopayWebService.repository;

import org.invopayWebService.entity.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PriorityRepository extends JpaRepository<Priority, Integer>,
    JpaSpecificationExecutor<Priority> {

}