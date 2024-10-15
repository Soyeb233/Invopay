package org.invopayWebService.repository.accounts;

import org.invopayWebService.dto.accounts.AccountsTransactionsDTO;
import org.invopayWebService.entity.AccountsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface AccountsTransactionRepository extends JpaRepository<AccountsTransaction, Integer>,
    JpaSpecificationExecutor<AccountsTransaction> {

// add transaction details
    @Query(value = "SELECT new org.invopayWebService.dto.accounts.AccountsTransactionsDTO(a.accountsTransactionId,a.accountsTransactionDate,a.voucherNo,a.voucherName,a.transactionType,a.receivedFrom,a.paidTo, a.accountsTransactionCredit,a.accountsTransactionDebit,ac.accountsCodeName,acType.accountsTransactionTypeName )FROM AccountsTransaction a , AccountsCode ac,AccountsTransactionType acType WHERE a.refAccountsCodeId=ac.accountsCodeId AND  a.refAccountsTransactionTypeId=acType.accountsTransactionTypeId AND a.deleteStatus=0")
    List<AccountsTransactionsDTO> getAllTransactions();

    @Transactional
    @Modifying
    @Query(value="UPDATE AccountsTransaction a SET a.deleteStatus=?2 WHERE a.accountsTransactionId =?1")
    void deleteStaus(Integer item, int i);

    @Query(value = "SELECT new org.invopayWebService.dto.accounts.AccountsTransactionsDTO(a.accountsTransactionId,a.accountsTransactionDate,a.voucherNo,a.voucherName,a.transactionType,a.receivedFrom,a.paidTo, a.accountsTransactionCredit,a.accountsTransactionDebit,ac.accountsCodeName,acType.accountsTransactionTypeName )FROM AccountsTransaction a , AccountsCode ac,AccountsTransactionType acType WHERE a.refAccountsCodeId=ac.accountsCodeId AND  a.refAccountsTransactionTypeId=acType.accountsTransactionTypeId AND a.deleteStatus=0 AND a.accountsTransactionId=?1")
    public AccountsTransactionsDTO findByTransactionsId(int id);

    public Optional<AccountsTransaction> findByVoucherName(String voucherName);
}