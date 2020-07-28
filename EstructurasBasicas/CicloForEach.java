package com.globallogic.myapp.bootcampgl.EstructurasBasicas;

public class CicloForEach {

	public static void main(String[] args) {
				 
		int [] numeros = {1,2,3,4,5,6,7,8,9,10};
		for (int num: numeros)
		{
			System.out.println("valor iterado--->"+num);
		}
		
		
		////////////////////////////////////////////////////// 
		String [] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		for(String dia: semana)
		{
			System.out.println(dia);
		}
		//////////////////////////////////////////////////////
		
		String str = "Bootcamp 2020";
		for (char c: str.toCharArray ()) { System.out.println ("letra: "+c); }
		
}

}
