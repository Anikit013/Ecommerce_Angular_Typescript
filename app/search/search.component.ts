import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';
import { User1 } from '../user1';
import { Search } from '../search';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  search1 =new Search();
  temp:any;
  response:any;


  constructor( private search : RegistrationService, private router : Router) { }

  ngOnInit(): void {
  }

  enteredsearchvalue : string ='';

  @Output()
  searchTextChanged : EventEmitter<string> =new EventEmitter<string>();

  onsearchTextChanged(){
    this.searchTextChanged.emit(this.enteredsearchvalue);
  }

  public Search()
  {
    this.search.SearchFromBox(this.search1).subscribe(
      data=>{ console.log("Data are being received");
      this.temp=JSON.stringify(data);
      console.log(data);
      this.response.JSON.parse(this.search);
      console.log(this.response.status);

      if(this.response.status="OK")
      {
        alert("Search result Found");
        this.router.navigate(["/ProductSearch"])
      }
    }
      , error=>{ console.log("Search Result not found");
                  alert("Search result not found");
                }
    )


    }
  } 
