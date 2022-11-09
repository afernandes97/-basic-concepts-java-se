package ControlStructure;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);


        System.out.println("Please, insert you media of semester: ");
        double media = entry.nextDouble();

        boolean approvalCriteriaApproved = media <= 10 && media >= 7;
        boolean approvalCriteriaRecuperation = media < 7 && media >= 4.5;
        boolean approvalCriteriaReproved = media < 4.5 && media >= 0;

        if(approvalCriteriaApproved){
            System.out.println("Approved");
        }

        if(approvalCriteriaRecuperation){
            System.out.println("Recuperation");
        }

        if(approvalCriteriaReproved){
            System.out.println("Reproved");
        }

        entry.close();
    }
}
