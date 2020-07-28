package com.globallogic.myapp.bootcampgl.EstructurasBasicas;

public class Tienda {
	int compra;
	
	public static void descuento(int compra)
	{	
		if (compra<300)
		{
			System.out.println("No aplica descuento");
		}
		if (compra==300)
		{
			int d = (compra*20)/100;
			System.out.println("Su descuento es de: "+d);
		}
		else 
			if(compra>350)
			{
				int d = (compra*25)/100;
				System.out.println("Su descuento es de: "+d);
				
			}
		
		
	}
	
	
}
