/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Data
@NoArgsConstructor
public class AccountsTransactionTypeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       accountsTransactionTypeId;
    private String        accountsTransactionTypeName;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public AccountsTransactionTypeDTO(Integer accountsTransactionTypeId,String accountsTransactionTypeName){
        this.accountsTransactionTypeId=accountsTransactionTypeId;
        this.accountsTransactionTypeName=accountsTransactionTypeName;
    }





}
