package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Insira o numero da tabuada desejada: ");
        numero = sc.nextInt();
        System.out.println("\n"+"Tabuada do número " + numero + ":");

        for(int i = 0; i <= 10; i++ ){
            
            System.out.println(numero + " X " + i + " = " +(numero*i));
        }        
    }    
}