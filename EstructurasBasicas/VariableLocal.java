package com.globallogic.myapp.bootcampgl.EstructurasBasicas;

public class VariableLocal 
{
	private static int age;
	
	
	public static void main (String[]args)
	{
		
		String mssg = "la edad es: ";
		System.out.println(mssg+age);
		
		int estudiante;
		
		VariableLocal studentDetails = new VariableLocal();
		//studentDetails.studentAge();
		
	}


	public static void studentAge()
	{
		int age=0;
		age += 5;
		/*String mssg = "la edad es: ";
		System.out.println(mssg+age);*/
	}
}

