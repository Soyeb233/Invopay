package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientCallPurpose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientCallPurposeRepository extends JpaRepository<ClientCallPurpose, Integer>,
    JpaSpecificationExecutor<ClientCallPurpose> {

}