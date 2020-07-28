package com.globallogic.myapp.bootcampgl.Poo;

public class Hombre implements Animal, Persona2 {

	@Override
	public void hablar() {
		System.out.println("El hombre habla mucho");

	}

	@Override
	public void dormir() {
		System.out.println("El hombre duerme muchas horas");

	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonidos de animal");

	}

	@Override
	
	public void come(String c) {
		// TODO Auto-generated method stub
		Persona2.super.come(c);
	}
	
	public static void main (String[]args)
	{
		Hombre hombre = new Hombre();
		
		hombre.dormir();
		hombre.hablar();
		hombre.sonidoAnimal();
		hombre.come("Hombre");
		System.out.println("Se ejecuta método de la clase Hombre");
	}
}
