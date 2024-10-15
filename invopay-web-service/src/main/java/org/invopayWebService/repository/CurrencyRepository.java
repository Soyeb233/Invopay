package org.invopayWebService.repository;

import org.invopayWebService.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CurrencyRepository extends JpaRepository<Currency, Integer>,
    JpaSpecificationExecutor<Currency> {

}