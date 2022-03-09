package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParImpar {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int qtdNumeros;
        int numeros;
        int count = 0;        
        int pares = 0;
        int impares = 0;

        System.out.println("Quatidade de número que serão inseridos: ");
        qtdNumeros = sc.nextInt();

        do{
            System.out.println("\n"+"Insira um número ");
            numeros = sc.nextInt();
            if(numeros % 2 == 0) pares++;
            else impares++;
            count++;
        }while(count < qtdNumeros);
        System.out.println("\n"+"RESULTADO");
        System.out.println("-> QTD pares inseridos= "+pares);
        System.out.println("-> QTD impares inseridos= "+impares);
    }        
}