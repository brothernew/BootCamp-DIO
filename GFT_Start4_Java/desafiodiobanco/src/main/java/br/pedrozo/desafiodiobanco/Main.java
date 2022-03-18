package br.pedrozo.desafiodiobanco;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		String txt = "";
		int valorDp = 0;
		int valorTf = 0;
		
		Cliente cli =  new Cliente();
		System.out.println("Insira seu nome de Cliente: ");
		txt = scanner.next();
		cli.setNome(txt);
		
		Conta cc = new ContaCorrente(cli);
		Conta cp = new ContaPoupanca(cli);
		
		System.out.println("Insira o valor de deposito em C/C: ");
		valorDp = scanner.nextInt();
		cc.depositar(valorDp);
		
		System.out.println("Insira o valor de transferencias para C/P: ");
		valorTf = scanner.nextInt();
		cc.transferir(valorTf, cp);
		
		cc.imprimirExt();
		cp.imprimirExt();
	}

}
