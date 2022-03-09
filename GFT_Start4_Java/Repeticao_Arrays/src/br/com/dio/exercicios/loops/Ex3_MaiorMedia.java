package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;
        int count = 0;
        int maior = 0;

        do{
            System.out.println("\n"+"Insira o número "+count);
            numero = sc.nextInt();
            if(numero > maior) maior = numero;
            soma = soma + numero;
            count = count + 1;
        }while(count < 5);
        
        System.out.println("\n"+"O número maior inserido foi: "+maior);
        System.out.println("Média entre os números é: "+soma/5);
    }    
}
