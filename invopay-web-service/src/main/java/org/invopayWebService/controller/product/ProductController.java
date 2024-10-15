package org.invopayWebService.controller.product;

import com.commons.ResponceHandler;


import org.invopayWebService.dto.product.ProductDTO;
import org.invopayWebService.dto.product.ProductsDTO;
import org.invopayWebService.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/invopay")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProduct")
    public ResponseEntity<Object> getProduct()
    {
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,productService.getAllProduct());
    }
    @PostMapping("/addNewProducts")
    public ResponseEntity<Object> addNewProducts( @RequestBody ProductsDTO productsDTO){
         System.out.println(productsDTO.toString());
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,productService.addNewProducts(productsDTO));
    }

    @GetMapping("/findProductById/{id}")
    public ResponseEntity<Object> findProductById(@PathVariable int id){
        System.out.println(id);
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,productService.findProductById(id));
    }

    @PutMapping("/updateProducts/{id}")
    public ResponseEntity<Object> updateProducts(@RequestBody ProductsDTO productsDTO,@PathVariable int id){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,productService.updateProducts(productsDTO,id));
    }

    @PutMapping("/deleteProducts")
    public ResponseEntity<Object> deleteProducts(@RequestBody List<Integer> id) {
        System.out.println(id);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,productService.changeDeleteStatus(id));
    }
}
