package org.zai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.zai.models.ClientResponce;

import java.util.Optional;

@Repository
public interface ZaiClientRepository extends JpaRepository<ClientResponce, Long> {
    @Query("select c from ClientResponce c where c.id=?1")
    Optional<ClientResponce> findByzaiId(String s);
}
