export class Flight{
    flightNum:number;
    flightModel:string;
    carrierName:string;
    seatCapacity:number;
    constructor(flightNum:number,flightModel:string,carrierName:string,seatCapacity:number){
        this.flightNum=flightNum;
        this.flightModel=flightModel;
        this.carrierName=carrierName;
        this.seatCapacity=seatCapacity;
    }
    
    getFlightNum():number{
        return this.flightNum;
    }
    getFlightModel():string{
        return this.flightModel;   
    }
    getCarrierName():string{
        return this.carrierName;
    }
    getSeatCapacity():number{
        return this.seatCapacity;
    }
}