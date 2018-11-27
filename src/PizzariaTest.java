import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import abstract_factory.Pizzaria;

@RunWith(JUnit4.class)
public class PizzariaTest {
	private Pizzaria pizzaria;
	
	@Before
	public void setUp() {
		pizzaria = new Pizzaria();
	}
	
	@Test
	public void testCriarPizza_sabor_quatroqueijos() {
		pizzaria.criarPizza("sao-paulo", "queijo");
	}
	
	@Test
	public void testCriarPizza_sabor_portuguesa() {
		pizzaria.criarPizza("riodejaneiro", "portuguesa");
	}
	
	@Test public void testCriarPizza_sabor_calabresa() {
		pizzaria.criarPizza("sao-paulo", "calabresa");
	}
}
