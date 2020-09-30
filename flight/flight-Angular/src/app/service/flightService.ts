import { Injectable } from '@angular/core';
import { from, observable, Observable } from 'rxjs';
import { Flight } from '../model/flight';
import {HttpClient} from '@angular/common/http'

@Injectable()
export class FlightService{

    baseUrl="http://localhost:8080/flights";

    constructor(private http:HttpClient){

    }

    addFlight(flight:Flight):Observable<Flight>{
     let url=this.baseUrl+"/add";   
     let observable:Observable<Flight>=this.http.post<Flight>(url,flight);
     return observable;
    }
    modifyFlight(flight:Flight): Observable<Flight> {
        let url=this.baseUrl+"/modify";
        let observable:Observable<Flight>=this.http.put<Flight>(url,flight);
        return observable;
      }

    viewByFlightNum(flightNum:number):Observable<Flight>{
        let url=this.baseUrl+"/get/"+flightNum;
        let observable:Observable<Flight>=this.http.get<Flight>(url);
        return observable;
    }

   viewAllFlights():Observable<Flight[]>{
       let url=this.baseUrl;
       let observable:Observable<Flight[]>=this.http.get<Flight[]>(url);
       return observable;
   }

   delete(flightNum:number):Observable<void>{
       let url="";
       let observable:Observable<void>=this.http.delete<void>(url);
       return observable;
   }

}