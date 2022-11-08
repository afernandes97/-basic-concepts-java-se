package inheritance.abstractClass.application;

import inheritance.abstractClass.entities.Account;
import inheritance.abstractClass.entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){

        //Abstract classes cannot be instantiated, but they can be subclassed.
        //Account acc1 = new Account(1001,"andré",1000.00);

        Account accSaving = new SavingAccount(1002, "bia",1000.0,0.02);
        Account accSaving2 = new SavingAccount(1003, "test",1100.0,0.04);
        Account accSaving3 = new SavingAccount(1004, "test2",1200.0,0.02);
        Account accSaving4 = new SavingAccount(1005, "test3",1300.0,0.04);

        //System.out.println(acc1.getBalance());
        System.out.println(accSaving.getBalance());

        //using polymorphism it is possible to change all account subclasses even if the account is abstract
        List<Account> list = new ArrayList<>();

        list.add(accSaving);
        list.add(accSaving2);
        list.add(accSaving3);
        list.add(accSaving4);

        double sum = 0.0;

        for(Account acc: list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc: list){
            acc.deposit(10.00);
        }

        for(Account acc: list){
            System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
