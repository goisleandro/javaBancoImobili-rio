package View;

import java.awt.Image;
import java.awt.Toolkit;

class Dados {
	private static Dados x=null;
	static Image D1, D2, D3, D4, D5, D6;
	
	String Dado1 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/dados/die_face_1.png";
	String Dado2 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/dados/die_face_2.png";
	String Dado3 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/dados/die_face_3.png";
	String Dado4 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/dados/die_face_4.png";
	String Dado5 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/dados/die_face_5.png";
	String Dado6 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/dados/die_face_6.png";
	
	private Dados(){
		
		D1 = Toolkit.getDefaultToolkit().getImage(Dado1);
		D2 = Toolkit.getDefaultToolkit().getImage(Dado2);
		D3 = Toolkit.getDefaultToolkit().getImage(Dado3);
		D4 = Toolkit.getDefaultToolkit().getImage(Dado4);
		D5 = Toolkit.getDefaultToolkit().getImage(Dado5);
		D6 = Toolkit.getDefaultToolkit().getImage(Dado6);
		
		
	}
	Image getDado(int x) {
		switch(x) {
		  case 1:
			  return D1;
		  case 2:
			  return D2;
		  case 3:
			  return D3;
		  case 4:
			  return D4;
		  case 5:
			  return D5;
		  case 6:
			  return D6;
		  default:
		    System.out.println("Dado não pôde ser encontrado. Jogo será finalizado.");
		    System.exit(1);
		}
		return null;
	}
	public static Dados getDados() {
		if(x==null)
			x=new Dados();
		return x;
	}
}
