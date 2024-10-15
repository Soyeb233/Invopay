package org.invopayWebService.service.product;

import org.invopayWebService.config.ObjectMapperUtil;
import org.invopayWebService.dto.product.ProductDTO;

import org.invopayWebService.dto.product.ProductsDTO;
import org.invopayWebService.entity.Invoice;
import org.invopayWebService.entity.Product;
import org.invopayWebService.entity.Supplier;
import org.invopayWebService.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<ProductDTO> getAllProduct() {
        System.out.println(productRepository.findAllProduct());

        return productRepository.findAllProduct();
    }

    public Product addNewProducts(ProductsDTO productsDTO) {
        Product product= ObjectMapperUtil.copyPropertiesByMapper(productsDTO, Product.class);
        return productRepository.save(product);
    }

    public Product findProductById(int id) {
        Optional<Product> product=productRepository.findById(id);
        if(product.isPresent()){
            return  product.get();
        }
        return null;
    }

    public Object updateProducts(ProductsDTO productsDTO, int id) {
        Optional<Product> product=productRepository.findById(id);
        if(product.isPresent()){
            Product product1=product.get();
            product1.setProductName(productsDTO.getProductName());
            product1.setDescription(productsDTO.getDescription());
            product1.setPrice(productsDTO.getPrice());
            productRepository.save(product1);
        }
        return null ;
    }

    public boolean changeDeleteStatus(List<Integer> data) {
        for (Integer item : data) {
            Optional<Product> invoiceItem = productRepository.findById(item);

            if (invoiceItem.isPresent()) {

                productRepository.deleteStaus(item,1);
            } else {
               return false;
            }
        }
        return true;
    }
}
