package ControlStructure;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Please insert one number");

        int convertValue = Integer.parseInt(value);

        if( convertValue % 2 == 0){
            System.out.println("Pair number");
        }else{
            System.out.println("odd number");
        }
    }
}
