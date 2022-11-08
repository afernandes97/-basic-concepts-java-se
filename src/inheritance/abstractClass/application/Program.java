package inheritance.abstractClass.application;

import inheritance.abstractClass.entities.Account;
import inheritance.abstractClass.entities.SavingAccount;

public class Program {
    public static void main(String[] args){

        //Abstract classes cannot be instantiated, but they can be subclassed.
        //Account acc1 = new Account(1001,"andré",1000.00);

        Account accSaving = new SavingAccount(1002, "bia",1000.0,0.02);

        //System.out.println(acc1.getBalance());
        System.out.println(accSaving.getBalance());

    }
}
