package org.invopayWebService.repository;

import org.invopayWebService.entity.DueType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DueTypeRepository extends JpaRepository<DueType, Integer>,
    JpaSpecificationExecutor<DueType> {

}