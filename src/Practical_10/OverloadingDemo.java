package Practical_10;

//10. Write a java program for Method overloading and Constructor overloading

class Calculator {
    // Method Overloading: Same method name, different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Constructor Overloading: Different constructors
    public Calculator() {
        System.out.println("Default constructor");
    }

    public Calculator(int a) {
        System.out.println("Constructor with one argument: " + a);
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        // Constructor overloading
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator(10);

        // Method overloading
        System.out.println("Sum of 2 numbers: " + calc1.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc2.add(1, 2, 3));
    }
}

