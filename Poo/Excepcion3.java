package com.globallogic.myapp.bootcampgl.Poo;
//ejercicio  8.3
public class Excepcion3 {
	int [] array = {0, 1 , 2};
	
	int getValue(int i) 
	{
        return array[i];
    }

    public static void main(String[] args) 
    {
        Excepcion3 a = new Excepcion3();
        try {
            a.getValue(3);
            System.out.println("Value-->" + a.getValue(3));
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Excepción: indice de array fuera de limites: " + e.getMessage());
        }
    }
}

