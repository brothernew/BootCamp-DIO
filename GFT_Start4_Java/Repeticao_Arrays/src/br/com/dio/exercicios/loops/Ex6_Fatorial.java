package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int fatorial;
        int multiplicador = 1;

        System.out.println("Insira número para obter valor fatorial: ");
        fatorial = sc.nextInt();

        for(int i = fatorial; i >= 1; i--){

            multiplicador = multiplicador * i;
        }
        System.out.println("\n"+"O valor fatorial de "+ fatorial + "!= é : " + multiplicador);        
    }    
}
