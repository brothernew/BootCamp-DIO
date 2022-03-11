package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex4_ArrayMultidimensional {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número máximo para RANDOM: ");
        int numMax = sc.nextInt();

        System.out.println("Insira um número máximo de colunas: ");
        int col = sc.nextInt();

        System.out.println("Insira um número máximo de linhas: ");
        int lin = sc.nextInt();

        int[][] mult = new int [lin][col];

        for(int i = 0; i < mult.length; i++){
            for(int j = 0; j < mult[i].length; j++){
                mult[i][j] = random.nextInt(numMax);
            }
        }

        System.out.println("\nMatriz: ");
        for(int[] linha : mult){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }    
}