package org.invopayWebService.controller.country;

import com.commons.ResponceHandler;
import org.invopayWebService.service.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invopay/")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/getCountry/{id}")
    public ResponseEntity<Object> getCountryById(@PathVariable int id){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,countryService.getCountryNameById(id));
    }
}
