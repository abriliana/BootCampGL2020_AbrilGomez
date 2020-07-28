package com.globallogic.myapp.bootcampgl.Poo;

public class Excepcion {
    public static void main(String[] args) {
        try {
            throw new Exception("Esto es una excepción.");
        } catch (Exception e) {
        	
            System.out.println("Se produjo un excepción: "+ e.getMessage());
        } finally {
            System.out.println("Esto se ejecuta sin importar si se presentan errores");
        }
    }
}


