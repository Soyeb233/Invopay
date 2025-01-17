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
public class LeadDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        leadName;
    private Integer       leadId;
    private LocalDateTime leadDataCollectionDateAndTime;
    private Integer       refDataSourceId;
    private String        leadDataSourceOthers;
    private String        leadDataSourceLink;
    private Integer       refBusinessCategoryId;
    private String        refSalutationId;
    private String        leadAddressLine1;
    private String        leadAddressLine2;
    private String        leadAddressLine3;
    private Integer       refAreaId;
    private Integer       refCityId;
    private Integer       refDistrictId;
    private Integer       refStateId;
    private Integer       refCountryId;
    private String        leadPincode;
    private LocalDate     leadReferredDate;
    private String        leadReferredBy;
    private Integer       deleteStatus;
    private Integer       refUserId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public LeadDTO() {}

    public LeadDTO(LeadDTO value) {
        this.leadName = value.leadName;
        this.leadId = value.leadId;
        this.leadDataCollectionDateAndTime = value.leadDataCollectionDateAndTime;
        this.refDataSourceId = value.refDataSourceId;
        this.leadDataSourceOthers = value.leadDataSourceOthers;
        this.leadDataSourceLink = value.leadDataSourceLink;
        this.refBusinessCategoryId = value.refBusinessCategoryId;
        this.refSalutationId = value.refSalutationId;
        this.leadAddressLine1 = value.leadAddressLine1;
        this.leadAddressLine2 = value.leadAddressLine2;
        this.leadAddressLine3 = value.leadAddressLine3;
        this.refAreaId = value.refAreaId;
        this.refCityId = value.refCityId;
        this.refDistrictId = value.refDistrictId;
        this.refStateId = value.refStateId;
        this.refCountryId = value.refCountryId;
        this.leadPincode = value.leadPincode;
        this.leadReferredDate = value.leadReferredDate;
        this.leadReferredBy = value.leadReferredBy;
        this.deleteStatus = value.deleteStatus;
        this.refUserId = value.refUserId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public LeadDTO(
        String        leadName,
        Integer       leadId,
        LocalDateTime leadDataCollectionDateAndTime,
        Integer       refDataSourceId,
        String        leadDataSourceOthers,
        String        leadDataSourceLink,
        Integer       refBusinessCategoryId,
        String        refSalutationId,
        String        leadAddressLine1,
        String        leadAddressLine2,
        String        leadAddressLine3,
        Integer       refAreaId,
        Integer       refCityId,
        Integer       refDistrictId,
        Integer       refStateId,
        Integer       refCountryId,
        String        leadPincode,
        LocalDate     leadReferredDate,
        String        leadReferredBy,
        Integer       deleteStatus,
        Integer       refUserId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.leadName = leadName;
        this.leadId = leadId;
        this.leadDataCollectionDateAndTime = leadDataCollectionDateAndTime;
        this.refDataSourceId = refDataSourceId;
        this.leadDataSourceOthers = leadDataSourceOthers;
        this.leadDataSourceLink = leadDataSourceLink;
        this.refBusinessCategoryId = refBusinessCategoryId;
        this.refSalutationId = refSalutationId;
        this.leadAddressLine1 = leadAddressLine1;
        this.leadAddressLine2 = leadAddressLine2;
        this.leadAddressLine3 = leadAddressLine3;
        this.refAreaId = refAreaId;
        this.refCityId = refCityId;
        this.refDistrictId = refDistrictId;
        this.refStateId = refStateId;
        this.refCountryId = refCountryId;
        this.leadPincode = leadPincode;
        this.leadReferredDate = leadReferredDate;
        this.leadReferredBy = leadReferredBy;
        this.deleteStatus = deleteStatus;
        this.refUserId = refUserId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.lead.lead_name</code>. Lead Name
     */
    public String getLeadName() {
        return this.leadName;
    }

    /**
     * Setter for <code>invopay.lead.lead_name</code>. Lead Name
     */
    public LeadDTO setLeadName(String leadName) {
        this.leadName = leadName;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.lead_id</code>. Lead ID
     */
    public Integer getLeadId() {
        return this.leadId;
    }

    /**
     * Setter for <code>invopay.lead.lead_id</code>. Lead ID
     */
    public LeadDTO setLeadId(Integer leadId) {
        this.leadId = leadId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.lead_data_collection_date_and_time</code>. Data Collection Date
     */
    public LocalDateTime getLeadDataCollectionDateAndTime() {
        return this.leadDataCollectionDateAndTime;
    }

    /**
     * Setter for <code>invopay.lead.lead_data_collection_date_and_time</code>. Data Collection Date
     */
    public LeadDTO setLeadDataCollectionDateAndTime(LocalDateTime leadDataCollectionDateAndTime) {
        this.leadDataCollectionDateAndTime = leadDataCollectionDateAndTime;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.ref_data_source_id</code>. Data Source
     */
    public Integer getRefDataSourceId() {
        return this.refDataSourceId;
    }

    /**
     * Setter for <code>invopay.lead.ref_data_source_id</code>. Data Source
     */
    public LeadDTO setRefDataSourceId(Integer refDataSourceId) {
        this.refDataSourceId = refDataSourceId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.lead_data_source_others</code>.
     */
    public String getLeadDataSourceOthers() {
        return this.leadDataSourceOthers;
    }

    /**
     * Setter for <code>invopay.lead.lead_data_source_others</code>.
     */
    public LeadDTO setLeadDataSourceOthers(String leadDataSourceOthers) {
        this.leadDataSourceOthers = leadDataSourceOthers;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.lead_data_source_link</code>. Data Source Link
     */
    public String getLeadDataSourceLink() {
        return this.leadDataSourceLink;
    }

    /**
     * Setter for <code>invopay.lead.lead_data_source_link</code>. Data Source Link
     */
    public LeadDTO setLeadDataSourceLink(String leadDataSourceLink) {
        this.leadDataSourceLink = leadDataSourceLink;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.ref_business_category_id</code>. Category
     */
    public Integer getRefBusinessCategoryId() {
        return this.refBusinessCategoryId;
    }

    /**
     * Setter for <code>invopay.lead.ref_business_category_id</code>. Category
     */
    public LeadDTO setRefBusinessCategoryId(Integer refBusinessCategoryId) {
        this.refBusinessCategoryId = refBusinessCategoryId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.ref_salutation_id</code>.
     */
    public String getRefSalutationId() {
        return this.refSalutationId;
    }

    /**
     * Setter for <code>invopay.lead.ref_salutation_id</code>.
     */
    public LeadDTO setRefSalutationId(String refSalutationId) {
        this.refSalutationId = refSalutationId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.lead_address_line1</code>.
     */
    public String getLeadAddressLine1() {
        return this.leadAddressLine1;
    }

    /**
     * Setter for <code>invopay.lead.lead_address_line1</code>.
     */
    public LeadDTO setLeadAddressLine1(String leadAddressLine1) {
        this.leadAddressLine1 = leadAddressLine1;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.lead_address_line2</code>.
     */
    public String getLeadAddressLine2() {
        return this.leadAddressLine2;
    }

    /**
     * Setter for <code>invopay.lead.lead_address_line2</code>.
     */
    public LeadDTO setLeadAddressLine2(String leadAddressLine2) {
        this.leadAddressLine2 = leadAddressLine2;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.lead_address_line3</code>.
     */
    public String getLeadAddressLine3() {
        return this.leadAddressLine3;
    }

    /**
     * Setter for <code>invopay.lead.lead_address_line3</code>.
     */
    public LeadDTO setLeadAddressLine3(String leadAddressLine3) {
        this.leadAddressLine3 = leadAddressLine3;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.ref_area_id</code>. Area
     */
    public Integer getRefAreaId() {
        return this.refAreaId;
    }

    /**
     * Setter for <code>invopay.lead.ref_area_id</code>. Area
     */
    public LeadDTO setRefAreaId(Integer refAreaId) {
        this.refAreaId = refAreaId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.ref_city_id</code>.
     */
    public Integer getRefCityId() {
        return this.refCityId;
    }

    /**
     * Setter for <code>invopay.lead.ref_city_id</code>.
     */
    public LeadDTO setRefCityId(Integer refCityId) {
        this.refCityId = refCityId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.ref_district_id</code>. District
     */
    public Integer getRefDistrictId() {
        return this.refDistrictId;
    }

    /**
     * Setter for <code>invopay.lead.ref_district_id</code>. District
     */
    public LeadDTO setRefDistrictId(Integer refDistrictId) {
        this.refDistrictId = refDistrictId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.ref_state_id</code>. State
     */
    public Integer getRefStateId() {
        return this.refStateId;
    }

    /**
     * Setter for <code>invopay.lead.ref_state_id</code>. State
     */
    public LeadDTO setRefStateId(Integer refStateId) {
        this.refStateId = refStateId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.ref_country_id</code>.
     */
    public Integer getRefCountryId() {
        return this.refCountryId;
    }

    /**
     * Setter for <code>invopay.lead.ref_country_id</code>.
     */
    public LeadDTO setRefCountryId(Integer refCountryId) {
        this.refCountryId = refCountryId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.lead_pincode</code>.
     */
    public String getLeadPincode() {
        return this.leadPincode;
    }

    /**
     * Setter for <code>invopay.lead.lead_pincode</code>.
     */
    public LeadDTO setLeadPincode(String leadPincode) {
        this.leadPincode = leadPincode;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.lead_referred_date</code>.
     */
    public LocalDate getLeadReferredDate() {
        return this.leadReferredDate;
    }

    /**
     * Setter for <code>invopay.lead.lead_referred_date</code>.
     */
    public LeadDTO setLeadReferredDate(LocalDate leadReferredDate) {
        this.leadReferredDate = leadReferredDate;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.lead_referred_by</code>. Referrd By
     */
    public String getLeadReferredBy() {
        return this.leadReferredBy;
    }

    /**
     * Setter for <code>invopay.lead.lead_referred_by</code>. Referrd By
     */
    public LeadDTO setLeadReferredBy(String leadReferredBy) {
        this.leadReferredBy = leadReferredBy;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.lead.delete_status</code>.
     */
    public LeadDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.lead.ref_user_id</code>.
     */
    public LeadDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.lead.transaction_id</code>.
     */
    public LeadDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.lead.added_date</code>.
     */
    public LeadDTO setAddedDate(LocalDateTime addedDate) {
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
        final LeadDTO other = (LeadDTO) obj;
        if (leadName == null) {
            if (other.leadName != null)
                return false;
        }
        else if (!leadName.equals(other.leadName))
            return false;
        if (leadId == null) {
            if (other.leadId != null)
                return false;
        }
        else if (!leadId.equals(other.leadId))
            return false;
        if (leadDataCollectionDateAndTime == null) {
            if (other.leadDataCollectionDateAndTime != null)
                return false;
        }
        else if (!leadDataCollectionDateAndTime.equals(other.leadDataCollectionDateAndTime))
            return false;
        if (refDataSourceId == null) {
            if (other.refDataSourceId != null)
                return false;
        }
        else if (!refDataSourceId.equals(other.refDataSourceId))
            return false;
        if (leadDataSourceOthers == null) {
            if (other.leadDataSourceOthers != null)
                return false;
        }
        else if (!leadDataSourceOthers.equals(other.leadDataSourceOthers))
            return false;
        if (leadDataSourceLink == null) {
            if (other.leadDataSourceLink != null)
                return false;
        }
        else if (!leadDataSourceLink.equals(other.leadDataSourceLink))
            return false;
        if (refBusinessCategoryId == null) {
            if (other.refBusinessCategoryId != null)
                return false;
        }
        else if (!refBusinessCategoryId.equals(other.refBusinessCategoryId))
            return false;
        if (refSalutationId == null) {
            if (other.refSalutationId != null)
                return false;
        }
        else if (!refSalutationId.equals(other.refSalutationId))
            return false;
        if (leadAddressLine1 == null) {
            if (other.leadAddressLine1 != null)
                return false;
        }
        else if (!leadAddressLine1.equals(other.leadAddressLine1))
            return false;
        if (leadAddressLine2 == null) {
            if (other.leadAddressLine2 != null)
                return false;
        }
        else if (!leadAddressLine2.equals(other.leadAddressLine2))
            return false;
        if (leadAddressLine3 == null) {
            if (other.leadAddressLine3 != null)
                return false;
        }
        else if (!leadAddressLine3.equals(other.leadAddressLine3))
            return false;
        if (refAreaId == null) {
            if (other.refAreaId != null)
                return false;
        }
        else if (!refAreaId.equals(other.refAreaId))
            return false;
        if (refCityId == null) {
            if (other.refCityId != null)
                return false;
        }
        else if (!refCityId.equals(other.refCityId))
            return false;
        if (refDistrictId == null) {
            if (other.refDistrictId != null)
                return false;
        }
        else if (!refDistrictId.equals(other.refDistrictId))
            return false;
        if (refStateId == null) {
            if (other.refStateId != null)
                return false;
        }
        else if (!refStateId.equals(other.refStateId))
            return false;
        if (refCountryId == null) {
            if (other.refCountryId != null)
                return false;
        }
        else if (!refCountryId.equals(other.refCountryId))
            return false;
        if (leadPincode == null) {
            if (other.leadPincode != null)
                return false;
        }
        else if (!leadPincode.equals(other.leadPincode))
            return false;
        if (leadReferredDate == null) {
            if (other.leadReferredDate != null)
                return false;
        }
        else if (!leadReferredDate.equals(other.leadReferredDate))
            return false;
        if (leadReferredBy == null) {
            if (other.leadReferredBy != null)
                return false;
        }
        else if (!leadReferredBy.equals(other.leadReferredBy))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
            return false;
        if (refUserId == null) {
            if (other.refUserId != null)
                return false;
        }
        else if (!refUserId.equals(other.refUserId))
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
        result = prime * result + ((this.leadName == null) ? 0 : this.leadName.hashCode());
        result = prime * result + ((this.leadId == null) ? 0 : this.leadId.hashCode());
        result = prime * result + ((this.leadDataCollectionDateAndTime == null) ? 0 : this.leadDataCollectionDateAndTime.hashCode());
        result = prime * result + ((this.refDataSourceId == null) ? 0 : this.refDataSourceId.hashCode());
        result = prime * result + ((this.leadDataSourceOthers == null) ? 0 : this.leadDataSourceOthers.hashCode());
        result = prime * result + ((this.leadDataSourceLink == null) ? 0 : this.leadDataSourceLink.hashCode());
        result = prime * result + ((this.refBusinessCategoryId == null) ? 0 : this.refBusinessCategoryId.hashCode());
        result = prime * result + ((this.refSalutationId == null) ? 0 : this.refSalutationId.hashCode());
        result = prime * result + ((this.leadAddressLine1 == null) ? 0 : this.leadAddressLine1.hashCode());
        result = prime * result + ((this.leadAddressLine2 == null) ? 0 : this.leadAddressLine2.hashCode());
        result = prime * result + ((this.leadAddressLine3 == null) ? 0 : this.leadAddressLine3.hashCode());
        result = prime * result + ((this.refAreaId == null) ? 0 : this.refAreaId.hashCode());
        result = prime * result + ((this.refCityId == null) ? 0 : this.refCityId.hashCode());
        result = prime * result + ((this.refDistrictId == null) ? 0 : this.refDistrictId.hashCode());
        result = prime * result + ((this.refStateId == null) ? 0 : this.refStateId.hashCode());
        result = prime * result + ((this.refCountryId == null) ? 0 : this.refCountryId.hashCode());
        result = prime * result + ((this.leadPincode == null) ? 0 : this.leadPincode.hashCode());
        result = prime * result + ((this.leadReferredDate == null) ? 0 : this.leadReferredDate.hashCode());
        result = prime * result + ((this.leadReferredBy == null) ? 0 : this.leadReferredBy.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lead (");

        sb.append(leadName);
        sb.append(", ").append(leadId);
        sb.append(", ").append(leadDataCollectionDateAndTime);
        sb.append(", ").append(refDataSourceId);
        sb.append(", ").append(leadDataSourceOthers);
        sb.append(", ").append(leadDataSourceLink);
        sb.append(", ").append(refBusinessCategoryId);
        sb.append(", ").append(refSalutationId);
        sb.append(", ").append(leadAddressLine1);
        sb.append(", ").append(leadAddressLine2);
        sb.append(", ").append(leadAddressLine3);
        sb.append(", ").append(refAreaId);
        sb.append(", ").append(refCityId);
        sb.append(", ").append(refDistrictId);
        sb.append(", ").append(refStateId);
        sb.append(", ").append(refCountryId);
        sb.append(", ").append(leadPincode);
        sb.append(", ").append(leadReferredDate);
        sb.append(", ").append(leadReferredBy);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
