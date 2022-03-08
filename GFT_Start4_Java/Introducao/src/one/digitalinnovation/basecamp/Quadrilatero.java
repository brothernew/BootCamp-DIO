package one.digitalinnovation.basecamp;

public class Quadrilatero{

    public static void area(double lado){

        System.out.println("Área do quadrado: " + "\n" + lado * lado + "\n");
    }

    public static void area(double lado1, double lado2){

        System.out.println("Área do retângulo: " + "\n" + lado1 * lado2 + "\n");
    }

    public static void area(double baseMaior, double baseMenor, double altura){

        System.out.println("Área do trapézio: " + "\n" + ((baseMaior+baseMenor)*altura) / 2 + "\n");
    }

    public static void area(float diagonal1, float diagonal2){

        System.out.println("Área do losango: " + "\n" + (diagonal1 * diagonal2) / 2 + "\n");
    }    
}
