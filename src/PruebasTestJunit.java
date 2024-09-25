

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import es.cursojava.inicio.funciones.Utilidades;

public class PruebasTestJunit {
	//Patrón AAA (Arrange, Act, Assert)
	static Utilidades utils;
	@Before
	public void preparacion() {
		if(utils==null) {
			System.out.println("Preparando");
			utils = new Utilidades();
		}
	}
	
	@Test(timeout = 2000)
	public void validarEmailTest() {
		System.out.println("validarEmailTest");
		boolean valido = Utilidades.validarEmail("emails@asdas.es");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertTrue(valido);
	}
	
	
	@Test
	public void validarEmailIncorrectoTest() {
		System.out.println("validarEmailIncorrectoTest");
		boolean valido = Utilidades.validarEmail("emailsasdas.es");
		
		assertFalse(valido);
		
	}
	
	@Test
	public void validaFuncionSuma() {
		int resultado = utils.suma(5, 3);
		
		assertEquals(8, resultado);
	}
	
	
	@Test
	public void validaFuncionResta() {
		int resultado = utils.resta(5, 3);
		
		assertEquals(2, resultado);
	}
	
	@Test
	public void validaFuncionMultiplica() {
		int resultado = utils.multiplica(5, 3);
		
		assertEquals(15, resultado);
	}
	
	@Test(expected = ArithmeticException.class)
	public void validaFuncionDivide() {
		int resultado = utils.divide(5, 0);

	}
	
}
