package tryCatchExamples.TryCatchTest.application;

import tryCatchExamples.TryCatchTest.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    //sdf.parse might throw an exception, to resolve this usage throws ParseException to alert the compiler that the main method might throw an exception
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();

        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());
        Date now = new Date();


        //EXCEPTION TREATMENT: WRONG WAY =========================================================

        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }else {
            if(checkIn.after(now) || checkOut.after(now)){
                Reservation reservation = new Reservation(roomNumber,checkIn,checkOut);
                System.out.println(reservation);

                //update reservation
                System.out.println();

                System.out.println("Check-in date (dd/MM/yyyy): ");
                checkIn = sdf.parse(sc.next());

                System.out.println("Check-out date (dd/MM/yyyy): ");
                checkOut = sdf.parse(sc.next());


                String error = reservation.updateDate(checkIn,checkOut);
                if(error != "Update"){
                    System.out.println("error in reservation: " + error);
                }else{
                    System.out.println(reservation);
                }


            }else{
                System.out.println("Error in reservation: Reservation dates for update must be future");
            }

        }


    }
}
