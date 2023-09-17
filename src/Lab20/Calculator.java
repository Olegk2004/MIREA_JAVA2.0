package Lab20;

public class Calculator<T> {
    public static <T extends Number> T sum(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            System.out.println("Неправильный тип данных");
            return (T) Integer  .valueOf("0");
        }
    }
    public static <T extends Number> T mult(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else {
            System.out.println("Неправильный тип данных");
            return (T) Integer.valueOf("0");
        }
    }
    public static <T extends Number> T div(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else {
            System.out.println("Неправильный тип данных");
            return (T) Integer.valueOf("0");
        }
    }

    public static <T extends Number> T minus(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else {
            System.out.println("Неправильный тип данных");
            return (T) Integer.valueOf("0");
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 7, 2};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Min: " + intMinMax.findMin());
        System.out.println("Max: " + intMinMax.findMax());

        Double[] doubleArray = {1.5, 3.2, 5.7, 2.8, 7.1};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);
        System.out.println("Min: " + doubleMinMax.findMin());
        System.out.println("Max: " + doubleMinMax.findMax());

        int num1 = 10;
        int num2 = 5;
        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Multiply: " + mult(num1, num2));
        System.out.println("Divide: " + div(num1, num2));
        System.out.println("Minus: " + minus(num1, num2));

        double num3 = 8.5;
        double num4 = 3.0;
        System.out.println("Sum: " + sum(num3, num4));
        System.out.println("Multiply: " + mult(num3, num4));
        System.out.println("Divide: " + div(num3, num4));
        System.out.println("Minus: " + minus(num3, num4));
    }
}