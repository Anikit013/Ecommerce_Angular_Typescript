import { Component, OnInit } from '@angular/core';
import { freeapiservice } from '../services/freeapiservices';
import { Comments} from '../classes/comment';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  

  constructor( private _freeApiService : freeapiservice) { }

  lstcomments: any;
  temp:any;
  temp1:any;
  temp3:any;
  
  ngOnInit(): void {

    this._freeApiService.getcomments().subscribe
    (data=>{

      this.temp=data;
      this.temp1=JSON.stringify(this.temp);
      this.temp3=JSON.parse(this.temp1);
      this.lstcomments=this.temp3['content'];
      console.log(this.lstcomments);
    },
    (error=>{console.log(error)})
    )
  }
  searchText:string=''

  onSearchTextEntered(searchvalue: string){
    this.searchText= searchvalue;
    console.log(this.searchText);

  }

}
