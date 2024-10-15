package org.invopayWebService.repository;

import org.invopayWebService.entity.AppointmentRejectReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AppointmentRejectReasonRepository extends
    JpaRepository<AppointmentRejectReason, Integer>,
    JpaSpecificationExecutor<AppointmentRejectReason> {

}