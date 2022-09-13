package fundamentals.basics;

public class Wrappers {
    public static void main(String[] args) {
        Byte b = 1;
        Short s = 1000;
        Integer i = Integer.parseInt("10000");//string to int
        Long l = 100000000L;

        Boolean bo = Boolean.parseBoolean("True");//string to boolean

        Character cha = 'C';

        Float f = 111.11F;
        Double d = 1111.111;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());//bollean to string

        System.out.println(cha.toString().toLowerCase());

        System.out.println(f.toString().getBytes());
        System.out.println(d.byteValue());
    }
}
