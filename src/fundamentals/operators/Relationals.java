package fundamentals.operators;

public class Relationals {
    public static void main(String[] args) {
        System.out.println(2 > 7);
        System.out.println(7 >= 7);
        System.out.println(8 <= 7);
        System.out.println(2 < 7);
        System.out.println(2 != 7);

        //exemple use
        double note = 4;
        boolean goodComporting = true;
        boolean passOfMedia = note >= 7;
        boolean passedSemester = goodComporting && passOfMedia;

        System.out.println("went through good behavior? " + goodComporting);
        System.out.println("passed a good grade? " + passOfMedia);
        System.out.println("Passed semester? " + passedSemester);
    }
}
