package org.invopayWebService.repository;

import org.invopayWebService.entity.ResetPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResetPasswordRepository extends JpaRepository<ResetPassword, Integer>,
    JpaSpecificationExecutor<ResetPassword> {

}