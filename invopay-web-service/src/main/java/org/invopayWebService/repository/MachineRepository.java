package org.invopayWebService.repository;

import org.invopayWebService.entity.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MachineRepository extends JpaRepository<Machine, Integer>,
    JpaSpecificationExecutor<Machine> {

}