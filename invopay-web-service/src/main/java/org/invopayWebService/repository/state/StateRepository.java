package org.invopayWebService.repository.state;

import org.invopayWebService.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface StateRepository extends JpaRepository<State, Integer>,
    JpaSpecificationExecutor<State> {

//    @Query("select s from State where refCountryId=?1")
    List<State> findAllByRefCountryId(int id);

}