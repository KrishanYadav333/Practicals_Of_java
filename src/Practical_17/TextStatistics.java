package Practical_17;

//17. Write a Java program that displays the number of characters, lines and wordsin a text?

import java.util.Scanner;

public class TextStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text (type 'STOP' to finish):");

        int lines = 0, words = 0, characters = 0;

        while (true) {
            String line = sc.nextLine();
            if (line.equals("STOP")) {
                break;
            }
            lines++;
            characters += line.length();
            String[] wordArray = line.split("\\s+");
            words += wordArray.length;
        }

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
    }
}
