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
@Table(name = "client_calls")
public class ClientCalls {

  @Id
  @Column(name = "client_call_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer clientCallId;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "call_type", nullable = false)
  private Integer callType;

  @Column(name = "client_call_date_and_time", nullable = false)
  private Date clientCallDateAndTime;

  @Column(name = "contact_number", nullable = false)
  private String contactNumber;

  @Column(name = "client_call_duration", nullable = false)
  private String clientCallDuration;

  @Column(name = "ref_client_call_purpose_id", nullable = false)
  private Integer refClientCallPurposeId;

  @Column(name = "ref_client_call_not_connected_id", nullable = false)
  private Integer refClientCallNotConnectedId;

  @Column(name = "ref_client_call_feedback_id", nullable = false)
  private Integer refClientCallFeedbackId;

  @Column(name = "client_call_reminder", nullable = false)
  private Integer clientCallReminder;

  @Column(name = "client_call_reminder_date", nullable = false)
  private Date clientCallReminderDate;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "client_call_comments", nullable = false)
  private String clientCallComments;

}
