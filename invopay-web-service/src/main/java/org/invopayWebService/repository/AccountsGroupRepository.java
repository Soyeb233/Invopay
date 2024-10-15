package org.invopayWebService.repository;

import org.invopayWebService.entity.AccountsGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountsGroupRepository extends JpaRepository<AccountsGroup, Integer>,
    JpaSpecificationExecutor<AccountsGroup> {

}