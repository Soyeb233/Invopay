package org.invopayWebService.repository;

import org.invopayWebService.entity.CompactCotBig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompactCotBigRepository extends JpaRepository<CompactCotBig, Integer>,
    JpaSpecificationExecutor<CompactCotBig> {

}