import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { RegistrationService } from '../registration.service';
import { User } from '../user';
import { Observable } from 'rxjs';
import { ObjectUnsubscribedError } from 'rxjs';
import { Route, Router } from '@angular/router';
import { User1 } from '../user1';


@Component({
  selector: 'app-login',
  templateUrl:'./login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user1 = new User1();
  private _service: any;
  msg="";
  temp: any;
  commonRespo: any;
  userlogin: any;


  constructor(private service : RegistrationService , private router: Router ){ }

  ngOnInit(): void {
  }

     public  LoginUser() {
    this.service.LoginUserFromRemote(this.user1).subscribe((data)=>{
      this.temp=JSON.stringify(data);
      console.log(data);
     this.commonRespo=JSON.parse(this.temp);
     console.log(this.commonRespo.status)
      if(this.commonRespo.status=="Invalid emailid or password"){
        alert("Invalid login");}
      if(this.commonRespo.status=="LOGIN SUCCESFULL"){
        alert("Login Successful"); 
        this.router.navigate(["/products"]);
      }
    },(error)=>alert("Sorry Please Enter Correct Details"));

  }

    }
  

    
  