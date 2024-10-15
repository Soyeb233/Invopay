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
@Table(name = "patient_1")
public class Patient1 {

  @Id
  @Column(name = "patient_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer patientId;

  @Column(name = "patient_name", nullable = false)
  private String patientName;

  @Column(name = "profile_pic", nullable = false)
  private String profilePic;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "mobile", nullable = false)
  private Long mobile;

  @Column(name = "age", nullable = false)
  private Integer age;

  @Column(name = "weight", nullable = false)
  private Integer weight;

  @Column(name = "patient_address_line1", nullable = false)
  private String patientAddressLine1;

  @Column(name = "patient_address_line2", nullable = false)
  private String patientAddressLine2;

  @Column(name = "patient_address_line3", nullable = false)
  private String patientAddressLine3;

  @Column(name = "ref_country_id", nullable = false)
  private Integer refCountryId;

  @Column(name = "ref_state_id", nullable = false)
  private Integer refStateId;

  @Column(name = "ref_district_id", nullable = false)
  private Integer refDistrictId;

  @Column(name = "pincode", nullable = false)
  private Integer pincode;

  @Column(name = "ref_patient_reference_id", nullable = false)
  private Integer refPatientReferenceId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "gender", nullable = false)
  private String gender;

}
