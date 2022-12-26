package com.pelatro.pelatrocartapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pelatro.pelatrocartapp.service.UserService;
import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponseWrapper;
import com.pelatro.pelatrocartapp.entity.Users;
import com.pelatro.pelatrocartapp.repository.UserRepository;
@CrossOrigin(origins="https://localhost:4200")
@RestController()
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	

	PelatrocartResponseWrapper pelResponseWrapper = new PelatrocartResponseWrapper(); 
	//Logger log = LoggerFactory.getLogger(this.getClass());
	//@PostMapping("/register")
	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<PelatrocartResponse> registerUser(@RequestBody Users user) {
		PelatrocartResponse pelResponse=userService.registerUser(user);
		if(pelResponse.getStatus().equalsIgnoreCase("OK"))
			return new ResponseEntity<PelatrocartResponse>(pelResponse,HttpStatus.OK);
		else
			return new ResponseEntity<PelatrocartResponse>(pelResponse,HttpStatus.BAD_REQUEST);
			
		}
	
    //  @PostMapping("/login")
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
       public ResponseEntity<PelatrocartResponse> loginUser(@RequestBody Users user) {
       PelatrocartResponse pelResponse= userService.loginUser(user);
       if(pelResponse.getStatus().equalsIgnoreCase("LOGIN SUCCESFULL"))
    	   return new ResponseEntity<PelatrocartResponse>(pelResponse,HttpStatus.OK);
       else
		return new ResponseEntity<PelatrocartResponse>(pelResponse,HttpStatus.BAD_REQUEST);   
	}
	
//	@GetMapping("/getalluser")
//	public List<Users> getAllUsers(){		
//	      return userRepository.findAll();
//	   }
}
	
	
	
	
	
	

	
	
	
	
	
//	@GetMapping("/getUsers")
//	public ArrayList<Users> getAllUsers(){
//		ArrayList<Users> users = new ArrayList<Users>();
//	      userRepository.findAll().forEach(user -> users.add(user));
//	      return users;
//	   }
//	
	
	
//	@PostMapping("/login")
//    public ResponseEntity<String> responseLogin(@RequestBody Users user) {
//        try {
//        	Users savedUser = userRepository.findByEmail(user.getEmail());
//        	//Users saveuser = userRepository.findByPassword(user.getPassword()).get();
//        	if(!savedUser.getPassword().equals(user.getPassword()) || !savedUser.getEmail().equals(user.getEmail()))
//        	{
//        		return new ResponseEntity<>("wrong username and password", HttpStatus.UNAUTHORIZED);
//        	}     	
//        	return new ResponseEntity<>("SucessFully Login", HttpStatus.OK);
//        } catch (Exception e) {
//        	System.out.println(e);
//        	return new ResponseEntity<>("Error", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
	
//	@PostMapping("/register")
//  public ResponseEntity<Users> responseEntity(@RequestBody Users user) {
//      try {
//      	Users saveduser = userRepository.save(user);
//      	return new ResponseEntity<>(saveduser, HttpStatus.CREATED);
//      	System.out.println();
//      } catch (Exception e) {
//      	System.out.println(e);
//      	return new ResponseEntity<>(user, HttpStatus.INTERNAL_SERVER_ERROR);
//      }
//  }
	
