package br.pedrozo.desafiodiobanco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExt() {
		System.out.println("Extrato Conta Poupanca");
		super.ImprimirInfosComuns();		
	}

}
