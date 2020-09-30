import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Observable } from 'rxjs';
import { Airport } from '../model/airport';
import { AirportService } from '../service/airportservice';

@Component({
  selector: 'app-airport-details',
  templateUrl: './airport-details.component.html',
  styleUrls: ['./airport-details.component.css']
})
export class AirportDetailsComponent  {

  constructor(private route:ActivatedRoute, private airportservice:AirportService)
   { 
    let observable =route.paramMap;//param map is the property in activated route
    observable.subscribe((params:ParamMap)=>{
     let codeVal:string =params.get("code");
     console.log("code available is "+codeVal);
     this.findAirportByCode(codeVal);
    })
   }
   
   airport:Airport;


   findAirportByCode(code:string){
    let observable:Observable<Airport>=this.airportservice.getAirport(code);
    observable.subscribe(
      airportArg=>{
        this.airport=airportArg;
      },

      err=>{
        console.log("inside airport details, err is "+err.message);
      }

    );
   }

  findAirport(form:any){
    let data=form.value;
    let code=data.airportcode;
   this.findAirportByCode(code);
  }

  

}
