package com.pelatro.pelatrocartapp.Service.Implementation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponseWrapper;
import com.pelatro.pelatrocartapp.entity.Order;
import com.pelatro.pelatrocartapp.service.OrderService;

@Service
public class OrderImplementation implements OrderService{
	
	//private static final char[] OrderjsonData = null;
	PelatrocartResponseWrapper pelcartrespwrp = new PelatrocartResponseWrapper();
	
	@Override
	public PelatrocartResponse placeOrder(Order order) throws IOException{
		ObjectMapper objectmapper = new ObjectMapper();
		String OrderjsonData = null;
		try {
			OrderjsonData = objectmapper.writeValueAsString(order);
			
		} catch (JsonProcessingException e) {
	
			e.printStackTrace();
		} 
		File filepath = new File("/home/roshiwagh/Documents/OrderjsonData");
		
		FileWriter fw = new FileWriter(filepath,true);//true for not overwrite the data in file.
		BufferedWriter bw = new BufferedWriter(fw); 
		bw.write(OrderjsonData);
		bw.close();
		fw.close();
		return pelcartrespwrp.createResponse("OK",fw);
	}
	
	
	

}
