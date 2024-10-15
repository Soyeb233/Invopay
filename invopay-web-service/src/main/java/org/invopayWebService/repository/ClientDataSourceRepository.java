package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientDataSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientDataSourceRepository extends JpaRepository<ClientDataSource, Integer>,
    JpaSpecificationExecutor<ClientDataSource> {

}