package example;

public class Calculator {
    public int add(int a, int b) {
        // TODO: Implement this method
        int sum = a + b;
        return sum;
    }

    public int minus(int a, int b) {
        // TODO: Implement this method
        int sub = a - b;
        return sub;
    }

    public int multiply(int a, int b) {
        // TODO: Implement this method
        int multi = a * b;
        return multi;
    }

    public double divide(int a, int b) {
        // TODO: Implement this method
        int div;
        if (a == 0) {
            return 0;
        } else {
            div = a / b;
        }
        return div;
    }
}
