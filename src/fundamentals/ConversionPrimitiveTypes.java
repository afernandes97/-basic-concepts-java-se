package fundamentals;

public class ConversionPrimitiveTypes {
    public static void main(String[] args) {

        double a = 1; //implicit conversion : a = 1.0(double)

        float b = (float) 1.0;//casting explicit conversion

        int c = 500;
        byte d = (byte) c; // result will be in the byte range -128 / 128. //casting explicit conversion

        double e = 1.8888999555;
        int f = (int) e; //casting explicit conversion
    }
}
