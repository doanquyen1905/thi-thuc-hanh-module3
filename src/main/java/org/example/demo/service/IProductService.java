package org.example.demo.service;

import org.example.demo.dto.ProductDTO;
import org.example.demo.models.Products;

import java.util.List;

public interface IProductService {

    List<ProductDTO> findAll();

    void save(Products product);
}
