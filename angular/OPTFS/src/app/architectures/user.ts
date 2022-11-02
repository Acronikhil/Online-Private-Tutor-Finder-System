import { last } from "rxjs";

export interface User {
    firstName: string,
    lastName: string,
    email: string,
    password: string,
    phoneNo: number;
    isAdmin: boolean,
    isParent: boolean,
    isTutor: boolean,
};

export let Users: User[] = [{
    firstName: "Nikhil",
    lastName: "Dubey",
    email: "20.nikhildubey@gmail.com",
    password: "123",
    phoneNo: 8962132378,
    isAdmin: false,
    isParent: true,
    isTutor: false
}, {
    firstName: "Tony",
    lastName: "Stark",
    email: "stark@gmail.com",
    password: "123",
    phoneNo: 8962132378,
    isAdmin: true,
    isParent: false,
    isTutor: false
}];

export let setUser = (uList: User) => Users.concat(uList);
