// Paulo Vinicius de Lima Britto - 1812157 
// Pedro Machado - 2020711
// Leandro Gois - 1811601

package Model;

 class Espaço {
	int aluguel[] = new int[8] ;
	int ncasas = 0;
	int hotel = 0;
	String cor;
	String dono = "void";
	String nome = "void";
	
	int getNcasas() {
		return ncasas;
	}
	void setNcasas(int ncasas) {
		this.ncasas = ncasas;
	}
	int getHotel() {
		return hotel;
	}
	void setHotel(int hotel) {
		this.hotel = hotel;
	}
	String getECor() {
		return cor;
	}
	void setECor(String cor) {
		this.cor = cor;
	}
	String getDono() {
		return dono;
	}
	void setDono(String dono) {
		this.dono = dono;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
}
