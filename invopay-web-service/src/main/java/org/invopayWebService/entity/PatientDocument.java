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
@Table(name = "patient_document")
public class PatientDocument {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "patient_document_id", nullable = false)
  private Integer patientDocumentId;

  @Column(name = "text1", nullable = false)
  private String text1;

  @Column(name = "document1", nullable = false)
  private String document1;

  @Column(name = "text2", nullable = false)
  private String text2;

  @Column(name = "document2", nullable = false)
  private String document2;

  @Column(name = "text3", nullable = false)
  private String text3;

  @Column(name = "document3", nullable = false)
  private String document3;

  @Column(name = "text4", nullable = false)
  private String text4;

  @Column(name = "document4", nullable = false)
  private String document4;

  @Column(name = "ref_patient_id", nullable = false)
  private Integer refPatientId;

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
