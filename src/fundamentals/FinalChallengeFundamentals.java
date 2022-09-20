package fundamentals;

import java.util.Scanner;

public class FinalChallengeFundamentals {
    public static void main(String[] args) {
        //this challenge will ask for two numbers for user and an expression: +,-,*,/,%. in the end it will calculate two numbers, in this exercise it will be done necessarily using the content viewed so far

        //entry numbers
        Scanner entryNumber = new Scanner(System.in);

        System.out.println("Please digit first number: ");
        double number1 = entryNumber.nextDouble();
        System.out.println("Please digit second number: ");
        double number2 = entryNumber.nextDouble();
        System.out.println("Please digit operation expression (+, -, *, /, %): ");
        String operator = entryNumber.next();

        //calculate
        double result = "+".equals(operator) ? number1 + number2 : 0;
        result = "-".equals(operator) ? number1 - number2 : result;
        result = "*".equals(operator) ? number1 * number2 : result;
        result = "/".equals(operator) ? number1 / number2 : result;
        result = "%".equals(operator) ? number1 % number2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", number1,operator,number2,result);

        System.out.println("\n  ---------  ");

        //second exercise: one program what read a temperature in fahrenheit and convert to celsius

        System.out.println("Please digit a temperature in Fahrenheit");
        double fahrenheitTemperature = entryNumber.nextDouble();

        fahrenheitTemperature = (fahrenheitTemperature - 32) / 1.8;

        System.out.printf("Fahrenheit to Celsius: %.2f", fahrenheitTemperature);

        System.out.println("\n  ---------  ");

        //third exercise: one program what read a temperature in celsius and convert to Fahrenheit

        System.out.println("Please digit a temperature in Celsius");
        double celsiusTemperature = entryNumber.nextDouble();

        celsiusTemperature = (celsiusTemperature * 1.8) + 32;

        System.out.printf("Celsius to Fahrenheit: %.2f", celsiusTemperature);

        System.out.println("\n  ---------  ");

        //fourth exercise: one program what read a weight and height for user and calculate the IMC.

        System.out.println("Please digit your weight: ");
        double weight = entryNumber.nextDouble();

        System.out.println("Please digit your height: ");
        double height = entryNumber.nextDouble();

        double resultImc = weight / (height * height);

        System.out.printf("You imc is: %.2f", resultImc);

        System.out.println("\n  ---------  ");

        //fourth exercise: one program what read a weight and height for user and calculate the IMC.
        
        entryNumber.close();
    }
}
