package fundamentals.conversions;

public class ConversionNumberToString {
    public static void main(String[] args) {
        Integer number1 = 10000;
        var toString = number1.toString();//number(Integer) to string;
        toString.length();

        //without Integer to string, using int
        int number2 = 1033333;
        var intToString = Integer.toString(number2);
    }
}
