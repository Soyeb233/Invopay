package org.invopayWebService.repository;

import org.invopayWebService.entity.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LineItemRepository extends JpaRepository<LineItem, Integer>,
    JpaSpecificationExecutor<LineItem> {

}