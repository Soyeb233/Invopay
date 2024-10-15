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
@Table(name = "patient_panchakarma")
public class PatientPanchakarma {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "patient_panchakarma_id", nullable = false)
  private Integer patientPanchakarmaId;

  @Column(name = "ref_panchakarma_id", nullable = false)
  private Integer refPanchakarmaId;

  @Column(name = "duration", nullable = false)
  private Integer duration;

  @Column(name = "ref_patient_visit_id", nullable = false)
  private Integer refPatientVisitId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
