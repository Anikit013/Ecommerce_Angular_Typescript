package com.pelatro.pelatrocartapp.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.entity.Order;
import com.pelatro.pelatrocartapp.service.OrderService;

@CrossOrigin(origins="https://localhost:4200")
@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService; 
	
	@PostMapping(value = "/placeorder")
	//@RequestMapping(value="/order",method=RequestMethod.POST)
	public ResponseEntity<PelatrocartResponse> placeOrder(@RequestBody Order order) throws IOException{
		PelatrocartResponse pelcartresp=orderService.placeOrder(order);
		return new ResponseEntity<PelatrocartResponse>(HttpStatus.OK);
	}

}
