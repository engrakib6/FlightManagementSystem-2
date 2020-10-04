import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../model/user';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent  {
  user:User;
  message: any;
  constructor(private userService:UserService) { }


  addUser(form: any) {
    let data = form.value;
    let userType=data.userType;
      let userName=data.userName;
      let email= data.email;
      let password=data.password; 
      let phoneNumber=data.phoneNumber;
    this.user = new User(userType, userName, email, password, phoneNumber);
    let successFun = (userArg: User) => {
      this.user = userArg;
    };
    let errFun = err => {
      console.log("err in addtestcomponent " + err.message);
    }

    let observable: Observable<User> = this.userService.addUser(this.user);
    observable.subscribe(successFun, errFun);
    //alert("user add successfully")
  }
}

  
