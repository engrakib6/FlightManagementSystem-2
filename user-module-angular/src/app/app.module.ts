import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AddUserComponent } from './add-user/add-user.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { UserService } from './services/user.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UserListComponent } from './user-list/user-list.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { LoginComponent } from './login/login.component';
import { FlightService } from './services/flightService';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { ModifyFlightComponent } from './modify-flight/modify-flight.component';
import { ViewAllFlightsComponent } from './view-all-flights/view-all-flights.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { AddAirportComponent } from './add-airport/add-airport.component';
import { AirportsListComponent } from './airports-list/airports-list.component';
import { AirportDetailsComponent } from './airport-details/airport-details.component';
import { AirportService } from './services/airportservice';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AddUserComponent,
    UserListComponent,
    UserDetailsComponent,
    LoginComponent,
    AddFlightComponent,
    ModifyFlightComponent,
    ViewAllFlightsComponent,
     UpdateUserComponent,
     AddAirportComponent,
     AirportsListComponent,
     AirportDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,FormsModule,ReactiveFormsModule
  ],
  providers: [UserService,HttpClient,FlightService,AirportService],
  bootstrap: [AppComponent]
})
export class AppModule { }
