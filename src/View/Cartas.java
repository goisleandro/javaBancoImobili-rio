package View;

import java.awt.Image;
import java.awt.Toolkit;

class Cartas {
	private static Cartas x=null;
	static Image carta[]=new Image[30];
	static int i=0;
	String Carta1 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance1.png";
	String Carta2 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance2.png";
	String Carta3 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance3.png";
	String Carta4 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance4.png";
	String Carta5 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance5.png";
	String Carta6 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance6.png";
	String Carta7 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance7.png";
	String Carta8 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance8.png";
	String Carta9 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance9.png";
	String Carta10 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance10.png";
	String Carta11 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance11.png";
	String Carta12 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance12.png";
	String Carta13 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance13.png";
	String Carta14 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance14.png";
	String Carta15 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance15.png";
	String Carta16 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance16.png";
	String Carta17 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance17.png";
	String Carta18 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance18.png";
	String Carta19 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance19.png";
	String Carta20 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance20.png";
	String Carta21 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance21.png";
	String Carta22 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance22.png";
	String Carta23 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance23.png";
	String Carta24 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance24.png";
	String Carta25 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance25.png";
	String Carta26 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance26.png";
	String Carta27 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance27.png";
	String Carta28 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance28.png";
	String Carta29 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance29.png";
	String Carta30 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/sorteReves/chance30.png";
	
	private Cartas (){
		carta[0] = Toolkit.getDefaultToolkit().getImage(Carta1);
		carta[1] = Toolkit.getDefaultToolkit().getImage(Carta2);
		carta[2] = Toolkit.getDefaultToolkit().getImage(Carta3);
		carta[3] = Toolkit.getDefaultToolkit().getImage(Carta4);
		carta[4] = Toolkit.getDefaultToolkit().getImage(Carta5);
		carta[5] = Toolkit.getDefaultToolkit().getImage(Carta6);
		carta[6] = Toolkit.getDefaultToolkit().getImage(Carta7);
		carta[7] = Toolkit.getDefaultToolkit().getImage(Carta8);
		carta[8] = Toolkit.getDefaultToolkit().getImage(Carta9);
		carta[9] = Toolkit.getDefaultToolkit().getImage(Carta10);
		carta[10] = Toolkit.getDefaultToolkit().getImage(Carta11);
		carta[11] = Toolkit.getDefaultToolkit().getImage(Carta12);
		carta[12] = Toolkit.getDefaultToolkit().getImage(Carta13);
		carta[13] = Toolkit.getDefaultToolkit().getImage(Carta14);
		carta[14] = Toolkit.getDefaultToolkit().getImage(Carta15);
		carta[15] = Toolkit.getDefaultToolkit().getImage(Carta16);
		carta[16] = Toolkit.getDefaultToolkit().getImage(Carta17);
		carta[17] = Toolkit.getDefaultToolkit().getImage(Carta18);
		carta[18] = Toolkit.getDefaultToolkit().getImage(Carta19);
		carta[19] = Toolkit.getDefaultToolkit().getImage(Carta20);
		carta[20] = Toolkit.getDefaultToolkit().getImage(Carta21);
		carta[21] = Toolkit.getDefaultToolkit().getImage(Carta22);
		carta[22] = Toolkit.getDefaultToolkit().getImage(Carta23);
		carta[23] = Toolkit.getDefaultToolkit().getImage(Carta24);
		carta[24] = Toolkit.getDefaultToolkit().getImage(Carta25);
		carta[25] = Toolkit.getDefaultToolkit().getImage(Carta26);
		carta[26] = Toolkit.getDefaultToolkit().getImage(Carta27);
		carta[27] = Toolkit.getDefaultToolkit().getImage(Carta28);
		carta[28] = Toolkit.getDefaultToolkit().getImage(Carta29);
		carta[29] = Toolkit.getDefaultToolkit().getImage(Carta30);
	}
	protected Image getCarta(int tag) {
		return carta[tag];
	}
	public static Cartas getCartas() {
		if(x==null)
			x=new Cartas();
		return x;
	}
}
