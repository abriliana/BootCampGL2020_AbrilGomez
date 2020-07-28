package com.globallogic.myapp.bootcampgl.Poo;

public interface Animal {
	public void dormir();
	public void sonidoAnimal();
	
	default void come(String c)
	{
		System.out.println("El "+c+" come.");
	}
	
	public static void camina(String a)
	{
		System.out.println("El "+a+" camina.");
	}
	
	
}
