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
@Table(name = "patient_old")
public class PatientOld {

  @Id
  @Column(name = "patient_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer patientId;

  @Column(name = "patient_name", nullable = false)
  private String patientName;

  @Column(name = "contact_number_1", nullable = false)
  private Long contactNumber1;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
