package org.invopayWebService.repository;

import org.invopayWebService.entity.GstType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GstTypeRepository extends JpaRepository<GstType, Integer>,
    JpaSpecificationExecutor<GstType> {

}