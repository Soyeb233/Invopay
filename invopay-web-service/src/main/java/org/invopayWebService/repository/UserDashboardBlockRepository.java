package org.invopayWebService.repository;

import org.invopayWebService.entity.UserDashboardBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDashboardBlockRepository extends JpaRepository<UserDashboardBlock, Integer>,
    JpaSpecificationExecutor<UserDashboardBlock> {

}