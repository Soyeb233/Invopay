package org.invopayWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dietproduct")
public class Dietproduct {

  @Id
  @Column(name = "dietproduct_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer dietproductId;

  @Column(name = "ref_diet_category_id", nullable = false)
  private Integer refDietCategoryId;

  @Column(name = "dietproduct_name", nullable = false)
  private String dietproductName;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Integer addedDate;

}
