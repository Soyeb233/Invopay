package org.invopayWebService.repository;

import com.commons.invopayWebServices.DTO.AccountsTransactionTypeDTO;
import org.invopayWebService.entity.AccountsTransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface AccountsTransactionTypeRepository extends
    JpaRepository<AccountsTransactionType, Integer>,
    JpaSpecificationExecutor<AccountsTransactionType> {

    @Query(value = "SELECT new com.commons.invopayWebServices.DTO.AccountsTransactionTypeDTO(att.accountsTransactionTypeId, att.accountsTransactionTypeName) FROM AccountsTransaction at,AccountsTransactionType att WHERE at.refAccountsTransactionTypeId=att.accountsTransactionTypeId AND at.accountsTransactionId=?1")
    AccountsTransactionTypeDTO getAccountsTransactionTypeByAccountsTransactionId(Integer accountsTransactionId);
}