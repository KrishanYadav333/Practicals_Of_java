package Practical_19;

//19. Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use
//StringTokenizer class)?

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of integers: ");
        String line = sc.nextLine();

        StringTokenizer st = new StringTokenizer(line);
        int sum = 0;

        System.out.println("Integers are:");
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum += num;
        }

        System.out.println("Sum of integers: " + sum);
    }
}

