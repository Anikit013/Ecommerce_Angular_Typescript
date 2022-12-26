package com.pelatro.pelatrocartapp.service;

import com.pelatro.pelatrocartapp.entity.Users;
import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;


public interface UserService {
	
	PelatrocartResponse registerUser(Users user);
    Users findByEmail(String email);
    //PelatrocartResponse login(Users user);
    PelatrocartResponse loginUser(Users user);
   
}
