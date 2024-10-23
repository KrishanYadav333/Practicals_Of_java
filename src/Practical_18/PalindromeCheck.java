package Practical_18;

//18. Write a Java program that checks whether a given string is a palindrome or not. Ex: MADAM is a palindrome?

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

