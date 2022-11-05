import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {


  allUsers: any;
  allTutors: any;

  userToEdit: any;


  manageUser: boolean = true;
  manageTutor: boolean = false;

  constructor(private userService: UserService) {
    this.allUsers = this.userService.getAllUsers().subscribe((data) => this.allUsers = data);


  }

  editMe(user: any) {
    this.userToEdit = user;
    console.log("----------- User To Edit ------------", user);
  }

  toggleManageUser() {
    this.manageUser = true;
    this.manageTutor = false;
  }

  toggleManageTutor() {
    this.allTutors = this.userService.getAllTutors().subscribe(data => this.allTutors = data);
    this.manageTutor = true;
    this.manageUser = false;
  }

  editUser() {
    let uId = this.userToEdit.userId;
    this.userService.deleteUser(uId).subscribe();
  }

  deleteMe() {
    let uId = this.userToEdit.userId;
    console.log("Deleting User: ", this.userToEdit.firstName, uId);

    this.userService.deleteUser(uId).subscribe();
    this.ngOnInit();
  }

  ngOnInit(): void {

    this.allUsers = this.userService.getAllUsers().subscribe((data) => this.allUsers = data);



  }

}
