import { Component, OnInit } from '@angular/core';
import { Address } from '../address';
import { RegistrationService } from '../registration.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {

  address =new Address();
  temp:any;
  msg:any;


  constructor(private _service : RegistrationService) { }

  ngOnInit(): void {
  }

  BillingAddress(){
    this._service.RegisterAddress(this.address).subscribe(
      data=>{console.log("data are recieved");
      this.msg=" Successfully saved the address";
      alert("Successfully saved the address");},
      error=>{ console.log("error saving the data");
    alert("Couldnot save the address");});
      



  }

}
