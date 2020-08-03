package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class test_1_7 {
	@Test
	void test_1_7() {
		App app = new App();
		boolean resultado = app.ejercicio_1_7(5);
		assertTrue(resultado, "Esta variable es true:");
	}
	
	@Test
	void test_1_7_error() {
		App app = new App();
		boolean resultado = app.ejercicio_1_7(2);
		assertTrue(resultado, "Esta variable es false:");
	}
}
