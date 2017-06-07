export class Account {
    constructor(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}

export class SavingAccount {
    constructor(id, name, balance,interest) {
        Account(id, name, balance);
        this.interest = interest;
    }
}

export class CurrentAccount {
    constructor(id, name, balance,cashCredit) {
        Account(id, name, balance);
        this.cashCredit = cashCredit;
    }

    getTotalBalance(){
        
    }
}