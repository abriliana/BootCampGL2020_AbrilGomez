package com.globallogic.myapp.bootcampgl.Poo;

public class MiExcepcionTest 
{
		public static void main(String[] args) throws Exception {
			try {
				throw new MiExcepcion("Mi excepción customizada.");
			} catch (MiExcepcion e) {
				System.out.println("Excepción: " + e.getStr());
			}
		}
}
