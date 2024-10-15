package org.invopayWebService.controller.supplier;

import com.commons.ResponceHandler;
import org.apache.http.client.ResponseHandler;
import org.invopayWebService.dto.client.ClientDTO;
import org.invopayWebService.dto.login.ResetPassword;
import org.invopayWebService.dto.supplier.SupplierDTO;
import org.invopayWebService.dto.user.UserDTO;
import org.invopayWebService.entity.Country;
import org.invopayWebService.entity.Supplier;
import org.invopayWebService.service.country.CountryService;
import org.invopayWebService.service.supplier.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/invopay")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private CountryService countryService;
    @GetMapping("/getAllMerchant")
    public ResponseEntity<Object> getAllMerchant() {
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,supplierService.getAllSupplier());
    }

    @PostMapping("/addSupplier")
    public ResponseEntity<Object> addNewSupplier(@RequestBody SupplierDTO supplierDTO) {

        return ResponceHandler.generateResponce(HttpStatus.OK , true ,supplierService.addNewSupplier(supplierDTO));
    }
    @GetMapping("/getCountry")
    public List<Country> getAllCountry() {

        return countryService.getCountry();
    }

    @GetMapping("/getDetailById/{id}")
    public ResponseEntity<Object> getSupplierDetail(@PathVariable int id){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,supplierService.getSupplierDetails(id));
    }

    @GetMapping("/getAllClient/{id}")
    public ResponseEntity<Object> getAllClient(@PathVariable long id){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,supplierService.findAllClientById(id));
    }

    @PutMapping("deleteSupplier")
    public ResponseEntity<Object> deleteSupplier(@RequestBody List<Integer> id) {
        System.out.println(id);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,supplierService.changeDeleteStatus(id));
    }
    @PutMapping("/updateSupplier/{id}")
    public ResponseEntity<Object> updateSupplier(@RequestBody SupplierDTO supplierDTO, @PathVariable int id){
        System.out.println(id);
        System.out.println(supplierDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,supplierService.updateSupplier(supplierDTO,id));
    }
    @GetMapping("/findSupplierById/{id}")
    public ResponseEntity<Object> findSupplierById(@PathVariable int id){
        return ResponceHandler.generateResponce(HttpStatus.OK, true,supplierService.findSupplierById(id));
    }

    @PutMapping("/resetPassword")
    public ResponseEntity<Object> resetPassword(@RequestBody ResetPassword resetPassword){
        System.out.println(resetPassword);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,supplierService.updatePassword(resetPassword));
    }

}
