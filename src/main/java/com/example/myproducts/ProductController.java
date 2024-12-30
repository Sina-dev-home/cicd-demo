package com.example.myproducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prod")
public class ProductController {
    @Autowired
    ProdService prodService;

    @GetMapping
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<>(prodService.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<?> getProductById(@PathVariable Long id){
        return new ResponseEntity<>(prodService.getProductById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(prodService.createProduct(product), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateProduct(@RequestBody Product product){
        return new ResponseEntity<>(prodService.updateProduct(product), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> createProduct(@PathVariable Long id){
        return new ResponseEntity<>(prodService.deleteProduct(id), HttpStatus.OK);
    }
}
