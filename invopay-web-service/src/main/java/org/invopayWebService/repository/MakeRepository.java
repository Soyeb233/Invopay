package org.invopayWebService.repository;

import org.invopayWebService.entity.Make;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MakeRepository extends JpaRepository<Make, Integer>,
    JpaSpecificationExecutor<Make> {

}