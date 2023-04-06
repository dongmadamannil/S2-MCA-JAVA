package dwany_java;

public class MainTestClass {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();

        int sum = calc.add(10, 20);
        System.out.println("Sum: " + sum);

        int diff = calc.subtract(20, 10);
        System.out.println("Difference: " + diff);

        int prod = calc.multiply(10, 20);
        System.out.println("Product: " + prod);

        double quotient = calc.divide(20, 10);
        System.out.println("Quotient: " + quotient);

        double sqrt = calc.squareRoot(25);
        System.out.println("Square Root: " + sqrt);

        double cbrt = calc.cubeRoot(27);
        System.out.println("Cube Root: " + cbrt);

        double div3 = calc.divide(100, 5, 2);
        System.out.println("Division 3: " + div3);
    }
}