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
@Table(name = "product_sample_request_particulars")
public class ProductSampleRequestParticulars {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_sample_request_particulars_id", nullable = false)
  private Integer productSampleRequestParticularsId;

  @Column(name = "ref_product_sample_request_id", nullable = false)
  private Integer refProductSampleRequestId;

  @Column(name = "ref_product_id", nullable = false)
  private Integer refProductId;

  @Column(name = "ref_product_quality_id", nullable = false)
  private Integer refProductQualityId;

  @Column(name = "ref_product_quality_size_id", nullable = false)
  private Integer refProductQualitySizeId;

  @Column(name = "ref_product_variety_id", nullable = false)
  private Integer refProductVarietyId;

  @Column(name = "qty", nullable = false)
  private Integer qty;

  @Column(name = "delivered_qty", nullable = false)
  private Integer deliveredQty;

  @Column(name = "damaged_qty", nullable = false)
  private Integer damagedQty;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
