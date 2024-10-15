package org.invopayWebService.repository;

import org.invopayWebService.entity.ContactNumberType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ContactNumberTypeRepository extends JpaRepository<ContactNumberType, Integer>,
    JpaSpecificationExecutor<ContactNumberType> {

}