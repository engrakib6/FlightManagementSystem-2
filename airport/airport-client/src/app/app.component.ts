import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'airport-client';
  constructor(private router:Router){  
    //programtic way of navigating to a path, when ever appcomponent will be constructed, navigation will be done to user-list
      //this.router.navigate(['airports-list']);
    
    }
}
