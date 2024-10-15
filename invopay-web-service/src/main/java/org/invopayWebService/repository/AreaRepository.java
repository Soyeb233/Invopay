package org.invopayWebService.repository;

import org.invopayWebService.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AreaRepository extends JpaRepository<Area, Integer>,
    JpaSpecificationExecutor<Area> {

}