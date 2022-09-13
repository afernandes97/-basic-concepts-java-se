package fundamentals.operators;

public class Logics {
    public static void main(String[] args) {
        boolean cond1 = true;
        boolean cond2 = 3 > 7;

        System.out.println(cond1 && cond2);
        System.out.println(cond1 || cond2);
        System.out.println(cond1 ^ cond2);
        System.out.println(!cond1);
        System.out.println(!cond2);
        System.out.println(!!cond1);

        //truth table - and
        System.out.println("\ntruth table - and");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //truth table - or
        System.out.println("\ntruth table - or");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //truth table - exclusive or
        System.out.println("\ntruth table - exclusive or");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //truth table - negation (not)
        System.out.println(!true);
        System.out.println(!false);

    }
}
