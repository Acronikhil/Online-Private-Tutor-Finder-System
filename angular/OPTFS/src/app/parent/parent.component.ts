import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  allTutors: any;

  constructor(protected userService: UserService) {

    this.userService.getAllTutors().subscribe((data) => {
      this.allTutors = data;
      console.log(data);

    });

    console.log("Contructing all Tutors: ", this.allTutors);


  }

  ngOnInit(): void {
  }

}
