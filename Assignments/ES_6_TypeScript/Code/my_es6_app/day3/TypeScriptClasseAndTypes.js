"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Account = (function () {
    function Account(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    Account.prototype.getBalance = function () {
        return this.balance;
    };
    return Account;
}());
exports.Account = Account;
var SavingAccount = (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(id, name, balance, interest) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.interest = interest;
        return _this;
    }
    SavingAccount.prototype.getBalance = function () {
        return this.balance + this.interest;
    };
    return SavingAccount;
}(Account));
exports.SavingAccount = SavingAccount;
var CurrentAccount = (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name, balance, cashCredit) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.cashCredit = cashCredit;
        return _this;
    }
    CurrentAccount.prototype.getBalance = function () {
        return this.balance + this.cashCredit;
    };
    return CurrentAccount;
}(Account));
exports.CurrentAccount = CurrentAccount;
function getTotalBalance(accountArr) {
    var sum = 0;
    for (var _i = 0, accountArr_1 = accountArr; _i < accountArr_1.length; _i++) {
        var acc = accountArr_1[_i];
        sum += acc.getBalance();
    }
    return sum;
}
function f1() {
    var a1 = new Account(1, 'shrey', 1000);
    var a2 = new SavingAccount(2, 'shrey', 1000, 100);
    var a3 = new CurrentAccount(3, 'shrey', 1000, 50);
    var a4 = new SavingAccount(4, 'shrey', 1000, 100);
    console.log("Total balance : " + getTotalBalance([a1, a2, a3, a4]));
}
exports.f1 = f1;
