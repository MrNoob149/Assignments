package Assignment1_3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the third number: ");
        int number3 = Integer.parseInt(scanner.nextLine());

        double The_triangle_thing = (number2 * number2) - (4 * number1 * number3);
        double root1 = (-number2 + The_triangle_thing)/(2*number1);
        double root2 = (-number2 - The_triangle_thing)/(2*number1);

        if (root1 > 0 && root2 > 0 || root1 < 0 && root2 < 0) {
            System.out.println("There are two roots");
        }
            else if (root1 > 0 && root2 < 0 || root1 < 0 && root2 > 0) {
            System.out.println("There are two roots");
        }
            else {
            System.out.println("There are no roots.");
        }
}}