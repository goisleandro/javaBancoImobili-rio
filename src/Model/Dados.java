// Paulo Vinicius de Lima Britto - 1812157 
// Pedro Machado - 2020711
// Leandro Gois - 1811601

package Model;
import java.util.Random;

 class Dados {
	private Random geradorD1 = new Random ();
	private Random geradorD2 = new Random ();
	
	int valorD1 = geradorD1.nextInt(6)+1;
	int valorD2 = geradorD2.nextInt(6)+1;
	int total = valorD1 + valorD2;
	int prison = 0;
	
	void reroll() {
		this.valorD1 = geradorD1.nextInt(6)+1;
		this.valorD2 = geradorD2.nextInt(6)+1;
		this.total = valorD1+ valorD2;
	}
	int getPrison() {
		return prison;
	}
	void setPrison(int nprison) {
		prison = nprison;
	}
	int getDValorD1() {
		return valorD1;
	}
	int getDValorD2() {
		return valorD2;
	}	
	void setDValorD1(int num) {
		this.valorD1 = num;
	}
	void setDValorD2(int num) {
		this.valorD2 = num;
	}
	int getIguais() {
		if((valorD1!=valorD2) || prison==3) {
			prison = 0;
			return prison;
		}
		prison++;
		return prison;
	}
	int getTotal() {
		return this.total;
	}
	void setTotal(int ntotal) {
		this.total = ntotal;
	}
}

