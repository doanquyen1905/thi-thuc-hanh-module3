package org.example.demo.controllers;

import org.example.demo.dto.ProductDTO;
import org.example.demo.models.Products;
import org.example.demo.service.IProductService;
import org.example.demo.service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductController", value = "/product")
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                req.getRequestDispatcher("/product/create.jsp").forward(req, resp);
                break;
            default:
                List<ProductDTO> allProduct = productService.findAll();
                req.setAttribute("products", allProduct);
                req.getRequestDispatcher("/product/list.jsp").forward(req, resp);
                break;
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                String name = req.getParameter("name_product");
                Double price = Double.valueOf(req.getParameter("price_product"));
                double discount = Double.parseDouble(req.getParameter("discount"));
                int stock = Integer.parseInt(req.getParameter("stock"));
                if (name != null && price != null && discount > 0 && stock > 0) {
                    Products product = new Products(name, price, discount, stock);
                    productService.save(product);
                    resp.sendRedirect(req.getContextPath() + "/product");
                } else {
                    req.setAttribute("message", "Thông tin không hợp lệ. Vui lòng điền đầy đủ các thông tin sản phẩm.");
                    req.getRequestDispatcher("/product/create.jsp").forward(req, resp);
                } break;
//
             default:
                        resp.sendRedirect(req.getContextPath() + "/product");
                        break;
//
            }
        }
    }
