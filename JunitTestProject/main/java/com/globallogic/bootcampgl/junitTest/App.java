package com.globallogic.bootcampgl.junitTest;

public class App 
{
    public int suma(int a, int b) {
    	return a + b;
    }
    /**
    Ejercicio 1.7: Crear un método con las siguientes condiciones
    Debe retornar un boolean
    Realizar un For, con valor inicial 0 y donde el valor máximo de iteración 
    será recibido por parámetro. 
    Se debe colocar un corte en la iteración cuando este llegue a 3 retornando true, 
    en caso contrario retornar false
	*/
    public boolean ejercicio_1_7 (int maximoValor) {
    	for ( int i=0 ; i <= maximoValor ; i++) {
    		if (i == 3) {
    			return true;
    		}
    	}
    	return false;
    }
}
