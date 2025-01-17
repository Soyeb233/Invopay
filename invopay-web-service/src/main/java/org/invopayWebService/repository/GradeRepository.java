package org.invopayWebService.repository;

import org.invopayWebService.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GradeRepository extends JpaRepository<Grade, Integer>,
    JpaSpecificationExecutor<Grade> {

}