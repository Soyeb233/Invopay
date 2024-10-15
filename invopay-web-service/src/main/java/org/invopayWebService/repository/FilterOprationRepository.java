package org.invopayWebService.repository;

import org.invopayWebService.entity.FilterOpration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FilterOprationRepository extends JpaRepository<FilterOpration, Integer>,
    JpaSpecificationExecutor<FilterOpration> {

}