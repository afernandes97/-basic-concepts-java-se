package fundaments;

public class PrimitiveTypes {
    public static void main(String[] args) {
        //information of functionary

        //literal types
        //numeric types
        byte yearsOfCompany = 23;
        short numbersOfFlying = 500;
        int id = 19923211;
        //for long number, adding a letter L on final text
        long accumulatedPoints = 3_578_444_313L;

        //numeric types of float point, real numbers
        float salary = 11_444.44F; //this number represents a double number, for the java to understand to float number, we add a letter F on final text
        double accumulatedSells = 1_900_100_055.01; // The java understand numbers with point being like double

        //boolean type
        boolean isOnVacation = true;

        //character type
        char status = 'A'; //char do accepted only one character

        //days on company
        System.out.println("This functionary have a " + yearsOfCompany * 365 + " Days on the company");

        //number of Flying
        System.out.println("This functionary as been fly " + numbersOfFlying / 2 + " times on the year");

        //The functionary is active?
        System.out.println("The functionary is active? " + status);

        //points to real
        System.out.println("For each real selled, the functionary has won " + accumulatedPoints / accumulatedSells);

        //salary by functionary
        System.out.println("The functionary " + id + " win " + salary + " reals for the month");

        //functionary vacation
        System.out.println("The functionary is vacation? " + isOnVacation);
    }
}
