package Model;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	@Test
	public void testObjetoMain() {
		Main m = new Main();
		assertNotNull("Objeto Cartas inv�lido", m);
	}
	@Test
	public void testObjetoCartas() {
		Cartas m = new Cartas();
		assertNotNull("Objeto Cartas inv�lido", m);
	}
	@Test
	public void testObjetoTabuleiro() {
		Tabuleiro m = new Tabuleiro();
		assertNotNull("Objeto Cartas inv�lido", m);
	}
	@Test
	public void testObjetoDados() {
		Tabuleiro m = new Tabuleiro();
		assertNotNull("Objeto Cartas inv�lido", m);
	}
	@Test
	public void testObjetoEspa�o() {
		Tabuleiro m = new Tabuleiro();
		assertNotNull("Objeto Cartas inv�lido", m);
	}
	@Test
	public void testObjetoJogador() {
		Tabuleiro m = new Tabuleiro();
		assertNotNull("Objeto Cartas inv�lido", m);
	}
}