package org.invopayWebService.repository.country;

import org.invopayWebService.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CountryRepository extends JpaRepository<Country, Integer>,
        JpaSpecificationExecutor<Country> {
         Country findByCountryId(int id);
}