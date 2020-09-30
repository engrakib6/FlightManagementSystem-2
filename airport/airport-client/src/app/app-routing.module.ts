import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddAirportComponent } from './add-airport/add-airport.component';
import { AirportDetailsComponent } from './airport-details/airport-details.component';
import { AirportsListComponent } from './airports-list/airports-list.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {
    path:"app-home",
    component:HomeComponent
  },
//wheneever someone has list in uri, it will be naviagted to user-list
{
  path:'',
  redirectTo :'app-home',
  pathMatch:'full'
},

  {
    path:'airport-details/:code',
    component:AirportDetailsComponent
  },
  {
    path:'airport-details',
    component:AirportDetailsComponent
  },
  {
    path: 'add-airport',
    component:AddAirportComponent
  },

  {
    path:'airports-list',
    component: AirportsListComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
