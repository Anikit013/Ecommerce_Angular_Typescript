package com.pelatro.pelatrocartapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponseWrapper;
import com.pelatro.pelatrocartapp.entity.BillingAddress;
import com.pelatro.pelatrocartapp.service.BillingAddressService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
@RequestMapping("/billingaddress")
public class BillingAddressController {

	@Autowired
	public  BillingAddressService billingAddressService;
	

	
	PelatrocartResponseWrapper pelResponseWrapper = new PelatrocartResponseWrapper();
	
	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<PelatrocartResponse> registerUser(@RequestBody BillingAddress billingAddress) {
		PelatrocartResponse pelResponse=billingAddressService.registerUser(billingAddress);
		if(pelResponse.getStatus().equalsIgnoreCase("OK"))
			return new ResponseEntity<PelatrocartResponse>(pelResponse,HttpStatus.OK);
		else
			return new ResponseEntity<PelatrocartResponse>(pelResponse,HttpStatus.BAD_REQUEST);
			
	}
	


}
