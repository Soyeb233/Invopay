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
@Table(name = "supplier_commission_details")
public class SupplierCommissionDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "commission_detail_id", nullable = false)
  private Integer commissionDetailId;

  @Column(name = "ref_commission_id", nullable = false)
  private Integer refCommissionId;

  @Column(name = "ref_invoice_id", nullable = false)
  private Integer refInvoiceId;

  @Column(name = "commission_amount", nullable = false)
  private Float commissionAmount;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
