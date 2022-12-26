package com.pelatro.pelatrocartapp.service;

import java.util.List;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponseWrapper;
import com.pelatro.pelatrocartapp.entity.Products;

public interface ProductService {

	//List<Products> searchProduct(String query);

	PelatrocartResponse  createProduct(Products products);
	PelatrocartResponse  findOne(int productid);
	PelatrocartResponse getAllProducts();
	//PelatrocartResponse getProductsById(int productid);


}
