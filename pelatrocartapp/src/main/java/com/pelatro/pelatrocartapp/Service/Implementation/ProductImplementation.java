package com.pelatro.pelatrocartapp.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponseWrapper;
import com.pelatro.pelatrocartapp.entity.Products;
import com.pelatro.pelatrocartapp.repository.ProductRepository;
import com.pelatro.pelatrocartapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ProductImplementation implements ProductService{
	@Autowired
	private ProductRepository productRepository;


	public ProductImplementation(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public PelatrocartResponse getAllProducts() {
		PelatrocartResponseWrapper pelarespwrp = new PelatrocartResponseWrapper();
		return pelarespwrp.createResponse("OK", productRepository.findAll());
	} 

	public PelatrocartResponse createProduct(Products products)
	{PelatrocartResponseWrapper pelarespwrp = new PelatrocartResponseWrapper();
	return pelarespwrp.createResponse("OK", productRepository.save(products));
} 



    public PelatrocartResponse findOne(int productid) {
    	PelatrocartResponseWrapper pelarespwrp = new PelatrocartResponseWrapper();
		return pelarespwrp.createResponse("OK", productRepository.findById(productid).get());
	} 
    }
	
