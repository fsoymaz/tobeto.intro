package com.tobeto.a.spring.intro;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {
    // In-Memory DB
    private List<Product> productList = new ArrayList<>();


    @GetMapping
    public List<Product> getAll(){
        return productList;
    }

    @GetMapping("{id}")
    public void getById(@PathVariable int id){
    }

    @PostMapping
    public String add(@RequestBody Product products) {
        productList.add(products);
        return "Eklendi";
    }
}

