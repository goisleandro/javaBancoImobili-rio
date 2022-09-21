package View;

import java.awt.*;
import java.awt.event.*;
 
class Tabuleiro extends Frame //implements ActionListener
{
	private static Tabuleiro x=null;
	static Image Tab;
	
	private Tabuleiro() {
		
		String imagemTabuleiro = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/tabuleiro.png"; 
		Tab = Toolkit.getDefaultToolkit().getImage(imagemTabuleiro);
	}
	
	Image getTab() {
		return Tab;
	}
	public static Tabuleiro getTabuleiro() {
		if(x==null)
			x=new Tabuleiro();
		return x;
	}
}