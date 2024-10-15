package org.invopayWebService.repository.userActivity;

import org.invopayWebService.dto.userActivity.UserActivityDTO;
import org.invopayWebService.entity.UserActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserActivityRepository extends JpaRepository<UserActivity, Integer>,
    JpaSpecificationExecutor<UserActivity> {
    @Query(value = "select new org.invopayWebService.dto.userActivity.UserActivityDTO( u.userName,  ua.userActivityKey,  lul.loggedInDate)"+" from User u INNER JOIN UserActivity ua  ON u.userId = ua.refUserId INNER JOIN LoginUserLogs lul ON lul.userId = u.userId WHERE ua.deleteStatus = 0")
    public List<UserActivityDTO> findAllUserActivity();

}