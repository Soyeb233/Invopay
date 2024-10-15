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
@Table(name = "product_enquiry")
public class ProductEnquiry {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_enquiry_id", nullable = false)
  private Integer productEnquiryId;

  @Column(name = "ref_product_id", nullable = false)
  private Integer refProductId;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "venue", nullable = false)
  private String venue;

  @Column(name = "state", nullable = false)
  private String state;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "phone", nullable = false)
  private String phone;

  @Column(name = "message", nullable = false)
  private String message;

  @Column(name = "product_quantity", nullable = false)
  private Integer productQuantity;

  @Column(name = "ref_user_id")
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
