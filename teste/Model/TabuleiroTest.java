package Model;

import static org.junit.Assert.*;

import org.junit.Test;

import Control.Controller;

public class TabuleiroTest {

	@Test
	public void test() {
		Espaço Tab []= new Espaço [40];
		assertNotNull("Vetor de espaços inválido", Tab);
		
		Espaço Leblon = new Espaço();
		assertNotNull("Objeto Espaço inválido", Leblon);
		
		Tab[1]= Leblon;
		assertNotNull("Erro na alocação de objeto no vetor de objeto", Tab[1]);
	}
	@Test
	public void testaValorBanco() {
		assertTrue(Controller.getBanco() >= 0);
		assertTrue(Controller.getBanco() < 200001);
	}
	@Test
	public void testaValorEstado() {
		Controller.setEstado(1);
		assertTrue(Controller.getEstado() <= 1);
		assertTrue(Controller.getEstado() >= 0);
	}
	@Test
	public void testaDonoNomeTabuleiro() {
		Controller.setTTabDono(5, "Preto");
		assertTrue(Controller.getTTabDono(5)=="Preto");
		assertTrue(Controller.getTTabNome(5) == "Companhia Ferroviária");
	}
}