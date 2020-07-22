package com.globallogic.myapp.bootcampgl.EstructurasBasicas;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {

	public static void main(String[] args) 
	{
		List<String> letters = new ArrayList<String>();
		letters.add(0, "A");
		letters.add(1, "B");
		letters.add(2, "C");

        System.out.println(letters);
        System.out.println(letters.size());

        letters.add(0, "X");
        System.out.println(letters);
		

	}

}
