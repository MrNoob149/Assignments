package Assignment1_4;

import java.util.Scanner;
import java.util.TreeSet;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        TreeSet<Integer> uniqueList = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            uniqueList.add(numbers[i]);
        }
            System.out.println("The array without duplicates:");
            System.out.println(uniqueList.toString());

    }}
