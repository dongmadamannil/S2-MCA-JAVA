package dwany_java;

public class ShopCalculator extends BaseCalculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    // Method Overloading
    public double divide(int a, int b) {
        return a / (double)b;
    }
    
    // Method Overriding
    @Override
    public int add(int a, int b) {
        int sum = super.add(a, b);
        System.out.println("Adding " + a + " and " + b + " in ShopCalculator");
        return sum;
    }

    @Override
    public int subtract(int a, int b) {
        int diff = super.subtract(a, b);
        System.out.println("Subtracting " + b + " from " + a + " in ShopCalculator");
        return diff;
    }
}