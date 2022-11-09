package tryCatchExamples.readTxtFile.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        //creating a new File object and pass the location of the txt file
        File file = new File("C:\\in.txt");

        //define new scanner null
        Scanner sc = null;

        try{
            //adding file to new Scanner in sc
            sc = new Scanner(file);
            //case have content in archive print this
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(FileNotFoundException e){//case don't locale the archive
            System.out.println("Error opening file: " + e.getMessage());
        }finally {
            //by the end, if sc(scanner) case don't null close the scanner.
            if(sc != null){
                sc.close();
            }
        }
    }
}
