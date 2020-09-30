import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddAirportComponent } from './add-airport/add-airport.component';
import { AirportDetailsComponent } from './airport-details/airport-details.component';
import { AirportsListComponent } from './airports-list/airports-list.component';
import { AirportService } from './service/airportservice';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    AddAirportComponent,
    AirportDetailsComponent,
    AirportsListComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [AirportService,HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
