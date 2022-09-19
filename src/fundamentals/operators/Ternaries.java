package fundamentals.operators;

public class Ternaries {
    public static void main(String[] args) {
        double media = 3.5;
        String partialResult = media >= 4 ? "Recuperation" : "Reproved";
        String result = media >= 6.0 ? "Approved!" : partialResult; //ternary expression

        System.out.println("The student is: " + result);
    }
}
