package com.globallogic.myapp.bootcampgl.Poo;

public class Gato {
	private String nombre;
	private int patas;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int numeroPatas) {
		patas = numeroPatas;
	}
	
	
	public static void main(String []args)
	{
		Gato gato = new Gato ();
		gato.setNombre("Pelusa");
		gato.setPatas(4);
	System.out.println("El gato se llama: "+gato.getNombre());
	System.out.println("y tiene: "+gato.getPatas()+" patas.");
		
	}
	
}
