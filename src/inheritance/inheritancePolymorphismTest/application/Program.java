package inheritance.inheritancePolymorphismTest.application;

import inheritance.inheritancePolymorphismTest.entities.Employee;
import inheritance.inheritancePolymorphismTest.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //list of Employee
        List<Employee> list = new ArrayList<>();

        //user entry
        System.out.println("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();

        for(int i = 1; i <= numberOfEmployees; i++){
            System.out.println("Emplyee #" + i + "data:");

            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            //if ch(outsourced) is 'y'
            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                //and adding in list
                list.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
            }else{
                //and adding in list
                list.add(new Employee(name,hours,valuePerHour));
            }


        }

        System.out.println();
        System.out.println("PAYMENTS: ");

        for(Employee emp: list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
        }
        sc.close();
    }
}
