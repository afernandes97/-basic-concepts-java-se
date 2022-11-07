package inheritance.application;

import inheritance.entities.Account;
import inheritance.entities.BusinessAccount;
import inheritance.entities.SavingsAccount;

public class Program {
    public static void main(String[] args){
        Account acc = new Account(1001,"André",0.0);
        BusinessAccount bcc = new BusinessAccount(1002,"Maria",0.0,1000.00);

        //UPCASTING BusinessAccount && SavingsAccount => Account (subclass to superclass)
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003,"bob",0.0,1000.00);
        Account acc3 = new SavingsAccount(1004,"Job", 0.0, 0.02);


        //DOWNCASTING SuperClass to SubClass
        BusinessAccount acc4 = (BusinessAccount)acc2; //implicit convert
        acc4.loan(150.00);

        //verify instance type using instaceof
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("LOAN");
        }

        //verify instance type using instaceof
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        //testing without override
        Account withoutOverrideMethod = new Account(1001, "andre", 1000.0);
        withoutOverrideMethod.withdraw(200.0);
        System.out.println(withoutOverrideMethod.getBalance());

        //testing override method in savingsAccount
        Account overrideMethod = new SavingsAccount(1002, "julio", 1000.0, 0.02);
        overrideMethod.withdraw(200.0);
        System.out.println(overrideMethod.getBalance());

        //testing override method in BusinessAccount
        Account businessAccountOverride = new BusinessAccount(1002, "julio", 1000.0, 1000.0);
        businessAccountOverride.withdraw(200.0);
        System.out.println(businessAccountOverride.getBalance());

    }
}
