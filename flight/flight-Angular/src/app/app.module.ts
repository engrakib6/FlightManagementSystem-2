import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import  { Observable } from 'rxjs';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { ModifyFlightComponent } from './modify-flight/modify-flight.component';
import { ViewAllFlightsComponent } from './view-all-flights/view-all-flights.component';
import { FlightService } from './service/flightService';

@NgModule({
  declarations: [
    AppComponent,
    AddFlightComponent,
    ModifyFlightComponent,
    ViewAllFlightsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [FlightService,HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
