package org.invopayWebService.repository;

import org.invopayWebService.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DesignationRepository extends JpaRepository<Designation, Integer>,
    JpaSpecificationExecutor<Designation> {

}