package org.invopayWebService.repository;

import org.invopayWebService.entity.CabinetType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CabinetTypeRepository extends JpaRepository<CabinetType, Integer>,
    JpaSpecificationExecutor<CabinetType> {

}