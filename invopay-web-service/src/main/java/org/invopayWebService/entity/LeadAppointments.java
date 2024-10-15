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
@Table(name = "lead_appointments")
public class LeadAppointments {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "lead_appointment_id", nullable = false)
  private Integer leadAppointmentId;

  @Column(name = "ref_lead_id", nullable = false)
  private Integer refLeadId;

  @Column(name = "appointment_process_date", nullable = false)
  private Date appointmentProcessDate;

  @Column(name = "appointment_visit_date", nullable = false)
  private Date appointmentVisitDate;

  @Column(name = "appointment_address", nullable = false)
  private String appointmentAddress;

  @Column(name = "appointment_landmark", nullable = false)
  private String appointmentLandmark;

  @Column(name = "appointment_to_confirm", nullable = false)
  private Integer appointmentToConfirm;

  @Column(name = "appointment_to_confirm_date", nullable = false)
  private Date appointmentToConfirmDate;

  @Column(name = "ref_appointment_feedback_id", nullable = false)
  private Integer refAppointmentFeedbackId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "appointment_comments", nullable = false)
  private String appointmentComments;

}
