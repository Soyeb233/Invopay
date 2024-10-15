package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientAppointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientAppointmentsRepository extends JpaRepository<ClientAppointments, Integer>,
    JpaSpecificationExecutor<ClientAppointments> {

}