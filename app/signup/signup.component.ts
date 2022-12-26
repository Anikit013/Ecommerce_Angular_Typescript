import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../user';
import { RegistrationService } from '../registration.service';
import { Route, Router } from '@angular/router';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
[x: string]: any;
  user= new User();
  msg="";

  constructor(private _service : RegistrationService, private _router : Router ) { }

  ngOnInit(): void {
  }

  registerUser() 
  {
    this._service.RegisterUserFromRemote(this.user).subscribe(
      (data: any) =>{ console.log("data are recieved");
                     this.msg="Registation Successful";
                     alert("Signup Successful");
                     this._router.navigate(["/login"])},
    (error:any) => { console.log("error durning passing data");
                    this.msg="Registration Unsuccessful";
                    alert("User already exist or fill all the fields");})
    }
  } 