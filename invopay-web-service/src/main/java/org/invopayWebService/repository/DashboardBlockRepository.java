package org.invopayWebService.repository;

import org.invopayWebService.entity.DashboardBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DashboardBlockRepository extends JpaRepository<DashboardBlock, Integer>,
    JpaSpecificationExecutor<DashboardBlock> {

}