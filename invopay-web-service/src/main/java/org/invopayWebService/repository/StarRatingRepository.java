package org.invopayWebService.repository;

import org.invopayWebService.entity.StarRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StarRatingRepository extends JpaRepository<StarRating, Integer>,
    JpaSpecificationExecutor<StarRating> {

}