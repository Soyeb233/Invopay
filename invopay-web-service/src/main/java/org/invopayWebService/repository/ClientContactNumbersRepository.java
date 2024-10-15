package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientContactNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientContactNumbersRepository extends
    JpaRepository<ClientContactNumbers, Integer>, JpaSpecificationExecutor<ClientContactNumbers> {

}