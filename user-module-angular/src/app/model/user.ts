export class User{

     userId:number;
    private userType:string;
    private userName:string;
    private email:string;
    private password:string;
    private phoneNumber:number;

    constructor(userType:string,userName:string,email:string,password:string,phoneNumber:number){
       // this.userId=userId;
        this.userType=userType;
        this.userName=userName;
        this.email=email;
        this.password=password;
        this.phoneNumber=phoneNumber;
    }

}