package View;

import java.awt.Image;
import java.awt.Toolkit;

class Territorio {
	private static Territorio x=null;
	static Image t_Av_9deJulho, t_Av_Atlântica, t_Av_Brasil, t_Av_Brigadero_Faria_Lima, 
	t_Av_Europa, t_Av_Nossa_S_de_Copacabana, t_Av_Pacaembu, t_Av_Paulista, t_Av_Presidente_Vargas, 
	t_Av_Rebouças, t_Av_Vieira_Souto, t_Botafogo, t_Brooklin, t_Copacabana, t_Flamengo, 
	t_Interlagos, t_Ipanema, t_Jardim_Europa, t_Jardim_Paulista, t_Leblon, t_Morumbi, t_Av_Augusta;
	static Image Terras[]= new Image[40];
	
	String Av_9deJulho = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. 9 de Julho.png";
	String Av_Atlântica = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. Atlântica.png";
	String Av_Brasil = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. Brasil.png";
	String Av_Brigadero_Faria_Lima = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. Brigadero Faria Lima.png";
	String Av_Europa = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. Europa.png";
	String Av_Nossa_S_de_Copacabana = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. Nossa S. de Copacabana.png";
	String Av_Pacaembu = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. Pacaembú.png";
	String Av_Paulista = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. Paulista.png";
	String Av_Presidente_Vargas = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. Presidente Vargas.png";
	String Av_Rebouças = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. Rebouças.png";
	String Av_Vieira_Souto = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Av. Vieira Souto.png";
	String Botafogo = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Botafogo.png";
	String Brooklin = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Brooklin.png";
	String Copacabana = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Copacabana.png";
	String Flamengo = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Flamengo.png";
	String Interlagos = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Interlagos.png";
	String Ipanema = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Ipanema.png";
	String Jardim_Europa = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Jardim Europa.png";
	String Jardim_Paulista = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Jardim Paulista.png";
	String Leblon = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Leblon.png";
	String Morumbi = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Morumbi.png";
	String Av_Augusta = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/territorios/Rua Augusta.png";

	
	private Territorio (){
		for(int i=0;i<40;i++) {
			Terras[i]=null;
		}
		Terras[9] = Toolkit.getDefaultToolkit().getImage(Av_9deJulho);
		Terras[34] = Toolkit.getDefaultToolkit().getImage(Av_Atlântica);
		Terras[26] = Toolkit.getDefaultToolkit().getImage(Av_Brasil);
		Terras[6]  = Toolkit.getDefaultToolkit().getImage(Av_Brigadero_Faria_Lima);
		Terras[11] = Toolkit.getDefaultToolkit().getImage(Av_Europa);
		Terras[4] = Toolkit.getDefaultToolkit().getImage(Av_Nossa_S_de_Copacabana);
		Terras[14] = Toolkit.getDefaultToolkit().getImage(Av_Pacaembu);
		Terras[28] = Toolkit.getDefaultToolkit().getImage(Av_Paulista);
		Terras[3]  = Toolkit.getDefaultToolkit().getImage(Av_Presidente_Vargas);
		Terras[8] = Toolkit.getDefaultToolkit().getImage(Av_Rebouças);
		Terras[33] = Toolkit.getDefaultToolkit().getImage(Av_Vieira_Souto);
		Terras[23] = Toolkit.getDefaultToolkit().getImage(Botafogo);
		Terras[39] = Toolkit.getDefaultToolkit().getImage(Brooklin);
		Terras[31] = Toolkit.getDefaultToolkit().getImage(Copacabana);
		Terras[21] = Toolkit.getDefaultToolkit().getImage(Flamengo);
		Terras[17] = Toolkit.getDefaultToolkit().getImage(Interlagos);
		Terras[36] = Toolkit.getDefaultToolkit().getImage(Ipanema);
		Terras[29] = Toolkit.getDefaultToolkit().getImage(Jardim_Europa);
		Terras[38]= Toolkit.getDefaultToolkit().getImage(Jardim_Paulista);
		Terras[1]= Toolkit.getDefaultToolkit().getImage(Leblon);
		Terras[19] = Toolkit.getDefaultToolkit().getImage(Morumbi);
		Terras[13]= Toolkit.getDefaultToolkit().getImage(Av_Augusta);
		
		
	}
	protected Image getTerritory(int tag) {
		return Terras[tag];
	}
	public static Territorio getTerritorio() {
		if(x==null)
			x=new Territorio();
		return x;
	}

}