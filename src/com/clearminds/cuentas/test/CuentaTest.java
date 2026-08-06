package com.clearminds.cuentas.test;

import com.clearminds.cuentas.*;

public class CuentaTest {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);

		Cuenta cuenta2 = new Cuenta("03476", "C", 675);

		Cuenta cuenta3 = new Cuenta("03476");

		cuenta3.setTipo("C");

		System.out.println("-------------Valores Iniciales---------");
		cuenta1.impresion();
		cuenta2.impresion();
		cuenta3.impresion();
	}

}
