package tryCatchExamples.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        mainMethod();
        System.out.println("End of program");
    }

    public static void mainMethod(){
        Scanner sc = new Scanner(System.in);
        Integer lengthVector = 0;

        //When executing Java code, different errors can occur, one of the ways to treat them is using try catch, to treat possibles errors
        try {
            String[] vector = sc.nextLine().split(" ");
            lengthVector = vector.length;
            int position = sc.nextInt();
            System.out.println(vector[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position,\n" +
                    "please enter the number between 0 and " + (lengthVector - 1));
        }catch (InputMismatchException e){
            System.out.println("Please entry only numbers");
        }

        sc.close();
    }
}
