package Practical_3;

//3. Write a program to perform arithmetic and bitwise operations by creating individual methods and classes than create an
//object to execute the individual methods of each operation.

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // Additional arithmetic operations (multiply, divide) can be added here
}

class Bitwise {
    public int andOperation(int a, int b) {
        return a & b;
    }

    public int orOperation(int a, int b) {
        return a | b;
    }

    // Additional bitwise operations can be added here
}

public class ArithmeticBitwiseOperations {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Bitwise bitwise = new Bitwise();

        int a = 5, b = 3;

        System.out.println("Addition: " + arithmetic.add(a, b));
        System.out.println("Subtraction: " + arithmetic.subtract(a, b));
        System.out.println("Bitwise AND: " + bitwise.andOperation(a, b));
        System.out.println("Bitwise OR: " + bitwise.orOperation(a, b));
    }
}
