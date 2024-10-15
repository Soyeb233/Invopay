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
@Table(name = "delivery_challan_particulars")
public class DeliveryChallanParticulars {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "delivery_challan_particulars_id", nullable = false)
  private Integer deliveryChallanParticularsId;

  @Column(name = "ref_delivery_challan_id", nullable = false)
  private Integer refDeliveryChallanId;

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

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
