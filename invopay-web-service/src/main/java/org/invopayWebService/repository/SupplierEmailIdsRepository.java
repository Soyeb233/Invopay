package org.invopayWebService.repository;

import org.invopayWebService.entity.SupplierEmailIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SupplierEmailIdsRepository extends JpaRepository<SupplierEmailIds, Integer>,
    JpaSpecificationExecutor<SupplierEmailIds> {

}