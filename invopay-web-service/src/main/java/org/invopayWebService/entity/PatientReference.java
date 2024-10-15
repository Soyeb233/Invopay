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
@Table(name = "patient_reference")
public class PatientReference {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "patient_reference_id", nullable = false)
  private Integer patientReferenceId;

  @Column(name = "patient_reference_name", nullable = false)
  private String patientReferenceName;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}