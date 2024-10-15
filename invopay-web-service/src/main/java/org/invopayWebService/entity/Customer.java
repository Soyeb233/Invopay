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
@Table(name = "customer")
public class Customer {

  @Id
  @Column(name = "customer_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer customerId;

  @Column(name = "customer_name", nullable = false)
  private String customerName;

  @Column(name = "customer_type", nullable = false)
  private String customerType;

  @Column(name = "first_name", nullable = false)
  private String firstName;

  @Column(name = "last_name", nullable = false)
  private String lastName;

  @Column(name = "license_no", nullable = false)
  private String licenseNo;

  @Column(name = "license_front_file", nullable = false)
  private String licenseFrontFile;

  @Column(name = "license_back_file", nullable = false)
  private String licenseBackFile;

  @Column(name = "aadhar_no", nullable = false)
  private String aadharNo;

  @Column(name = "aadhar_front_file", nullable = false)
  private String aadharFrontFile;

  @Column(name = "aadhar_back_file", nullable = false)
  private String aadharBackFile;

  @Column(name = "company")
  private String company;

  @Column(name = "mobile", nullable = false)
  private String mobile;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "pincode", nullable = false)
  private Integer pincode;

  @Column(name = "street")
  private String street;

  @Column(name = "suburb")
  private String suburb;

  @Column(name = "state")
  private String state;

  @Column(name = "no_of_gaming_machines", nullable = false)
  private Integer noOfGamingMachines;

  @Column(name = "ref_district_id", nullable = false)
  private Integer refDistrictId;

  @Column(name = "ref_country_id", nullable = false)
  private Integer refCountryId;

  @Column(name = "ref_state_id", nullable = false)
  private Integer refStateId;

  @Column(name = "payment_method", nullable = false)
  private String paymentMethod;

  @Column(name = "customer_gst_no", nullable = false)
  private String customerGstNo;

  @Column(name = "customer_gst_file", nullable = false)
  private String customerGstFile;

  @Column(name = "user_type", nullable = false)
  private Integer userType;

  @Column(name = "customer_description", nullable = false)
  private String customerDescription;

  @Column(name = "ref_user_id")
  private Integer refUserId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "address", nullable = false)
  private String address;

}
