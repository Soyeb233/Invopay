package org.invopayWebService.repository;

import com.commons.invopayWebServices.DTO.AccountsCodeDTO;
import org.invopayWebService.entity.AccountsCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface AccountsCodeRepository extends JpaRepository<AccountsCode, Integer>,
    JpaSpecificationExecutor<AccountsCode> {
    @Query(value = "SELECT new com.commons.invopayWebServices.DTO.AccountsCodeDTO(ac.accountsCodeId,ac.accountsCodeName) from AccountsTransaction at,AccountsCode ac WHERE at.refAccountsCodeId=ac.accountsCodeId AND at.accountsTransactionId=?1")
    public AccountsCodeDTO getAccountsCodeByAccountsTransactionId(int accountsTransactionsId);
}