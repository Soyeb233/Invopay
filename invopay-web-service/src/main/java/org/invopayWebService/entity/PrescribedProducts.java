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
@Table(name = "prescribed_products")
public class PrescribedProducts {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "prescribed_products_id", nullable = false)
  private Integer prescribedProductsId;

  @Column(name = "product_name", nullable = false)
  private String productName;

  @Column(name = "ref_product_id", nullable = false)
  private Integer refProductId;

  @Column(name = "ref_product_batch_id", nullable = false)
  private Integer refProductBatchId;

  @Column(name = "available_quantity", nullable = false)
  private String availableQuantity;

  @Column(name = "selected_quantity", nullable = false)
  private Integer selectedQuantity;

  @Column(name = "type", nullable = false)
  private String type;

  @Column(name = "time", nullable = false)
  private String time;

  @Column(name = "morning", nullable = false)
  private String morning;

  @Column(name = "afternoon", nullable = false)
  private String afternoon;

  @Column(name = "evening", nullable = false)
  private String evening;

  @Column(name = "night", nullable = false)
  private String night;

  @Column(name = "remarks", nullable = false)
  private String remarks;

  @Column(name = "ref_patient_id", nullable = false)
  private Integer refPatientId;

  @Column(name = "ref_patient_visit_id", nullable = false)
  private Integer refPatientVisitId;

  @Column(name = "invoice_status", nullable = false)
  private Integer invoiceStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
