package Assignment1_2;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the temperature number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println ("The Celsius of the temperature is " + (double)((first-30)/3));
    }
}