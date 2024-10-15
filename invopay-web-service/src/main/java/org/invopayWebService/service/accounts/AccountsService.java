package org.invopayWebService.service.accounts;


import com.commons.invopayWebServices.DTO.AccountsTransactionDTO;
import com.commons.invopayWebServices.DTO.AccountsTransactionTypeDTO;
import org.invopayWebService.config.ObjectMapperUtil;
import org.invopayWebService.dto.accounts.AccountsExpensesDTO;
import org.invopayWebService.dto.accounts.AccountsAddIncomeDTO;
import org.invopayWebService.dto.accounts.AccountsTransactionsDTO;
import org.invopayWebService.dto.bank.BankDTO;
import org.invopayWebService.entity.*;
import org.invopayWebService.repository.AccountsCodeRepository;
import org.invopayWebService.repository.AccountsTransactionTypeRepository;
import org.invopayWebService.repository.accounts.AccountsTransactionRepository;
import org.invopayWebService.repository.bank.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountsService {
    @Autowired
    private AccountsTransactionRepository accountsTransactionRepository;
    @Autowired
    private AccountsCodeRepository accountsCodeRepository;
    @Autowired
    private AccountsTransactionTypeRepository accountsTransactionTypeRepository;
    @Autowired
    private  BankRepository bankRepository;
    // get All Trasactions
    public List<AccountsTransactionsDTO> getAllTransactionDetails() {
      List<AccountsTransactionsDTO> accountsTransactionDTOS=accountsTransactionRepository.getAllTransactions();

      return accountsTransactionDTOS;

    }
    public boolean changeDeleteStatus(List<Integer> id) {



        for (Integer item : id) {
            Optional<AccountsTransaction> supplierItem = accountsTransactionRepository.findById(item);
            if (supplierItem.isPresent()) {

                accountsTransactionRepository.deleteStaus(item,1);

            } else {
               return false;
            }
        }
        return true;
    }

    public AccountsTransaction addNewExpenses(AccountsExpensesDTO accountsExpensesDTO) {
        String vouchernumber="";
        List<AccountsTransaction> accountsTransactions=accountsTransactionRepository.findAll();
        for(AccountsTransaction accountsTransactionsDetails:accountsTransactions){
               if(!accountsTransactionsDetails.getVoucherNo().equals("") || !accountsTransactionsDetails.getVoucherNo().equals(null) ){
                     vouchernumber=accountsTransactionsDetails.getVoucherNo();
                     System.out.println(vouchernumber);
               }
        }
        if(vouchernumber.equals("") ){
            System.out.println("I am not executing");
            vouchernumber="0000";
        }

        int voucherNum=Integer.valueOf(vouchernumber);
        voucherNum+=1;
        if(accountsExpensesDTO.getRefBankId()==null){
            accountsExpensesDTO.setRefBankId(0);
        }
        String voucherNo = String.format("%04d" , voucherNum);
        AccountsTransaction accountsTransaction=ObjectMapperUtil.copyPropertiesByMapper(accountsExpensesDTO,AccountsTransaction.class);

        accountsTransaction.setVoucherNo(voucherNo);
        accountsTransaction.setVoucherName("V"+"-"+LocalDate.now().toString()+"-"+voucherNo);
        System.out.println(accountsTransaction);
        return accountsTransactionRepository.save(accountsTransaction);

    }

    public AccountsTransaction addNewIncome(AccountsAddIncomeDTO accountsAddIncomeDTO) {
        AccountsTransaction accountsTransaction=ObjectMapperUtil.copyPropertiesByMapper(accountsAddIncomeDTO,AccountsTransaction.class);
        System.out.println(accountsTransaction);
       return accountsTransactionRepository.save(accountsTransaction);

    }

    public List<AccountsCode> getAccountsName() {
        List<AccountsCode> accountsCodes=accountsCodeRepository.findAll();
       List<AccountsCode>accountsCodeList= accountsCodes
               .stream().sorted((o1, o2) -> o1.getAccountsCodeName().compareTo(o2.getAccountsCodeName())).collect(Collectors.toList());
        return  accountsCodeList;
    }

    public List<AccountsTransactionTypeDTO> getTransactionType() {
          List<AccountsTransactionType> accountsTransactionTypes=accountsTransactionTypeRepository.findAll();

          List<AccountsTransactionType>transactionTypes= accountsTransactionTypes
                    .stream().sorted((o1, o2) -> o1.getAccountsTransactionTypeName().compareTo(o2.getAccountsTransactionTypeName())).collect(Collectors.toList());

          List<AccountsTransactionTypeDTO> transactionTypeDTOList=ObjectMapperUtil.copyPropertiesByMapper(transactionTypes, ArrayList.class);
          return transactionTypeDTOList;



    }

    public List<BankDTO> getAllBankName() {
        List<Bank> banks= bankRepository.findAll();
        List<BankDTO> bankDTOS = ObjectMapperUtil.copyMapToObject(banks, ArrayList.class);
        return bankDTOS;
    }


    public AccountsTransactionsDTO getTransactionById(int id) {
        System.out.println("I got Hit "+id);
       return accountsTransactionRepository.findByTransactionsId(id);
    }

    public String editTransactionById(AccountsTransactionDTO accountsTransactionDTO,int id) {
        Optional<AccountsTransaction> accountsTransaction = accountsTransactionRepository.findById(id);

        if (accountsTransaction.isPresent()) {
            AccountsTransaction accountsTransaction1=accountsTransaction.get();
            accountsTransaction1.setRefAccountsCodeId(accountsTransactionDTO.getRefAccountsCodeId());
            accountsTransaction1.setRefAccountsTransactionTypeId(accountsTransactionDTO.getRefAccountsTransactionTypeId());
            accountsTransaction1.setAddedDate(accountsTransactionDTO.getAddedDate());
            accountsTransaction1.setRefBankId(accountsTransactionDTO.getRefBankId());
            accountsTransaction1.setPaidTo(accountsTransactionDTO.getPaidTo());
            accountsTransaction1.setReceivedFrom(accountsTransactionDTO.getReceivedFrom());
            accountsTransaction1.setAccountsTransactionDebit(accountsTransactionDTO.getAccountsTransactionDebit());
            accountsTransaction1.setChequeRefNumber(accountsTransactionDTO.getChequeRefNumber());
            accountsTransactionRepository.save(accountsTransaction1);


        } else {
            throw new RuntimeException("FIleNotFound");
        }

        return "Record Deleted";

    }
}
