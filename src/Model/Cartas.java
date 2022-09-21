// Paulo Vinicius de Lima Britto - 1812157 
// Pedro Machado - 2020711
// Leandro Gois - 1811601

package Model;

import java.util.*;

 class Cartas {
	int num = 30;
	int baralho[] = new int[num];
	int efeitos[] = new int[num];
	private Random geradorCarta = new Random ();
	int verificador = 0;
	
	Cartas(){
		verificador = 0;
		efeitos[0] = 25;
		efeitos[1] = 150;
		efeitos[2] = 80;
		efeitos[3] = 200;
		efeitos[4] = 50;
		efeitos[5] = 50;
		efeitos[6] = 100;
		efeitos[7] = 100;
		efeitos[8] = 500;	// Saida livre // 
		efeitos[9] = 650;	// Vá para o ponto de partida
		efeitos[10]= 550;
		efeitos[11]= 45;
		efeitos[12]= 100;
		efeitos[13]= 100;
		efeitos[14]= 20;
		efeitos[15]=-15;
		efeitos[16]=-25;
		efeitos[17]=-45;
		efeitos[18]=-30;
		efeitos[19]=-100;
		efeitos[20]=-100;
		efeitos[21]=-40;
		efeitos[22]= 600;	// Direto para a prisão // 
		efeitos[23]=-30;
		efeitos[24]=-50;
		efeitos[25]=-25;
		efeitos[26]=-30;
		efeitos[27]=-45;
		efeitos[28]=-50;
		efeitos[29]=-50;
		
		while(verificador<num) {
			int valor=geradorCarta.nextInt(num);
			for(int i=0;i<verificador;i++) {
				if(valor==baralho[i]) {
					valor=geradorCarta.nextInt(num);
					i=-1;
				}
			}
			baralho[verificador]=valor;
			verificador++;
		}
		verificador = 0;
	}
	
	int getCEfeitos(int x) {
		return efeitos[x];
	}
	
	int getCBaralho(int x) {
		return baralho[x];
	}
	
	int getCVerificador() {
		return verificador;
	}
	
	int getCNum() {
		return num;
	}
	void setVerificador(int verifica) {
		this.verificador = verifica;
	}
}