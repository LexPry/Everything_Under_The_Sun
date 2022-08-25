package com.alex.everything_under_the_sun.service;

import com.alex.everything_under_the_sun.model.Product;
import com.alex.everything_under_the_sun.repositories.ProductRepository;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    public Iterable<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id)
    {
        return productRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Product with id " + id + " not found."));
    }

    @Override
    public Product save(Product product)
    {
        return productRepository.save(product);
    }

}
