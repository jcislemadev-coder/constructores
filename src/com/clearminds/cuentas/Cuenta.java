package com.clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;

	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuenta(String id) {
		this.id = id;
		tipo = "A";
	}
	
	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	public void impresion() {
		System.out.println("************************");
		System.out.println("       CUENTA           ");
		System.out.println("************************");
		System.out.println("Numero de cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD "+saldo);
		System.out.println("************************");
	}
	
	
	public void imprimirConMiEstilo() {
		System.out.println("---------BANCO DEL PICHINCHA---------");
		System.out.println("Su numero de cuenta es: "+id);
		System.out.println("La cuenta es de tipo: "+tipo);
		System.out.println("El saldo actual es de: "+saldo);
		System.out.println("------Gracias por usar nuestros servicios!!!---");
		
	}
}
