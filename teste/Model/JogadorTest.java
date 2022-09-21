package Model;

import Control.Controller;
import static org.junit.Assert.*;
import org.junit.Test;



public class JogadorTest {
	static String cor;
	static Jogador j;
	
	@Test
	public void testJogadores() {
		String nome1 = "Butao";
		cor= "Preto";
		Controller.setJogador(cor, nome1);
		j = Main.getJogador(cor);
		assertNotNull("Objeto Jogador invalido", j);
		assertTrue(j.Estado_Preso == 0);
		assertTrue(j.posicao == 0);
		assertTrue(j.Tem_liberdade == 0);
		assertTrue(j.dinheiro == 4000);
		assertTrue(j.ordem == -1);
		assertTrue(j.cor == cor);
		assertTrue(j.nome == nome1);
	}
	@Test
	public void testJogadoresCorNome() {
		Controller.setJCor("laranja");
		assertTrue(Controller.getJCor() == "laranja");
		Controller.setJNome("Cachorro", cor);
		assertTrue(Controller.getJNome(cor) == "Cachorro");
	}
	@Test
	public void testeEstado_Preso() {
		Controller.setEstado(3);
		assertTrue(Controller.getEstado() == 3);
	}
	@Test
	public void testePosicaoJogador() {
		Controller.setJPosicao("Preto",20);
		assertTrue(Controller.getJPosicao("Preto") == 20);
	}
	@Test
	public void testeLiberdadeJogador() {
		Controller.setTem_liberdade(12, j.cor);
		assertTrue(Controller.getTem_liberdade(j.cor) == 12);
	}
	@Test
	public void testeDinheiroJogador() {
		Controller.setDinheiro(5000, j.cor);
		assertTrue(Controller.getDinheiro(j.cor) > 0);
		assertTrue(Controller.getDinheiro(j.cor) < 5001);
	}
	@Test
	public void TestaOrdemJogador() {
		Controller.setOrdem("Preto", 3);
		assertTrue(Controller.getOrdem("Preto")==3);
	}
	@Test
	public void TestaPosicaoJogador() {
		Controller.setJPosicao("Preto", 3);
		assertTrue(Controller.getJPosicao("Preto")==3);
	}
}