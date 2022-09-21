package View;

import static org.junit.Assert.*;
import org.junit.Test;
import Control.Controller;
import java.awt.Image;

public class CartasTest {

	@Test
	public void TestaCartas () {
		Image imagem;
		assertNotNull(imagem = Controller.getCarta(10));
	}
} 