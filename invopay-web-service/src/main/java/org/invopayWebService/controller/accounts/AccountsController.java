package org.invopayWebService.controller.accounts;

import com.commons.ResponceHandler;
import com.commons.invopayWebServices.DTO.AccountsTransactionDTO;
import org.invopayWebService.dto.accounts.AccountsExpensesDTO;
import org.invopayWebService.dto.accounts.AccountsAddIncomeDTO;
import org.invopayWebService.service.accounts.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/invopay/accounts")
public class AccountsController {
    @Autowired
    private AccountsService accountsService;

    @GetMapping("/getAllTransactionDetails")
    public ResponseEntity<Object> getAllTransactionDetails(){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,accountsService.getAllTransactionDetails());
    }
    @PostMapping("/addNewExpenses")
    public ResponseEntity<Object> addNewExpenses(@RequestBody AccountsExpensesDTO accountsExpensesDTO) {
        System.out.println("Add New Expenses");
        System.out.println(accountsExpensesDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,accountsService.addNewExpenses(accountsExpensesDTO));
    }

    @PostMapping("/addNewIncome")
    public ResponseEntity<Object> addNewIncome(@RequestBody AccountsAddIncomeDTO accountsAddIncomeDTO){
        System.out.println("Add New Income");
        System.out.println(accountsAddIncomeDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,accountsService.addNewIncome(accountsAddIncomeDTO));
    }
    @PutMapping("/deleteAccountList")
    public ResponseEntity<Object>  deleteAccountList(@RequestBody  List<Integer> id){
        System.out.println(id);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,accountsService.changeDeleteStatus(id));
    }

    @GetMapping("/getAccountsName")
    public ResponseEntity<Object> getAccountsName(){
        return ResponceHandler.generateResponce(HttpStatus.OK, true,accountsService.getAccountsName());
    }
    @GetMapping("/getTransactionType")
    public ResponseEntity<Object> getTransactionType(){
        return ResponceHandler.generateResponce(HttpStatus.OK, true,accountsService.getTransactionType());
    }

    @GetMapping("/getBankNames")
    public ResponseEntity<Object> findAllBankName(){
        return ResponceHandler.generateResponce(HttpStatus.OK, true, accountsService.getAllBankName());
    }

    @PutMapping("deleteTransactions")
    public ResponseEntity<Object> deleteTransactions(@RequestBody List<Integer> id) {
        System.out.println(id);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,accountsService.changeDeleteStatus(id));
    }
    @GetMapping("/getTransactionById/{id}")
    public ResponseEntity<Object> getTransactionById(@PathVariable int id){
        return ResponceHandler.generateResponce(HttpStatus.OK, true,accountsService.getTransactionById(id));
    }

    @PutMapping("/editExpenses/{id}")
    public ResponseEntity<Object> editTransactionById(@RequestBody AccountsTransactionDTO accountsTransactionsDTO, @PathVariable int id){
        System.out.println(accountsTransactionsDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,accountsService.editTransactionById(accountsTransactionsDTO,id));
    }
}
