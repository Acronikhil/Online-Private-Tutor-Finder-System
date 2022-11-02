import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { setUser, User, Users } from '../architectures/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  activeUser: User = {
    firstName: '',
    lastName: '',
    email: '',
    password: '',
    phoneNo: 0,
    isAdmin: false,
    isParent: false,
    isTutor: false
  };

  linkHeader = "http://localhost:8089/";

  users: any;

  constructor(private http: HttpClient) {

  }

  getUserByEmail(email: string) {
    return Users.filter((user) => user.email == email);
  }

  getAllUsers() {
    // console.log(this.http.get("http://localhost:8089/allUsers").subscribe((data)=> console.log(data)));

    return (this.http.get(`${this.linkHeader}allUsers`));
  }

  getAllParents() {
    return (this.http.get(`${this.linkHeader}allParents`));
  }

  getAllTutors() {
    return this.http.get(`${this.linkHeader}allTutors`);
  }

  deleteUser(uId: number) {
    return this.http.delete(`${this.linkHeader}deleteUser/${uId}`)
  }


  addUser(user: User) {

    setUser(user);

  }


}


