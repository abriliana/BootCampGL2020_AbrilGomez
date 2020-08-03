package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class test_1_5__1_3_error {
	/**
	 * 	Ejercicio 1.3: Crear un Test con las siguientes assertions:
	 * 25 > 12 sea verdadero
	 * 25 > 27 sea falso
	 */
	@Test
	void test_1_5__1_3_error() {
				
		if (25 < 12) {
			assertTrue(true);
		}
		
		if (25 < 27) {
			assertTrue(false);
		}
		
	}
}
