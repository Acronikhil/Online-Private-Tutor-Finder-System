import { Component, OnInit } from '@angular/core';
import { User } from '../architectures/user';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user: User;

  confirmPassword: string = "";
  message: string = "";
  registered = false;

  allUser: [] | any;


  constructor(private userService: UserService) {
    this.user = {
      firstName: "",
      lastName: "",
      email: "",
      password: "",
      phoneNo: 0,
      isAdmin: false,
      isParent: true,
      isTutor: false
    }
  }

  ngOnInit(): void {

    this.userService.getAllUsers().subscribe((data) => {
      this.allUser = data;
    });
  }

  registerUser() {
    console.log(this.user, this.confirmPassword);

    if (this.confirmPassword == this.user.password) {
      this.registered = true;
      this.message = `Congratulations ${this.user.firstName}, you are registered successfully.`;
      this.userService.addUser(this.user);

    }
    else {
      this.registered = false;
      this.message = `OOps ${this.user.firstName}, your Password and confirm password doesn't match.`;

    }

  }

}
