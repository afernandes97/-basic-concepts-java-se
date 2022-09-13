package fundamentals.arithmetics;

public class ArithmeticsChallenge {
    public static void main(String[] args) {

        double aPow = Math.pow(6 * (3+2),2);
        double aMultiply = 3*2;


        double b = (1-5)*(2-7);
        double bNumber = 2;

        double aMath = aPow / aMultiply;

        double bMath = Math.pow(b / bNumber, 2);

        double superiorResult = Math.pow(aMath - bMath,3);

        double c = Math.pow(10,3);

        double finalResult = superiorResult / c;
        System.out.println("The result of operation is: " + finalResult);

    }
}
