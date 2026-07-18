package Assignment1_2;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the number:");
        int weight = Integer.parseInt(scanner.nextLine());

        double GtoLuoti = 13.28;
        double Gtonaula = GtoLuoti * 32;
        double Gtoleiviskä = Gtonaula * 20 ;

        int leiviskä= (int)(weight / Gtoleiviskä);
        int naula = (int)(weight / Gtonaula);
        double Luoti = weight / GtoLuoti ;

        System.out.println("Weight(g): " + weight);
        System.out.printf("%d %d %6.2f", (int)leiviskä, (int)naula, Luoti);
    }
}

