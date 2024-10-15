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
@Table(name = "booking_history_status")
public class BookingHistoryStatus {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "booking_history_status_id", nullable = false)
  private Integer bookingHistoryStatusId;

  @Column(name = "ref_booking_id", nullable = false)
  private Integer refBookingId;

  @Column(name = "status", nullable = false)
  private String status;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

}
