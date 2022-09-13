package fundamentals.arithmetics;

public class Arithmetics {
    public static void main(String[] args) {
        //Arithmetics with console log
        System.out.println(2 * 5);
        //inference
        var x = 34.33;
        var y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double)b);//casting
        System.out.println(a / (float)b);//casting

        //rest of division, using %
        System.out.println( 10 % 4);
    }
}
