package com.globallogic.myapp.bootcampgl.Poo;

class MiExcepcion extends Exception 
{
	String str;
	public MiExcepcion (String str) throws Exception
	{
		this.str = str;
	}
	
	public String getStr()throws Exception
	{
		return "mi excepción. "+str;
	}





}
