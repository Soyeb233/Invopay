package org.invopayWebService.repository;

import org.invopayWebService.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegistrationRepository extends JpaRepository<Registration, Integer>,
    JpaSpecificationExecutor<Registration> {

}