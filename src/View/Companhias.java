package View;

import java.awt.Image;
import java.awt.Toolkit;

class Companhias {
	private static Companhias x=null;
	static Image Companias[]=new Image[60];
	
	String company1 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/companhias/company1.png";
	String company2 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/companhias/company2.png";
	String company3 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/companhias/company3.png";
	String company4 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/companhias/company4.png";
	String company5 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/companhias/company5.png";
	String company6 = "G:/Meu Drive/11PUC/inf1636-POO/1811601/src/View/Imagens-01/companhias/company6.png";
	private Companhias () {
		for(int i=0;i<60;i++) {
			Companias[i]=null;
		}
		Companias[5] = Toolkit.getDefaultToolkit().getImage(company1);
		Companias[7] = Toolkit.getDefaultToolkit().getImage(company2);
		Companias[15] = Toolkit.getDefaultToolkit().getImage(company3);
		Companias[25] = Toolkit.getDefaultToolkit().getImage(company4);
		Companias[32] = Toolkit.getDefaultToolkit().getImage(company5);
		Companias[35] = Toolkit.getDefaultToolkit().getImage(company6);
	}
	protected Image getCompany(int tag) {
		return Companias[tag];
	}
	public static Companhias getCompanhias() {
		if(x==null)
			x=new Companhias();
		return x;
	}
}
