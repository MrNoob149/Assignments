package Assignment1_4;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < size; i++) {

            int currentSum = 0;

            for (int j = i; j < size; j++) {

                currentSum += numbers[j];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));
    }}
