package org.invopayWebService.repository;

import org.invopayWebService.entity.CompactCotSmall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompactCotSmallRepository extends JpaRepository<CompactCotSmall, Integer>,
    JpaSpecificationExecutor<CompactCotSmall> {

}