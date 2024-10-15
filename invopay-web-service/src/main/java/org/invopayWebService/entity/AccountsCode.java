package org.invopayWebService.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "accounts_code")
public class AccountsCode {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "accounts_code_id", nullable = false)
  private Integer accountsCodeId;

  @Column(name = "accounts_code_name", nullable = false)
  private String accountsCodeName;

  @Column(name = "ref_accounts_transaction_category_id", nullable = false)
  private Integer refAccountsTransactionCategoryId;

  @Column(name = "ref_accounts_group_id", nullable = false)
  private Integer refAccountsGroupId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
