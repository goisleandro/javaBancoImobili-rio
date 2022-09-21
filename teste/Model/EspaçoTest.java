package Model;

import Control.Controller;
import org.junit.*;
import static org.junit.Assert.*;

public class EspaçoTest {

	@Test
	public void testaObjedoEspaço() {
		Espaço e = new Espaço();
		assertNotNull("Objeto Espaço inválido", e);
	}
	@Test
	public void testaValoresNcasas() {
		for (int x = 0; x<40; x++) {
			for (int i = 0; i<5; i++) {
				Controller.setNcasas(i, x);
				assertTrue(Controller.getNcasas(x) >= 0);
				assertTrue(Controller.getNcasas(x) < 5);
				assertFalse(Controller.getNcasas(x) < 0);
				assertFalse(Controller.getNcasas(x) > 4);
			}	
		}
	}
	@Test
	public void testaValoresHotel() {
		for (int x = 0; x<30; x++) {
			for (int i = 0; i<2; i++) {
				Controller.setHotel(i, x);
				assertTrue(Controller.getHotel(x) >= 0);
				assertTrue(Controller.getHotel(x) <= 1);
			}
		}
	}
	@Test
	public void testaValoresaluguel() {
		for (int i = 0; i<40; i++) {
			for (int j = 0; j<8; j++) {
				Controller.setEAluguel(j, 100, i);
				assertTrue(Controller.getEAluguel( j, i ) == 100);
			}
		}
	}
	@Test
	public void testaEspacoCor() {
		for (int i = 0; i<40; i++) {
			Controller.setECor("preto", i);
			assertTrue(Controller.getECor(i) == "preto");
		}	
	}
	@Test
	public void testaEspacoDono() {
		for (int i = 0; i<40; i++) {
			Controller.setDono("eu", i);
			assertTrue(Controller.getDono(i) == "eu");			
		}
	}
	@Test
	public void testaEspacoNome() {
		for (int i = 0; i<40; i++) {
			Controller.setNome("ferrari", i);
			assertTrue(Controller.getNome(i) == "ferrari");
		}
	}
}
