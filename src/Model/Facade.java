package Model;

import java.io.IOException;
import java.util.Observable;
import View.CartasObserver;

@SuppressWarnings("deprecation")
public class Facade extends Observable implements CartasObserver{
	private static String acao = "";
	
	//Observer
	public void vaParaPrisao() {
		acao = "vaParaPrisao";
		this.mudaEstado();
	}
	public void avanceAtePontoDePartida() {
		acao = "avanceAtePontoDePartida";
		this.mudaEstado();
	}
	public void mudaEstado() {
		setChanged();			//mudanca de estado
		notifyObservers(acao);	//Notifica todos os observadores
	}
	
	//Class Model.Main
	public static void salvaJogo(int qtdPlayers, String[] vez,int turno,int turno2,int repete,int [] posicaoini) throws IOException {
		Main.salvaJogo(qtdPlayers,vez,turno,turno2,repete,posicaoini);
	}
	public static void carregaJogo() throws IOException {
		Main.carregaJogo();
	}
	
	// Class Model.Jogador
	public static int getJProp (String setCor) {
		return Main.getJProp(setCor);
	}
	public static void setJProp (String setCor,int n) {
		Main.setJProp(setCor, n);
	}
	public static void setJogador (String cor, String nome) {	//recebe uma string com a cor do jogador e o cria. Case Sensitive: Preto, Amarelo, Roxo, Azul, Vermelho, Laranja.
		Main.setJogador(cor, nome);
	}
	public static Jogador getJogador (String cor) {	// retorna o jogador (Jogador.jogador). Se retornar null é que nao encontrou a cor do jogador.
		return Main.getJogador(cor);
	}
	public static void setJPosicao (String cor, int posicao) {	//recebe a cor (String) e posição (int) do jogador. Case Sensitive: Preto, Amarelo, Roxo, Azul, Vermelho, Laranja.
		Main.setJPosicao(cor, posicao);
	}
	public static int getJPosicao (String cor) {	// retorna posição (int) em jogador.posicao (Não faz os calculos). Se retornar -1 é que nao encontrou a cor do jogador.
		return Main.getJPosicao(cor);
	}
	public static int getOrdem(String cor) {
		return Main.getOrdem(cor);
	}
	public static void setOrdem(String cor, int numero) {
		Main.setOrdem(cor, numero);
	}
	public static String getCor(String cor) {
		return Main.getCor(cor);
	}
	public static void setDinheiro(int dinheiro, String Jogador) {
		Main.setDinheiro(dinheiro, Jogador);
	}
	public static int getDinheiro(String Jogador) {
		return Main.getDinheiro(Jogador);
	}
	public static void setTem_liberdade(int setTem_liberdade, String Jogador) {
		Main.setTem_liberdade(setTem_liberdade, Jogador);
	}
	public static int getTem_liberdade(String Jogador) {
		return Main.getTem_liberdade(Jogador);
	}
	public static void setEstado_Preso(int Estado_Preso, String Jogador) {
		Main.setEstado_Preso(Estado_Preso, Jogador);
	}
	public static int getEstado_Preso(String Jogador) {
		return Main.getEstado_Preso(Jogador);
	}
	public static void setJCor(String cor) {//ilogico
		Main.setJCor(cor);
	}
	public static String getJCor() {//ilogico
		return Main.getJCor();
	}
	public static void setJNome(String nome,String Jogador) {
		Main.setJNome(nome, Jogador);
	}
	public static String getJNome(String Jogador) {
		return Main.getJNome(Jogador);
	}
	
	// Class Model.Cartas
	public static int getCEfeitos(int x) {
		return Main.getCEfeitos(x);
	}
	public static int getCBaralho(int x) {
		return Main.getCBaralho(x);
	}
	public static int getCVerificador() {
		return Main.getCVerificador();
	}
	public static void setVerificador(int verifica) {
		Main.setVerificador(verifica);
	}
	public static int getCNum() {//inutil
		return Main.getCNum();
	}
	public static void newC() {
		Main.newC();
	}
	
	// Class Model.Dados
	public static int getDValorD1() {
		return Main.getDValorD1();
	}
	public static int getDValorD2() {
		return Main.getDValorD2();
	}
	public static void setDValorD1(int num) {
		Main.setDValorD1(num);
	}
	public static void setDValorD2(int num) {
		Main.setDValorD2(num);
	}
	public static int getTotal() {
		return Main.getTotal();
	}
	public static void setTotal(int num) {
		Main.setTotal(num);
	}
	public static int getPrison() {
		return Main.getPrison();
	}
	public static void setPrison(int nprison) {
		Main.setPrison(nprison);
	}
	public static int getIguais() {
		return Main.getIguais();
	}
	public static void reroll() {
		Main.reroll();
	}
	
	// Class Model.Espaço
	public static void setNcasas(int ncasas,int i) {
		Main.setNcasas(ncasas,i);
	}
	public static int getNcasas(int i) {
		return Main.getNcasas(i);
	}
	public static int getHotel(int i) {
		return Main.getHotel(i);
	}
	public static void setHotel(int hotel,int i) {
		Main.setHotel(hotel,i);
	}
	public static String getECor(int i) {
		return Main.getECor(i);
	}
	public static void setECor(String cor,int i) {
		Main.setECor(cor,i);
	}
	public static String getDono(int i) {
		return Main.getDono(i);
	}
	public static void setDono(String dono,int i) {
		Main.setDono(dono,i);
	}
	public static String getNome(int i) {
		return Main.getNome(i);
	}
	public static void setNome(String nome,int i) {
		Main.setNome(nome,i);
	}
	public static int getEAluguel(int pos,int i) {
		return Main.getEAluguel(pos,i);
	}
	public static void setEAluguel(int pos, int vAluguel,int i) {
		Main.setEAluguel(pos,vAluguel, i);
	}
	public static void pagaAluguelCasaHotel (String j, String jx, int nSomaDados) {
		Main.pagaAluguelCasaHotel(j,jx,nSomaDados);
	}
	
	// Class Model.Tabuleiro
	public static void setBanco(int banco) {
		Main.setBanco(banco);
	}
	public static int getBanco() {
		return Main.getBanco();
	}
	public static void setEstado(int estado) {//inutil
		Main.setEstado(estado);
	}
	public static int getEstado() {//inutil
		return Main.getEstado();
	}
	public static String getTTabNome(int pos) {
		return Main.getTTabNome(pos);
	}
	public static String getTTabDono(int pos) {
		return Main.getTTabDono(pos);
	}
	public static void setTTabDono(int pos, String nome) {
		Main.setTTabDono(pos, nome);
	}
}
