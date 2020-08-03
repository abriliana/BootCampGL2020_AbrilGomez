package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class test_1_4 {
	/**
	 * 	Crear un Test donde se evalúe que una variable Long inicializada en  null. 
	 * Luego asignarle el valor 1  volver a verificar, pero que esta vez no sea null
	 */
	@Test
	void test_1_4() {
		Long soyLong = null;
		soyLong = 1L;
		
		assertNotNull(soyLong);
	}
}
