package org.invopayWebService.entity;

import java.time.LocalDate;
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
@Table(name = "supplier")
public class Supplier {

  @Id
  @Column(name = "supplier_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer supplierId;

  @Column(name = "stripe_account_id", nullable = false)
  private String stripeAccountId;

  @Column(name = "ref_company_id", nullable = false)
  private Integer refCompanyId;

  @Column(name = "supplier_no", nullable = false)
  private String supplierNo;

  @Column(name = "supplier_code", nullable = false)
  private String supplierCode;

  @Column(name = "ref_data_source_id", nullable = false)
  private Integer refDataSourceId;

  @Column(name = "supplier_type", nullable = false)
  private Boolean supplierType;

  @Column(name = "supplier_name", nullable = false)
  private String supplierName;

  @Column(name = "supplier_fname", nullable = false)
  private String supplierFname;

  @Column(name = "supplier_lname", nullable = false)
  private String supplierLname;

  @Column(name = "company_name")
  private String companyName;

  @Column(name = "contact_number", nullable = false)
  private Long contactNumber;

  @Column(name = "contact_mobile", nullable = false)
  private String contactMobile;

  @Column(name = "contact_email", nullable = false)
  private String contactEmail;

  @Column(name = "website")
  private String website;

  @Column(name = "supplier_address_line1", nullable = false)
  private String supplierAddressLine1;

  @Column(name = "supplier_address_line2", nullable = false)
  private String supplierAddressLine2;

  @Column(name = "supplier_pincode", nullable = false)
  private String supplierPincode;

  @Column(name = "supplier_city")
  private String supplierCity;

  @Column(name = "supplier_state")
  private String supplierState;

  @Column(name = "ref_country_id", nullable = false)
  private Integer refCountryId;

  @Column(name = "supplier_fax_no")
  private String supplierFaxNo;

  @Column(name = "supplier_gst_no", nullable = false)
  private String supplierGstNo;

  @Column(name = "supplier_from_date", nullable = false)
  private Date supplierFromDate= java.sql.Date.valueOf(LocalDate.now());;

  @Column(name = "supplier_address_line3", nullable = false)
  private String supplierAddressLine3;

  @Column(name = "ref_district_id", nullable = false)
  private Integer refDistrictId;

  @Column(name = "ref_state_id", nullable = false)
  private Integer refStateId;

  @Column(name = "contact_number_2", nullable = false)
  private Long contactNumber2;

  @Column(name = "contact_email_2", nullable = false)
  private String contactEmail2;

  @Column(name = "supplier_gst_file", nullable = false)
  private String supplierGstFile;

  @Column(name = "supplier_pan_no", nullable = false)
  private String supplierPanNo;

  @Column(name = "supplier_pan_file", nullable = false)
  private String supplierPanFile;

  @Column(name = "direct_to_customer", nullable = false)
  private Integer directToCustomer;

  @Column(name = "commission_percentage", nullable = false)
  private Integer commissionPercentage;

  @Column(name = "abn", nullable = false)
  private String abn;

  @Column(name = "acn", nullable = false)
  private String acn;

  @Column(name = "ref_currency_id", nullable = false)
  private Integer refCurrencyId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate = java.sql.Date.valueOf(LocalDate.now());;

  @Column(name = "supplier_description", nullable = false)
  private String supplierDescription;

  @Column(name = "custom_fields")
  private String customFields;

  @Column(name="millis")
  private Long millis=0L;

  @Column(name="millis1")
  private Long millis1=0L;

}
