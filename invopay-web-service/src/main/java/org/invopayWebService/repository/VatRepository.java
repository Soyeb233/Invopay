package org.invopayWebService.repository;

import org.invopayWebService.entity.Vat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VatRepository extends JpaRepository<Vat, Integer>, JpaSpecificationExecutor<Vat> {

}