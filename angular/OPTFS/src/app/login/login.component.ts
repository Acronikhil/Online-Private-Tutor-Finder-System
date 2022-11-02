import { Component, OnInit } from '@angular/core';
import { User } from '../architectures/user';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  email = "";
  password = "";

  constructor(private userService: UserService) {
    console.log("All user in login:", this.userService.getAllUsers());

  }

  ngOnInit(): void {
  }

  loginUser() {
    let user = this.userService.getUserByEmail(this.email);
    console.log("`````````````", user);

    if (user.length > 0) {
      console.log(`Welcome ${user}`);

    }
    else {
      console.log("not logged in");

    }

  }

}
