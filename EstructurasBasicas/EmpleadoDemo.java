package com.globallogic.myapp.bootcampgl.EstructurasBasicas;


public class EmpleadoDemo {

	public static void main (String[]args)
	{
		Empleado e = new Empleado();
		e.setSalario(1000);
		
		System.out.println("El empleado es: ");
		System.out.println(e.getNombre());
		System.out.println("Su salario es de: ");
		System.out.print(e.getSalario());
	}
	
}