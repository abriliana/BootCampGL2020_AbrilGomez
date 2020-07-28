package com.globallogic.myapp.bootcampgl.Poo;

public interface Persona2 {
	public void hablar();
	public void dormir();
	default void come(String c)
	{
		System.out.println("La persona "+c+" come.");
	}
	
}
