package org.invopayWebService.repository.admin;


import org.invopayWebService.dto.admin.MenuOrderDTO;
import org.invopayWebService.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Menu,Integer>  {
    @Query("select u from Menu u where u.id=?1")
    public Menu findByIdAdmin(int id);

    @Query(value = "SELECT new org.invopayWebService.dto.admin.MenuOrderDTO( m.menuId,m.menuName,m.sortOrder) FROM Menu m")
    List<MenuOrderDTO> getChangeMenuOrder();
    @Query(value = "SELECT new org.invopayWebService.dto.admin.MenuOrderDTO( m.menuId,m.menuName,m.sortOrder) FROM Menu1 m")
    List<MenuOrderDTO> getChangeMasterOrder();

    @Transactional
    @Modifying
    @Query(value="UPDATE Menu m SET m.deleteStatus=?2 WHERE m.menuId =?1")
    public void deleteStaus(int data, int x);



}
