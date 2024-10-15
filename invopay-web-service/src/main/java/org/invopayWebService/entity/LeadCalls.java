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
@Table(name = "lead_calls")
public class LeadCalls {

  @Id
  @Column(name = "lead_call_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer leadCallId;

  @Column(name = "ref_lead_id", nullable = false)
  private Integer refLeadId;

  @Column(name = "call_type", nullable = false)
  private String callType;

  @Column(name = "lead_call_date_and_time", nullable = false)
  private Date leadCallDateAndTime;

  @Column(name = "contact_number", nullable = false)
  private String contactNumber;

  @Column(name = "lead_call_duration", nullable = false)
  private String leadCallDuration;

  @Column(name = "ref_lead_call_not_connected_id", nullable = false)
  private Integer refLeadCallNotConnectedId;

  @Column(name = "ref_lead_call_feedback_id", nullable = false)
  private Integer refLeadCallFeedbackId;

  @Column(name = "lead_call_reminder", nullable = false)
  private Integer leadCallReminder;

  @Column(name = "lead_call_reminder_date", nullable = false)
  private Date leadCallReminderDate;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "lead_call_comments", nullable = false)
  private String leadCallComments;

}
