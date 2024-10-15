package org.invopayWebService.repository;

import org.invopayWebService.entity.LeadAppointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadAppointmentsRepository extends JpaRepository<LeadAppointments, Integer>,
    JpaSpecificationExecutor<LeadAppointments> {

}