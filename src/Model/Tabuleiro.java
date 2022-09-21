// Paulo Vinicius de Lima Britto - 1812157 
// Pedro Machado - 2020711
// Leandro Gois - 1811601

package Model;

class Tabuleiro {
	int banco = 200000;
	int estado=0;
	Espaço Tab []= new Espaço [40];
	
	void setBanco(int banco) {
		this.banco = banco;
	}
	int getBanco() {
		return banco;
	}
	int getEstado() {
		return estado;
	}
	void setEstado(int estado) {
		this.estado = estado;
	}
	String getTTabNome(int pos) {
		return Tab[pos].nome;
	}
	String getTTabDono(int pos) {
		return Tab[pos].dono;
	}
	void setTTabDono(int pos, String nome) {
		this.Tab[pos].dono = nome;
	}

	Tabuleiro() {
		Espaço Leblon = new Espaço();
		Tab[1]= Leblon;
		Leblon.nome="Leblon";
		Leblon.cor = "rosa";
		Leblon.aluguel[0]= 6;
		Leblon.aluguel[1]= 30;
		Leblon.aluguel[2]= 90;
		Leblon.aluguel[3]= 270;
		Leblon.aluguel[4]= 400;
		Leblon.aluguel[5]= 500;
		Leblon.aluguel[6]= 50;
		Leblon.aluguel[7]= 100;		
		
		Espaço Av_Presidente_Vargas = new Espaço();
		Tab[3]= Av_Presidente_Vargas;
		Av_Presidente_Vargas.nome="Av. Presidente Vargas";
		Av_Presidente_Vargas.cor = "rosa";
		Av_Presidente_Vargas.aluguel[0]= 2;
		Av_Presidente_Vargas.aluguel[1]= 10;
		Av_Presidente_Vargas.aluguel[2]= 30;
		Av_Presidente_Vargas.aluguel[3]= 90;
		Av_Presidente_Vargas.aluguel[4]= 160;
		Av_Presidente_Vargas.aluguel[5]= 250;
		Av_Presidente_Vargas.aluguel[6]= 50;
		Av_Presidente_Vargas.aluguel[7]= 60;
		
		Espaço Av_NossaSenhoradeCopacabana = new Espaço();
		Tab[4]= Av_NossaSenhoradeCopacabana;
		Av_NossaSenhoradeCopacabana.nome="Av. Nossa Senhora de Copacabana";
		Av_NossaSenhoradeCopacabana.cor = "rosa";
		Av_NossaSenhoradeCopacabana.aluguel[0]= 4;
		Av_NossaSenhoradeCopacabana.aluguel[1]= 20;
		Av_NossaSenhoradeCopacabana.aluguel[2]= 60;
		Av_NossaSenhoradeCopacabana.aluguel[3]= 180;
		Av_NossaSenhoradeCopacabana.aluguel[4]= 320;
		Av_NossaSenhoradeCopacabana.aluguel[5]= 450;
		Av_NossaSenhoradeCopacabana.aluguel[6]= 50;
		Av_NossaSenhoradeCopacabana.aluguel[7]= 60;
		
		Espaço Av_BrigadeiroFariaLima = new Espaço();
		Tab[6]=Av_BrigadeiroFariaLima;
		Av_BrigadeiroFariaLima.nome="Av. Brigadeiro Faria Lima";
		Av_BrigadeiroFariaLima.cor = "azul";
		Av_BrigadeiroFariaLima.aluguel[0]= 20;
		Av_BrigadeiroFariaLima.aluguel[1]= 100;
		Av_BrigadeiroFariaLima.aluguel[2]= 300;
		Av_BrigadeiroFariaLima.aluguel[3]= 750;
		Av_BrigadeiroFariaLima.aluguel[4]= 925;
		Av_BrigadeiroFariaLima.aluguel[5]= 1100;
		Av_BrigadeiroFariaLima.aluguel[6]= 150;
		Av_BrigadeiroFariaLima.aluguel[7]= 240;
		
		Espaço Av_Rebouças = new Espaço();
		Tab[8]=Av_Rebouças;
		Av_Rebouças.nome="Av. Rebouças";
		Av_Rebouças.cor = "azul";
		Av_Rebouças.aluguel[0]= 18;
		Av_Rebouças.aluguel[1]= 90;
		Av_Rebouças.aluguel[2]= 250;
		Av_Rebouças.aluguel[3]= 700;
		Av_Rebouças.aluguel[4]= 875;
		Av_Rebouças.aluguel[5]= 1050;
		Av_Rebouças.aluguel[6]= 150;
		Av_Rebouças.aluguel[7]= 220;
		
		Espaço Av_9deJulho = new Espaço();
		Tab[9]=Av_9deJulho;
		Av_9deJulho.nome="Av. 9 de Julho";
		Av_9deJulho.cor = "azul";
		Av_9deJulho.aluguel[0]= 18;
		Av_9deJulho.aluguel[1]= 90;
		Av_9deJulho.aluguel[2]= 250;
		Av_9deJulho.aluguel[3]= 700;
		Av_9deJulho.aluguel[4]= 875;
		Av_9deJulho.aluguel[5]= 1050;
		Av_9deJulho.aluguel[6]= 150;
		Av_9deJulho.aluguel[7]= 220;
		
		Espaço Av_Europa = new Espaço();
		Tab[11]=Av_Europa;
		Av_Europa.nome="Av. Europa";
		Av_Europa.cor = "vinho";
		Av_Europa.aluguel[0]= 16;
		Av_Europa.aluguel[1]= 80;
		Av_Europa.aluguel[2]= 220;
		Av_Europa.aluguel[3]= 600;
		Av_Europa.aluguel[4]= 800;
		Av_Europa.aluguel[5]= 1000;
		Av_Europa.aluguel[6]= 100;
		Av_Europa.aluguel[7]= 200;
		
		Espaço Rua_Augusta = new Espaço();
		Tab[13]=Rua_Augusta;
		Rua_Augusta.nome="Rua Augusta";
		Rua_Augusta.cor = "vinho";
		Rua_Augusta.aluguel[0]= 14;
		Rua_Augusta.aluguel[1]= 70;
		Rua_Augusta.aluguel[2]= 200;
		Rua_Augusta.aluguel[3]= 550;
		Rua_Augusta.aluguel[4]= 750;
		Rua_Augusta.aluguel[5]= 950;
		Rua_Augusta.aluguel[6]= 100;
		Rua_Augusta.aluguel[7]= 180;
		
		Espaço Av_Pacaembu = new Espaço();
		Tab[14]=Av_Pacaembu;
		Av_Pacaembu.nome="Av. Pacaembu";
		Av_Pacaembu.cor = "vinho";
		Av_Pacaembu.aluguel[0]= 14;
		Av_Pacaembu.aluguel[1]= 70;
		Av_Pacaembu.aluguel[2]= 200;
		Av_Pacaembu.aluguel[3]= 550;
		Av_Pacaembu.aluguel[4]= 750;
		Av_Pacaembu.aluguel[5]= 950;
		Av_Pacaembu.aluguel[6]= 100;
		Av_Pacaembu.aluguel[7]= 180;
		
		Espaço Interlagos = new Espaço();
		Tab[17]=Interlagos;
		Interlagos.nome="Interlagos";
		Interlagos.cor = "laranja";
		Interlagos.aluguel[0]= 35;
		Interlagos.aluguel[1]= 175;
		Interlagos.aluguel[2]= 500;
		Interlagos.aluguel[3]= 1100;
		Interlagos.aluguel[4]= 1300;
		Interlagos.aluguel[5]= 1500;
		Interlagos.aluguel[6]= 200;
		Interlagos.aluguel[7]= 350;
		
		Espaço Morumbi = new Espaço();
		Tab[19]=Morumbi;
		Morumbi.nome="Morumbi";
		Morumbi.cor = "laranja";
		Morumbi.aluguel[0]= 50;
		Morumbi.aluguel[1]= 200;
		Morumbi.aluguel[2]= 600;
		Morumbi.aluguel[3]= 1400;
		Morumbi.aluguel[4]= 1700;
		Morumbi.aluguel[5]= 2000;
		Morumbi.aluguel[6]= 200;
		Morumbi.aluguel[7]= 400;
		
		Espaço Flamengo = new Espaço();
		Tab[21]=Flamengo;
		Flamengo.nome="Flamengo";
		Flamengo.cor = "vermelho";
		Flamengo.aluguel[0]= 8;
		Flamengo.aluguel[1]= 40;
		Flamengo.aluguel[2]= 100;
		Flamengo.aluguel[3]= 300;
		Flamengo.aluguel[4]= 450;
		Flamengo.aluguel[5]= 600;
		Flamengo.aluguel[6]= 50;
		Flamengo.aluguel[7]= 120;
		
		Espaço Botafogo = new Espaço();
		Tab[23]=Botafogo;
		Botafogo.nome="Botafogo";
		Botafogo.cor = "vermelho";
		Botafogo.aluguel[0]= 6;
		Botafogo.aluguel[1]= 30;
		Botafogo.aluguel[2]= 90;
		Botafogo.aluguel[3]= 270;
		Botafogo.aluguel[4]= 400;
		Botafogo.aluguel[5]= 500;
		Botafogo.aluguel[6]= 50;
		Botafogo.aluguel[7]= 100;
		
		Espaço Av_Brasil = new Espaço();
		Tab[26]=Av_Brasil;
		Av_Brasil.nome="Av. Brasil";
		Av_Brasil.cor = "amarelo";
		Av_Brasil.aluguel[0]= 12;
		Av_Brasil.aluguel[1]= 60;
		Av_Brasil.aluguel[2]= 180;
		Av_Brasil.aluguel[3]= 500;
		Av_Brasil.aluguel[4]= 700;
		Av_Brasil.aluguel[5]= 900;
		Av_Brasil.aluguel[6]= 100;
		Av_Brasil.aluguel[7]= 160;
		
		Espaço Av_Paulista = new Espaço();
		Tab[28]=Av_Paulista;
		Av_Paulista.nome="Av. Paulista";
		Av_Paulista.cor = "azul";
		Av_Paulista.aluguel[0]= 10;
		Av_Paulista.aluguel[1]= 50;
		Av_Paulista.aluguel[2]= 150;
		Av_Paulista.aluguel[3]= 450;
		Av_Paulista.aluguel[4]= 625;
		Av_Paulista.aluguel[5]= 750;
		Av_Paulista.aluguel[6]= 100;
		Av_Paulista.aluguel[7]= 140;
		
		Espaço Jardim_Europa = new Espaço();
		Tab[29]=Jardim_Europa;
		Jardim_Europa.nome="Jardim Europa";
		Jardim_Europa.cor = "amarelo";
		Jardim_Europa.aluguel[0]= 10;
		Jardim_Europa.aluguel[1]= 50;
		Jardim_Europa.aluguel[2]= 150;
		Jardim_Europa.aluguel[3]= 450;
		Jardim_Europa.aluguel[4]= 625;
		Jardim_Europa.aluguel[5]= 700;
		Jardim_Europa.aluguel[6]= 100;
		Jardim_Europa.aluguel[7]= 140;		
		
		Espaço Copacabana = new Espaço();
		Tab[31]=Copacabana;
		Copacabana.nome="Copacabana";
		Copacabana.cor = "verde";
		Copacabana.aluguel[0]= 22;
		Copacabana.aluguel[1]= 110;
		Copacabana.aluguel[2]= 330;
		Copacabana.aluguel[3]= 800;
		Copacabana.aluguel[4]= 975;
		Copacabana.aluguel[5]= 1150;
		Copacabana.aluguel[6]= 150;
		Copacabana.aluguel[7]= 260;
		
		Espaço Av_Vieira_Souto = new Espaço();
		Tab[33]=Av_Vieira_Souto;
		Av_Vieira_Souto.nome="Av. Vieira Souto";
		Av_Vieira_Souto.cor = "verde";
		Av_Vieira_Souto.aluguel[0]= 28;
		Av_Vieira_Souto.aluguel[1]= 150;
		Av_Vieira_Souto.aluguel[2]= 450;
		Av_Vieira_Souto.aluguel[3]= 1000;
		Av_Vieira_Souto.aluguel[4]= 1200;
		Av_Vieira_Souto.aluguel[5]= 1400;
		Av_Vieira_Souto.aluguel[6]= 200;
		Av_Vieira_Souto.aluguel[7]= 320;
		
		Espaço Av_Atlantica = new Espaço();
		Tab[34]=Av_Atlantica;
		Av_Atlantica.nome="Av. Atlântica";
		Av_Atlantica.cor = "verde";
		Av_Atlantica.aluguel[0]= 26;
		Av_Atlantica.aluguel[1]= 130;
		Av_Atlantica.aluguel[2]= 390;
		Av_Atlantica.aluguel[3]= 900;
		Av_Atlantica.aluguel[4]= 1100;
		Av_Atlantica.aluguel[5]= 1275;
		Av_Atlantica.aluguel[6]= 200;
		Av_Atlantica.aluguel[7]= 300;	
		
		Espaço Ipanema = new Espaço();
		Tab[36]=Ipanema;
		Ipanema.nome="Ipanema";
		Ipanema.cor = "verde";
		Ipanema.aluguel[0]= 26;
		Ipanema.aluguel[1]= 130;
		Ipanema.aluguel[2]= 390;
		Ipanema.aluguel[3]= 900;
		Ipanema.aluguel[4]= 1100;
		Ipanema.aluguel[5]= 1275;
		Ipanema.aluguel[6]= 200;
		Ipanema.aluguel[7]= 300;
		
		Espaço Jardim_Paulista = new Espaço();
		Tab[38]=Jardim_Paulista;
		Jardim_Paulista.nome="Jardim Paulista";
		Jardim_Paulista.cor = "roxo";
		Jardim_Paulista.aluguel[0]= 24;
		Jardim_Paulista.aluguel[1]= 120;
		Jardim_Paulista.aluguel[2]= 360;
		Jardim_Paulista.aluguel[3]= 850;
		Jardim_Paulista.aluguel[4]= 1025;
		Jardim_Paulista.aluguel[5]= 1200;
		Jardim_Paulista.aluguel[6]= 150;
		Jardim_Paulista.aluguel[7]= 280;
		
		Espaço Brooklin = new Espaço();
		Tab[39]=Brooklin;
		Brooklin.nome="Brooklin";
		Brooklin.cor = "roxo";
		Brooklin.aluguel[0]= 22;
		Brooklin.aluguel[1]= 110;
		Brooklin.aluguel[2]= 330;
		Brooklin.aluguel[3]= 800;
		Brooklin.aluguel[4]= 975;
		Brooklin.aluguel[5]= 1150;
		Brooklin.aluguel[6]= 150;
		Brooklin.aluguel[7]= 260;
		
		Espaço revez1 = new Espaço(); 
		Espaço revez2 = new Espaço(); 
		Espaço revez3 = new Espaço(); 
		Espaço revez4 = new Espaço(); 
		Espaço revez5 = new Espaço(); 
		Espaço revez6 = new Espaço(); 
		
		revez1.nome="Sorte ou Revéz";
		revez2.nome="Sorte ou Revéz";
		revez3.nome="Sorte ou Revéz";
		revez4.nome="Sorte ou Revéz";
		revez5.nome="Sorte ou Revéz";
		revez6.nome="Sorte ou Revéz";
		
		Tab[2]=revez1;
		Tab[2].dono = "SorteRevez";
		
		Tab[12]=revez2;
		Tab[12].dono = "SorteRevez";
		
		Tab[16]=revez3;
		Tab[16].dono = "SorteRevez";
		
		Tab[22]=revez4;
		Tab[22].dono = "SorteRevez";

		Tab[27]=revez5;
		Tab[27].dono = "SorteRevez";
		
		Tab[37]=revez6;
		Tab[37].dono = "SorteRevez";
		
		Espaço Lucros  = new Espaço();
		Lucros.nome="Lucros ou Dividendos";
		Espaço Partida = new Espaço();
		Partida.nome="Partida";
		Espaço Imposto = new Espaço();
		Imposto.nome="Imposto de renda";
		
		Tab[18] = Lucros;
		Tab[18].dono= "Lucros";
		
		Tab[0]  = Partida;
		Tab[0].dono = "Nada";
		
		Tab[24] = Imposto;
		Tab[24].dono= "Imposto";
		
		Espaço Nada1 = new Espaço();
		Espaço Nada2 = new Espaço();
		
		Tab[10]=Nada1;
		Tab[20]=Nada2;
		
		Nada1.nome="Visitando a Prisão";
		Nada2.nome="Parada Livre";
		
		Tab[10].dono = "Nada";
		Tab[20].dono = "Nada";
		
		Espaço Ferrovia = new Espaço();
		Ferrovia.nome="Companhia Ferroviária";
		Ferrovia.aluguel[0] = 50;
		Ferrovia.aluguel[7] = 200;
		Tab[5]=Ferrovia;
		Tab[5].cor="cinza";
		
		Espaço Viaçao = new Espaço();
		Viaçao.nome="Companhia de Viação";
		Viaçao.aluguel[0] = 50;
		Viaçao.aluguel[7] = 200;
		Tab[7]=Viaçao;
		Tab[7].cor="cinza";
		
		Espaço Taxi = new Espaço();
		Taxi.nome="Companhia de Táxi";
		Taxi.aluguel[0] = 40;
		Taxi.aluguel[7] = 150;
		Tab[15]=Taxi;
		Tab[15].cor="cinza";
		
		Espaço Navegaçao = new Espaço();
		Navegaçao.nome="Companhia de Navegação";
		Navegaçao.aluguel[0] = 40;
		Navegaçao.aluguel[7] = 150;
		Tab[25]=Navegaçao;
		Tab[25].cor="cinza";
		
		Espaço Aviaçao = new Espaço();
		Aviaçao.nome="Companhia de Aviação";
		Aviaçao.aluguel[0] = 50;
		Aviaçao.aluguel[7] = 200;
		Tab[32]=Aviaçao;
		Tab[32].cor="cinza";
	
		Espaço Heliponto = new Espaço();
		Heliponto.nome="Companhia de Táxi Aéreo";
		Heliponto.aluguel[0] = 50;
		Heliponto.aluguel[7] = 200;
		Tab[35]=Heliponto;
		Tab[35].cor="cinza";
		
		Espaço Prisao = new Espaço();
		Prisao.nome="Vá para a Prisão";
		Tab[30]=Prisao;
		Tab[30].dono="Prisao";
	}
}
