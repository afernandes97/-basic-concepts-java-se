package fundamentals.basics;

public class StringTypeEquals {
    public static void main(String[] args) {
        //if you are going to use compression strings, it is recommended to use .equals

        //exemple:
        System.out.println("2" == "2"); //true
        String s1 = new String("2");
        System.out.println("2" == s1); //false
        System.out.println("2".equals(s1)); //true, .equals compare a value in " ".

    }

}
