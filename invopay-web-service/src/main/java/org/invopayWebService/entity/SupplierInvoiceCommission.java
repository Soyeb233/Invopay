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
@Table(name = "supplier_invoice_commission")
public class SupplierInvoiceCommission {

  @Id
  @Column(name = "commission_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer commissionId;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "ref_payment_type_id", nullable = false)
  private Integer refPaymentTypeId;

  @Column(name = "received_date", nullable = false)
  private Date receivedDate;

  @Column(name = "total_amount", nullable = false)
  private Float totalAmount;

  @Column(name = "remarks", nullable = false)
  private String remarks;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
