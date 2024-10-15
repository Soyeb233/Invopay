package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientRemark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientRemarkRepository extends JpaRepository<ClientRemark, Integer>,
    JpaSpecificationExecutor<ClientRemark> {

}