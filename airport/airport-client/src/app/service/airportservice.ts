import { Injectable } from '@angular/core';
import { from, observable, Observable } from 'rxjs';
import { Airport } from '../model/airport';
import {HttpClient} from '@angular/common/http'

@Injectable()
export class AirportService{

    baseUrl="http://localhost:8585/airports";

    constructor(private http:HttpClient){

    }

    addAirport(airport:Airport):Observable<Airport>{
     let url=this.baseUrl+"/add";   
     let observable:Observable<Airport>=this.http.post<Airport>(url,airport);
     return observable;
    }

    getAirport(code:string):Observable<Airport>{
        let url=this.baseUrl+"/get/"+code;
        let observable:Observable<Airport>=this.http.get<Airport>(url);
        return observable;
    }
       
   removeAirport(code:string):Observable<void>{
       let url=this.baseUrl+"/delete/"+code;
       let observable:Observable<void>=this.http.delete<void>(url);
       return observable;
   }
    
   getAllAirports():Observable<Airport[]>{
    let url=this.baseUrl;
    let observable:Observable<Airport[]>=this.http.get<Airport[]>(url);
    return observable;
}

}