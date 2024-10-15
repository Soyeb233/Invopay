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
@Table(name = "gst_type")
public class GstType {

  @Id
  @Column(name = "gst_type_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer gstTypeId;

  @Column(name = "gst_type_name", nullable = false)
  private String gstTypeName;

  @Column(name = "gst_perc", nullable = false)
  private Integer gstPerc;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
