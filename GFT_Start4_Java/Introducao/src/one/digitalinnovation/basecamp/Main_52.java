package one.digitalinnovation.basecamp;

public class Main_52 {

    public static void main(String[] args){

        // Quadrilatero2 - retornos

        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("Área do quadrado: " + "\n" + areaQuadrado + "\n");

        double areaRetangulo = Quadrilatero2.area(5, 5);
        System.out.println("Área do retangulo: "  + "\n" + areaRetangulo + "\n");

        double areaTrapezio = Quadrilatero2.area(7, 8, 9);
        System.out.println("Área do trapezio: "  + "\n" + areaTrapezio + "\n");
    }
    
}
