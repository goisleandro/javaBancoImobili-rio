package View; 

import static org.junit.Assert.*;

import java.awt.Image;
import java.awt.Toolkit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Control.Controller;

public class JogadoresTest {
	@Test
	public void JogadoresTeste() {
		Image imagem;
		assertNotNull(imagem = Controller.getPino("Preto"));
	}
}