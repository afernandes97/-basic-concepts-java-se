package fundamentals;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Type your age: ");
        int age = entry.nextInt();
        // To avoid the "enter" that a nextInt doesn't catch
        entry.nextLine();

        System.out.println("Type your name: ");
        //to receive a typed text
        String name = entry.nextLine();

        System.out.println("Type your last name: ");
        String lastName = entry.nextLine();



        String text = String.format("Hello %s %s, you age is %d",name, lastName, age);
        System.out.println(text);
    }
}
