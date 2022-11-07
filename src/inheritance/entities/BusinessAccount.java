package inheritance.entities;

//inheritance: to use inheritance em you class to extend content another class. use a reserved word "extends" to inheritance another class
public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    //using super() to access father class
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        //instead of assigning a value, use the superclass to access the extended data
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    //getters and setters
    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    //methods

    //loan method, using super class method: deposit and verifying if amount is less than loanLimit
    public void loan(double amount){
        if(amount <= loanLimit){
            balance += amount - 10.00;
        }
    }

    //@override method, using father method and rewriting method
    @Override
    public void withdraw(double amount){
        //using father method to withdraw and adding discount 2
        super.withdraw(amount); //realizing withdraw using father method
        balance -= 2.0;
    }
}
