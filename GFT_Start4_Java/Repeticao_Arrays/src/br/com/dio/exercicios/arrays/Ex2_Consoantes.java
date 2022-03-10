package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int qtdCons = 0;
        int count = 0;
        String[] cons = new String[6];

        do {
            System.out.println("Letra: ");
            String letra = sc.next();

            if(!(letra.equalsIgnoreCase("a")|
                letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o")|
                letra.equalsIgnoreCase("u"))){
                cons[count] = letra;
                qtdCons++;
            }
            count++;            
        } while (count < cons.length);

        System.out.println("Consoantes: ");
        for (String consoante : cons) {
            if(consoante != null)
            System.out.print(consoante + " ");
        }
    }    
}