package inheritance.inheritancePolymorphismTest.entities;

public class OutsourcedEmployee extends Employee{
    private double additionalCharge;

    //constructor without arguments
    public OutsourcedEmployee(){
        super();
    }

    //constructor with arguments
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    //getters and setters
    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    //override method
    @Override
    public Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
