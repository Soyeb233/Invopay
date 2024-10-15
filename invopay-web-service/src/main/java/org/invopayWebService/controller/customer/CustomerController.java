package org.invopayWebService.controller.customer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CustomerController {
    @GetMapping("/getMessage")
    public String getMessage()
    {
        return "Hello";
    }
}
