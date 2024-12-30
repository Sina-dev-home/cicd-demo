package com.example.myproducts;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/prodsl/sl")
public class ProductSLController {
    List<Product> list= new ArrayList<>();
    Product prod = new Product(1L,"abc",(int) 10);

    @GetMapping("/{id}")
    public Product getProductbyId(@PathVariable Long id){
        Product prod= list.stream().
                filter(product-> product.getProdId().equals(id)).
                findFirst().get();
        return (Product) prod;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        list.add(product);
        return product;
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        int i;
        for (i = 0; ; i++) {
            if (list.get(i).getProdId() == product.getProdId()) {
//                product.setProdId(product.getProdId());
                list.set(i, product);
                break;
            }
        }
        return list.get(i);
    }
}
