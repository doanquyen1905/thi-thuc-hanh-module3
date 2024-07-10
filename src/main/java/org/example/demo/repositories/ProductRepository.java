package org.example.demo.repositories;

import org.example.demo.dto.ProductDTO;
import org.example.demo.models.Products;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> productDTOS = new ArrayList<>();
        int id;
        String name;
        double price;
        int discount;
        int stock;
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection()
                    .prepareStatement("select name_product,price_product,discount,stock from product");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                name = resultSet.getString("name_product");
                price = resultSet.getDouble("price_product");
                discount = resultSet.getInt("discount");
                stock = resultSet.getInt("stock");
                productDTOS.add(new ProductDTO(name,price,discount,stock));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productDTOS;
    }

    @Override
    public void save(Products product) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().
                    prepareStatement("insert into product (name_product,price_product,discount,stock) values (?,?,?,?)");
            preparedStatement.setString(1, product.getName_product());
            preparedStatement.setDouble(2,product.getPrice_product());
            preparedStatement.setDouble(3,product.getDiscount());
            preparedStatement.setInt(4,product.getStock());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
