package Model;

import Control.Controller;
import org.junit.*;
import static org.junit.Assert.*;

public class DadosTest {
	@Test
	public void testaValoresObjedoDado() {
		Dados d=new Dados();
		assertNotNull("Objeto Dados inválido", d);
	}
	@Test
	public void testaValoresDados() {
		assertTrue(Controller.getDValorD1() > 0);
		assertTrue(Controller.getDValorD1() < 7);		
		assertTrue(Controller.getDValorD2() > 0);
		assertTrue(Controller.getDValorD2() < 7);
		assertFalse(Controller.getDValorD1() < 1);
		assertFalse(Controller.getDValorD1() > 6);		
		assertFalse(Controller.getDValorD2() < 1);
		assertFalse(Controller.getDValorD2() > 6);
	}
	@Test
	public void testaValoresTotal() {
		for(int i = 0; i < 30; i++) {
			Controller.reroll();
			assertTrue(Controller.getTotal() < 13);
			assertTrue(Controller.getTotal() > 1);
		}
	}
	@Test
	public void testaValoresIguaisPrison() {
		assertTrue(Controller.getPrison() < 4);
		assertTrue(Controller.getPrison() >= 0);
		for(int i = 1; i < 4; i++) {
			Controller.setDValorD1(i);
			Controller.setDValorD2(i);
			assertTrue(Controller.getIguais() == Controller.getPrison());
			assertTrue(Controller.getPrison() < 4);
			assertTrue(Controller.getPrison() >= 0);
		}
	}

}