package org.invopayWebService.repository;

import org.invopayWebService.entity.ModuleKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ModuleKeyRepository extends JpaRepository<ModuleKey, Integer>,
    JpaSpecificationExecutor<ModuleKey> {

}