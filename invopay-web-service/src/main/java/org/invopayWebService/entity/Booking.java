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
@Table(name = "booking")
public class Booking {

  @Id
  @Column(name = "booking_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer bookingId;

  @Column(name = "booking_name", nullable = false)
  private String bookingName;

  @Column(name = "ref_customer_id", nullable = false)
  private Integer refCustomerId;

  @Column(name = "vehicle_id", nullable = false)
  private Integer vehicleId;

  @Column(name = "customer_ride_request", nullable = false)
  private Integer customerRideRequest;

  @Column(name = "from_address", nullable = false)
  private String fromAddress;

  @Column(name = "to_address", nullable = false)
  private String toAddress;

  @Column(name = "distance_in_km", nullable = false)
  private Float distanceInKm;

  @Column(name = "amount", nullable = false)
  private Float amount;

  @Column(name = "extra_charge", nullable = false)
  private Float extraCharge;

  @Column(name = "sub_total", nullable = false)
  private Float subTotal;

  @Column(name = "gst_percentage", nullable = false)
  private Float gstPercentage;

  @Column(name = "cgst", nullable = false)
  private Float cgst;

  @Column(name = "sgst", nullable = false)
  private Float sgst;

  @Column(name = "igst", nullable = false)
  private Float igst;

  @Column(name = "total_amount", nullable = false)
  private Float totalAmount;

  @Column(name = "booking_date", nullable = false)
  private Date bookingDate;

  @Column(name = "status", nullable = false)
  private String status;

  @Column(name = "vehicle_status", nullable = false)
  private String vehicleStatus;

  @Column(name = "approve_date_time", nullable = false)
  private Date approveDateTime;

  @Column(name = "rejected_date_time", nullable = false)
  private Date rejectedDateTime;

  @Column(name = "cancel_date_time", nullable = false)
  private Date cancelDateTime;

  @Column(name = "travel_time_from", nullable = false)
  private Date travelTimeFrom;

  @Column(name = "travel_time_to", nullable = false)
  private Date travelTimeTo;

  @Column(name = "no_of_seats", nullable = false)
  private Integer noOfSeats;

  @Column(name = "driver_name", nullable = false)
  private String driverName;

  @Column(name = "driver_contact_no", nullable = false)
  private String driverContactNo;

  @Column(name = "star_rating", nullable = false)
  private Integer starRating;

  @Column(name = "customer_feedback", nullable = false)
  private String customerFeedback;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

}
