package org.invopayWebService.repository.login;

import org.invopayWebService.dto.login.LoginDTO;
import org.invopayWebService.entity.AccountsCode;
import org.invopayWebService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LoginRepository extends JpaRepository<User, Integer>,
        JpaSpecificationExecutor<AccountsCode> {
    @Query(value = "SELECT new org.invopayWebService.dto.login.LoginDTO(u.userId,u.userName,u.email,u.password,u.originalPassword,ug.userGroupId) FROM User u,UserGroup ug WHERE u.refUserGroupId=ug.userGroupId and u.userName=:username and u.originalPassword=:password")
    public LoginDTO validateUser(@Param("username") String username, @Param("password") String password);

}
