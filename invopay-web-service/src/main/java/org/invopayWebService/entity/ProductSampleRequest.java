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
@Table(name = "product_sample_request")
public class ProductSampleRequest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_sample_request_id", nullable = false)
  private Integer productSampleRequestId;

  @Column(name = "product_sample_request_code", nullable = false)
  private String productSampleRequestCode;

  @Column(name = "product_sample_request_no", nullable = false)
  private String productSampleRequestNo;

  @Column(name = "product_sample_request_date", nullable = false)
  private Date productSampleRequestDate;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "ref_sample_request_category_id", nullable = false)
  private Integer refSampleRequestCategoryId;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "product_sample_request_details", nullable = false)
  private String productSampleRequestDetails;

  @Column(name = "ref_delivery_point_id", nullable = false)
  private Integer refDeliveryPointId;

  @Column(name = "ref_despatch_mode_id", nullable = false)
  private Integer refDespatchModeId;

  @Column(name = "tag", nullable = false)
  private String tag;

  @Column(name = "schedule_date", nullable = false)
  private Date scheduleDate;

  @Column(name = "dispatch_date", nullable = false)
  private Date dispatchDate;

  @Column(name = "delivered_date", nullable = false)
  private Date deliveredDate;

  @Column(name = "installation_date", nullable = false)
  private Date installationDate;

  @Column(name = "reminder_date", nullable = false)
  private Date reminderDate;

  @Column(name = "ref_feedback_id", nullable = false)
  private Integer refFeedbackId;

  @Column(name = "client_feedback", nullable = false)
  private String clientFeedback;

  @Column(name = "ref_product_request_status_id", nullable = false)
  private Integer refProductRequestStatusId;

  @Column(name = "mail_status", nullable = false)
  private Integer mailStatus;

  @Column(name = "product_sample_request_name", nullable = false)
  private String productSampleRequestName;

  @Column(name = "product_sample_request_file", nullable = false)
  private String productSampleRequestFile;

  @Column(name = "delivery_challan_status", nullable = false)
  private Integer deliveryChallanStatus;

  @Column(name = "inward_status", nullable = false)
  private Integer inwardStatus;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Integer addedDate;

  @Column(name = "special_instruction", nullable = false)
  private String specialInstruction;

}
