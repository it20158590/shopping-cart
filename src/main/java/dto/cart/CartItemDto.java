package dto.cart;

import model.Product;

import javax.persistence.criteria.CriteriaBuilder;

public class CartItemDto {
    private Integer id;
    private Integer quantity;
    private Product product;



    public CartItemDto(){

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
