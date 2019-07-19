public class AreaCalculator {

    private static final int Negative = -1;

    public static double area(double radius) {
        if (radius < 0)
            return Negative;

        else

            return Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0)
            return Negative;

        else
            return x * y;
    }

}













