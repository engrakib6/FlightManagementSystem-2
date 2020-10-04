import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddAirportComponent } from './add-airport/add-airport.component';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { AddUserComponent } from './add-user/add-user.component';
import { AirportDetailsComponent } from './airport-details/airport-details.component';
import { AirportsListComponent } from './airports-list/airports-list.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ModifyFlightComponent } from './modify-flight/modify-flight.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { UserListComponent } from './user-list/user-list.component';
import { ViewAllFlightsComponent } from './view-all-flights/view-all-flights.component';

const routes: Routes = [
  {path:'',redirectTo :'app-login',pathMatch:'full'},
  {path:"app-login" ,component:LoginComponent,
    children:[
      {path:"app-home",component:HomeComponent}
    ]
},
{path: 'add-flight',component:AddFlightComponent},
{path: 'view-all-flights',component:ViewAllFlightsComponent},
{path: 'modify-flight',component: ModifyFlightComponent},
{path:"app-home" ,component:HomeComponent},
{path:"add-user" ,component:AddUserComponent},
{path:"user-list" ,component:UserListComponent},
{path:"user-details" ,component:UserDetailsComponent},
{path:"update-user" ,component:UpdateUserComponent},
{path:"add-airport" ,component:AddAirportComponent},
{path:"airport-details" ,component:AirportDetailsComponent},
{path:"airports-list" ,component:AirportsListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
