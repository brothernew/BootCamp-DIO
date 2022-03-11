package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class testes {

    public static void main(String[] args){

    	Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o valor de A: ");
    	double A = leitor.nextDouble();
        System.out.println("Insira o valor de B: ");
    	double B = leitor.nextDouble();
    	//Escreva aqui a sua lógica

        double percent = 0.0;
        percent = ((B-A)*100)/A;

        System.out.printf("%.2f", percent);
    }
	
}