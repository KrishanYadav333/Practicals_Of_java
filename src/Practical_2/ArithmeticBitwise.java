package Practical_2;
//2. Write a program to perform arithmetic and bitwise operations in a single source program without object creation.

public class ArithmeticBitwise {
    public static void main(String[] args) {
        int a = 5, b = 3;

        // Arithmetic Operations
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // Bitwise Operations
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise Complement of a: " + (~a));
    }
}
