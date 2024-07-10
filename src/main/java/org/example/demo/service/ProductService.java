package org.example.demo.service;

import org.example.demo.dto.ProductDTO;
import org.example.demo.models.Products;
import org.example.demo.repositories.IProductRepository;
import org.example.demo.repositories.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private static final IProductRepository productRepository = new ProductRepository();
    @Override
    public List<ProductDTO> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Products product) {
        productRepository.save(product);
    }
}
