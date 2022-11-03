package composition.entities;

import composition.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //associating worker at department
    private Department department;

    //associating hour contract at contract list, and initiate empty list
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){

    }

    //with you have one or more lists in your composition, you don't include in you constructor
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    //methods

    //adding contract in contracts list
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    //remove contract at contracts list
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        //sum base salary
        double sum = baseSalary;

        //instantiate Calendar to treatment year and month
        Calendar cal = Calendar.getInstance();

        for(HourContract c: contracts){
            //set contract getDate to Calendar Date
            cal.setTime(c.getDate());

            //get year at calendar
            int c_year = cal.get(Calendar.YEAR);
            //get month at calendar and sum 1 because calendar initiate month with 0;
            int c_month = 1 + cal.get(Calendar.MONTH);

            //verify month and year with equal to contract year/month
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }

        }

        //return sum
        return sum;
    }
}
