package org.invopayWebService.repository;

import org.invopayWebService.entity.AppointmentFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AppointmentFeedbackRepository extends JpaRepository<AppointmentFeedback, Integer>,
    JpaSpecificationExecutor<AppointmentFeedback> {

}