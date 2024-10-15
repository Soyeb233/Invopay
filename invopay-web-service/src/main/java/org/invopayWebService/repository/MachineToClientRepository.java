package org.invopayWebService.repository;

import org.invopayWebService.entity.MachineToClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MachineToClientRepository extends JpaRepository<MachineToClient, Integer>,
    JpaSpecificationExecutor<MachineToClient> {

}