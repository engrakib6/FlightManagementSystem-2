import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Observable } from 'rxjs';
import { Flight } from '../model/flight';
import { FlightService } from '../service/flightService';

@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})
export class AddFlightComponent implements OnInit {
  
  flightForm:FormGroup;
  flightModelCtrl:FormControl;
  carrierNameCtrl:FormControl;
  seatCapacityCtrl:FormControl;
  flight:Flight;

  constructor(private flightService:FlightService,fb:FormBuilder) { 
    this.flightModelCtrl=fb.control("",[Validators.required]);
    this.carrierNameCtrl=fb.control("",[Validators.required]);
    this.seatCapacityCtrl=fb.control("",[Validators.required]);
    this.flightForm=fb.group({
      flightModel: this.flightModelCtrl,
      carrierName: this.carrierNameCtrl,
      seatCapacity:this.seatCapacityCtrl
    });
  }

  ngOnInit(): void {
  }
addFlight(){
  let flightModel:string=this.flightModelCtrl.value;
  let carrierName:string=this.carrierNameCtrl.value;
  let seatCapacity:number=this.seatCapacityCtrl.value;
  this.flight=new Flight(1,flightModel,carrierName,seatCapacity);
  let observable:Observable<Flight>=this.flightService.addFlight(this.flight);
  observable.subscribe(
    flightArg=>{
      this.flight=flightArg;
    },      
    err=>{
      console.log("add flight = "+err.message);
    }
  )
}
}
