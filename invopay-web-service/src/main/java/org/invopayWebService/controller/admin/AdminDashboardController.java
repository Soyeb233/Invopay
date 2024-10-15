package org.invopayWebService.controller.admin;



import org.invopayWebService.dto.admin.AdminDashboardResponseDTO;
import org.invopayWebService.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invopay/admin")
public class AdminDashboardController {
  @Autowired
  private AdminService adminService;
 @GetMapping("/dashboard")
  public ResponseEntity<AdminDashboardResponseDTO> getdashboardMetaData(){
   AdminDashboardResponseDTO response = new AdminDashboardResponseDTO();
   response.setMerchantCount(adminService.getMerchantCount());
   response.setClientCount(adminService.getClientCount());

    return new ResponseEntity<>(response,HttpStatus.OK);
  }

}
