package org.invopayWebService.dto.accounts;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
@Data
@NoArgsConstructor
public class AccountsExpensesDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer accountsTransactionId;
    private String paidTo;
    private String receivedFrom;
    private Date addedDate;
    private Integer refAccountsCodeId;

    private Integer refAccountsTransactionTypeId;
    private String chequeRefNumber="";

    private Integer refBankId=0;
    private Integer accountsTransactionDebit;


}
