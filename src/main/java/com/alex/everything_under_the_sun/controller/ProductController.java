package com.alex.everything_under_the_sun.controller;

import com.alex.everything_under_the_sun.model.Product;
import com.alex.everything_under_the_sun.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("api/products")
public class ProductController {
    private final ProductServiceImpl productServiceImpl;

    public ProductController(ProductServiceImpl productServiceImpl)
    {
        this.productServiceImpl = productServiceImpl;
    }

    @GetMapping({"", "/"})
    public @NotNull Iterable<Product> getProducts()
    {
        return productServiceImpl.getAllProducts();
    }
}
