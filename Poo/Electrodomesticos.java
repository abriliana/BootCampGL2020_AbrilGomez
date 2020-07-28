package com.globallogic.myapp.bootcampgl.Poo;

public class Electrodomesticos {
	
	String marca, color;
	double peso, consumo;
	
	@Override
	public String toString() {
		
		return "La marca es: "+marca+"\nEl color es: "+color+"\nEl peso es:"+peso+"\nEl consumo es: "+consumo+"\n**********************";
	}


	public Electrodomesticos(String marca, String color, double peso, double consumo) {
		super();
		this.marca = marca;
		this.color = color;
		this.peso = peso;
		this.consumo = consumo;
	}


	public void encender()
	{
		System.out.println("Encendiendo electrodoméstico");
	}
	
	public void apagar()
	{
		System.out.println("Apagando electrodoméstico");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	
}
