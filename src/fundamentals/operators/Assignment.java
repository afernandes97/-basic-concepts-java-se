package fundamentals.operators;

public class Assignment {
    public static void main(String[] args) {
        //Assignment is =
        int a = 1;
        int b = a;
        int c = b + a;

        c += a; // equal to c = c + a;
        c -= b; // equal to c = c - b;
        c *= a; // equal to c = c * a;
        c /= b; // equal to c = c / b;
        c %= 2; // equal to c = c % 2;

    }
}
