/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;
import java.time.LocalDateTime;



/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ApiCountryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer      apiCountryId;
    private String        apiCountryName;
    private String        countryCode;
    private String        isoCountryCode;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private Integer       refUserId;
    private LocalDateTime addedDate;

    public ApiCountryDTO() {}

    public ApiCountryDTO(ApiCountryDTO value) {
        this.apiCountryId = value.apiCountryId;
        this.apiCountryName = value.apiCountryName;
        this.countryCode = value.countryCode;
        this.isoCountryCode = value.isoCountryCode;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.refUserId = value.refUserId;
        this.addedDate = value.addedDate;
    }

    public ApiCountryDTO(
        Integer      apiCountryId,
        String        apiCountryName,
        String        countryCode,
        String        isoCountryCode,
        Integer       deleteStatus,
        Integer       transactionId,
        Integer       refUserId,
        LocalDateTime addedDate
    ) {
        this.apiCountryId = apiCountryId;
        this.apiCountryName = apiCountryName;
        this.countryCode = countryCode;
        this.isoCountryCode = isoCountryCode;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.refUserId = refUserId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.api_country.api_country_id</code>.
     */
    public Integer getApiCountryId() {
        return this.apiCountryId;
    }

    /**
     * Setter for <code>invopay.api_country.api_country_id</code>.
     */
    public ApiCountryDTO setApiCountryId(Integer apiCountryId) {
        this.apiCountryId = apiCountryId;
        return this;
    }

    /**
     * Getter for <code>invopay.api_country.api_country_name</code>.
     */
    public String getApiCountryName() {
        return this.apiCountryName;
    }

    /**
     * Setter for <code>invopay.api_country.api_country_name</code>.
     */
    public ApiCountryDTO setApiCountryName(String apiCountryName) {
        this.apiCountryName = apiCountryName;
        return this;
    }

    /**
     * Getter for <code>invopay.api_country.country_code</code>.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Setter for <code>invopay.api_country.country_code</code>.
     */
    public ApiCountryDTO setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Getter for <code>invopay.api_country.iso_country_code</code>.
     */
    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * Setter for <code>invopay.api_country.iso_country_code</code>.
     */
    public ApiCountryDTO setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
        return this;
    }

    /**
     * Getter for <code>invopay.api_country.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.api_country.delete_status</code>.
     */
    public ApiCountryDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.api_country.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.api_country.transaction_id</code>.
     */
    public ApiCountryDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.api_country.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.api_country.ref_user_id</code>.
     */
    public ApiCountryDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.api_country.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.api_country.added_date</code>.
     */
    public ApiCountryDTO setAddedDate(LocalDateTime addedDate) {
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
        final ApiCountryDTO other = (ApiCountryDTO) obj;
        if (apiCountryId == null) {
            if (other.apiCountryId != null)
                return false;
        }
        else if (!apiCountryId.equals(other.apiCountryId))
            return false;
        if (apiCountryName == null) {
            if (other.apiCountryName != null)
                return false;
        }
        else if (!apiCountryName.equals(other.apiCountryName))
            return false;
        if (countryCode == null) {
            if (other.countryCode != null)
                return false;
        }
        else if (!countryCode.equals(other.countryCode))
            return false;
        if (isoCountryCode == null) {
            if (other.isoCountryCode != null)
                return false;
        }
        else if (!isoCountryCode.equals(other.isoCountryCode))
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
        if (refUserId == null) {
            if (other.refUserId != null)
                return false;
        }
        else if (!refUserId.equals(other.refUserId))
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
        result = prime * result + ((this.apiCountryId == null) ? 0 : this.apiCountryId.hashCode());
        result = prime * result + ((this.apiCountryName == null) ? 0 : this.apiCountryName.hashCode());
        result = prime * result + ((this.countryCode == null) ? 0 : this.countryCode.hashCode());
        result = prime * result + ((this.isoCountryCode == null) ? 0 : this.isoCountryCode.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ApiCountry (");

        sb.append(apiCountryId);
        sb.append(", ").append(apiCountryName);
        sb.append(", ").append(countryCode);
        sb.append(", ").append(isoCountryCode);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
