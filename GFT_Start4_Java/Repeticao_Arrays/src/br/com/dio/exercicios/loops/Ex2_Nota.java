package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nota;

        while(true){

            System.out.println("Informe nota: ");
            nota = sc.nextInt();
            if(nota > 0 && nota <= 10){
                break;
            }else{
                System.out.println("A nota "+nota+" informada não é válida, informe outra nota: ");

            }                        
        }System.out.println("Nota "+nota+" válida!!!");
    }
    
}
