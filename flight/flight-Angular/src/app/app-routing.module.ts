import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { ModifyFlightComponent } from './modify-flight/modify-flight.component';
import { ViewAllFlightsComponent } from './view-all-flights/view-all-flights.component';

const routes: Routes = [
  {
    path: 'add-flight',
    component:AddFlightComponent
  },
  {
    path: 'view-all-flights',
    component:ViewAllFlightsComponent
  },
  {
    path: 'modify-flight',
    component: ModifyFlightComponent
  },
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
