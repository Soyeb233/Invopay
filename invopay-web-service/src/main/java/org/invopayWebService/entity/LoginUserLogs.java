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
@Table(name = "login_user_logs")
public class  LoginUserLogs {

  @Id
  @Column(name = "log_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer logId;

  @Column(name = "user_id", nullable = false)
  private Integer userId;

  @Column(name = "ip_address", nullable = false)
  private String ipAddress;

  @Column(name = "logged_in_date", nullable = false)
  private Date loggedInDate;

  @Column(name = "logged_out_date", nullable = false)
  private Date loggedOutDate;

  @Column(name = "name")
  private String name;

}
