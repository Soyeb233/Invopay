package org.invopayWebService.repository;

import org.invopayWebService.entity.Menu1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface Menu1Repository extends JpaRepository<Menu1, Integer>,
    JpaSpecificationExecutor<Menu1> {

}