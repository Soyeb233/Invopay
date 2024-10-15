package org.invopayWebService.repository;

import org.invopayWebService.entity.PatientDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientDocumentRepository extends JpaRepository<PatientDocument, Integer>,
    JpaSpecificationExecutor<PatientDocument> {

}