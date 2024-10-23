package Practical_8;

//8. Write a Java program to multiply two given matrices?

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get dimensions for matrix A
        System.out.print("Enter rows and columns for matrix A: ");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();

        // Get dimensions for matrix B
        System.out.print("Enter rows and columns for matrix B: ");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        // Input Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display Result Matrix
        System.out.println("Result matrix after multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

