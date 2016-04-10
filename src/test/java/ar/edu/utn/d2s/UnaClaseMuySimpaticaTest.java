package ar.edu.utn.d2s;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ar.edu.utn.d2s.exceptions.UnaExceptionMuyClaraYPuntual;

public class UnaClaseMuySimpaticaTest {

	private UnaClaseMuySimpatica objetoAProbar;
	private final String nombrePrincipal = "UnNombreCualquiera";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Inicializo Algo muy pesado por unica vez
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Cierro recursos por unica vez
	}

	@Before
	public void setUp() throws Exception {
		// Antes de cada test se ejecuta esto
		this.objetoAProbar = new UnaClaseMuySimpatica();
		this.objetoAProbar.setNombre(this.nombrePrincipal);
		// Notar que el objeto se vuelve a instanciar cada vez que se corre un
		// test
	}

	@After
	public void tearDown() throws Exception {
		// Despues de cada test se ejecuta esto
	}

	@Test
	public void testUnaCuentaSuperAvanzada() {
		assertEquals(19, this.objetoAProbar.unaCuentaSuperAvanzada());
	}

	@Test(expected = UnaExceptionMuyClaraYPuntual.class)
	public void testSetearValorErroneo() throws Exception {
		this.objetoAProbar.setUnAtributoFundamental(-1);
	}

	@Test
	public void testEquals() {
		UnaClaseMuySimpatica otroObjetoQueDeberiaSerIgual = new UnaClaseMuySimpatica();
		otroObjetoQueDeberiaSerIgual.setNombre(this.nombrePrincipal);
		assertTrue("El equals no anda, poner siempre estas aclaraciones",
				this.objetoAProbar.equals(otroObjetoQueDeberiaSerIgual));
	}

	@Test
	public void testQueTodaviaNoHice() {
		fail("Not yet implemented, no entreguen test asi, como mucho @Ignore");
	}

	@Test
	@Ignore
	public void testQueIgnoroPorqueEstoyEnDuda() {
		fail("Not yet implemented");
	}
}