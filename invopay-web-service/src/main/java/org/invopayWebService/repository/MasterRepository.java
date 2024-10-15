package org.invopayWebService.repository;

import org.invopayWebService.entity.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MasterRepository extends JpaRepository<Master, Integer>,
    JpaSpecificationExecutor<Master> {

}