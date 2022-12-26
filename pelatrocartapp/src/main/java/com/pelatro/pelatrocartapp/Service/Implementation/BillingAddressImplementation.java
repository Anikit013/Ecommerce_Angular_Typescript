package com.pelatro.pelatrocartapp.Service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponseWrapper;
import com.pelatro.pelatrocartapp.entity.BillingAddress;
import com.pelatro.pelatrocartapp.repository.BillingAddressRepository;
import com.pelatro.pelatrocartapp.service.BillingAddressService;

@Service
public class BillingAddressImplementation implements BillingAddressService{
	
	@Autowired
	public BillingAddressRepository billingaddressrepository;
	
	@Override
	public PelatrocartResponse registerUser(BillingAddress billingaddress) {
		PelatrocartResponseWrapper pelresp=new PelatrocartResponseWrapper();
		try {
				return pelresp.createResponse("OK", billingaddressrepository.save(billingaddress));
			
		}
		catch(Exception e) {
			
		
		return pelresp.createResponse("NOT SAVED","Cannot save the data, please try again");
	}
	}

}
