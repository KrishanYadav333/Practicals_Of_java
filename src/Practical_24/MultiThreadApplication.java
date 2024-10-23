package Practical_24;

//24.
//Write a java program that implements a multi-thread application that has three threads. First thread generates random
//integer every 1 second and if the value is even, second thread computes the square of the number and prints. If the value
//is odd, the third thread will print the value of cube of the number.

import java.util.Random;

class RandomNumberThread extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(100);  // Generate random number between 0 and 99
            System.out.println("Generated Number: " + num);
            if (num % 2 == 0) {
                SquareThread square = new SquareThread(num);
                square.start();
            } else {
                CubeThread cube = new CubeThread(num);
                cube.start();
            }
            try {
                Thread.sleep(1000);  // Wait for 1 second before generating the next number
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread extends Thread {
    int num;

    public SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square of " + num + " is: " + (num * num));
    }
}

class CubeThread extends Thread {
    int num;

    public CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube of " + num + " is: " + (num * num * num));
    }
}

public class MultiThreadApplication {
    public static void main(String[] args) {
        RandomNumberThread randomThread = new RandomNumberThread();
        randomThread.start();
    }
}
