package Practical_21;

//21. write a program for multiple try blocks and multiple catch blocks including finally.

public class MultipleTryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside first try block");
            int a = 10 / 0;  // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught in first block");
        } finally {
            System.out.println("Finally block for first try block");
        }

        try {
            System.out.println("Inside second try block");
            int[] arr = new int[2];
            arr[5] = 10;  // Will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception caught in second block");
        } finally {
            System.out.println("Finally block for second try block");
        }
    }
}
