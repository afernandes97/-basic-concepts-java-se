package inheritance.abstractClass.entities;

public class SavingAccount extends Account{
    private Double interestRate;

    public SavingAccount(){
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    //@override method, using father method and rewriting method, and using 'final' to don't rewrite method (attributes of final type are analyzed in a way faster in execution time)
    @Override
    public final void withdraw(double amount){
        balance -= amount;
    }
}
