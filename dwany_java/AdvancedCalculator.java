package dwany_java;

public class AdvancedCalculator extends ShopCalculator {
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double cubeRoot(double a) {
        return Math.cbrt(a);
    }

    // Method Overriding
    @Override
    public int add(int a, int b) {
        int sum = super.add(a, b);
        System.out.println("Adding " + a + " and " + b + " in AdvancedCalculator");
        return sum;
    }

    @Override
    public int subtract(int a, int b) {
        int diff = super.subtract(a, b);
        System.out.println("Subtracting " + b + " from " + a + " in AdvancedCalculator");
        return diff;
    }

    // Method Overloading
    public double divide(int a, int b, int c) {
        return (double)(a) / (b * c);
    }
}