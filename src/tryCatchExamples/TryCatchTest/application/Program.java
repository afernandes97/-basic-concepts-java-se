package tryCatchExamples.TryCatchTest.application;

import tryCatchExamples.TryCatchTest.model.entities.Reservation;
import tryCatchExamples.TryCatchTest.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();

            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());
            Date now = new Date();


            //EXCEPTION TREATMENT: WRONG WAY =========================================================

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            //update reservation
            System.out.println();

            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());


            reservation.updateDate(checkIn, checkOut);

            System.out.println(reservation);
        }catch (ParseException e){
            System.out.println("Invalid date format!");
        }catch (DomainException e){
            //using exception created by reservation generating a throw error
            System.out.println("Error in reservation: " + e.getMessage());//
        }

    }
}
