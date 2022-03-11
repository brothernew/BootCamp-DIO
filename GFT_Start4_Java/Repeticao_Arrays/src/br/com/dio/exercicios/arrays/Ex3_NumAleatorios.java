package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumAleatorios {

    public static void main(String[] args) {
        
        Random random = new Random();
        
        System.out.println("Insira número máximo para o RANDOM: ");
        Scanner sc = new Scanner(System.in);
        int numMax = sc.nextInt();
        int[] numAleatorios = new int[20];        

        for(int i = 0; i < numAleatorios.length; i++){
            int numero = random.nextInt(numMax);
            numAleatorios[i] = numero;
        }
        
        System.out.print("\nNúmeros aleatórios com número máximo de "+ numMax + " = ");
        for(int numero : numAleatorios){
            System.out.print(numero + " ");
        }
    }    
}
