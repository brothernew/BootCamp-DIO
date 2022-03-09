package one.digitalinnovation.basecamp;

import java.util.Scanner;

public class Classe {

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        raio = scan.nextDouble();
        //declare suas variaveis do tipo double
		double area;
        //continue a solucao
        area = 3.14159 * (Math.pow(raio,2));

		System.out.printf("A=%.4f\n", area);
	}
}
    
}
