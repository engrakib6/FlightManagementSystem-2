import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Airport } from '../model/airport';
import { AirportService } from '../service/airportservice';

@Component({
  selector: 'app-airports-list',
  templateUrl: './airports-list.component.html',
  styleUrls: ['./airports-list.component.css']
})
export class AirportsListComponent{
  airports:Airport[];
  constructor(private airportservice:AirportService) 
  { 
    let observable:Observable<Airport[]>=airportservice.getAllAirports();
    observable.subscribe(
      airportArr=>{
        this.airports=airportArr;
      },
      err=>{
        console.log("inside airportsListComponent err is "+err.message);
      }

    );
  }

  removeAirport(code:string){
    let observable=this.airportservice.removeAirport(code);
    observable.subscribe(
      res=>{
       this.removeLocalElement(code);
      },
      err=>{
        console.log("inside removeAirport, err is "+err.message);
      }
    );
     }
   
     removeLocalElement(code:string):void{
       console.log("before user removed,length="+this.airports.length);
        for(let i=0 ;i<this.airports.length;i++ ){
          let airport=this.airports[i];
           if(airport.code===code){
               //index and number of elements to remove
               this.airports.splice(i,1);
           }
        }
          
   }

}
