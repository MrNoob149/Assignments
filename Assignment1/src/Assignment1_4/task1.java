package Assignment1_4;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] Fname = { "George", "William", "Armstrong", "Steven", "John"};

        String[] Lname = { "Smith", "Brown", "Alice", "Wilson", "Davis"};


        System.out.println("How many names you want? :");
        int chosennumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < chosennumber; i++) {

            int randomIndex = random.nextInt(Fname.length);
            int randomIndex2 = random.nextInt(Lname.length);

            String first_name = Fname[randomIndex];
            String last_name = Lname[randomIndex2];

            System.out.println("The name is " + first_name + " " + last_name);




    }
    scanner.close();
    }
}
