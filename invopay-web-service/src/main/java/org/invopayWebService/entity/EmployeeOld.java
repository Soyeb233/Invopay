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
@Table(name = "employee_old")
public class EmployeeOld {

  @Id
  @Column(name = "employee_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer employeeId;

  @Column(name = "employee_name", nullable = false)
  private String employeeName;

  @Column(name = "employee_data_collection_date_and_time", nullable = false)
  private Date employeeDataCollectionDateAndTime;

  @Column(name = "ref_business_category_id", nullable = false)
  private Integer refBusinessCategoryId;

  @Column(name = "ref_salutation_id", nullable = false)
  private Integer refSalutationId;

  @Column(name = "employee_address_line1", nullable = false)
  private String employeeAddressLine1;

  @Column(name = "employee_address_line2", nullable = false)
  private String employeeAddressLine2;

  @Column(name = "employee_address_line3", nullable = false)
  private String employeeAddressLine3;

  @Column(name = "ref_country_id", nullable = false)
  private Integer refCountryId;

  @Column(name = "ref_state_id", nullable = false)
  private Integer refStateId;

  @Column(name = "ref_district_id", nullable = false)
  private Integer refDistrictId;

  @Column(name = "employee_pincode", nullable = false)
  private String employeePincode;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "employee_description", nullable = false)
  private String employeeDescription;

}
