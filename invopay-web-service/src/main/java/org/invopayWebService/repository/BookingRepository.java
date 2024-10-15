package org.invopayWebService.repository;

import org.invopayWebService.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookingRepository extends JpaRepository<Booking, Integer>,
    JpaSpecificationExecutor<Booking> {

}