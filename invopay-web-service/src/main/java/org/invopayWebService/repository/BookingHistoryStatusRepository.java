package org.invopayWebService.repository;

import org.invopayWebService.entity.BookingHistoryStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookingHistoryStatusRepository extends
    JpaRepository<BookingHistoryStatus, Integer>, JpaSpecificationExecutor<BookingHistoryStatus> {

}