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
@Table(name = "client_call_not_connected")
public class ClientCallNotConnected {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "client_call_not_connected_id", nullable = false)
  private Integer clientCallNotConnectedId;

  @Column(name = "client_call_not_connected_name", nullable = false)
  private String clientCallNotConnectedName;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "user_id", nullable = false)
  private Integer userId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
