package org.invopayWebService.repository;

import org.invopayWebService.entity.PoIntent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PoIntentRepository extends JpaRepository<PoIntent, Integer>,
    JpaSpecificationExecutor<PoIntent> {

}