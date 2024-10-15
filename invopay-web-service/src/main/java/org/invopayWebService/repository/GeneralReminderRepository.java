package org.invopayWebService.repository;

import org.invopayWebService.entity.GeneralReminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GeneralReminderRepository extends JpaRepository<GeneralReminder, Integer>,
    JpaSpecificationExecutor<GeneralReminder> {

}