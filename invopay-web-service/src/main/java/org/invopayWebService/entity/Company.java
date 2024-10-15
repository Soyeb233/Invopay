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
@Table(name = "company")
public class Company {

  @Id
  @Column(name = "company_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer companyId;

  @Column(name = "company_code", nullable = false)
  private String companyCode;

  @Column(name = "ref_data_source_id", nullable = false)
  private Integer refDataSourceId;

  @Column(name = "company_name", nullable = false)
  private String companyName;

  @Column(name = "company_from_date", nullable = false)
  private Date companyFromDate;

  @Column(name = "company_address_line1", nullable = false)
  private String companyAddressLine1;

  @Column(name = "company_address_line2", nullable = false)
  private String companyAddressLine2;

  @Column(name = "company_address_line3", nullable = false)
  private String companyAddressLine3;

  @Column(name = "ref_district_id", nullable = false)
  private Integer refDistrictId;

  @Column(name = "ref_state_id", nullable = false)
  private Integer refStateId;

  @Column(name = "ref_country_id", nullable = false)
  private Integer refCountryId;

  @Column(name = "company_pincode", nullable = false)
  private String companyPincode;

  @Column(name = "company_gst_no", nullable = false)
  private String companyGstNo;

  @Column(name = "company_gst_file", nullable = false)
  private String companyGstFile;

  @Column(name = "company_pan_no", nullable = false)
  private String companyPanNo;

  @Column(name = "company_pan_file", nullable = false)
  private String companyPanFile;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "company_description", nullable = false)
  private String companyDescription;

}
