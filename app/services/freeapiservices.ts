import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";

@Injectable()
export class freeapiservice{

    constructor(private httpclient: HttpClient){}

    getcomments():Observable<object>{

        return this.httpclient.get<object>("http://localhost:8090/product/displayproducts");

    }



}