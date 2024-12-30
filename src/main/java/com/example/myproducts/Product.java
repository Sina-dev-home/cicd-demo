package com.example.myproducts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "CustomProducts")
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "Product Model ID")
    private Long prodId;
    @Column(name = "Product Name")
    private String prodName;
    @Column(name = "MRP(Rs.)")
    private int price;


    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getProdId() {
        System.out.println(prodId);
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
