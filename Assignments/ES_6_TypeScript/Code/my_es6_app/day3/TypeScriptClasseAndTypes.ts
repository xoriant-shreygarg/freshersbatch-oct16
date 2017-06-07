export class Account {
    id:number;
    name:string;
    balance:number;
    constructor(id:number,name:string,balance:number){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
     getBalance(){
        return this.balance;
    }

}
export class SavingAccount extends Account {
    interest:number;
    constructor(id:number,name:string,balance:number, interest:number){
       super(id,name,balance);
       this.interest = interest;
    }
   
     getBalance(){
        return this.balance + this.interest;
    }

}
export class CurrentAccount extends Account {
    cashCredit:number;
    constructor(id:number,name:string,balance:number, cashCredit:number){
       super(id,name,balance);
       this.cashCredit = cashCredit;
    }

   
     getBalance(){
        return this.balance + this.cashCredit;
    }

}

function getTotalBalance(accountArr){
        let sum = 0;
        for(let acc of accountArr){
            sum += acc.getBalance();
        }
        return sum;
}

export function f1(){
    let a1 = new Account(1,'shrey',1000);
    let a2 = new SavingAccount(2,'shrey',1000,100);
    let a3 = new CurrentAccount(3,'shrey',1000,50);
    let a4 = new SavingAccount(4,'shrey',1000,100);
    console.log("Total balance : "+getTotalBalance([a1,a2,a3,a4]));
}