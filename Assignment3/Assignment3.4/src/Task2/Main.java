package Task2;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Main {
    static long n1 = 0;
    static long n2 = 1;

    public static void main(String[] args) {


        try (Writer writer = new FileWriter("text.txt"); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            long n3 = 0;
            for (int i = 1; i <= 60; i++) {
                n3 = n1 + n2;
                System.out.println(n3);
                n1 = n2;
                n2 = n3;

                bufferedWriter.write(String.valueOf(n3) + " ");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
