package org.invopayWebService.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "vehicle")
public class Vehicle {

  @Id
  @Column(name = "vehicle_id", nullable = false)
  private Integer vehicleId;

  @Column(name = "ref_customer_id", nullable = false)
  private Integer refCustomerId;

  @Column(name = "ref_vehicle_type_id", nullable = false)
  private Integer refVehicleTypeId;

  @Column(name = "vehicle_image_file", nullable = false)
  private String vehicleImageFile;

  @Column(name = "vehicle_reg_no", nullable = false)
  private String vehicleRegNo;

  @Column(name = "vehicle_make", nullable = false)
  private String vehicleMake;

  @Column(name = "vehicle_model", nullable = false)
  private String vehicleModel;

  @Column(name = "no_of_seats", nullable = false)
  private Integer noOfSeats;

  @Column(name = "available_seats", nullable = false)
  private Integer availableSeats;

  @Column(name = "insurnace_file", nullable = false)
  private String insurnaceFile;

  @Column(name = "insurnace_expiry_date", nullable = false)
  private Date insurnaceExpiryDate;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

}
