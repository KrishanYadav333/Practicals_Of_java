package Practical_6;

//6.
//The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value
//is the sum of the 2 values preceding it. Write a Java program that uses both recursive and non- recursive functions to print
//the nth value of the Fibonacci sequence?

// Recursive Fibonacci
class FibonacciRecursive {
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

// Non-Recursive Fibonacci
class FibonacciNonRecursive {
    public int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}

public class FibonacciTest {
    public static void main(String[] args) {
        FibonacciRecursive fr = new FibonacciRecursive();
        FibonacciNonRecursive fnr = new FibonacciNonRecursive();

        int n = 10;  // nth Fibonacci number

        System.out.println("Fibonacci using recursion: " + fr.fibonacci(n));
        System.out.println("Fibonacci using non-recursion: " + fnr.fibonacci(n));
    }
}
