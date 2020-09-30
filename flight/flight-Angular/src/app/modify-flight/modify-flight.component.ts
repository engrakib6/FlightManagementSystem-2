import { Component, OnInit } from '@angular/core';
import { Flight } from '../model/flight';
import { Observable } from 'rxjs';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { FlightService } from '../service/flightService';
@Component({
  selector: 'app-modify-flight',
  templateUrl: './modify-flight.component.html',
  styleUrls: ['./modify-flight.component.css']
})
export class ModifyFlightComponent implements OnInit {

  modifyForm:FormGroup;
  flightModelCtrl:FormControl;
  carrierNameCtrl:FormControl;
  seatCapacityCtrl:FormControl;
  flight:Flight;
  constructor(private flightService:FlightService,fb:FormBuilder) { 
    this.flightModelCtrl=fb.control("",[Validators.required]);
    this.carrierNameCtrl=fb.control("",[Validators.required]);
    this.seatCapacityCtrl=fb.control("",[Validators.required]);
    this.modifyForm=fb.group({
      flightModel: this.flightModelCtrl,
      carrierName: this.carrierNameCtrl,
      seatCapacity:this.seatCapacityCtrl
    });
  }
   
    ngOnInit(): void {
    }
  modifyFlight(){
    let flightModel:string=this.flightModelCtrl.value;
    let carrierName:string=this.carrierNameCtrl.value;
    let seatCapacity:number=this.seatCapacityCtrl.value;
    this.flight=new Flight(2,flightModel,carrierName,seatCapacity);
    let observable:Observable<Flight>=this.flightService.modifyFlight(this.flight);
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