package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientFacebookPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientFacebookPageRepository extends JpaRepository<ClientFacebookPage, Integer>,
    JpaSpecificationExecutor<ClientFacebookPage> {

}