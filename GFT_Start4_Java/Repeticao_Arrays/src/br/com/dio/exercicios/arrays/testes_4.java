package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class testes_4 {

    public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
		//Escreva aqui o seu código
		
        System.out.println("Insira o flutuante: ");
		double X = leitor.nextDouble();
		System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));	
    }
	
}