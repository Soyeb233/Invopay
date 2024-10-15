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
@Table(name = "reset_password")
public class ResetPassword {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "reset_password_id", nullable = false)
  private Integer resetPasswordId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "hash_key", nullable = false)
  private String hashKey;

  @Column(name = "reset_password_status", nullable = false)
  private Integer resetPasswordStatus;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
