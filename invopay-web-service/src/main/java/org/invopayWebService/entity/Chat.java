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
@Table(name = "chat")
public class Chat {

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "member_from", nullable = false)
  private Integer memberFrom;

  @Column(name = "member_to", nullable = false)
  private Integer memberTo;

  @Column(name = "from", nullable = false)
  private String from;

  @Column(name = "to", nullable = false)
  private String to;

  @Column(name = "sent", nullable = false)
  private Date sent;

  @Column(name = "recd", nullable = false)
  private Long recd;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "message", nullable = false)
  private String message;

}
