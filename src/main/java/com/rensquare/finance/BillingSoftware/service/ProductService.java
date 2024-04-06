package com.rensquare.finance.BillingSoftware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rensquare.finance.BillingSoftware.entity.Product;
import com.rensquare.finance.BillingSoftware.repository.ProductRepository;


@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;
    

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }


	public Product addProduct(Product product) {
		
		   product.setProductId(product.getProductId());
		   product.setProductName(product.getProductName());
		   product.setSpecification(product.getSpecification());
		   product.setPrice(product.getPrice());
		return productRepository.save(product);
	}

}