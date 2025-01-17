/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@Data
@NoArgsConstructor
public class AccountsTransactionDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       accountsTransactionId;
    private String voucherNo="";
    private String voucherName="";
    private Date accountsTransactionDate= java.sql.Date.valueOf(LocalDate.now());

    private Integer refAccountsCodeId;
    private Integer refPatientId=0;

    private Integer refEmployeeId=0;
    private Integer refInvoiceId=0;
    private Integer       refAccountsTransactionCategoryId=0;
    private Integer       refAccountsTransactionTypeId;
    private String accountsTransactionReference="";
    private String accountsTransactionParticulars="";
    private Integer       accountsTransactionCredit=0;
    private Integer       accountsTransactionDebit;
    private Integer       transactionType=0;
    private String        chequeRefNumber="";
    private Date     chequeDate=java.sql.Date.valueOf(LocalDate.now());;
    private Integer       refBankId;
    private Integer       chequeClearanceStatus=0;
    private Date     chequeRealisationDate= java.sql.Date.valueOf(LocalDate.now());;
    private String        receivedFrom;
    private String        paidTo;
    private String        voucherFile="";
    private Integer       deleteStatus=0;
    private Integer       refUserId=1;
    private Integer       transactionId=0;
    private Date addedDate = java.sql.Date.valueOf(LocalDate.now());;;


}
