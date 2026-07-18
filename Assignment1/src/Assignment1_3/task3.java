package Assignment1_3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        if (number1 <= 0) {
            System.out.println("Error, please enter again.");
        }

        System.out.println("Enter the second number: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        if (number2 <= 0 || number2 <= number1) {
            System.out.println("Error, please enter again.");
        }

        for (int i = number1; i <= number2 ;i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    System.out.println(i);
                    if (i == j) {
                        break;
                    }
                }
            }
        }
    }}