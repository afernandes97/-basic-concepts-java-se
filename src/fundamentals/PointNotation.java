package fundamentals;

public class PointNotation {
    public static void main(String[] args) {
        double a = 2.3;
        String s = "Test String";
        //point notation
        s = s.replace("Test", "New Test");
        s = s.concat("!!!");
        s = s.toUpperCase();
        System.out.println(s);

        String n = "Hello";

        n = n.concat(", have a")
                .concat(" good day")
                .concat("!!!")
                .toUpperCase();

        System.out.println(n);
        //point notation without variable
        System.out.println("André".toUpperCase());


        //primitive types don't have point notation

    }
}
