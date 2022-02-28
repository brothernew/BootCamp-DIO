package one.digitalinnovation.basecamp;

import java.util.Date;

public class Main_4 {

    public static void main(String[] args) {

        //Calculadora

        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Data + Hora + Mensagem
        System.out.println("\n"+"Exercício mensagem");
        Mensagem.main(args);

        //Emprestimo
        System.out.println("\n"+"Exercício emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
