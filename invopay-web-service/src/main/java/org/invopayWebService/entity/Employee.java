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
@Table(name = "employee")
public class Employee {

  @Id
  @Column(name = "employee_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer employeeId;

  @Column(name = "sort_order", nullable = false)
  private Integer sortOrder;

  @Column(name = "employee_name", nullable = false)
  private String employeeName;

  @Column(name = "employee_no")
  private String employeeNo;

  @Column(name = "employee_code", nullable = false)
  private String employeeCode;

  @Column(name = "chief_employee_status", nullable = false)
  private Boolean chiefEmployeeStatus;

  @Column(name = "ref_employee_type_id", nullable = false)
  private Integer refEmployeeTypeId;

  @Column(name = "ref_specialization_id", nullable = false)
  private Integer refSpecializationId;

  @Column(name = "experience", nullable = false)
  private String experience;

  @Column(name = "pincode", nullable = false)
  private Integer pincode;

  @Column(name = "ref_country_id", nullable = false)
  private Integer refCountryId;

  @Column(name = "ref_state_id", nullable = false)
  private Integer refStateId;

  @Column(name = "ref_district_id", nullable = false)
  private Integer refDistrictId;

  @Column(name = "contact_number_1", nullable = false)
  private String contactNumber1;

  @Column(name = "contact_email_1", nullable = false)
  private String contactEmail1;

  @Column(name = "qualification", nullable = false)
  private String qualification;

  @Column(name = "designtion", nullable = false)
  private String designtion;

  @Column(name = "profile_pic", nullable = false)
  private String profilePic;

  @Column(name = "consulting_fees", nullable = false)
  private Integer consultingFees;

  @Column(name = "comm_to_clinic", nullable = false)
  private Integer commToClinic;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "employee_address_line1", nullable = false)
  private String employeeAddressLine1;

  @Column(name = "employee_address_line2", nullable = false)
  private String employeeAddressLine2;

  @Column(name = "employee_address_line3", nullable = false)
  private String employeeAddressLine3;

  @Column(name = "supplier_description", nullable = false)
  private String supplierDescription;

}
