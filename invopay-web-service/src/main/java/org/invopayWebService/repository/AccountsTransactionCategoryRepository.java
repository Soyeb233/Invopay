package org.invopayWebService.repository;

import org.invopayWebService.entity.AccountsTransactionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountsTransactionCategoryRepository extends
    JpaRepository<AccountsTransactionCategory, Integer>,
    JpaSpecificationExecutor<AccountsTransactionCategory> {

}