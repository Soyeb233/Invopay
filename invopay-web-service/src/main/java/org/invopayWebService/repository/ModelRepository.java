package org.invopayWebService.repository;

import org.invopayWebService.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ModelRepository extends JpaRepository<Model, Integer>,
    JpaSpecificationExecutor<Model> {

}