/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;





import java.io.Serializable;
import java.time.LocalDateTime;

import com.commons.invopayWebServices.ENUMS.BookingStatus;
import com.commons.invopayWebServices.ENUMS.BookingVehicleStatus;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookingDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer              bookingId;
    private String               bookingName;
    private Integer              refCustomerId;
    private Integer              vehicleId;
    private Integer              customerRideRequest;
    private String               fromAddress;
    private String               toAddress;
    private Double               distanceInKm;
    private Double               amount;
    private Double               extraCharge;
    private Double               subTotal;
    private Double               gstPercentage;
    private Double               cgst;
    private Double               sgst;
    private Double               igst;
    private Double               totalAmount;
    private LocalDateTime        bookingDate;
    private BookingStatus        status;
    private BookingVehicleStatus vehicleStatus;
    private LocalDateTime        approveDateTime;
    private LocalDateTime        rejectedDateTime;
    private LocalDateTime        cancelDateTime;
    private LocalDateTime        travelTimeFrom;
    private LocalDateTime        travelTimeTo;
    private Integer              noOfSeats;
    private String               driverName;
    private String               driverContactNo;
    private Integer              starRating;
    private String               customerFeedback;
    private Integer              refUserId;
    private LocalDateTime        addedDate;
    private Integer              transactionId;
    private Integer              deleteStatus;

    public BookingDTO() {}

    public BookingDTO(BookingDTO value) {
        this.bookingId = value.bookingId;
        this.bookingName = value.bookingName;
        this.refCustomerId = value.refCustomerId;
        this.vehicleId = value.vehicleId;
        this.customerRideRequest = value.customerRideRequest;
        this.fromAddress = value.fromAddress;
        this.toAddress = value.toAddress;
        this.distanceInKm = value.distanceInKm;
        this.amount = value.amount;
        this.extraCharge = value.extraCharge;
        this.subTotal = value.subTotal;
        this.gstPercentage = value.gstPercentage;
        this.cgst = value.cgst;
        this.sgst = value.sgst;
        this.igst = value.igst;
        this.totalAmount = value.totalAmount;
        this.bookingDate = value.bookingDate;
        this.status = value.status;
        this.vehicleStatus = value.vehicleStatus;
        this.approveDateTime = value.approveDateTime;
        this.rejectedDateTime = value.rejectedDateTime;
        this.cancelDateTime = value.cancelDateTime;
        this.travelTimeFrom = value.travelTimeFrom;
        this.travelTimeTo = value.travelTimeTo;
        this.noOfSeats = value.noOfSeats;
        this.driverName = value.driverName;
        this.driverContactNo = value.driverContactNo;
        this.starRating = value.starRating;
        this.customerFeedback = value.customerFeedback;
        this.refUserId = value.refUserId;
        this.addedDate = value.addedDate;
        this.transactionId = value.transactionId;
        this.deleteStatus = value.deleteStatus;
    }

    public BookingDTO(
        Integer              bookingId,
        String               bookingName,
        Integer              refCustomerId,
        Integer              vehicleId,
        Integer              customerRideRequest,
        String               fromAddress,
        String               toAddress,
        Double               distanceInKm,
        Double               amount,
        Double               extraCharge,
        Double               subTotal,
        Double               gstPercentage,
        Double               cgst,
        Double               sgst,
        Double               igst,
        Double               totalAmount,
        LocalDateTime        bookingDate,
        BookingStatus        status,
        BookingVehicleStatus vehicleStatus,
        LocalDateTime        approveDateTime,
        LocalDateTime        rejectedDateTime,
        LocalDateTime        cancelDateTime,
        LocalDateTime        travelTimeFrom,
        LocalDateTime        travelTimeTo,
        Integer              noOfSeats,
        String               driverName,
        String               driverContactNo,
        Integer              starRating,
        String               customerFeedback,
        Integer              refUserId,
        LocalDateTime        addedDate,
        Integer              transactionId,
        Integer              deleteStatus
    ) {
        this.bookingId = bookingId;
        this.bookingName = bookingName;
        this.refCustomerId = refCustomerId;
        this.vehicleId = vehicleId;
        this.customerRideRequest = customerRideRequest;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.distanceInKm = distanceInKm;
        this.amount = amount;
        this.extraCharge = extraCharge;
        this.subTotal = subTotal;
        this.gstPercentage = gstPercentage;
        this.cgst = cgst;
        this.sgst = sgst;
        this.igst = igst;
        this.totalAmount = totalAmount;
        this.bookingDate = bookingDate;
        this.status = status;
        this.vehicleStatus = vehicleStatus;
        this.approveDateTime = approveDateTime;
        this.rejectedDateTime = rejectedDateTime;
        this.cancelDateTime = cancelDateTime;
        this.travelTimeFrom = travelTimeFrom;
        this.travelTimeTo = travelTimeTo;
        this.noOfSeats = noOfSeats;
        this.driverName = driverName;
        this.driverContactNo = driverContactNo;
        this.starRating = starRating;
        this.customerFeedback = customerFeedback;
        this.refUserId = refUserId;
        this.addedDate = addedDate;
        this.transactionId = transactionId;
        this.deleteStatus = deleteStatus;
    }

    /**
     * Getter for <code>invopay.booking.booking_id</code>.
     */
    public Integer getBookingId() {
        return this.bookingId;
    }

    /**
     * Setter for <code>invopay.booking.booking_id</code>.
     */
    public BookingDTO setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.booking_name</code>.
     */
    public String getBookingName() {
        return this.bookingName;
    }

    /**
     * Setter for <code>invopay.booking.booking_name</code>.
     */
    public BookingDTO setBookingName(String bookingName) {
        this.bookingName = bookingName;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.ref_customer_id</code>.
     */
    public Integer getRefCustomerId() {
        return this.refCustomerId;
    }

    /**
     * Setter for <code>invopay.booking.ref_customer_id</code>.
     */
    public BookingDTO setRefCustomerId(Integer refCustomerId) {
        this.refCustomerId = refCustomerId;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.vehicle_id</code>.
     */
    public Integer getVehicleId() {
        return this.vehicleId;
    }

    /**
     * Setter for <code>invopay.booking.vehicle_id</code>.
     */
    public BookingDTO setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.customer_ride_request</code>.
     */
    public Integer getCustomerRideRequest() {
        return this.customerRideRequest;
    }

    /**
     * Setter for <code>invopay.booking.customer_ride_request</code>.
     */
    public BookingDTO setCustomerRideRequest(Integer customerRideRequest) {
        this.customerRideRequest = customerRideRequest;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.from_address</code>.
     */
    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * Setter for <code>invopay.booking.from_address</code>.
     */
    public BookingDTO setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.to_address</code>.
     */
    public String getToAddress() {
        return this.toAddress;
    }

    /**
     * Setter for <code>invopay.booking.to_address</code>.
     */
    public BookingDTO setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.distance_in_km</code>.
     */
    public Double getDistanceInKm() {
        return this.distanceInKm;
    }

    /**
     * Setter for <code>invopay.booking.distance_in_km</code>.
     */
    public BookingDTO setDistanceInKm(Double distanceInKm) {
        this.distanceInKm = distanceInKm;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.amount</code>.
     */
    public Double getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>invopay.booking.amount</code>.
     */
    public BookingDTO setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.extra_charge</code>.
     */
    public Double getExtraCharge() {
        return this.extraCharge;
    }

    /**
     * Setter for <code>invopay.booking.extra_charge</code>.
     */
    public BookingDTO setExtraCharge(Double extraCharge) {
        this.extraCharge = extraCharge;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.sub_total</code>.
     */
    public Double getSubTotal() {
        return this.subTotal;
    }

    /**
     * Setter for <code>invopay.booking.sub_total</code>.
     */
    public BookingDTO setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.gst_percentage</code>.
     */
    public Double getGstPercentage() {
        return this.gstPercentage;
    }

    /**
     * Setter for <code>invopay.booking.gst_percentage</code>.
     */
    public BookingDTO setGstPercentage(Double gstPercentage) {
        this.gstPercentage = gstPercentage;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.cgst</code>.
     */
    public Double getCgst() {
        return this.cgst;
    }

    /**
     * Setter for <code>invopay.booking.cgst</code>.
     */
    public BookingDTO setCgst(Double cgst) {
        this.cgst = cgst;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.sgst</code>.
     */
    public Double getSgst() {
        return this.sgst;
    }

    /**
     * Setter for <code>invopay.booking.sgst</code>.
     */
    public BookingDTO setSgst(Double sgst) {
        this.sgst = sgst;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.igst</code>.
     */
    public Double getIgst() {
        return this.igst;
    }

    /**
     * Setter for <code>invopay.booking.igst</code>.
     */
    public BookingDTO setIgst(Double igst) {
        this.igst = igst;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.total_amount</code>.
     */
    public Double getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * Setter for <code>invopay.booking.total_amount</code>.
     */
    public BookingDTO setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.booking_date</code>.
     */
    public LocalDateTime getBookingDate() {
        return this.bookingDate;
    }

    /**
     * Setter for <code>invopay.booking.booking_date</code>.
     */
    public BookingDTO setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.status</code>. 1-pending, 2-approved, 3-rejected, 4- cancel
     */
    public BookingStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>invopay.booking.status</code>. 1-pending, 2-approved, 3-rejected, 4- cancel
     */
    public BookingDTO setStatus(BookingStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.vehicle_status</code>. 0-pending,1-start,2-completed
     */
    public BookingVehicleStatus getVehicleStatus() {
        return this.vehicleStatus;
    }

    /**
     * Setter for <code>invopay.booking.vehicle_status</code>. 0-pending,1-start,2-completed
     */
    public BookingDTO setVehicleStatus(BookingVehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.approve_date_time</code>.
     */
    public LocalDateTime getApproveDateTime() {
        return this.approveDateTime;
    }

    /**
     * Setter for <code>invopay.booking.approve_date_time</code>.
     */
    public BookingDTO setApproveDateTime(LocalDateTime approveDateTime) {
        this.approveDateTime = approveDateTime;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.rejected_date_time</code>.
     */
    public LocalDateTime getRejectedDateTime() {
        return this.rejectedDateTime;
    }

    /**
     * Setter for <code>invopay.booking.rejected_date_time</code>.
     */
    public BookingDTO setRejectedDateTime(LocalDateTime rejectedDateTime) {
        this.rejectedDateTime = rejectedDateTime;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.cancel_date_time</code>.
     */
    public LocalDateTime getCancelDateTime() {
        return this.cancelDateTime;
    }

    /**
     * Setter for <code>invopay.booking.cancel_date_time</code>.
     */
    public BookingDTO setCancelDateTime(LocalDateTime cancelDateTime) {
        this.cancelDateTime = cancelDateTime;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.travel_time_from</code>.
     */
    public LocalDateTime getTravelTimeFrom() {
        return this.travelTimeFrom;
    }

    /**
     * Setter for <code>invopay.booking.travel_time_from</code>.
     */
    public BookingDTO setTravelTimeFrom(LocalDateTime travelTimeFrom) {
        this.travelTimeFrom = travelTimeFrom;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.travel_time_to</code>.
     */
    public LocalDateTime getTravelTimeTo() {
        return this.travelTimeTo;
    }

    /**
     * Setter for <code>invopay.booking.travel_time_to</code>.
     */
    public BookingDTO setTravelTimeTo(LocalDateTime travelTimeTo) {
        this.travelTimeTo = travelTimeTo;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.no_of_seats</code>.
     */
    public Integer getNoOfSeats() {
        return this.noOfSeats;
    }

    /**
     * Setter for <code>invopay.booking.no_of_seats</code>.
     */
    public BookingDTO setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.driver_name</code>.
     */
    public String getDriverName() {
        return this.driverName;
    }

    /**
     * Setter for <code>invopay.booking.driver_name</code>.
     */
    public BookingDTO setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.driver_contact_no</code>.
     */
    public String getDriverContactNo() {
        return this.driverContactNo;
    }

    /**
     * Setter for <code>invopay.booking.driver_contact_no</code>.
     */
    public BookingDTO setDriverContactNo(String driverContactNo) {
        this.driverContactNo = driverContactNo;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.star_rating</code>.
     */
    public Integer getStarRating() {
        return this.starRating;
    }

    /**
     * Setter for <code>invopay.booking.star_rating</code>.
     */
    public BookingDTO setStarRating(Integer starRating) {
        this.starRating = starRating;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.customer_feedback</code>.
     */
    public String getCustomerFeedback() {
        return this.customerFeedback;
    }

    /**
     * Setter for <code>invopay.booking.customer_feedback</code>.
     */
    public BookingDTO setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.booking.ref_user_id</code>.
     */
    public BookingDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.booking.added_date</code>.
     */
    public BookingDTO setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.booking.transaction_id</code>.
     */
    public BookingDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.booking.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.booking.delete_status</code>.
     */
    public BookingDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
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
        final BookingDTO other = (BookingDTO) obj;
        if (bookingId == null) {
            if (other.bookingId != null)
                return false;
        }
        else if (!bookingId.equals(other.bookingId))
            return false;
        if (bookingName == null) {
            if (other.bookingName != null)
                return false;
        }
        else if (!bookingName.equals(other.bookingName))
            return false;
        if (refCustomerId == null) {
            if (other.refCustomerId != null)
                return false;
        }
        else if (!refCustomerId.equals(other.refCustomerId))
            return false;
        if (vehicleId == null) {
            if (other.vehicleId != null)
                return false;
        }
        else if (!vehicleId.equals(other.vehicleId))
            return false;
        if (customerRideRequest == null) {
            if (other.customerRideRequest != null)
                return false;
        }
        else if (!customerRideRequest.equals(other.customerRideRequest))
            return false;
        if (fromAddress == null) {
            if (other.fromAddress != null)
                return false;
        }
        else if (!fromAddress.equals(other.fromAddress))
            return false;
        if (toAddress == null) {
            if (other.toAddress != null)
                return false;
        }
        else if (!toAddress.equals(other.toAddress))
            return false;
        if (distanceInKm == null) {
            if (other.distanceInKm != null)
                return false;
        }
        else if (!distanceInKm.equals(other.distanceInKm))
            return false;
        if (amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!amount.equals(other.amount))
            return false;
        if (extraCharge == null) {
            if (other.extraCharge != null)
                return false;
        }
        else if (!extraCharge.equals(other.extraCharge))
            return false;
        if (subTotal == null) {
            if (other.subTotal != null)
                return false;
        }
        else if (!subTotal.equals(other.subTotal))
            return false;
        if (gstPercentage == null) {
            if (other.gstPercentage != null)
                return false;
        }
        else if (!gstPercentage.equals(other.gstPercentage))
            return false;
        if (cgst == null) {
            if (other.cgst != null)
                return false;
        }
        else if (!cgst.equals(other.cgst))
            return false;
        if (sgst == null) {
            if (other.sgst != null)
                return false;
        }
        else if (!sgst.equals(other.sgst))
            return false;
        if (igst == null) {
            if (other.igst != null)
                return false;
        }
        else if (!igst.equals(other.igst))
            return false;
        if (totalAmount == null) {
            if (other.totalAmount != null)
                return false;
        }
        else if (!totalAmount.equals(other.totalAmount))
            return false;
        if (bookingDate == null) {
            if (other.bookingDate != null)
                return false;
        }
        else if (!bookingDate.equals(other.bookingDate))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (vehicleStatus == null) {
            if (other.vehicleStatus != null)
                return false;
        }
        else if (!vehicleStatus.equals(other.vehicleStatus))
            return false;
        if (approveDateTime == null) {
            if (other.approveDateTime != null)
                return false;
        }
        else if (!approveDateTime.equals(other.approveDateTime))
            return false;
        if (rejectedDateTime == null) {
            if (other.rejectedDateTime != null)
                return false;
        }
        else if (!rejectedDateTime.equals(other.rejectedDateTime))
            return false;
        if (cancelDateTime == null) {
            if (other.cancelDateTime != null)
                return false;
        }
        else if (!cancelDateTime.equals(other.cancelDateTime))
            return false;
        if (travelTimeFrom == null) {
            if (other.travelTimeFrom != null)
                return false;
        }
        else if (!travelTimeFrom.equals(other.travelTimeFrom))
            return false;
        if (travelTimeTo == null) {
            if (other.travelTimeTo != null)
                return false;
        }
        else if (!travelTimeTo.equals(other.travelTimeTo))
            return false;
        if (noOfSeats == null) {
            if (other.noOfSeats != null)
                return false;
        }
        else if (!noOfSeats.equals(other.noOfSeats))
            return false;
        if (driverName == null) {
            if (other.driverName != null)
                return false;
        }
        else if (!driverName.equals(other.driverName))
            return false;
        if (driverContactNo == null) {
            if (other.driverContactNo != null)
                return false;
        }
        else if (!driverContactNo.equals(other.driverContactNo))
            return false;
        if (starRating == null) {
            if (other.starRating != null)
                return false;
        }
        else if (!starRating.equals(other.starRating))
            return false;
        if (customerFeedback == null) {
            if (other.customerFeedback != null)
                return false;
        }
        else if (!customerFeedback.equals(other.customerFeedback))
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
        if (transactionId == null) {
            if (other.transactionId != null)
                return false;
        }
        else if (!transactionId.equals(other.transactionId))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.bookingId == null) ? 0 : this.bookingId.hashCode());
        result = prime * result + ((this.bookingName == null) ? 0 : this.bookingName.hashCode());
        result = prime * result + ((this.refCustomerId == null) ? 0 : this.refCustomerId.hashCode());
        result = prime * result + ((this.vehicleId == null) ? 0 : this.vehicleId.hashCode());
        result = prime * result + ((this.customerRideRequest == null) ? 0 : this.customerRideRequest.hashCode());
        result = prime * result + ((this.fromAddress == null) ? 0 : this.fromAddress.hashCode());
        result = prime * result + ((this.toAddress == null) ? 0 : this.toAddress.hashCode());
        result = prime * result + ((this.distanceInKm == null) ? 0 : this.distanceInKm.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.extraCharge == null) ? 0 : this.extraCharge.hashCode());
        result = prime * result + ((this.subTotal == null) ? 0 : this.subTotal.hashCode());
        result = prime * result + ((this.gstPercentage == null) ? 0 : this.gstPercentage.hashCode());
        result = prime * result + ((this.cgst == null) ? 0 : this.cgst.hashCode());
        result = prime * result + ((this.sgst == null) ? 0 : this.sgst.hashCode());
        result = prime * result + ((this.igst == null) ? 0 : this.igst.hashCode());
        result = prime * result + ((this.totalAmount == null) ? 0 : this.totalAmount.hashCode());
        result = prime * result + ((this.bookingDate == null) ? 0 : this.bookingDate.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.vehicleStatus == null) ? 0 : this.vehicleStatus.hashCode());
        result = prime * result + ((this.approveDateTime == null) ? 0 : this.approveDateTime.hashCode());
        result = prime * result + ((this.rejectedDateTime == null) ? 0 : this.rejectedDateTime.hashCode());
        result = prime * result + ((this.cancelDateTime == null) ? 0 : this.cancelDateTime.hashCode());
        result = prime * result + ((this.travelTimeFrom == null) ? 0 : this.travelTimeFrom.hashCode());
        result = prime * result + ((this.travelTimeTo == null) ? 0 : this.travelTimeTo.hashCode());
        result = prime * result + ((this.noOfSeats == null) ? 0 : this.noOfSeats.hashCode());
        result = prime * result + ((this.driverName == null) ? 0 : this.driverName.hashCode());
        result = prime * result + ((this.driverContactNo == null) ? 0 : this.driverContactNo.hashCode());
        result = prime * result + ((this.starRating == null) ? 0 : this.starRating.hashCode());
        result = prime * result + ((this.customerFeedback == null) ? 0 : this.customerFeedback.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Booking (");

        sb.append(bookingId);
        sb.append(", ").append(bookingName);
        sb.append(", ").append(refCustomerId);
        sb.append(", ").append(vehicleId);
        sb.append(", ").append(customerRideRequest);
        sb.append(", ").append(fromAddress);
        sb.append(", ").append(toAddress);
        sb.append(", ").append(distanceInKm);
        sb.append(", ").append(amount);
        sb.append(", ").append(extraCharge);
        sb.append(", ").append(subTotal);
        sb.append(", ").append(gstPercentage);
        sb.append(", ").append(cgst);
        sb.append(", ").append(sgst);
        sb.append(", ").append(igst);
        sb.append(", ").append(totalAmount);
        sb.append(", ").append(bookingDate);
        sb.append(", ").append(status);
        sb.append(", ").append(vehicleStatus);
        sb.append(", ").append(approveDateTime);
        sb.append(", ").append(rejectedDateTime);
        sb.append(", ").append(cancelDateTime);
        sb.append(", ").append(travelTimeFrom);
        sb.append(", ").append(travelTimeTo);
        sb.append(", ").append(noOfSeats);
        sb.append(", ").append(driverName);
        sb.append(", ").append(driverContactNo);
        sb.append(", ").append(starRating);
        sb.append(", ").append(customerFeedback);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(addedDate);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(deleteStatus);

        sb.append(")");
        return sb.toString();
    }
}
