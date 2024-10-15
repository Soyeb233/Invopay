package org.invopayWebService.repository.userGroup;

import org.invopayWebService.entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//import org.springframework.data.jpa.repository.Query;


public interface UserGroupRepository extends JpaRepository<UserGroup, Integer>,
    JpaSpecificationExecutor<UserGroup> {

    @Query("select u  from UserGroup u WHERE u.deleteStatus=0 ")
    public List<UserGroup> findAllUserGroup();
    @Transactional
    @Modifying
    @Query(value="UPDATE UserGroup u SET u.deleteStatus=?2 WHERE u.userGroupId =?1")
    public void deleteStaus(int id, int x);

}