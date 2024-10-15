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
@Table(name = "diet_products")
public class DietProducts {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "diet_products_id", nullable = false)
  private Integer dietProductsId;

  @Column(name = "action", nullable = false)
  private String action;

  @Column(name = "ref_diet_category_id", nullable = false)
  private String refDietCategoryId;

  @Column(name = "ref_dietproduct_id", nullable = false)
  private Integer refDietproductId;

  @Column(name = "ref_patient_id", nullable = false)
  private Integer refPatientId;

  @Column(name = "ref_patient_visit_id", nullable = false)
  private Integer refPatientVisitId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
