package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class test_1_6__suma {
	@Test
	void test_1_6__suma() {
		App app = new App();
		
		int resultado = app.suma(3, 5);
		assertEquals(8, resultado);

	}
	
	@Test
	void test_1_6__suma_error() {
		App app = new App();
		
		int resultado = app.suma(3, 5);
		assertEquals(77, resultado, "El resultado esta mal:");
	}
}
