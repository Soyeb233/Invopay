package org.invopayWebService.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "state")
public class State {

  @Id
  @Column(name = "state_id", nullable = false)
  private Integer stateId;

  @Column(name = "ref_country_id", nullable = false)
  private Integer refCountryId;

  @Column(name = "state_name", nullable = false)
  private String stateName;

  @Column(name = "code", nullable = false)
  private String code;

  @Column(name = "status", nullable = false)
  private Boolean status;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "user_id", nullable = false)
  private Integer userId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
