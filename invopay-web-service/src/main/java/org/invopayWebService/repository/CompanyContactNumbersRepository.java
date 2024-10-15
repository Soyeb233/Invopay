package org.invopayWebService.repository;

import org.invopayWebService.entity.CompanyContactNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompanyContactNumbersRepository extends
    JpaRepository<CompanyContactNumbers, Integer>, JpaSpecificationExecutor<CompanyContactNumbers> {

}