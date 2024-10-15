package org.invopayWebService.dto.accounts;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
@Data
@NoArgsConstructor
public class AccountsAddIncomeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer accountsTransactionId;
    private String paidTo;
    private String receivedFrom;
    private Date addedDate;
    private Integer refAccountsCodeId;

    private Integer refAccountsTransactionTypeId;

    private Integer refBankId;
    private Integer accountsTransactionCredit=0;
    private String chequeRefNumber="";

}
