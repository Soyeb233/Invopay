package org.invopayWebService.repository;

import org.invopayWebService.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SpecializationRepository extends JpaRepository<Specialization, Integer>,
    JpaSpecificationExecutor<Specialization> {

}