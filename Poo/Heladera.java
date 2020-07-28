package com.globallogic.myapp.bootcampgl.Poo;

public class Heladera extends Electrodomesticos{
	
	double capacidad, capacidadFreezer;
	boolean tieneFreezer; 
	
	
	public Heladera(String marca, String color, double peso, double consumo, double capacidad, double capacidadFreezer,
			boolean tieneFreezer) {
		super(marca, color, peso, consumo);
		this.capacidad = capacidad;
		this.capacidadFreezer = capacidadFreezer;
		this.tieneFreezer = tieneFreezer;
		
		/*if (tieneFreezer==true)
		{
			String tienefreezer = String.valueOf(tieneFreezer);
			tienefreezer="Si";
			return;
		}*/
	}


	@Override
	public String toString() {
		
		return "HELADERA------\nLa marca es: "+marca+"\nEl color es: "+color+"\nEl peso es:"+peso+"\nEl consumo es: "+consumo+"La capacidad es: "+capacidad+"\nLa capacidad del freezer es: "+capacidadFreezer+"\nTiene freezer: "+tieneFreezer+"\n**********************";
	}


	public void encender()
	{
		System.out.println("Encendiendo heladera.");
	}
	public void apagar()
	{
		System.out.println("Apagando heladera.");
	}
	
	
	public void guardarElemento(String a)
	{
		System.out.println("Guardo un elemento en la heladera");
	}
	
	public void extraerElemento(String a)
	{
		System.out.println("Extraigo un elemento en la heladera");
	}
	
	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}


	
	public double getCapacidadFreezer() {
		return capacidadFreezer;
	}

	public void setCapacidadFreezer(double capacidadFreezer) {
		this.capacidadFreezer = capacidadFreezer;
	}

	public boolean isTieneFreezer() {
		return tieneFreezer;
	}

	public void setTieneFreezer(boolean tieneFreezer) {
		this.tieneFreezer = tieneFreezer;
	}


	
}

