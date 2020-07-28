package com.globallogic.myapp.bootcampgl.EstructurasBasicas;

import java.util.Scanner;

public class TiendaTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese el valor de la compra:");
		int compra = scanner.nextInt();
		
		Tienda.descuento(compra);
	}

}
