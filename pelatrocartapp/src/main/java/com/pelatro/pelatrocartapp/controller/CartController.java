package com.pelatro.pelatrocartapp.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.dto.CartItemDto;
import com.pelatro.pelatrocartapp.entity.Cart;
import com.pelatro.pelatrocartapp.entity.Users;
import com.pelatro.pelatrocartapp.repository.CartRepository;
import com.pelatro.pelatrocartapp.repository.UserRepository;
import com.pelatro.pelatrocartapp.service.CartService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="https://localhost:4200")
@RestController()
@RequestMapping("/cart")
public class CartController {
	
	
	@Autowired
	private CartService cartservice;

	@PostMapping("/addtocart")
	public ResponseEntity<PelatrocartResponse> addToCart(@RequestBody Cart cart){
		System.out.println(cart);
		PelatrocartResponse pelatrocartresp=cartservice.addToCart(cart);
		return new ResponseEntity<PelatrocartResponse>(pelatrocartresp,HttpStatus.OK);
	
	}
	
	@GetMapping("/usercart/{userid}")
	public ResponseEntity<CartItemDto> getCartItem(@PathVariable int userid){
		CartItemDto pelatrocartresp=cartservice.listCartItems(userid);
		return new ResponseEntity<CartItemDto>(pelatrocartresp,HttpStatus.OK);
	
	}
}
	
//	@GetMapping(value="/{userid}")
//	//@RequestMapping(value="/get/{userid}",method=RequestMethod.GET)
//	public ResponseEntity<PelatrocartResponse> getCartByUserId(@PathVariable int userid){
//PelatrocartResponse pelatroResponse=cartservice.getCartByUserId(userid);	
////		return new ResponseEntity<PelatrocartResponse>(pelatroResponse,HttpStatus.OK);	
//	
//		if(pelatroResponse.getStatus().equals("OK"))
//			return new ResponseEntity<PelatrocartResponse>(pelatroResponse, HttpStatus.OK);
//		return new ResponseEntity<PelatrocartResponse>(pelatroResponse, HttpStatus.NO_CONTENT);
//		
//	}
	


