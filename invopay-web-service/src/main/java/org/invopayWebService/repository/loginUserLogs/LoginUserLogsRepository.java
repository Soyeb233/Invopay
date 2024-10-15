package org.invopayWebService.repository.loginUserLogs;

import org.invopayWebService.dto.loginUserLogs.LoginUserLogsDTO;
import org.invopayWebService.entity.LoginUserLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface LoginUserLogsRepository extends JpaRepository<LoginUserLogs, Integer>,
    JpaSpecificationExecutor<LoginUserLogs> {



    @Query(value = "select new org.invopayWebService.dto.loginUserLogs.LoginUserLogsDTO(u.userName,ug.userGroupName, ul.ipAddress, ul.loggedInDate,ul.loggedOutDate)" + "  from LoginUserLogs ul INNER JOIN User u ON ul.userId = u.userId INNER JOIN UserGroup ug ON u.refUserGroupId = ug.userGroupId")
    public List<LoginUserLogsDTO> findAllLoginUserLogs();

}