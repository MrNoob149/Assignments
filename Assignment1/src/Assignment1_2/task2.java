package Assignment1_2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());


        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println ("the hypotenuse of the triangle is " + (double)Math.sqrt((Math.pow(first, 2)+Math.pow(second, 2))));
    }
}