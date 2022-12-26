import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';
import { HttpClient } from '@angular/common/http';
import { User1 } from './user1';
import { Address } from './address';
import { Search } from './search';


@Injectable({providedIn: 'root'})
   
@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private http : HttpClient) { }

  public LoginUserFromRemote(user1 :User1):Observable<Object>
  {
    return this.http.post<Object>("http://localhost:8090/user/login", user1)

  }
  public RegisterUserFromRemote(user :User):Observable<Object>
  {
    return this.http.post<Object>("http://localhost:8090/user/register", user)

  }

  public RegisterAddress(address:Address):Observable<Object>{
    return this.http.post<object>("http://localhost:8090/billingaddress/register", address)

  }

  public SearchFromBox(search:Search):Observable<Object>{
    return this.http.post<object>("http://localhost:8090/product/1", search)
  }
  
  
}
