import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { ErrorHandler, Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { catchError, throwError } from 'rxjs';
import { User } from '../architectures/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  activeUser: any = {
  };

  response = 0;
  errorMessage: any;

  linkHeader = "http://localhost:8089/";

  users: any;

  constructor(private http: HttpClient, private router: Router) {

  }

  private handleError(error: HttpErrorResponse) {
    if (error.status === 0) {
      // A client-side or network error occurred. Handle it accordingly.
      console.warn('An error occurred:', error.error);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong.
      // this.response = error.status;


      console.warn(
        `Backend returned code ${error.status}, body was: `, error.error);
      this.errorMessage = error.error;
    }
    // Return an observable with a user-facing error message.
    return throwError(() => new Error('Something bad happened; please try again later.'));
  }

  getUserByEmail(email: string) {
    return this.http.get(`${this.linkHeader}getUserByEmail/${email}`);
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
    return this.http.delete(`${this.linkHeader}deleteUser/${uId}`);
  }


  addUser(user: User) {

    let message = this.http.put(`${this.linkHeader}addUser`, user).subscribe();
    // setUser(user);
    console.log("MESSAGE: ", message);


  }

  resp(status: number, email: String) {

    if (status == 200) {
      console.log("status is ok", status);

      console.log(this.activeUser);


      // sessionStorage.setItem();

    }

    console.log("Status in Resp:", status);

    this.http.get(`${this.linkHeader}getUserByEmail/${email}`, { observe: 'response' }).subscribe((data => {
      this.activeUser = data.body;
      // console.log(data.body);

      Object.entries(this.activeUser).forEach(
        ([key, values]) => {
          sessionStorage.setItem(key, <string>values);
        }
      );

      if (this.activeUser.admin) {
        this.router.navigate(['/admin']);
      }
      else if (this.activeUser.tutor) {
        this.router.navigate(['/tutor']);
      }
      else if (this.activeUser.parent) {
        this.router.navigate(['/parent']);
      }


      console.warn(this.activeUser);
    }
    ));


  }

  loginUser(email: String, password: String) {
    let httpResponse = 0;
    this.http.post(`${this.linkHeader}loginUser`, [email, password], { responseType: 'text', observe: 'response' }).pipe(catchError(this.handleError)).subscribe((data) => this.resp(data.status, email));

    console.log("++++++++++", httpResponse);



  }


}


