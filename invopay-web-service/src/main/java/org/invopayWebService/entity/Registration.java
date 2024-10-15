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
@Table(name = "registration")
public class Registration {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "registration_id", nullable = false)
  private Integer registrationId;

  @Column(name = "memership_type", nullable = false)
  private Integer memershipType;

  @Column(name = "registration_name", nullable = false)
  private String registrationName;

  @Column(name = "father_name", nullable = false)
  private String fatherName;

  @Column(name = "dob", nullable = false)
  private Date dob;

  @Column(name = "blood_group", nullable = false)
  private String bloodGroup;

  @Column(name = "qualification", nullable = false)
  private String qualification;

  @Column(name = "designation", nullable = false)
  private String designation;

  @Column(name = "registration_no", nullable = false)
  private String registrationNo;

  @Column(name = "state_ccim_certificate_file", nullable = false)
  private String stateCcimCertificateFile;

  @Column(name = "photo_file", nullable = false)
  private String photoFile;

  @Column(name = "residence_address", nullable = false)
  private String residenceAddress;

  @Column(name = "residence_city", nullable = false)
  private String residenceCity;

  @Column(name = "residence_state", nullable = false)
  private String residenceState;

  @Column(name = "residence_pincode", nullable = false)
  private Integer residencePincode;

  @Column(name = "residence_phone", nullable = false)
  private String residencePhone;

  @Column(name = "residence_mobile", nullable = false)
  private Long residenceMobile;

  @Column(name = "residence_email", nullable = false)
  private String residenceEmail;

  @Column(name = "hospital_address", nullable = false)
  private String hospitalAddress;

  @Column(name = "hospital_city", nullable = false)
  private String hospitalCity;

  @Column(name = "hospital_state", nullable = false)
  private String hospitalState;

  @Column(name = "hospital_pincode", nullable = false)
  private Integer hospitalPincode;

  @Column(name = "hospital_phone", nullable = false)
  private String hospitalPhone;

  @Column(name = "hospital_mobile", nullable = false)
  private Long hospitalMobile;

  @Column(name = "hospital_email", nullable = false)
  private String hospitalEmail;

  @Column(name = "website", nullable = false)
  private String website;

  @Column(name = "practice_clinical_expertise", nullable = false)
  private String practiceClinicalExpertise;

  @Column(name = "refered_by_1", nullable = false)
  private String referedBy1;

  @Column(name = "refered_by_2", nullable = false)
  private String referedBy2;

  @Column(name = "bams_year", nullable = false)
  private String bamsYear;

  @Column(name = "bams_college", nullable = false)
  private String bamsCollege;

  @Column(name = "bams_university", nullable = false)
  private String bamsUniversity;

  @Column(name = "bams_certificate_file", nullable = false)
  private String bamsCertificateFile;

  @Column(name = "mdms_year", nullable = false)
  private String mdmsYear;

  @Column(name = "mdms_college", nullable = false)
  private String mdmsCollege;

  @Column(name = "mdms_university", nullable = false)
  private String mdmsUniversity;

  @Column(name = "mdms_certificate_file", nullable = false)
  private String mdmsCertificateFile;

  @Column(name = "phd_year", nullable = false)
  private String phdYear;

  @Column(name = "phd_college", nullable = false)
  private String phdCollege;

  @Column(name = "phd_university", nullable = false)
  private String phdUniversity;

  @Column(name = "phd_certificate_file", nullable = false)
  private String phdCertificateFile;

  @Column(name = "others_year", nullable = false)
  private String othersYear;

  @Column(name = "others_college", nullable = false)
  private String othersCollege;

  @Column(name = "others_university", nullable = false)
  private String othersUniversity;

  @Column(name = "others_certificate_file", nullable = false)
  private String othersCertificateFile;

  @Column(name = "payment_status", nullable = false)
  private Integer paymentStatus;

  @Column(name = "payment_id", nullable = false)
  private String paymentId;

  @Column(name = "ref_user_id")
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
