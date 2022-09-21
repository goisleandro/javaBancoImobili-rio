package Model;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	@Test
	public void testObjetoMain() {
		Main m = new Main();
		assertNotNull("Objeto Cartas inválido", m);
	}
	@Test
	public void testObjetoCartas() {
		Cartas m = new Cartas();
		assertNotNull("Objeto Cartas inválido", m);
	}
	@Test
	public void testObjetoTabuleiro() {
		Tabuleiro m = new Tabuleiro();
		assertNotNull("Objeto Cartas inválido", m);
	}
	@Test
	public void testObjetoDados() {
		Tabuleiro m = new Tabuleiro();
		assertNotNull("Objeto Cartas inválido", m);
	}
	@Test
	public void testObjetoEspaço() {
		Tabuleiro m = new Tabuleiro();
		assertNotNull("Objeto Cartas inválido", m);
	}
	@Test
	public void testObjetoJogador() {
		Tabuleiro m = new Tabuleiro();
		assertNotNull("Objeto Cartas inválido", m);
	}
}