package org.invopayWebService.repository;

import org.invopayWebService.entity.CronHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CronHistoryRepository extends JpaRepository<CronHistory, Integer>,
    JpaSpecificationExecutor<CronHistory> {

}