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
@Table(name = "patient_visit")
public class PatientVisit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "patient_visit_id", nullable = false)
  private Integer patientVisitId;

  @Column(name = "patient_visit_date_time", nullable = false)
  private Date patientVisitDateTime;

  @Column(name = "patient_visit_name", nullable = false)
  private String patientVisitName;

  @Column(name = "ref_employee_id", nullable = false)
  private Integer refEmployeeId;

  @Column(name = "ref_patient_id", nullable = false)
  private Integer refPatientId;

  @Column(name = "ref_specialization_id", nullable = false)
  private Integer refSpecializationId;

  @Column(name = "duration", nullable = false)
  private String duration;

  @Column(name = "ref_ayurveda_diagnosis_id", nullable = false)
  private Integer refAyurvedaDiagnosisId;

  @Column(name = "ref_m_diagnosis_id", nullable = false)
  private Integer refMDiagnosisId;

  @Column(name = "ref_modern_system_id", nullable = false)
  private Integer refModernSystemId;

  @Column(name = "treatment_duration")
  private String treatmentDuration;

  @Column(name = "aayurveda", nullable = false)
  private Integer aayurveda;

  @Column(name = "panchkarma", nullable = false)
  private Integer panchkarma;

  @Column(name = "old_patient", nullable = false)
  private Boolean oldPatient;

  @Column(name = "invoice_status", nullable = false)
  private Boolean invoiceStatus;

  @Column(name = "appointment_status", nullable = false)
  private Boolean appointmentStatus;

  @Column(name = "ref_appointment_reject_reason_id", nullable = false)
  private Integer refAppointmentRejectReasonId;

  @Column(name = "patient_visit_status", nullable = false)
  private Boolean patientVisitStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "current_illness", nullable = false)
  private String currentIllness;

  @Column(name = "current_illness_history", nullable = false)
  private String currentIllnessHistory;

  @Column(name = "previous_taken_treatement", nullable = false)
  private String previousTakenTreatement;

  @Column(name = "diet_remarks", nullable = false)
  private String dietRemarks;

  @Column(name = "do_remarks", nullable = false)
  private String doRemarks;

  @Column(name = "donot_remarks", nullable = false)
  private String donotRemarks;

  @Column(name = "omit_remarks", nullable = false)
  private String omitRemarks;

  @Column(name = "occasional_remarks", nullable = false)
  private String occasionalRemarks;

}
