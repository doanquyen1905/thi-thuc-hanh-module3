package org.example.demo.repositories;

import org.example.demo.dto.ProductDTO;
import org.example.demo.models.Products;

import java.util.List;

public interface IProductRepository {
    List<ProductDTO> findAll();

    void save(Products product);
}
