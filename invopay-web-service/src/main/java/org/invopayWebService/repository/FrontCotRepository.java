package org.invopayWebService.repository;

import org.invopayWebService.entity.FrontCot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FrontCotRepository extends JpaRepository<FrontCot, Integer>,
    JpaSpecificationExecutor<FrontCot> {

}