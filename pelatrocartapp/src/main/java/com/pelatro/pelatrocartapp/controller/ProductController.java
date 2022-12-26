package com.pelatro.pelatrocartapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.entity.Products;
import com.pelatro.pelatrocartapp.entity.Users;
import com.pelatro.pelatrocartapp.repository.ProductRepository;
import com.pelatro.pelatrocartapp.service.ProductService;
@CrossOrigin(origins="https://localhost:4200")
@RestController
@RequestMapping("/product/")
public class ProductController {
	
	
	@Autowired
	private ProductService productService;

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(value="{id}")
	public ResponseEntity<PelatrocartResponse> productById(@PathVariable int id){
		PelatrocartResponse pelaresp= productService.findOne(id);
		if(pelaresp.getStatus().equals("OK"))
			return new ResponseEntity<PelatrocartResponse>(pelaresp, HttpStatus.OK);
		return new ResponseEntity<PelatrocartResponse>(pelaresp, HttpStatus.NO_CONTENT);
		
	}
	
	
	@RequestMapping("/displayproducts")
	public ResponseEntity<PelatrocartResponse> getAllProducts(){
		PelatrocartResponse pelaresp=productService.getAllProducts();
		if(pelaresp.getStatus().equals("OK")){
			return  new ResponseEntity<PelatrocartResponse>(pelaresp,HttpStatus.OK);
		}
		return  new ResponseEntity<PelatrocartResponse>(pelaresp,HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/create")
	public PelatrocartResponse createProduct(@RequestBody Products products)
	{
		return productService.createProduct(products);
	}
	
}
	
	