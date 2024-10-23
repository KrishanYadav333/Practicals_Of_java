package Practical_22;

//22. write a program to create user defined exception

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        int age = 15;  // Test value

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above to vote.");
            } else {
                System.out.println("Valid age for voting.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

