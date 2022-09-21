// Paulo Vinicius de Lima Britto - 1812157 
// Pedro Machado - 2020711
// Leandro Gois - 1811601

package Model;

class Jogador {
	int dinheiro=4000;
	String cor;
	String nome;
	int ordem=-1;
	int posicao = 0;
	int Tem_liberdade = 0;
	int Estado_Preso=0;
	int Propriedades=0;
	
	Jogador(){}
	Jogador (String c, String n) {
		this.cor = c;
		this.nome = n;
	}
	
	int getDinheiro() {
		return this.dinheiro;
	}
	void setDinheiro(int setDinheiro) {
		this.dinheiro = setDinheiro;
	}
	void setJCor(String Cor) {
		this.cor =  Cor;
	}
	String getJCor() {
		return this.cor;
	}
	int getOrdem() {
		return this.ordem;
	}
	void setOrdem(int numero) {
		this.ordem = numero;
	}
	void setJNome(String Nome) {
		this.nome = Nome;
	}
	String getJNome() {
		return this.nome;
	}
	int getPosicao() {
		return this.posicao;
	}
	void setPosicao(int setPosicao) {
		this.posicao = setPosicao;
	}
	int getTem_liberdade() {
		return this.Tem_liberdade;
	}
	void setTem_liberdade(int setTem_liberdade) {
		this.Tem_liberdade = setTem_liberdade;
	}
	int getEstado_Preso() {
		return this.Estado_Preso;
	}
	void setEstado_Preso(int setEstado_Preso) {
		this.Estado_Preso = setEstado_Preso;
	}
	int getJProp() {
		return this.Propriedades;
	}
	void setJProp(int n) {
		this.Propriedades = n;
	}
}
