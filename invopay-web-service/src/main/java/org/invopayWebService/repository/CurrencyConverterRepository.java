package org.invopayWebService.repository;

import org.invopayWebService.entity.CurrencyConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CurrencyConverterRepository extends JpaRepository<CurrencyConverter, Integer>,
    JpaSpecificationExecutor<CurrencyConverter> {

}