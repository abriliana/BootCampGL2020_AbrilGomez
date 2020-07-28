package com.globallogic.myapp.bootcampgl.Poo;

public class MainAnimal implements Animal {

	

	public static void main(String[] args) {
		Animal dog = new Perro();
		
		dog.dormir();
		dog.sonidoAnimal();
		Animal.camina("Chan");
		dog.come("Pitufo");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sonidoAnimal() {
		// TODO Auto-generated method stub
		
	}

}
