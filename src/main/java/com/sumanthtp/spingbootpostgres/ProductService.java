package com.sumanthtp.spingbootpostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductService {
    List<Product> products = new ArrayList<Product>();
    @Autowired
    ProductDB db;
    public void getAllProducts() {
        System.out.println(db.findAll());
    }
}
