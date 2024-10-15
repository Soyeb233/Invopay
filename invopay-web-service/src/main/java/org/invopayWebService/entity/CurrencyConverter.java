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
@Table(name = "currency_converter")
public class CurrencyConverter {

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "status", nullable = false)
  private Boolean status;

  @Column(name = "country")
  private String country;

  @Column(name = "value")
  private Double value;

  @Column(name = "currency_symbol", nullable = false)
  private String currencySymbol;

  @Column(name = "date_time", nullable = false)
  private Date dateTime;

}
