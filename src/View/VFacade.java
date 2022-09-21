package View;

import java.awt.Image;

public class VFacade {
	
	//Cartas
	public static Image getCarta(int tag) {
		return Main.getCarta(tag);
	}
	
	//Companhias
	public static Image getCompany(int tag) {
		return Main.getCompany(tag);
	}
	
	//Dados
	public static Image getDado(int x) {
		return Main.getDado(x);
	}
	
	//Jogadores
	public static Image getPino(String cor) {
		return Main.getPino(cor);
	}
	
	//Tabuleiro
	public static Image getTab() {
		return Main.getTab();
	}
	//Territorio
	public static Image getTerritory(int tag) {
		return Main.getTerritory(tag);
	}
	//Main
	public static void setQtdPlayers (int n) {
		Main.qtdPlayers = n;
	}
	public static int getQtdPlayers () {
		return Main.getQtdPlayers();
	}
	public static void setVez (int n, String cor) {
		Main.setVez (n, cor);
	}
	public static String getVez(int n) {
		return Main.getVez(n);
	}
	public static int getRepete () {
		return Main.getRepete();
	}
	public static void setRepete (int n) {
		Main.setRepete(n);
	}
	public static void setTurno (int n) {
		Main.setTurno(n);
	}
	public static void setTurno2 (int n) {
		Main.setTurno2(n);
	}
	public static void setPosicaoini (int indice, int pos) {
		Main.setPosicaoini(indice, pos);
	}
}
