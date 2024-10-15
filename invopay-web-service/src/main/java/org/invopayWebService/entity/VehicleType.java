package org.invopayWebService.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "vehicle_type")
public class VehicleType {

  @Id
  @Column(name = "vehicle_type_id", nullable = false)
  private Integer vehicleTypeId;

  @Column(name = "vehicle_type_name", nullable = false)
  private String vehicleTypeName;

  @Column(name = "sort_order", nullable = false)
  private Integer sortOrder;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "vehicle_type_image", nullable = false)
  private String vehicleTypeImage;

}
