package org.invopayWebService.dto.product;

import lombok.*;

@NoArgsConstructor
@Data
public class ProductsDTO {
    private int productId;
    private String productName;
    private Float price;
    private String description;

}
