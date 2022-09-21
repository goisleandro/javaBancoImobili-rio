package Model;

import org.junit.*;
import Control.Controller;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CartasTest {
	@Test
	public void testaValoresObjedoDado() {
		Cartas c=new Cartas();
		assertNotNull("Objeto Cartas inválido", c);
	}
	@Test
	public void testaPreenchimentoVetor() {
		int y;
		for (int i = 0; i<30; i++) {
			assertTrue(Controller.getCBaralho(i) < 651);
			assertTrue(Controller.getCBaralho(i) > -101);
			assertTrue(Controller.getCEfeitos(i) < 651);
			assertTrue(Controller.getCEfeitos(i) > -101);
			Controller.setVerificador(i);
			assertTrue(Controller.getCVerificador() == i);
		}
	}	
	@Test
	public void testaVariáveisDeInicializacao() {
		assertTrue(Controller.getCVerificador() == 0);
		assertTrue(Controller.getCNum() == 30);
	}
} 