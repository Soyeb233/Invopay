package org.invopayWebService.repository;

import org.invopayWebService.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AnnouncementRepository extends JpaRepository<Announcement, Integer>,
    JpaSpecificationExecutor<Announcement> {

}