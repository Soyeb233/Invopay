package org.invopayWebService.repository;

import org.invopayWebService.entity.Pincode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PincodeRepository extends JpaRepository<Pincode, Integer>,
    JpaSpecificationExecutor<Pincode> {

}