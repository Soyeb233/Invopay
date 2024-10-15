package org.invopayWebService.repository;

import org.invopayWebService.entity.ModernSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ModernSystemRepository extends JpaRepository<ModernSystem, Integer>,
    JpaSpecificationExecutor<ModernSystem> {

}