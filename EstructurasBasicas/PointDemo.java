package com.globallogic.myapp.bootcampgl.EstructurasBasicas;

public class PointDemo {

	public static void main(String[] args) 
	{
		VariableInstancia vl = new VariableInstancia();
		vl.setEngPoints(50);
		vl.setMathsPoints(80);
		
		System.out.println(vl.getEngPoints());
		System.out.print(vl.getMathsPoints());
		
	}
	

}
