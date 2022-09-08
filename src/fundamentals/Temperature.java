package fundamentals;
//this exercise have a objective: convert fahrenheit to celsius
public class Temperature {
    public static void main(String[] args) {
        int fahrenheit = 55;
        final int ADJUST_NUMBER = 32;
        final double FACTOR_NUMBER = 5.0/9.0;
        double celsius = (fahrenheit - ADJUST_NUMBER) * FACTOR_NUMBER;

        System.out.println(celsius);
    }
}
