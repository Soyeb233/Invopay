package org.invopayWebService.repository;

import org.invopayWebService.entity.BloodGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BloodGroupRepository extends JpaRepository<BloodGroup, Integer>,
    JpaSpecificationExecutor<BloodGroup> {

}