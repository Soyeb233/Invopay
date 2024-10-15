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
public class PatientVisitDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       patientVisitId;
    private LocalDateTime patientVisitDateTime;
    private String        patientVisitName;
    private Integer       refEmployeeId;
    private Integer       refPatientId;
    private Integer       refSpecializationId;
    private String        currentIllness;
    private String        currentIllnessHistory;
    private String        previousTakenTreatement;
    private String        duration;
    private Integer       refAyurvedaDiagnosisId;
    private Integer       refMDiagnosisId;
    private Integer       refModernSystemId;
    private String        treatmentDuration;
    private Integer       aayurveda;
    private Integer       panchkarma;
    private String        dietRemarks;
    private String        doRemarks;
    private String        donotRemarks;
    private String        omitRemarks;
    private String        occasionalRemarks;
    private Byte          oldPatient;
    private Byte          invoiceStatus;
    private Byte          appointmentStatus;
    private Integer       refAppointmentRejectReasonId;
    private Byte          patientVisitStatus;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public PatientVisitDTO() {}

    public PatientVisitDTO(PatientVisitDTO value) {
        this.patientVisitId = value.patientVisitId;
        this.patientVisitDateTime = value.patientVisitDateTime;
        this.patientVisitName = value.patientVisitName;
        this.refEmployeeId = value.refEmployeeId;
        this.refPatientId = value.refPatientId;
        this.refSpecializationId = value.refSpecializationId;
        this.currentIllness = value.currentIllness;
        this.currentIllnessHistory = value.currentIllnessHistory;
        this.previousTakenTreatement = value.previousTakenTreatement;
        this.duration = value.duration;
        this.refAyurvedaDiagnosisId = value.refAyurvedaDiagnosisId;
        this.refMDiagnosisId = value.refMDiagnosisId;
        this.refModernSystemId = value.refModernSystemId;
        this.treatmentDuration = value.treatmentDuration;
        this.aayurveda = value.aayurveda;
        this.panchkarma = value.panchkarma;
        this.dietRemarks = value.dietRemarks;
        this.doRemarks = value.doRemarks;
        this.donotRemarks = value.donotRemarks;
        this.omitRemarks = value.omitRemarks;
        this.occasionalRemarks = value.occasionalRemarks;
        this.oldPatient = value.oldPatient;
        this.invoiceStatus = value.invoiceStatus;
        this.appointmentStatus = value.appointmentStatus;
        this.refAppointmentRejectReasonId = value.refAppointmentRejectReasonId;
        this.patientVisitStatus = value.patientVisitStatus;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public PatientVisitDTO(
        Integer       patientVisitId,
        LocalDateTime patientVisitDateTime,
        String        patientVisitName,
        Integer       refEmployeeId,
        Integer       refPatientId,
        Integer       refSpecializationId,
        String        currentIllness,
        String        currentIllnessHistory,
        String        previousTakenTreatement,
        String        duration,
        Integer       refAyurvedaDiagnosisId,
        Integer       refMDiagnosisId,
        Integer       refModernSystemId,
        String        treatmentDuration,
        Integer       aayurveda,
        Integer       panchkarma,
        String        dietRemarks,
        String        doRemarks,
        String        donotRemarks,
        String        omitRemarks,
        String        occasionalRemarks,
        Byte          oldPatient,
        Byte          invoiceStatus,
        Byte          appointmentStatus,
        Integer       refAppointmentRejectReasonId,
        Byte          patientVisitStatus,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.patientVisitId = patientVisitId;
        this.patientVisitDateTime = patientVisitDateTime;
        this.patientVisitName = patientVisitName;
        this.refEmployeeId = refEmployeeId;
        this.refPatientId = refPatientId;
        this.refSpecializationId = refSpecializationId;
        this.currentIllness = currentIllness;
        this.currentIllnessHistory = currentIllnessHistory;
        this.previousTakenTreatement = previousTakenTreatement;
        this.duration = duration;
        this.refAyurvedaDiagnosisId = refAyurvedaDiagnosisId;
        this.refMDiagnosisId = refMDiagnosisId;
        this.refModernSystemId = refModernSystemId;
        this.treatmentDuration = treatmentDuration;
        this.aayurveda = aayurveda;
        this.panchkarma = panchkarma;
        this.dietRemarks = dietRemarks;
        this.doRemarks = doRemarks;
        this.donotRemarks = donotRemarks;
        this.omitRemarks = omitRemarks;
        this.occasionalRemarks = occasionalRemarks;
        this.oldPatient = oldPatient;
        this.invoiceStatus = invoiceStatus;
        this.appointmentStatus = appointmentStatus;
        this.refAppointmentRejectReasonId = refAppointmentRejectReasonId;
        this.patientVisitStatus = patientVisitStatus;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.patient_visit.patient_visit_id</code>.
     */
    public Integer getPatientVisitId() {
        return this.patientVisitId;
    }

    /**
     * Setter for <code>invopay.patient_visit.patient_visit_id</code>.
     */
    public PatientVisitDTO setPatientVisitId(Integer patientVisitId) {
        this.patientVisitId = patientVisitId;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.patient_visit_date_time</code>.
     */
    public LocalDateTime getPatientVisitDateTime() {
        return this.patientVisitDateTime;
    }

    /**
     * Setter for <code>invopay.patient_visit.patient_visit_date_time</code>.
     */
    public PatientVisitDTO setPatientVisitDateTime(LocalDateTime patientVisitDateTime) {
        this.patientVisitDateTime = patientVisitDateTime;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.patient_visit_name</code>.
     */
    public String getPatientVisitName() {
        return this.patientVisitName;
    }

    /**
     * Setter for <code>invopay.patient_visit.patient_visit_name</code>.
     */
    public PatientVisitDTO setPatientVisitName(String patientVisitName) {
        this.patientVisitName = patientVisitName;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.ref_employee_id</code>. Doctor
     */
    public Integer getRefEmployeeId() {
        return this.refEmployeeId;
    }

    /**
     * Setter for <code>invopay.patient_visit.ref_employee_id</code>. Doctor
     */
    public PatientVisitDTO setRefEmployeeId(Integer refEmployeeId) {
        this.refEmployeeId = refEmployeeId;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.ref_patient_id</code>. Patient
     */
    public Integer getRefPatientId() {
        return this.refPatientId;
    }

    /**
     * Setter for <code>invopay.patient_visit.ref_patient_id</code>. Patient
     */
    public PatientVisitDTO setRefPatientId(Integer refPatientId) {
        this.refPatientId = refPatientId;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.ref_specialization_id</code>.
     */
    public Integer getRefSpecializationId() {
        return this.refSpecializationId;
    }

    /**
     * Setter for <code>invopay.patient_visit.ref_specialization_id</code>.
     */
    public PatientVisitDTO setRefSpecializationId(Integer refSpecializationId) {
        this.refSpecializationId = refSpecializationId;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.current_illness</code>.
     */
    public String getCurrentIllness() {
        return this.currentIllness;
    }

    /**
     * Setter for <code>invopay.patient_visit.current_illness</code>.
     */
    public PatientVisitDTO setCurrentIllness(String currentIllness) {
        this.currentIllness = currentIllness;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.current_illness_history</code>.
     */
    public String getCurrentIllnessHistory() {
        return this.currentIllnessHistory;
    }

    /**
     * Setter for <code>invopay.patient_visit.current_illness_history</code>.
     */
    public PatientVisitDTO setCurrentIllnessHistory(String currentIllnessHistory) {
        this.currentIllnessHistory = currentIllnessHistory;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.previous_taken_treatement</code>.
     */
    public String getPreviousTakenTreatement() {
        return this.previousTakenTreatement;
    }

    /**
     * Setter for <code>invopay.patient_visit.previous_taken_treatement</code>.
     */
    public PatientVisitDTO setPreviousTakenTreatement(String previousTakenTreatement) {
        this.previousTakenTreatement = previousTakenTreatement;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.duration</code>.
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * Setter for <code>invopay.patient_visit.duration</code>.
     */
    public PatientVisitDTO setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.ref_ayurveda_diagnosis_id</code>.
     */
    public Integer getRefAyurvedaDiagnosisId() {
        return this.refAyurvedaDiagnosisId;
    }

    /**
     * Setter for <code>invopay.patient_visit.ref_ayurveda_diagnosis_id</code>.
     */
    public PatientVisitDTO setRefAyurvedaDiagnosisId(Integer refAyurvedaDiagnosisId) {
        this.refAyurvedaDiagnosisId = refAyurvedaDiagnosisId;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.ref_m_diagnosis_id</code>.
     */
    public Integer getRefMDiagnosisId() {
        return this.refMDiagnosisId;
    }

    /**
     * Setter for <code>invopay.patient_visit.ref_m_diagnosis_id</code>.
     */
    public PatientVisitDTO setRefMDiagnosisId(Integer refMDiagnosisId) {
        this.refMDiagnosisId = refMDiagnosisId;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.ref_modern_system_id</code>.
     */
    public Integer getRefModernSystemId() {
        return this.refModernSystemId;
    }

    /**
     * Setter for <code>invopay.patient_visit.ref_modern_system_id</code>.
     */
    public PatientVisitDTO setRefModernSystemId(Integer refModernSystemId) {
        this.refModernSystemId = refModernSystemId;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.treatment_duration</code>.
     */
    public String getTreatmentDuration() {
        return this.treatmentDuration;
    }

    /**
     * Setter for <code>invopay.patient_visit.treatment_duration</code>.
     */
    public PatientVisitDTO setTreatmentDuration(String treatmentDuration) {
        this.treatmentDuration = treatmentDuration;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.aayurveda</code>.
     */
    public Integer getAayurveda() {
        return this.aayurveda;
    }

    /**
     * Setter for <code>invopay.patient_visit.aayurveda</code>.
     */
    public PatientVisitDTO setAayurveda(Integer aayurveda) {
        this.aayurveda = aayurveda;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.panchkarma</code>.
     */
    public Integer getPanchkarma() {
        return this.panchkarma;
    }

    /**
     * Setter for <code>invopay.patient_visit.panchkarma</code>.
     */
    public PatientVisitDTO setPanchkarma(Integer panchkarma) {
        this.panchkarma = panchkarma;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.diet_remarks</code>.
     */
    public String getDietRemarks() {
        return this.dietRemarks;
    }

    /**
     * Setter for <code>invopay.patient_visit.diet_remarks</code>.
     */
    public PatientVisitDTO setDietRemarks(String dietRemarks) {
        this.dietRemarks = dietRemarks;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.do_remarks</code>.
     */
    public String getDoRemarks() {
        return this.doRemarks;
    }

    /**
     * Setter for <code>invopay.patient_visit.do_remarks</code>.
     */
    public PatientVisitDTO setDoRemarks(String doRemarks) {
        this.doRemarks = doRemarks;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.donot_remarks</code>.
     */
    public String getDonotRemarks() {
        return this.donotRemarks;
    }

    /**
     * Setter for <code>invopay.patient_visit.donot_remarks</code>.
     */
    public PatientVisitDTO setDonotRemarks(String donotRemarks) {
        this.donotRemarks = donotRemarks;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.omit_remarks</code>.
     */
    public String getOmitRemarks() {
        return this.omitRemarks;
    }

    /**
     * Setter for <code>invopay.patient_visit.omit_remarks</code>.
     */
    public PatientVisitDTO setOmitRemarks(String omitRemarks) {
        this.omitRemarks = omitRemarks;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.occasional_remarks</code>.
     */
    public String getOccasionalRemarks() {
        return this.occasionalRemarks;
    }

    /**
     * Setter for <code>invopay.patient_visit.occasional_remarks</code>.
     */
    public PatientVisitDTO setOccasionalRemarks(String occasionalRemarks) {
        this.occasionalRemarks = occasionalRemarks;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.old_patient</code>.
     */
    public Byte getOldPatient() {
        return this.oldPatient;
    }

    /**
     * Setter for <code>invopay.patient_visit.old_patient</code>.
     */
    public PatientVisitDTO setOldPatient(Byte oldPatient) {
        this.oldPatient = oldPatient;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.invoice_status</code>.
     */
    public Byte getInvoiceStatus() {
        return this.invoiceStatus;
    }

    /**
     * Setter for <code>invopay.patient_visit.invoice_status</code>.
     */
    public PatientVisitDTO setInvoiceStatus(Byte invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.appointment_status</code>. 0-Direct Visit,1-Pending,2-Confirmed,3-Rejected
     */
    public Byte getAppointmentStatus() {
        return this.appointmentStatus;
    }

    /**
     * Setter for <code>invopay.patient_visit.appointment_status</code>. 0-Direct Visit,1-Pending,2-Confirmed,3-Rejected
     */
    public PatientVisitDTO setAppointmentStatus(Byte appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.ref_appointment_reject_reason_id</code>.
     */
    public Integer getRefAppointmentRejectReasonId() {
        return this.refAppointmentRejectReasonId;
    }

    /**
     * Setter for <code>invopay.patient_visit.ref_appointment_reject_reason_id</code>.
     */
    public PatientVisitDTO setRefAppointmentRejectReasonId(Integer refAppointmentRejectReasonId) {
        this.refAppointmentRejectReasonId = refAppointmentRejectReasonId;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.patient_visit_status</code>.
     */
    public Byte getPatientVisitStatus() {
        return this.patientVisitStatus;
    }

    /**
     * Setter for <code>invopay.patient_visit.patient_visit_status</code>.
     */
    public PatientVisitDTO setPatientVisitStatus(Byte patientVisitStatus) {
        this.patientVisitStatus = patientVisitStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.patient_visit.ref_user_id</code>.
     */
    public PatientVisitDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.patient_visit.delete_status</code>.
     */
    public PatientVisitDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.patient_visit.transaction_id</code>.
     */
    public PatientVisitDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.patient_visit.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.patient_visit.added_date</code>.
     */
    public PatientVisitDTO setAddedDate(LocalDateTime addedDate) {
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
        final PatientVisitDTO other = (PatientVisitDTO) obj;
        if (patientVisitId == null) {
            if (other.patientVisitId != null)
                return false;
        }
        else if (!patientVisitId.equals(other.patientVisitId))
            return false;
        if (patientVisitDateTime == null) {
            if (other.patientVisitDateTime != null)
                return false;
        }
        else if (!patientVisitDateTime.equals(other.patientVisitDateTime))
            return false;
        if (patientVisitName == null) {
            if (other.patientVisitName != null)
                return false;
        }
        else if (!patientVisitName.equals(other.patientVisitName))
            return false;
        if (refEmployeeId == null) {
            if (other.refEmployeeId != null)
                return false;
        }
        else if (!refEmployeeId.equals(other.refEmployeeId))
            return false;
        if (refPatientId == null) {
            if (other.refPatientId != null)
                return false;
        }
        else if (!refPatientId.equals(other.refPatientId))
            return false;
        if (refSpecializationId == null) {
            if (other.refSpecializationId != null)
                return false;
        }
        else if (!refSpecializationId.equals(other.refSpecializationId))
            return false;
        if (currentIllness == null) {
            if (other.currentIllness != null)
                return false;
        }
        else if (!currentIllness.equals(other.currentIllness))
            return false;
        if (currentIllnessHistory == null) {
            if (other.currentIllnessHistory != null)
                return false;
        }
        else if (!currentIllnessHistory.equals(other.currentIllnessHistory))
            return false;
        if (previousTakenTreatement == null) {
            if (other.previousTakenTreatement != null)
                return false;
        }
        else if (!previousTakenTreatement.equals(other.previousTakenTreatement))
            return false;
        if (duration == null) {
            if (other.duration != null)
                return false;
        }
        else if (!duration.equals(other.duration))
            return false;
        if (refAyurvedaDiagnosisId == null) {
            if (other.refAyurvedaDiagnosisId != null)
                return false;
        }
        else if (!refAyurvedaDiagnosisId.equals(other.refAyurvedaDiagnosisId))
            return false;
        if (refMDiagnosisId == null) {
            if (other.refMDiagnosisId != null)
                return false;
        }
        else if (!refMDiagnosisId.equals(other.refMDiagnosisId))
            return false;
        if (refModernSystemId == null) {
            if (other.refModernSystemId != null)
                return false;
        }
        else if (!refModernSystemId.equals(other.refModernSystemId))
            return false;
        if (treatmentDuration == null) {
            if (other.treatmentDuration != null)
                return false;
        }
        else if (!treatmentDuration.equals(other.treatmentDuration))
            return false;
        if (aayurveda == null) {
            if (other.aayurveda != null)
                return false;
        }
        else if (!aayurveda.equals(other.aayurveda))
            return false;
        if (panchkarma == null) {
            if (other.panchkarma != null)
                return false;
        }
        else if (!panchkarma.equals(other.panchkarma))
            return false;
        if (dietRemarks == null) {
            if (other.dietRemarks != null)
                return false;
        }
        else if (!dietRemarks.equals(other.dietRemarks))
            return false;
        if (doRemarks == null) {
            if (other.doRemarks != null)
                return false;
        }
        else if (!doRemarks.equals(other.doRemarks))
            return false;
        if (donotRemarks == null) {
            if (other.donotRemarks != null)
                return false;
        }
        else if (!donotRemarks.equals(other.donotRemarks))
            return false;
        if (omitRemarks == null) {
            if (other.omitRemarks != null)
                return false;
        }
        else if (!omitRemarks.equals(other.omitRemarks))
            return false;
        if (occasionalRemarks == null) {
            if (other.occasionalRemarks != null)
                return false;
        }
        else if (!occasionalRemarks.equals(other.occasionalRemarks))
            return false;
        if (oldPatient == null) {
            if (other.oldPatient != null)
                return false;
        }
        else if (!oldPatient.equals(other.oldPatient))
            return false;
        if (invoiceStatus == null) {
            if (other.invoiceStatus != null)
                return false;
        }
        else if (!invoiceStatus.equals(other.invoiceStatus))
            return false;
        if (appointmentStatus == null) {
            if (other.appointmentStatus != null)
                return false;
        }
        else if (!appointmentStatus.equals(other.appointmentStatus))
            return false;
        if (refAppointmentRejectReasonId == null) {
            if (other.refAppointmentRejectReasonId != null)
                return false;
        }
        else if (!refAppointmentRejectReasonId.equals(other.refAppointmentRejectReasonId))
            return false;
        if (patientVisitStatus == null) {
            if (other.patientVisitStatus != null)
                return false;
        }
        else if (!patientVisitStatus.equals(other.patientVisitStatus))
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
        result = prime * result + ((this.patientVisitId == null) ? 0 : this.patientVisitId.hashCode());
        result = prime * result + ((this.patientVisitDateTime == null) ? 0 : this.patientVisitDateTime.hashCode());
        result = prime * result + ((this.patientVisitName == null) ? 0 : this.patientVisitName.hashCode());
        result = prime * result + ((this.refEmployeeId == null) ? 0 : this.refEmployeeId.hashCode());
        result = prime * result + ((this.refPatientId == null) ? 0 : this.refPatientId.hashCode());
        result = prime * result + ((this.refSpecializationId == null) ? 0 : this.refSpecializationId.hashCode());
        result = prime * result + ((this.currentIllness == null) ? 0 : this.currentIllness.hashCode());
        result = prime * result + ((this.currentIllnessHistory == null) ? 0 : this.currentIllnessHistory.hashCode());
        result = prime * result + ((this.previousTakenTreatement == null) ? 0 : this.previousTakenTreatement.hashCode());
        result = prime * result + ((this.duration == null) ? 0 : this.duration.hashCode());
        result = prime * result + ((this.refAyurvedaDiagnosisId == null) ? 0 : this.refAyurvedaDiagnosisId.hashCode());
        result = prime * result + ((this.refMDiagnosisId == null) ? 0 : this.refMDiagnosisId.hashCode());
        result = prime * result + ((this.refModernSystemId == null) ? 0 : this.refModernSystemId.hashCode());
        result = prime * result + ((this.treatmentDuration == null) ? 0 : this.treatmentDuration.hashCode());
        result = prime * result + ((this.aayurveda == null) ? 0 : this.aayurveda.hashCode());
        result = prime * result + ((this.panchkarma == null) ? 0 : this.panchkarma.hashCode());
        result = prime * result + ((this.dietRemarks == null) ? 0 : this.dietRemarks.hashCode());
        result = prime * result + ((this.doRemarks == null) ? 0 : this.doRemarks.hashCode());
        result = prime * result + ((this.donotRemarks == null) ? 0 : this.donotRemarks.hashCode());
        result = prime * result + ((this.omitRemarks == null) ? 0 : this.omitRemarks.hashCode());
        result = prime * result + ((this.occasionalRemarks == null) ? 0 : this.occasionalRemarks.hashCode());
        result = prime * result + ((this.oldPatient == null) ? 0 : this.oldPatient.hashCode());
        result = prime * result + ((this.invoiceStatus == null) ? 0 : this.invoiceStatus.hashCode());
        result = prime * result + ((this.appointmentStatus == null) ? 0 : this.appointmentStatus.hashCode());
        result = prime * result + ((this.refAppointmentRejectReasonId == null) ? 0 : this.refAppointmentRejectReasonId.hashCode());
        result = prime * result + ((this.patientVisitStatus == null) ? 0 : this.patientVisitStatus.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PatientVisit (");

        sb.append(patientVisitId);
        sb.append(", ").append(patientVisitDateTime);
        sb.append(", ").append(patientVisitName);
        sb.append(", ").append(refEmployeeId);
        sb.append(", ").append(refPatientId);
        sb.append(", ").append(refSpecializationId);
        sb.append(", ").append(currentIllness);
        sb.append(", ").append(currentIllnessHistory);
        sb.append(", ").append(previousTakenTreatement);
        sb.append(", ").append(duration);
        sb.append(", ").append(refAyurvedaDiagnosisId);
        sb.append(", ").append(refMDiagnosisId);
        sb.append(", ").append(refModernSystemId);
        sb.append(", ").append(treatmentDuration);
        sb.append(", ").append(aayurveda);
        sb.append(", ").append(panchkarma);
        sb.append(", ").append(dietRemarks);
        sb.append(", ").append(doRemarks);
        sb.append(", ").append(donotRemarks);
        sb.append(", ").append(omitRemarks);
        sb.append(", ").append(occasionalRemarks);
        sb.append(", ").append(oldPatient);
        sb.append(", ").append(invoiceStatus);
        sb.append(", ").append(appointmentStatus);
        sb.append(", ").append(refAppointmentRejectReasonId);
        sb.append(", ").append(patientVisitStatus);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
