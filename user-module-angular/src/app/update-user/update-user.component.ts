import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../model/user';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent {
  user: User;
  userId: number;

  constructor(private service:UserService) { }

  updateUser(form: any) {
    let data = form.value;
    let id = form.value;
    let userType=data.userType;
    let userName=data.userName;
    let email= data.email;
    let password=data.password; 
    let phoneNumber=data.phoneNumber;
    this.user = new User(userType, userName, email, password, phoneNumber);
    let successFun = (userArg: User) => {
      this.user = userArg;
      alert("update successfully")
    };
    let errFun = err => {
      console.log("err in addtestcomponent " + err.message);
    }

    let observable:Observable<User> =this.service.updateUser(id);
    observable.subscribe(successFun, errFun);
    //alert("user add successfully")
  }
}
