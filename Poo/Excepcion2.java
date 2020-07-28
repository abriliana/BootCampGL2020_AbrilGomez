package com.globallogic.myapp.bootcampgl.Poo;
//ejercicio 8.2
public class Excepcion2 {
    public static void main(String[] args) {
        Excepcion2 b = null;
        try {
        	b.toString();
        } catch (Exception e) {
            System.out.println("Se produjo una exepción. " + e.getMessage());
        }
    }
}

