package com.globallogic.myapp.bootcampgl.Poo;

public class Berlina extends Automovil {

	void retroceder() {
		System.out.println("enciendo el auto de la clase berlina");

	}

	public static void main (String[]args)
	{
		Automovil berlina = new Berlina();
		berlina.retroceder();
		berlina.avanzar();
	}
	
}
