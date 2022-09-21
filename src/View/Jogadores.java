package View;

import java.awt.Image;
import java.awt.Toolkit;

class Jogadores {
	private static Jogadores x=null;
	static Image J1, J2, J3, J4, J5, J6;
	
	String P1 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/pinos/pin5.png";
	String P2 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/pinos/pin3.png";
	String P3 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/pinos/pin4.png";
	String P4 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/pinos/pin1.png";
	String P5 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/pinos/pin0.png";
	String P6 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/pinos/pin2.png";
	
	private Jogadores(){
		J1 = Toolkit.getDefaultToolkit().getImage(P1);
		J2 = Toolkit.getDefaultToolkit().getImage(P2);
		J3 = Toolkit.getDefaultToolkit().getImage(P3);
		J4 = Toolkit.getDefaultToolkit().getImage(P4);
		J5 = Toolkit.getDefaultToolkit().getImage(P5);
		J6 = Toolkit.getDefaultToolkit().getImage(P6);
	}
	
	Image getPino(String cor) {
		switch(cor) {
		  case "Preto":
			  return J1;
		  case "Amarelo":
			  return J2;
		  case "Roxo":
			  return J3;
		  case "Azul":
			  return J4;
		  case "Vermelho":
			  return J5;
		  case "Laranja":
			  return J6;
		  default:
		}
		return null;
	}
	public static Jogadores getJogadores() {
		if(x==null)
			x=new Jogadores();
		return x;
	}
}