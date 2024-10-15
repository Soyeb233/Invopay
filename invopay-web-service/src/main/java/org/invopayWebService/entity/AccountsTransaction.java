package org.invopayWebService.entity;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "accounts_transaction")
public class AccountsTransaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "accounts_transaction_id", nullable = false)
  private Integer accountsTransactionId;

  @Column(name = "voucher_no")
  private String voucherNo;

  @Column(name = "voucher_name")
  private String voucherName;

  @Column(name = "accounts_transaction_date", nullable = false)
  private Date accountsTransactionDate= java.sql.Date.valueOf(LocalDate.now());

  @Column(name = "ref_accounts_code_id", nullable = false)
  private Integer refAccountsCodeId;

  @Column(name = "ref_patient_id", nullable = false)
  private Integer refPatientId=0;

  @Column(name = "ref_employee_id", nullable = false)
  private Integer refEmployeeId=0;

  @Column(name = "ref_invoice_id", nullable = false)
  private Integer refInvoiceId=0;

  @Column(name = "ref_accounts_transaction_category_id", nullable = false)
  private Integer refAccountsTransactionCategoryId=0;

  @Column(name = "ref_accounts_transaction_type_id", nullable = false)
  private Integer refAccountsTransactionTypeId;

  @Column(name = "accounts_transaction_reference", nullable = false)
  private String accountsTransactionReference="";

  @Column(name = "accounts_transaction_particulars", nullable = false)
  private String accountsTransactionParticulars="";

  @Column(name = "accounts_transaction_credit", nullable = false)
  private Integer accountsTransactionCredit=0;

  @Column(name = "accounts_transaction_debit", nullable = false)
  private Integer accountsTransactionDebit=0;

  @Column(name = "transaction_type", nullable = false)
  private Integer transactionType=0;

  @Column(name = "cheque_ref_number", nullable = false)
  private String chequeRefNumber="";

  @Column(name = "cheque_date", nullable = false)
  private Date chequeDate= java.sql.Date.valueOf(LocalDate.now());

  @Column(name = "ref_bank_id", nullable = false)
  private Integer refBankId=0;

  @Column(name = "cheque_clearance_status", nullable = false)
  private Integer chequeClearanceStatus=0;

  @Column(name = "cheque_realisation_date", nullable = false)
  private Date chequeRealisationDate= java.sql.Date.valueOf(LocalDate.now());

  @Column(name = "received_from", nullable = false)
  private String receivedFrom;

  @Column(name = "paid_to", nullable = false)
  private String paidTo;

  @Column(name = "voucher_file")
  private String voucherFile="";

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus=0;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId=2;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId=0;

  @Column(name = "added_date", nullable = false)
  private Date addedDate= java.sql.Date.valueOf(LocalDate.now());;

}
