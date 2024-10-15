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
@Table(name = "client_facebook_page")
public class ClientFacebookPage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "client_facebook_page_id", nullable = false)
  private Integer clientFacebookPageId;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "client_facebook_page_name", nullable = false)
  private String clientFacebookPageName;

  @Column(name = "facebook_page_id", nullable = false)
  private String facebookPageId;

  @Column(name = "token_created_date", nullable = false)
  private Date tokenCreatedDate;

  @Column(name = "facebook_user_name", nullable = false)
  private String facebookUserName;

  @Column(name = "facebook_password", nullable = false)
  private String facebookPassword;

  @Column(name = "token_expiry_date", nullable = false)
  private Date tokenExpiryDate;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "facebook_page_link", nullable = false)
  private String facebookPageLink;

  @Column(name = "facebook_page_access_token", nullable = false)
  private String facebookPageAccessToken;

}
