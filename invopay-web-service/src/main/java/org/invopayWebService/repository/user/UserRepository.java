package org.invopayWebService.repository.user;

import org.invopayWebService.dto.user.UserDTO;
import org.invopayWebService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>,
    JpaSpecificationExecutor<User> {

    @Query(value ="select new org.invopayWebService.dto.user.UserDTO( u.userId,u.fullName, u.nickName, u.userName, u.originalPassword, ug.userGroupName, u.status)"+" from User u INNER JOIN UserGroup ug ON u.refUserGroupId = ug.userGroupId WHERE u.deleteStatus = 0 ")
    public List<UserDTO> findAllUser();

    @Transactional
    @Modifying
    @Query(value="UPDATE User u SET u.deleteStatus=?2 WHERE u.userId =?1")
    public void deleteStaus(int id, int x);

    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.originalPassword = ?1, u.password = ?2 WHERE u.userId = ?3")
    void updatePassword(String password,String encryptedRandomPassword ,int id);

    @Query("select u.userId from User u WHERE  u.refSupplierId = ?1")
    int getUserId(Integer supplierId);

    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.originalPassword = ?1 , u.password = ?2 WHERE u.userId= ?3")
    void resetPassword(String originalPassword,String password , Integer newUserId);

//    @Query("SELECT u.userId FROM User u ORDER BY u.userId DESC LIMIT 1")
//    public int findTopByOrderByIdDesc();
    public User findFirstByOrderByUserIdDesc();

    Optional<User> findByUserName(String username);

    Optional<User> findByEmail(String username);
}