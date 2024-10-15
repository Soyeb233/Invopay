package org.invopayWebService.dto.accounts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountsTransactionsDTO {
    private Integer accountsTransactionId;
    private Date accountsTransactionDate;
    private String voucherNo;
    private String voucherName;
    private Integer transactionType;
    private String receivedFrom;
    private String paidTo;
    private Integer accountsTransactionCredit=0;
    private Integer accountsTransactionDebit=0;
    private String accountsCodeName;
    private String accountsTransactionTypeName;


}
