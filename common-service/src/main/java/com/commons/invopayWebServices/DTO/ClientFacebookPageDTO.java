/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientFacebookPageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       clientFacebookPageId;
    private Integer       refClientId;
    private String        clientFacebookPageName;
    private String        facebookPageId;
    private String        facebookPageLink;
    private String        facebookPageAccessToken;
    private LocalDate     tokenCreatedDate;
    private String        facebookUserName;
    private String        facebookPassword;
    private LocalDate     tokenExpiryDate;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ClientFacebookPageDTO() {}

    public ClientFacebookPageDTO(ClientFacebookPageDTO value) {
        this.clientFacebookPageId = value.clientFacebookPageId;
        this.refClientId = value.refClientId;
        this.clientFacebookPageName = value.clientFacebookPageName;
        this.facebookPageId = value.facebookPageId;
        this.facebookPageLink = value.facebookPageLink;
        this.facebookPageAccessToken = value.facebookPageAccessToken;
        this.tokenCreatedDate = value.tokenCreatedDate;
        this.facebookUserName = value.facebookUserName;
        this.facebookPassword = value.facebookPassword;
        this.tokenExpiryDate = value.tokenExpiryDate;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ClientFacebookPageDTO(
        Integer       clientFacebookPageId,
        Integer       refClientId,
        String        clientFacebookPageName,
        String        facebookPageId,
        String        facebookPageLink,
        String        facebookPageAccessToken,
        LocalDate     tokenCreatedDate,
        String        facebookUserName,
        String        facebookPassword,
        LocalDate     tokenExpiryDate,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.clientFacebookPageId = clientFacebookPageId;
        this.refClientId = refClientId;
        this.clientFacebookPageName = clientFacebookPageName;
        this.facebookPageId = facebookPageId;
        this.facebookPageLink = facebookPageLink;
        this.facebookPageAccessToken = facebookPageAccessToken;
        this.tokenCreatedDate = tokenCreatedDate;
        this.facebookUserName = facebookUserName;
        this.facebookPassword = facebookPassword;
        this.tokenExpiryDate = tokenExpiryDate;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.client_facebook_page_id</code>.
     */
    public Integer getClientFacebookPageId() {
        return this.clientFacebookPageId;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.client_facebook_page_id</code>.
     */
    public ClientFacebookPageDTO setClientFacebookPageId(Integer clientFacebookPageId) {
        this.clientFacebookPageId = clientFacebookPageId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.ref_client_id</code>. Client
     */
    public Integer getRefClientId() {
        return this.refClientId;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.ref_client_id</code>. Client
     */
    public ClientFacebookPageDTO setRefClientId(Integer refClientId) {
        this.refClientId = refClientId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.client_facebook_page_name</code>.
     */
    public String getClientFacebookPageName() {
        return this.clientFacebookPageName;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.client_facebook_page_name</code>.
     */
    public ClientFacebookPageDTO setClientFacebookPageName(String clientFacebookPageName) {
        this.clientFacebookPageName = clientFacebookPageName;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.facebook_page_id</code>.
     */
    public String getFacebookPageId() {
        return this.facebookPageId;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.facebook_page_id</code>.
     */
    public ClientFacebookPageDTO setFacebookPageId(String facebookPageId) {
        this.facebookPageId = facebookPageId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.facebook_page_link</code>.
     */
    public String getFacebookPageLink() {
        return this.facebookPageLink;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.facebook_page_link</code>.
     */
    public ClientFacebookPageDTO setFacebookPageLink(String facebookPageLink) {
        this.facebookPageLink = facebookPageLink;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.facebook_page_access_token</code>.
     */
    public String getFacebookPageAccessToken() {
        return this.facebookPageAccessToken;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.facebook_page_access_token</code>.
     */
    public ClientFacebookPageDTO setFacebookPageAccessToken(String facebookPageAccessToken) {
        this.facebookPageAccessToken = facebookPageAccessToken;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.token_created_date</code>.
     */
    public LocalDate getTokenCreatedDate() {
        return this.tokenCreatedDate;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.token_created_date</code>.
     */
    public ClientFacebookPageDTO setTokenCreatedDate(LocalDate tokenCreatedDate) {
        this.tokenCreatedDate = tokenCreatedDate;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.facebook_user_name</code>.
     */
    public String getFacebookUserName() {
        return this.facebookUserName;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.facebook_user_name</code>.
     */
    public ClientFacebookPageDTO setFacebookUserName(String facebookUserName) {
        this.facebookUserName = facebookUserName;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.facebook_password</code>.
     */
    public String getFacebookPassword() {
        return this.facebookPassword;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.facebook_password</code>.
     */
    public ClientFacebookPageDTO setFacebookPassword(String facebookPassword) {
        this.facebookPassword = facebookPassword;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.token_expiry_date</code>.
     */
    public LocalDate getTokenExpiryDate() {
        return this.tokenExpiryDate;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.token_expiry_date</code>.
     */
    public ClientFacebookPageDTO setTokenExpiryDate(LocalDate tokenExpiryDate) {
        this.tokenExpiryDate = tokenExpiryDate;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.ref_user_id</code>.
     */
    public ClientFacebookPageDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.delete_status</code>.
     */
    public ClientFacebookPageDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.transaction_id</code>.
     */
    public ClientFacebookPageDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_facebook_page.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.client_facebook_page.added_date</code>.
     */
    public ClientFacebookPageDTO setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ClientFacebookPageDTO other = (ClientFacebookPageDTO) obj;
        if (clientFacebookPageId == null) {
            if (other.clientFacebookPageId != null)
                return false;
        }
        else if (!clientFacebookPageId.equals(other.clientFacebookPageId))
            return false;
        if (refClientId == null) {
            if (other.refClientId != null)
                return false;
        }
        else if (!refClientId.equals(other.refClientId))
            return false;
        if (clientFacebookPageName == null) {
            if (other.clientFacebookPageName != null)
                return false;
        }
        else if (!clientFacebookPageName.equals(other.clientFacebookPageName))
            return false;
        if (facebookPageId == null) {
            if (other.facebookPageId != null)
                return false;
        }
        else if (!facebookPageId.equals(other.facebookPageId))
            return false;
        if (facebookPageLink == null) {
            if (other.facebookPageLink != null)
                return false;
        }
        else if (!facebookPageLink.equals(other.facebookPageLink))
            return false;
        if (facebookPageAccessToken == null) {
            if (other.facebookPageAccessToken != null)
                return false;
        }
        else if (!facebookPageAccessToken.equals(other.facebookPageAccessToken))
            return false;
        if (tokenCreatedDate == null) {
            if (other.tokenCreatedDate != null)
                return false;
        }
        else if (!tokenCreatedDate.equals(other.tokenCreatedDate))
            return false;
        if (facebookUserName == null) {
            if (other.facebookUserName != null)
                return false;
        }
        else if (!facebookUserName.equals(other.facebookUserName))
            return false;
        if (facebookPassword == null) {
            if (other.facebookPassword != null)
                return false;
        }
        else if (!facebookPassword.equals(other.facebookPassword))
            return false;
        if (tokenExpiryDate == null) {
            if (other.tokenExpiryDate != null)
                return false;
        }
        else if (!tokenExpiryDate.equals(other.tokenExpiryDate))
            return false;
        if (refUserId == null) {
            if (other.refUserId != null)
                return false;
        }
        else if (!refUserId.equals(other.refUserId))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
            return false;
        if (transactionId == null) {
            if (other.transactionId != null)
                return false;
        }
        else if (!transactionId.equals(other.transactionId))
            return false;
        if (addedDate == null) {
            if (other.addedDate != null)
                return false;
        }
        else if (!addedDate.equals(other.addedDate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.clientFacebookPageId == null) ? 0 : this.clientFacebookPageId.hashCode());
        result = prime * result + ((this.refClientId == null) ? 0 : this.refClientId.hashCode());
        result = prime * result + ((this.clientFacebookPageName == null) ? 0 : this.clientFacebookPageName.hashCode());
        result = prime * result + ((this.facebookPageId == null) ? 0 : this.facebookPageId.hashCode());
        result = prime * result + ((this.facebookPageLink == null) ? 0 : this.facebookPageLink.hashCode());
        result = prime * result + ((this.facebookPageAccessToken == null) ? 0 : this.facebookPageAccessToken.hashCode());
        result = prime * result + ((this.tokenCreatedDate == null) ? 0 : this.tokenCreatedDate.hashCode());
        result = prime * result + ((this.facebookUserName == null) ? 0 : this.facebookUserName.hashCode());
        result = prime * result + ((this.facebookPassword == null) ? 0 : this.facebookPassword.hashCode());
        result = prime * result + ((this.tokenExpiryDate == null) ? 0 : this.tokenExpiryDate.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClientFacebookPage (");

        sb.append(clientFacebookPageId);
        sb.append(", ").append(refClientId);
        sb.append(", ").append(clientFacebookPageName);
        sb.append(", ").append(facebookPageId);
        sb.append(", ").append(facebookPageLink);
        sb.append(", ").append(facebookPageAccessToken);
        sb.append(", ").append(tokenCreatedDate);
        sb.append(", ").append(facebookUserName);
        sb.append(", ").append(facebookPassword);
        sb.append(", ").append(tokenExpiryDate);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
