package br.pedrozo.desafiodiobanco;

public class ContaCorrente extends Conta{

	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExt() {
		System.out.println("Extrato Conta Corrente");
		super.ImprimirInfosComuns();		
	}
	
}
