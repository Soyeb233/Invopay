package org.invopayWebService.repository;

import org.invopayWebService.entity.SupplierContactNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SupplierContactNumbersRepository extends
    JpaRepository<SupplierContactNumbers, Integer>,
    JpaSpecificationExecutor<SupplierContactNumbers> {

}