package fundamentals.conversions;

import javax.swing.*;

public class ConversionChallenge {
    public static void main(String[] args) {
        String salary1 = JOptionPane.showInputDialog("Type your first salary").replace(",",".");
        String salary2 = JOptionPane.showInputDialog("Type your second salary").replace(",",".");
        String salary3 = JOptionPane.showInputDialog("Type your third salary").replace(",",".");

        double salary1Converted = Double.parseDouble(salary1);
        double salary2Converted = Double.parseDouble(salary2);
        double salary3Converted = Double.parseDouble(salary3);

        double salarySum = salary1Converted + salary2Converted + salary3Converted;
        double mediaSalary = salarySum / 3;

        System.out.println("Hi, your sum of salary is: " + salarySum);
        System.out.println("Your media of salary is: " + mediaSalary);
    }
}
