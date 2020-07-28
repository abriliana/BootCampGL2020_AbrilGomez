package com.globallogic.myapp.bootcampgl.EstructurasBasicas;

public class MayusMinusc {
	
	public static boolean esMayuscula(String s) {
		  return s.equals(s.toUpperCase());
		}
	public static boolean esMinuscula(String s) {
		  return s.equals(s.toLowerCase());
		}	
	
	public static void main(String[] args) {
		
		String a = "A";
		String b = "a";
		
		if (esMayuscula(a)) {
			System.out.println(a+" es mayúscula");
		} else if (esMinuscula(a)) {
			System.out.println(a+" es minúscula");
			}
		if (esMayuscula(b)) {
			System.out.println(b+" es mayúscula");
		} else if (esMinuscula(b)) {
			System.out.println(b+" es minúscula");
			}
	}
}



