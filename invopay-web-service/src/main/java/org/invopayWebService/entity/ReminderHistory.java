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
@Table(name = "reminder_history")
public class ReminderHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "reminder_history_id", nullable = false)
  private Integer reminderHistoryId;

  @Column(name = "ref_general_reminder_id", nullable = false)
  private Integer refGeneralReminderId;

  @Column(name = "start_time", nullable = false)
  private Date startTime;

  @Column(name = "stop_time", nullable = false)
  private Date stopTime;

  @Column(name = "total_minutes", nullable = false)
  private Integer totalMinutes;

  @Column(name = "details", nullable = false)
  private String details;

  @Column(name = "reference_file", nullable = false)
  private String referenceFile;

  @Column(name = "reference_link", nullable = false)
  private String referenceLink;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "file_update_status", nullable = false)
  private Integer fileUpdateStatus;

}
