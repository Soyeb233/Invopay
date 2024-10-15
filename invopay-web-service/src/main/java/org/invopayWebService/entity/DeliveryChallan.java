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
@Table(name = "delivery_challan")
public class DeliveryChallan {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "delivery_challan_id", nullable = false)
  private Integer deliveryChallanId;

  @Column(name = "delivery_challan_name", nullable = false)
  private String deliveryChallanName;

  @Column(name = "ref_product_sample_request_id", nullable = false)
  private Integer refProductSampleRequestId;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "delivery_challan_date", nullable = false)
  private Date deliveryChallanDate;

  @Column(name = "delivery_challan_no", nullable = false)
  private String deliveryChallanNo;

  @Column(name = "delivery_challan_code", nullable = false)
  private String deliveryChallanCode;

  @Column(name = "ref_despatch_mode_id", nullable = false)
  private Integer refDespatchModeId;

  @Column(name = "ref_delivery_point_id", nullable = false)
  private Integer refDeliveryPointId;

  @Column(name = "delivery_challan_file", nullable = false)
  private String deliveryChallanFile;

  @Column(name = "email_subject", nullable = false)
  private String emailSubject;

  @Column(name = "customer_delivery_challan", nullable = false)
  private Integer customerDeliveryChallan;

  @Column(name = "customer_delivery_challan_date", nullable = false)
  private Date customerDeliveryChallanDate;

  @Column(name = "customer_delivery_challan_code", nullable = false)
  private String customerDeliveryChallanCode;

  @Column(name = "customer_despatch_mode_id", nullable = false)
  private Integer customerDespatchModeId;

  @Column(name = "customer_delivery_point_id", nullable = false)
  private Integer customerDeliveryPointId;

  @Column(name = "customer_delivery_challan_file", nullable = false)
  private String customerDeliveryChallanFile;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "delivery_challan_details", nullable = false)
  private String deliveryChallanDetails;

  @Column(name = "delivery_challan_additional_details", nullable = false)
  private String deliveryChallanAdditionalDetails;

  @Column(name = "supplier_email", nullable = false)
  private String supplierEmail;

  @Column(name = "email_additional", nullable = false)
  private String emailAdditional;

}
