package ControlStructure;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Please entry you note: ");
        double note = entry.nextDouble();

        if(note > 10 || note <0){
            System.out.println("Invalid note");
        }else if(note >= 8.1){
            System.out.println("Note A");
        }else if(note >= 6.1){
            System.out.println("Note B");
        }else if(note >= 4.1) {
            System.out.println("Note C");
        }else if(note >= 2.1) {
            System.out.println("Note D");
        }else{
            System.out.println("Note F");
        }

        System.out.println("End.");

        entry.close();
    }
}
