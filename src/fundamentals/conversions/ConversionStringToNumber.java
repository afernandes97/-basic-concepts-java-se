package fundamentals.conversions;

import javax.swing.*;

public class ConversionStringToNumber {
    public static void main(String[] args) {
        //dialog with user
        String value1 = JOptionPane.showInputDialog("Type first note");
        String value2 = JOptionPane.showInputDialog("Type second note");

        //conversion string to number
        double value1ToNumber = Double.parseDouble(value1);
        double value2ToNumber = Double.parseDouble(value2);

        System.out.println("Note 1: " + value1ToNumber);
        System.out.println("Note 2: " + value2ToNumber);

        var sum = value1ToNumber + value2ToNumber;
        var result = sum / 2;

        System.out.println("Sum of notes: " + sum);
        System.out.println("Semester result: " + result);

        if(result >= 6){
            System.out.println("Congratulation you have passed the semester");
        }else{
            System.out.println("Sorry you failed, please keep trying");
        }

    }
}
