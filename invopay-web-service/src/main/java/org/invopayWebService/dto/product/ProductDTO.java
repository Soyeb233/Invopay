package org.invopayWebService.dto.product;

public class ProductDTO {

    private Integer productId;

    private String productName;

    // column of this data is not present in database
    private String sku;

    private String quantityTypeName;

    // column of this data is not present in database
    private String quantity;

    // column of this data is not present in database
    private String uom;

    private Float price;


    private String vatNumber;

    // column of this data is not present in database
    private String reorderQuantity;

    public ProductDTO() {
    }

    public ProductDTO(Integer productId, String productName, String quantityTypeName, Float price, String vatNumber) {
        this.productId = productId;
        this.productName = productName;
        this.sku = "";
        this.quantityTypeName = quantityTypeName;
        this.quantity = "";
        this.uom ="";
        this.price = price;
        this.vatNumber = vatNumber;
        this.reorderQuantity ="";
    }

    public ProductDTO(Integer productId, String productName, String sku, String quantityTypeName, String quantity, String uom, Float price, String vatNumber, String reorderQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.sku = sku;
        this.quantityTypeName = quantityTypeName;
        this.quantity = quantity;
        this.uom = uom;
        this.price = price;
        this.vatNumber = vatNumber;
        this.reorderQuantity = reorderQuantity;
    }


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getQuantityTypeName() {
        return quantityTypeName;
    }

    public void setQuantityTypeName(String quantityTypeName) {
        this.quantityTypeName = quantityTypeName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(String reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }
}
