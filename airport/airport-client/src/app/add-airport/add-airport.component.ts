import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Airport } from '../model/airport';
import { AirportService } from '../service/airportservice';

@Component({
  selector: 'app-add-airport',
  templateUrl: './add-airport.component.html',
  styleUrls: ['./add-airport.component.css']
})
export class AddAirportComponent  {
  

  constructor(private airportservice: AirportService)
   {
    
   }
  airport: Airport;

  addAirport(form: any) {
    let data = form.value;
    let name = data.name;
    let location = data.location;
    this.airport = new Airport("o", name,location);
    let successFun = (airportArg: Airport) => {
      this.airport = airportArg;
    };

    let errFun = err => {
      console.log("err in addAirportcomponent " + err.message);
    }

    let observable: Observable<Airport> = this.airportservice.addAirport(this.airport);
    observable.subscribe(successFun, errFun);
  }

}
