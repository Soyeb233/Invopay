package org.invopayWebService.repository;

import org.invopayWebService.entity.ReminderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ReminderHistoryRepository extends JpaRepository<ReminderHistory, Integer>,
    JpaSpecificationExecutor<ReminderHistory> {

}