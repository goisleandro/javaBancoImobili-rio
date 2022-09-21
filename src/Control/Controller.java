package Control;

import java.awt.Image;
import java.io.IOException;

import Model.Facade;
import View.VFacade;

public class Controller {
	
	// //////////////////// VIEW //////////////////// //
	
	//View.Cartas
	public static Image getCarta(int tag) {
		return VFacade.getCarta(tag);
	}
	//View.Companhias
	public static Image getCompany(int tag) {
		return VFacade.getCompany(tag);
	}
	//View.Dados
	public static Image getDado(int x) {
		return VFacade.getDado(x);
	}
	//View.Jogadores
	public static Image getPino(String cor) {
		return VFacade.getPino(cor);
	}
	//View.Tabuleiro
	public static Image getTab() {
		return VFacade.getTab();
	}
	//View.Territorio
	public static Image getTerritory(int tag) {
		return VFacade.getTerritory(tag);
	}
	//View.Main
	public static void setQtdPlayers (int n) {
		VFacade.setQtdPlayers(n);
	}
	public static int getQtdPlayers () {
		return VFacade.getQtdPlayers();
	}
	public static void setVez (int n, String cor) {
		VFacade.setVez (n, cor);
	}
	public static String getVez(int n) {
		return VFacade.getVez(n);
	}
	public static int getRepete () {
		return VFacade.getRepete();
	}
	public static void setRepete (int n) {
		VFacade.setRepete(n);
	}
	public static void setTurno (int n) {
		VFacade.setTurno(n);
	}
	public static void setTurno2 (int n) {
		VFacade.setTurno2(n);
	}
	public static void setPosicaoini (int indice, int pos) {
		VFacade.setPosicaoini(indice, pos);
	}
	
	// //////////////////// MODEL //////////////////// //
	
	//Model.Main
	public static void salvaJogo(int qtdPlayers, String[] vez,int turno,int turno2,int repete,int [] posicaoini) throws IOException {
		Facade.salvaJogo(qtdPlayers,vez,turno,turno2,repete,posicaoini);
	}
	public static void carregaJogo() throws IOException {
		Facade.carregaJogo();
	}
	
	//Model.Jogador
	public static int getJProp (String setCor) {
		return Facade.getJProp(setCor);
	}
	public static void setJProp (String setCor,int n) {
		Facade.setJProp(setCor, n);
	}
	
	public static void setJogador (String cor, String nome) {
		Facade.setJogador(cor, nome);
	}
	public static void setJPosicao (String cor, int posicao) {	//recebe a cor (String) e posição (int) do jogador. Case Sensitive: Preto, Amarelo, Roxo, Azul, Vermelho, Laranja.
		Facade.setJPosicao(cor, posicao);
	}
	public static int getJPosicao (String cor) {	// retorna posição (int) em jogador.posicao (Não faz os calculos). Se retornar -1 é que nao encontrou a cor do jogador.
		return Facade.getJPosicao(cor);
	}
	public static int getOrdem(String cor) {
		return Facade.getOrdem(cor);
	}
	public static void setOrdem(String cor, int numero) {
		Facade.setOrdem(cor, numero);
	}
	public static String getCor(String cor) {
		return Facade.getCor(cor);
	}
	public static void setDinheiro(int dinheiro, String Jogador) {
		Facade.setDinheiro(dinheiro, Jogador);
	}
	public static int getDinheiro(String Jogador) {
		return Facade.getDinheiro(Jogador);
	}
	public static void setTem_liberdade(int setTem_liberdade, String Jogador) {
		Facade.setTem_liberdade(setTem_liberdade, Jogador);
	}
	public static int getTem_liberdade(String Jogador) {
		return Facade.getTem_liberdade(Jogador);
	}
	public static void setEstado_Preso(int Estado_Preso, String Jogador) {
		Facade.setEstado_Preso(Estado_Preso, Jogador);
	}
	public static int getEstado_Preso(String Jogador) {
		return Facade.getEstado_Preso(Jogador);
	}
	public static void setJCor(String cor) {//ilogico
		Facade.setJCor(cor);
	}
	public static String getJCor() {//ilogico
		return Facade.getJCor();
	}
	public static void setJNome(String nome,String Jogador) {
		Facade.setJNome(nome, Jogador);
	}
	public static String getJNome(String Jogador) {
		return Facade.getJNome(Jogador);
	}
	
	// Class Model.Cartas
	public static int getCEfeitos(int x) {
		return Facade.getCEfeitos(x);
	}
	public static int getCBaralho(int x) {
		return Facade.getCBaralho(x);
	}
	public static int getCVerificador() {
		return Facade.getCVerificador();
	}
	public static void setVerificador(int verifica) {
		Facade.setVerificador(verifica);
	}
	public static int getCNum() {//inutil
		return Facade.getCNum();
	}
	public static void newC() {
		Facade.newC();
	}
	
	// Class Model.Dados
	public static int getDValorD1() {
		return Facade.getDValorD1();
	}
	public static int getDValorD2() {
		return Facade.getDValorD2();
	}
	public static void setDValorD1(int num) {
		Facade.setDValorD1(num);
	}
	public static void setDValorD2(int num) {
		Facade.setDValorD2(num);
	}
	public static int getTotal() {
		return Facade.getTotal();
	}
	public static void setTotal(int num) {
		Facade.setTotal(num);
	}
	public static int getPrison() {
		return Facade.getPrison();
	}
	public static void setPrison(int nprison) {
		Facade.setPrison(nprison);
	}
	public static int getIguais() {
		return Facade.getIguais();
	}
	public static void reroll() {
		Facade.reroll();
	}
	
	// Class Model.Espaço
	public static void setNcasas(int ncasas,int i) {
		Facade.setNcasas(ncasas,i);
	}
	public static int getNcasas(int i) {
		return Facade.getNcasas(i);
	}
	public static int getHotel(int i) {
		return Facade.getHotel(i);
	}
	public static void setHotel(int hotel,int i) {
		Facade.setHotel(hotel,i);
	}
	public static String getECor(int i) {
		return Facade.getECor(i);
	}
	public static void setECor(String cor,int i) {
		Facade.setECor(cor,i);
	}
	public static String getDono(int i) {
		return Facade.getDono(i);
	}
	public static void setDono(String dono,int i) {
		Facade.setDono(dono,i);
	}
	public static String getNome(int i) {
		return Facade.getNome(i);
	}
	public static void setNome(String nome,int i) {
		Facade.setNome(nome,i);
	}
	public static int getEAluguel(int pos,int i) {
		return Facade.getEAluguel(pos,i);
	}
	public static void setEAluguel(int pos, int vAluguel,int i) {
		Facade.setEAluguel(pos,vAluguel, i);
	}
	public static void pagaAluguelCasaHotel (String j, String jx, int nSomaDados) {
		Facade.pagaAluguelCasaHotel(j,jx,nSomaDados);
	}
	
	// Class Model.Tabuleiro
	public static void setBanco(int banco) {
		Facade.setBanco(banco);
	}
	public static int getBanco() {
		return Facade.getBanco();
	}
	public static void setEstado(int estado) {//inutil
		Facade.setEstado(estado);
	}
	public static int getEstado() {//inutil
		return Facade.getEstado();
	}
	public static String getTTabNome(int pos) {
		return Facade.getTTabNome(pos);
	}
	public static String getTTabDono(int pos) {
		return Facade.getTTabDono(pos);
	}
	public static void setTTabDono(int pos, String nome) {
		Facade.setTTabDono(pos, nome);
	}
}