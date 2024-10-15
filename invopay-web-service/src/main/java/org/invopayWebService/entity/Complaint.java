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
@Table(name = "complaint")
public class Complaint {

  @Id
  @Column(name = "complaint_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer complaintId;

  @Column(name = "complaint_code", nullable = false)
  private String complaintCode;

  @Column(name = "complaint_no", nullable = false)
  private Integer complaintNo;

  @Column(name = "receipt_date", nullable = false)
  private Date receiptDate;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "client_name", nullable = false)
  private String clientName;

  @Column(name = "client_location", nullable = false)
  private String clientLocation;

  @Column(name = "contact_person", nullable = false)
  private String contactPerson;

  @Column(name = "contact_number", nullable = false)
  private String contactNumber;

  @Column(name = "product_grade", nullable = false)
  private String productGrade;

  @Column(name = "supplied_invoice_no", nullable = false)
  private String suppliedInvoiceNo;

  @Column(name = "supplied_invoice_date", nullable = false)
  private Date suppliedInvoiceDate;

  @Column(name = "length", nullable = false)
  private Integer length;

  @Column(name = "width", nullable = false)
  private Integer width;

  @Column(name = "defective_qty", nullable = false)
  private Integer defectiveQty;

  @Column(name = "total_sqcm", nullable = false)
  private Integer totalSqcm;

  @Column(name = "product_group", nullable = false)
  private String productGroup;

  @Column(name = "ref_application_segment_type_id", nullable = false)
  private Integer refApplicationSegmentTypeId;

  @Column(name = "machine_type_model", nullable = false)
  private String machineTypeModel;

  @Column(name = "operating_condition", nullable = false)
  private String operatingCondition;

  @Column(name = "installation_from_date", nullable = false)
  private Date installationFromDate;

  @Column(name = "installation_to_date", nullable = false)
  private Date installationToDate;

  @Column(name = "count_processed", nullable = false)
  private String countProcessed;

  @Column(name = "spindle_tape", nullable = false)
  private Integer spindleTape;

  @Column(name = "jockey_pulley_distance", nullable = false)
  private String jockeyPulleyDistance;

  @Column(name = "spindle_rpm", nullable = false)
  private String spindleRpm;

  @Column(name = "spindle_count", nullable = false)
  private Integer spindleCount;

  @Column(name = "nature_of_complaint", nullable = false)
  private String natureOfComplaint;

  @Column(name = "sample_availability", nullable = false)
  private Integer sampleAvailability;

  @Column(name = "sample_qty", nullable = false)
  private Integer sampleQty;

  @Column(name = "sample_sent_via", nullable = false)
  private String sampleSentVia;

  @Column(name = "complaint_file", nullable = false)
  private String complaintFile;

  @Column(name = "mail_status", nullable = false)
  private Integer mailStatus;

  @Column(name = "complaint_name", nullable = false)
  private String complaintName;

  @Column(name = "complaint_product_requested_details", nullable = false)
  private String complaintProductRequestedDetails;

  @Column(name = "application_type_segment", nullable = false)
  private String applicationTypeSegment;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
