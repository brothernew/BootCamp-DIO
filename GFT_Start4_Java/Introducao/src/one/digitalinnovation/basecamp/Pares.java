package one.digitalinnovation.basecamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pares {

    public static void main(String[] args) throws IOException {

        int entrada;
        Scanner N = new Scanner(new InputStreamReader(System.in));

        entrada = N.nextInt();
        for (int i = 1; i <= entrada; i++) {

            if (i % 2 == 0) {

                System.out.println(i);

            }

        }
    }
}