package com.globallogic.myapp.bootcampgl.Poo;

public class Televisor extends Electrodomesticos 
{	String resolucion;
	Double pulgadas;
	
	
	public Televisor(String marca, String color, double peso, double consumo, String resolucion, Double pulgadas) {
		super(marca, color, peso, consumo);
		this.resolucion = resolucion;
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		
		return "TELEVISOR-----\nLa marca es: "+marca+"\nEl color es: "+color+"\nEl peso es:"+peso+"\nEl consumo es: "+consumo+"\nLa resolución es: "+resolucion+"\nPulgadas: "+pulgadas+"\n**********************";
	}

	public void encender()
	{
		System.out.println("Encendiendo TV.");
	}
	public void apagar()
	{
		System.out.println("Apagando TV.");
	}
	

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public Double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public void cambiarCanar(int a)
	{
		System.out.println("Cambiando de canal");
	}
	
	
	
}
