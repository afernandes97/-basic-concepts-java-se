package fundamentals.basics;
//this exercise have a objective: calculate the circumference area.
public class AreaCircumference {
    //Variables and Constant
    public static void main(String[] args) {

        //Variable integer
        //int radius = 3;

        //Variable double
        double radius = 3.4;
        //final is a constant variable, recommended for the constant variable that its name be in capital letters
        final double PI = 3.14159;

        double area = PI * radius * radius;

        System.out.println(area);

    }
}
