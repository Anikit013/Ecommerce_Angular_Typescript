package com.pelatro.pelatrocartapp.Service.Implementation;

import com.pelatro.pelatrocartapp.entity.Users;
import com.pelatro.pelatrocartapp.repository.UserRepository;
import com.pelatro.pelatrocartapp.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;

import com.pelatro.pelatrocartapp.commonresponse.*;
@Service
public class UserImplemention implements UserService {
	
	@Autowired
	public UserRepository userRepository;

	@Override
	public PelatrocartResponse registerUser(Users user) {
		PelatrocartResponseWrapper pelresp=new PelatrocartResponseWrapper();
		try {
			Users cuser=userRepository.findByEmail(user.getEmail());
			if(cuser==null)
				return pelresp.createResponse("OK", userRepository.save(user));
				
				//return pelresp.createResponse(user.getEmail(),"already user exists");
		}
		catch(Exception e) {
			
		}
		return pelresp.createResponse(user.getEmail(),"already user exists");
	}
	
	@Override
	public PelatrocartResponse loginUser(Users user) {
		PelatrocartResponseWrapper pelresp=new PelatrocartResponseWrapper();
		try {
			
			Users temusr=userRepository.findByEmail(user.getEmail());
			if(temusr!=null) {
			if(temusr.getPassword().equals(user.getPassword()))
				return pelresp.createResponse(Integer.toString(user.getUserid()), user);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pelresp.createResponse("LOGIN NOT SUCCESFUL", user);
	}
//	 @Override
//		public Users findByEmail(String email) {
//			
//			return userRepository.findByEmail(email);
//		}
//        String password = user.getPassword();
//        if (password.isEmpty()) {
//            new Exception("Invalid password.");
//        }
//        userRepository.save(user);
//        return user;
    

	@Override
	public Users findByEmail(String email) {
		
		return userRepository.findByEmail(email);
	}
	
	
}
