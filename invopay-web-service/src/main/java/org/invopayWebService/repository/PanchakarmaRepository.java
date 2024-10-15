package org.invopayWebService.repository;

import org.invopayWebService.entity.Panchakarma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PanchakarmaRepository extends JpaRepository<Panchakarma, Integer>,
    JpaSpecificationExecutor<Panchakarma> {

}