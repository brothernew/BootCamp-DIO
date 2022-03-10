package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {
        
        int [] vetor = {-5, -6, 50, 8, 4};

        System.out.print("Vetor: ");
        
        for(int i = (vetor.length -1); i >= 0; i--){

            System.out.print(vetor[i] + " ");
        }
    }    
}