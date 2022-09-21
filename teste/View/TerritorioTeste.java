package View;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Control.Controller;
import Model.Facade;

import java.awt.Image;
import java.awt.Toolkit;

public class TerritorioTeste {
	@Test
	public void TerritorioTeste() {
		Image imagem;
		assertNotNull(imagem = Controller.getTerritory(8));
	}
}