package org.invopayWebService.repository;

import org.invopayWebService.entity.Salutation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalutationRepository extends JpaRepository<Salutation, Integer>,
    JpaSpecificationExecutor<Salutation> {

}