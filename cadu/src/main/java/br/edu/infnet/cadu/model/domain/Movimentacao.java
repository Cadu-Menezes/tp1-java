package br.edu.infnet.cadu.model.domain;

public class Movimentacao {

	private int id;
	private double valor;
	private boolean entrada;
	private boolean fixa;
	private double saldo;
	
	public double verificarEntradaSaida() {
		
		if(entrada) {
			return valor;
		}
		else {
			
	        return valor = valor * -1;
		}
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public boolean isEntrada() {
		return entrada;
	}
	
	public void setEntrada(boolean entrada) {
		this.entrada = entrada;
	}
	
	public boolean isFixa() {
		return fixa;
	}
	
	public void setFixa(boolean fixa) {
		this.fixa = fixa;
	}
	
	
	
}
