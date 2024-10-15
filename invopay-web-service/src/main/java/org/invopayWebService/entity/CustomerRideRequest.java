package org.invopayWebService.entity;

import java.sql.Time;
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
@Table(name = "customer_ride_request")
public class CustomerRideRequest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_ride_request_id", nullable = false)
  private Integer customerRideRequestId;

  @Column(name = "ref_customer_id", nullable = false)
  private Integer refCustomerId;

  @Column(name = "from_location", nullable = false)
  private Integer fromLocation;

  @Column(name = "to_location", nullable = false)
  private Integer toLocation;

  @Column(name = "from_time", nullable = false)
  private Time fromTime;

  @Column(name = "to_time", nullable = false)
  private Time toTime;

  @Column(name = "travel_date", nullable = false)
  private Date travelDate;

  @Column(name = "no_of_seats", nullable = false)
  private Integer noOfSeats;

  @Column(name = "status")
  private String status;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
