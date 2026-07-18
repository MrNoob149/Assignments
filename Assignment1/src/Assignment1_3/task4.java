package Assignment1_3;

import java.util.Scanner;

    public class task4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while(true) {
                int questions = 0;
                for (int i = 1; i < 10; i++) {
                    int number1 = (int) (Math.random() * 10) + 1;
                    int number2 = (int) (Math.random() * 10) + 1;
                    System.out.println("What is the answer of " + number1 + " * " + number2);
                    int answer = Integer.parseInt(scanner.nextLine());
                    if (answer == number1 * number2) {
                        System.out.println("Correct");
                        questions++;
                    } else {
                        System.out.println("Incorrect, the answer is " + (number1*number2));

                if ( questions == 10) {
                    System.out.println("Congratulation for mastering the multiplication tables and terminates");
                } else {
                        System.out.println("Sorry you lost, start again");
                    }
                    }
                }
            }
}}
