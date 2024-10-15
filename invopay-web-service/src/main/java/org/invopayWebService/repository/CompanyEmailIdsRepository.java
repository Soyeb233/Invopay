package org.invopayWebService.repository;

import org.invopayWebService.entity.CompanyEmailIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompanyEmailIdsRepository extends JpaRepository<CompanyEmailIds, Integer>,
    JpaSpecificationExecutor<CompanyEmailIds> {

}