package com.globallogic.myapp.bootcampgl.Poo;

import java.util.ArrayList;

public class ElectrodomesticosTest  {
	
	public static void main (String []args) {
		
		ArrayList<Electrodomesticos> electrodomesticos = new ArrayList<Electrodomesticos>();
		
		Electrodomesticos heladera  = new Heladera("Peabody", "Gris", 120.0, 120, 50, 10,true);
		Electrodomesticos cafetera = new Cafetera("Noblex","rojo", 1, 3, 5);
		Electrodomesticos tv = new Televisor("Hisense", "negro", 8, 120,"full hd", 21.7);
		Electrodomesticos electrodomestico = new Electrodomesticos("Noblex", "Negro", 1, 2);
		
		electrodomesticos.add(heladera);
		electrodomesticos.add(cafetera);
		electrodomesticos.add(tv);
		electrodomesticos.add(electrodomestico);
		
		for(int i = 0; i < electrodomesticos.size(); i++) {   
		    System.out.println(electrodomesticos.get(i));  
			electrodomesticos.get(i).encender();
	
		       
		}  
		
	}

	
	
}
