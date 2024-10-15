package org.invopayWebService.repository;

import org.invopayWebService.entity.DataSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataSourceRepository extends JpaRepository<DataSource, Integer>,
    JpaSpecificationExecutor<DataSource> {

}