package app;

public class Main {

    private static final double FREEZING_F = 32.0;

    public static void main(String[] args) {
        System.out.println("Converter v 1.0");
        System.out.println("App for temperature converting");

        double f = 77.0;
        double c = convFahrenheitToCelsium(f);

        System.out.println("F > C:");
        System.out.println(f + "F = " + c + "C");

    }

    private static double convFahrenheitToCelsium(double f) {
        return (f - FREEZING_F) * 5.0/9.0;
    }
}