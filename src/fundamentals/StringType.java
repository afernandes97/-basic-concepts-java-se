package fundamentals;

public class StringType {
    public static void main(String[] args) {
        System.out.println("Hello".charAt(0));

        String text = "Today is a good day";
        text = text.concat("!!!");
        System.out.println(text.startsWith("Today"));
        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.endsWith("!!!"));
        System.out.println(text.equals("Today is a good day!!!"));
        System.out.println(text.equalsIgnoreCase("today is a good day!!!"));

        var name = "André";
        var lastName = "Fernandes";
        var age = 25;
        var salary = 1235.22;

        //concat strings, %s = to substitute strings, %d to substitute integer numbers, %f to float/double numbers
        //System.out.printf("Hello %s %s, sr. have a %d years old, and you receive %.2f dollars years", name, lastName, age, salary);

        //another way  to use concat
        String phrase = String.format("Hello %s %s, sr. have a %d years old, and you receive %.2f dollars years", name, lastName, age, salary);
        System.out.println(phrase);
    }
}
