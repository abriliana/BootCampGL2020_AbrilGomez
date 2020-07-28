package com.globallogic.myapp.bootcampgl.Poo;

public class Cafetera extends Electrodomesticos {

	float litros;
	

	
	public Cafetera(String marca, String color, double peso, double consumo, float litros) {
		super(marca, color, peso, consumo);
		this.litros = litros;
	}

	@Override
	public String toString() {
		
		return "CAFETERA-----\nLa marca es: "+marca+"\nEl color es: "+color+"\nEl peso es:"+peso+"\nEl consumo es: "+consumo+"\nLitros: "+litros+"\n**********************";
	}

	public void encender()
	{
		System.out.println("Encendiendo cafetera.");
	}
	public void apagar()
	{
		System.out.println("Apagando cafetera.");
	}
	
	
	


	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

	public void elegirSabor(String a)
	{
		System.out.println("Eligiendo sabor de café");
	}
}
