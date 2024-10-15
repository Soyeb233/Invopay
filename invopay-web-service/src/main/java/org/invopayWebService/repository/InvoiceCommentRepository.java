package org.invopayWebService.repository;

import org.invopayWebService.entity.InvoiceComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceCommentRepository extends JpaRepository<InvoiceComment, Integer>,
    JpaSpecificationExecutor<InvoiceComment> {

}