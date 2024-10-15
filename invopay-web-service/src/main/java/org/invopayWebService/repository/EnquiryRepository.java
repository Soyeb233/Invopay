package org.invopayWebService.repository;

import org.invopayWebService.entity.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EnquiryRepository extends JpaRepository<Enquiry, Integer>,
    JpaSpecificationExecutor<Enquiry> {

}