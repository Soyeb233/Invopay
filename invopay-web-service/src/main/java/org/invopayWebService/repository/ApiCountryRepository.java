package org.invopayWebService.repository;

import org.invopayWebService.entity.ApiCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ApiCountryRepository extends JpaRepository<ApiCountry, Long>,
    JpaSpecificationExecutor<ApiCountry> {

}