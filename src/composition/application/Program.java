package composition.application;



import composition.Department;
import composition.HourContract;
import composition.Worker;
import composition.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        //redefine locale default
        Locale.setDefault(Locale.US);
        //associating Scanner at variable
        Scanner sc = new Scanner(System.in);
        //define data using simpla date format
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //user entry
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.print("Enter Worker data: ");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();

        //declaring worker, instantiate new object Worker passing values and others objects
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departmentName));


        //verify contracts
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        //for loop to control quantity of contracts
        for(int i = 1; i <= n; i++){
            System.out.println("Enter contract #" + i + " data: ");

            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            //adding user data to new object HourContract
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            //associating worker a new contract
            worker.addContract(contract);
        }

        //final user entry
        System.out.println();

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();

        //take monthAndYear variable and split to MM and YYYY variables
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        //result

        //objects compositions
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " +  String.format("%2f", worker.income(month,year)));
        sc.close();
    }
}
