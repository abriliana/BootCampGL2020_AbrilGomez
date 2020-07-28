package com.globallogic.myapp.bootcampgl.EstructurasBasicas;

public class CicloFor {
		
	public static void main(String[] args) {
		
		for (int i = 1; i<=10; i++)
		{
			System.out.println("valor iterado: \n"+i);
		}
		//////////////////////////////////////////////////
		int contador = 0;
		for (int i = 0; i<=25; i++)
		{
			if (i%2 == 0)
			{
				System.out.println("Es par: \n"+i);
				contador++;
				System.out.println("--contador nros pares-->"+contador);
			}
			else
			{
				System.out.println("**********Es impar: "+i);
			}
		}
		
		
		
		
		
	}	
}
