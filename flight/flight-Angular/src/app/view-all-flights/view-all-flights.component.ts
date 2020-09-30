import { Component, OnInit } from '@angular/core';
import { Flight } from '../model/flight';
import { FlightService } from '../service/flightService';
import { observable, Observable } from 'rxjs';

@Component({
  selector: 'app-view-all-flights',
  templateUrl: './view-all-flights.component.html',
  styleUrls: ['./view-all-flights.component.css']
})
export class ViewAllFlightsComponent  {

flights:Flight[];

  constructor(private flightService:FlightService) {
    let observable:Observable<Flight[]>=flightService.viewAllFlights();
    observable.subscribe(
      flightArray=>
      this.flights=flightArray);
      
    }
    delete(flightNum:number){
      let observable=this.flightService.delete(flightNum);
      observable.subscribe(
        res=>{
         this.deleteFlight(flightNum);
        },
        err=>{
          console.log("inside deleteFlight, err is "+err.message);
        }
      );
       }
     deleteFlight(flightNum:number):void{
       console.log("before deleting flight,length="+this.flights.length);
       for(let i=0 ;i<this.flights.length;i++ ){
        let flight=this.flights[i];
         if(flight.flightNum===flightNum){
              this.flights.splice(i,1);
         }
      }
     }
   }

