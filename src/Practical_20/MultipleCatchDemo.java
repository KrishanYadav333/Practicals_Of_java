package Practical_20;

//20. Write a java program for creating single try block with multiple catch blocks.

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;  // ArithmeticException
            int[] arr = new int[3];
            arr[5] = 10;  // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
    }
}
