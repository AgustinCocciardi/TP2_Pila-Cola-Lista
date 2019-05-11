package testPila;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import Pila.PilaDinamica;

public class PilaDinamicaTest {
	
	private PilaDinamica<String> pila;
	
	@Before
	public void crearPila() {
		pila = new PilaDinamica<String>();
	}
	
	@Test
	public void quePuedeApilar() {
		pila.push("Sofia");
		Assert.assertEquals("Sofia", pila.peek());
	}
	
	@Test
	public void quePuedeDesapilar() {
		pila.push("German");
		Assert.assertEquals("German", pila.pop());
	}
	
	@Test 
	public void quePuedeUsarPeek() {
		pila.push("Mario Hugo");
		Assert.assertEquals("Mario Hugo", pila.peek());
	}
	
	@Test
	public void queFuncionaIsEmptyCuandoEstaVacia() {
		Assert.assertEquals(true, pila.isEmpty());
	}
	
	@Test
	public void queFuncionaIsEmptyCuandoNoEstaVacia() {
		pila.push("Martin");
		Assert.assertEquals(false, pila.isEmpty());
	}
	
	@Test
	public void queVaciaLaPila() {
		pila.push("Emilio");
		pila.empty();
		Assert.assertEquals(true, pila.isEmpty());
	}
}
