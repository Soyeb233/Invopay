package org.invopayWebService.repository;

import org.invopayWebService.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MenuRepository extends JpaRepository<Menu, Integer>,
    JpaSpecificationExecutor<Menu> {

}