package org.zai.service;

import com.commons.zaiDTOS.client.ClientDTO;
import org.springframework.stereotype.Service;
import org.zai.dto.responce.agreement.ValiDatePayToAgreementDTO;
@Service
public class ZAIValidationService {

    protected boolean validateDataOfValidatePayToAgreement(ValiDatePayToAgreementDTO valiDateAgreement) {
        if (valiDateAgreement.getUser_external_id() == null && valiDateAgreement.getUser_external_id().isEmpty()) {
            throw new RuntimeException("Please enter user payto id");
        }
        if (valiDateAgreement.getPriority() == null && valiDateAgreement.getPriority().isEmpty()) {
            throw new RuntimeException("Please enter priority");
        }
        if (valiDateAgreement.getAgreement_info() == null && valiDateAgreement.getAgreement_info().getPurpose_code() == null && valiDateAgreement.getAgreement_info().getPurpose_code().isEmpty()) {
            throw new RuntimeException("Please enter purpose code");
        }
        if (valiDateAgreement.getAgreement_info() == null && valiDateAgreement.getAgreement_info().getAgreement_type() == null && valiDateAgreement.getAgreement_info().getAgreement_type().isEmpty()) {
            throw new RuntimeException("Please enter agreement type");
        }
        if (valiDateAgreement.getAgreement_info() == null && valiDateAgreement.getAgreement_info().getValidity_start_date() == null) {
            throw new RuntimeException("Please enter startdate");
        }
        if (valiDateAgreement.getAgreement_info().getCreditor_info() == null && valiDateAgreement.getAgreement_info().getCreditor_info().getUltimate_creditor_name() == null && valiDateAgreement.getAgreement_info().getCreditor_info().getUltimate_creditor_name().isEmpty()) {
            throw new RuntimeException("Please enter Ultimate_creditor_name");
        }
        if (valiDateAgreement.getAgreement_info().getDebtor_info() == null && valiDateAgreement.getAgreement_info().getDebtor_info().getDebtor_details().getDebtor_name() == null && valiDateAgreement.getAgreement_info().getDebtor_info().getDebtor_details().getDebtor_name().isEmpty()) {
            throw new RuntimeException("Please enter Debtor name");
        }
        if (valiDateAgreement.getAgreement_info().getDebtor_info() == null && valiDateAgreement.getAgreement_info().getDebtor_info().getDebtor_details().getUltimate_debtor_name() == null && valiDateAgreement.getAgreement_info().getDebtor_info().getDebtor_details().getUltimate_debtor_name().isEmpty()) {
            throw new RuntimeException("Please enter Ultimate_debtor_name");
        }
        if (valiDateAgreement.getAgreement_info().getDebtor_info() == null && valiDateAgreement.getAgreement_info().getDebtor_info().getDebtor_details().getDebtor_type() == null && valiDateAgreement.getAgreement_info().getDebtor_info().getDebtor_details().getDebtor_type().isEmpty()) {
            throw new RuntimeException("Please enter Debtor type");
        }
//        if (valiDateAgreement.getAgreement_info().getDebtor_info() == null && valiDateAgreement.getAgreement_info().getDebtor_info().getDebtor_account_details().getAccount_id() == null && valiDateAgreement.getAgreement_info().getDebtor_info().getDebtor_account_details().getAccount_id().isEmpty()) {
//            throw new RuntimeException("Please enter Debtor Account Id");
//        }
        if (valiDateAgreement.getAgreement_info().getDebtor_info() == null && valiDateAgreement.getAgreement_info().getDebtor_info().getDebtor_account_details().getAccount_id_type() == null && valiDateAgreement.getAgreement_info().getDebtor_info().getDebtor_account_details().getAccount_id_type().isEmpty()) {
            throw new RuntimeException("Please enter Debtor Account Id Type");
        }
        if (valiDateAgreement.getAgreement_info().getPayment_initiator_info() == null && valiDateAgreement.getAgreement_info().getPayment_initiator_info().getInitiator_id() == null && valiDateAgreement.getAgreement_info().getPayment_initiator_info().getInitiator_id().isEmpty()) {
            throw new RuntimeException("Please enter pyament initiator id");
        }
        if (valiDateAgreement.getAgreement_info().getPayment_initiator_info() == null && valiDateAgreement.getAgreement_info().getPayment_initiator_info().getInitiator_id_type_code() == null && valiDateAgreement.getAgreement_info().getPayment_initiator_info().getInitiator_id_type_code().isEmpty()) {
            throw new RuntimeException("Please enter pyament initiator id type");
        }
        if (valiDateAgreement.getAgreement_info().getPayment_initiator_info() == null && valiDateAgreement.getAgreement_info().getPayment_initiator_info().getInitiator_name() == null && valiDateAgreement.getAgreement_info().getPayment_initiator_info().getInitiator_name().isEmpty()) {
            throw new RuntimeException("Please enter pyament initiator name");
        }
        if (valiDateAgreement.getAgreement_info().getPayment_initiator_info() == null && valiDateAgreement.getAgreement_info().getPayment_initiator_info().getInitiator_legal_name() == null && valiDateAgreement.getAgreement_info().getPayment_initiator_info().getInitiator_legal_name().isEmpty()) {
            throw new RuntimeException("Please enter pyament initiator legal name");
        }
        if (valiDateAgreement.getAgreement_info().getPayment_terms() == null && valiDateAgreement.getAgreement_info().getPayment_terms().getFrequency() == null && valiDateAgreement.getAgreement_info().getPayment_terms().getFrequency().isEmpty()) {
            throw new RuntimeException("Please enter frequency");
        }
        return true;
    }

    protected boolean validateClient(ClientDTO clientDTO) {
        if(clientDTO.getClient_fname()!= null && clientDTO.getClient_fname().isEmpty()){
            throw new RuntimeException("Client first name can't be empity");
        }
        if(clientDTO.getClient_lname()!= null && clientDTO.getClient_lname().isEmpty()){
            throw new RuntimeException("Client first name can't be empity");
        }
        if(clientDTO.getClient_email()!= null && clientDTO.getClient_email().isEmpty()){
            throw new RuntimeException("Client first name can't be empity");
        }
        return true;
    }
}
