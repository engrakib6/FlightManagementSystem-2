export class Airport{
    code:string;
    name:string;
    location:string;
    

    constructor(code:string,name : string, location:string){
      this.code=code;
      this.name=name;
      this.location=location;
      
    }
    getCode():string{
        return this.code;
      }

    getName():string{
      return this.name;
    }
  
    getLocation():string{
      return this.location;
    }
  
    

  }