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
@Table(name = "salutation")
public class Salutation {

  @Id
  @Column(name = "salutation_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer salutationId;

  @Column(name = "salutation_name", nullable = false)
  private String salutationName;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "user_id", nullable = false)
  private Integer userId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
