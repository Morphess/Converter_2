package app;

public class Main {

    private static final double FREEZING_F = 32.0;

    public static void main(String[] args) {
        System.out.println("Converter v 1.1");
        System.out.println("App for temperature converting");

        double f = 77.0;
        double CtoF = convFahrenheitToCelsium(f);

        System.out.println("F > C:");
        System.out.println(f + "F = " + CtoF + "C");

        double c = 25.0;
        double FtoC = convCelsiumToFahrenheit(c);

        System.out.println("C > F:");
        System.out.println(c + "C = " + FtoC + "F");

    }

    private static double convFahrenheitToCelsium(double f) {
        return (f - FREEZING_F) * 5.0/9.0;
    }

    private static double convCelsiumToFahrenheit(double c) {
        return c * 9.0/5.0 + FREEZING_F;
    }
}