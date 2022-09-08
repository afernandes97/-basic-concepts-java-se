package fundaments;

//to use a lot of java functions, need to be import for use.
import javax.swing.*;
import java.util.Date;

public class Imports {
    public static void main(String[] args) {
        String text = "Hello, today is";
        //Import referring a java.util.Date
        Date d = new Date();

        System.out.println(text + " " + d + ", have a god day");
        //Import referring a javax.swing.*
        //JButton button = new JButton();
    }
}
