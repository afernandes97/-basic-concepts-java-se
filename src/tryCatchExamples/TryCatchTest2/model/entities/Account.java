package tryCatchExamples.TryCatchTest2.model.entities;

import tryCatchExamples.TryCatchTest2.model.exceptions.DomainException;

public class Account {
    public Integer number;
    public String holder;
    public Double balance;
    public Double withdrawLimit;

    public Account(){

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException{
        if(amount > balance) {
            throw new DomainException("Don't is possible withdraw. You don't have balance for this");
        }else if(amount > withdrawLimit){
            throw new DomainException("The withdrawal amount cannot be greater than the amount limit on the account");
        }else{
            balance -= amount;
        }
    }
}
