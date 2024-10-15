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
@Table(name = "pincode")
public class Pincode {

  @Id
  @Column(name = "pincode_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer pincodeId;

  @Column(name = "pincode", nullable = false)
  private Integer pincode;

  @Column(name = "pincode_name", nullable = false)
  private String pincodeName;

  @Column(name = "ref_area_id", nullable = false)
  private Integer refAreaId;

  @Column(name = "ref_district_id", nullable = false)
  private Integer refDistrictId;

  @Column(name = "ref_state_id", nullable = false)
  private Integer refStateId;

  @Column(name = "status", nullable = false)
  private Boolean status;

  @Column(name = "created_at", nullable = false)
  private Date createdAt;

}
