package org.invopayWebService.repository;

import org.invopayWebService.entity.DespatchMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DespatchModeRepository extends JpaRepository<DespatchMode, Integer>,
    JpaSpecificationExecutor<DespatchMode> {

}