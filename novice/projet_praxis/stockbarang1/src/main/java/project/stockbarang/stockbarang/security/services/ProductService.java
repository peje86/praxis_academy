package project.stockbarang.stockbarang.security.services;

import java.util.ArrayList;
import java.util.List;

import project.stockbarang.stockbarang.model.Products;
import project.stockbarang.stockbarang.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Products> getAllProducts() {
        List<Products> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    public Products getProducts(Long id) {
        Products products = productRepository.findById(id).orElse(null);
        return products;
    }

    public Products addProducts(Products products) {
        productRepository.save(products);
        return products;
    }

    public Products updateProducts(Long id, Products products) {
        productRepository.save(products);
        return products;
    }

    public Products deleteProducts(Long id) {
        Products products = productRepository.findById(id).orElse(null);
        productRepository.deleteById(id);
        return products;
    }
}