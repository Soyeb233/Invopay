package org.invopayWebService.repository;

import org.invopayWebService.entity.StockRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StockRoomRepository extends JpaRepository<StockRoom, Integer>,
    JpaSpecificationExecutor<StockRoom> {

}