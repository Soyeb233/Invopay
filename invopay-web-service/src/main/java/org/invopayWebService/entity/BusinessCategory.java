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
@Table(name = "business_category")
public class BusinessCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "business_category_id", nullable = false)
  private Integer businessCategoryId;

  @Column(name = "business_category_parent_id", nullable = false)
  private Integer businessCategoryParentId;

  @Column(name = "business_category_name", nullable = false)
  private String businessCategoryName;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "old_sub_category_id", nullable = false)
  private Integer oldSubCategoryId;

}
