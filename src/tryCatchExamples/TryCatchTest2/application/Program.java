package tryCatchExamples.TryCatchTest2.application;

import tryCatchExamples.TryCatchTest2.model.entities.Account;
import tryCatchExamples.TryCatchTest2.model.exceptions.DomainException;

public class Program {
    public static void main(String[] args){
        try{
            Account acc = new Account(1003,"André Fernandes", 1000.00, 1000.00);
            acc.withdraw(1110.00);
            System.out.println(acc.getBalance());
        }catch(DomainException e){
            System.out.println("Error in withdraw: " + e.getMessage());
        }
    }
}
