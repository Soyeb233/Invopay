package org.invopayWebService.repository.product;

import org.invopayWebService.dto.product.ProductDTO;
import org.invopayWebService.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>,
    JpaSpecificationExecutor<Product> {


    @Query(value = "select new org.invopayWebService.dto.product.ProductDTO(p.productId, p.productName, qt.quantityTypeName, p.price, u.vatNumber)" + "  from Product p LEFT JOIN QuantityType qt ON p.refQuantityTypeId = qt.quantityTypeId LEFT JOIN User u ON p.refUserId = u.userId Where p.deleteStatus = 0")
    public List<ProductDTO> findAllProduct();


    @Transactional
    @Modifying
    @Query(value="UPDATE Product p SET p.deleteStatus=?2 WHERE p.productId =?1")
    public void deleteStaus(int data, int x);
}