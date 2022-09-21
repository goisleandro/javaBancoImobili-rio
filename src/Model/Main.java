// Paulo Vinicius de Lima Britto - 1812157 
// Pedro Machado - 2020711
// Leandro Gois - 1811601

package Model;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.*;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import Control.Controller;


class Main {
	
	static Jogador preto, amarelo, roxo, azul, vermelho, laranja;
	static Cartas c = new Cartas();
	static Dados d = new Dados();
	static Espaço e = new Espaço();
	static Jogador w = new Jogador();
	//static Main m = new Main();
	static Tabuleiro t = new Tabuleiro();
	
	static PrintWriter grava;
	static FileWriter arq;
	static String linha = new String();
	
	static void carregaJogo() throws IOException {
		String caminho = procuraArquivo(0);
		FileReader arq = new FileReader(caminho);
		BufferedReader lerArq = new BufferedReader(arq);
		int i = 0, k = 1, tam, j=0, m=0, pos, tamanho;
		String cor;
		
		linha = lerArq.readLine();							// getRepete()
		Controller.setRepete(Integer.parseInt(linha));
		linha = lerArq.readLine();							// getTurno()
		Controller.setTurno(Integer.parseInt(linha));
		linha = lerArq.readLine();							// getTurno2()
		Controller.setTurno2(Integer.parseInt(linha));
		linha = lerArq.readLine();							// setQtdPlayers()
		Controller.setQtdPlayers(Integer.parseInt(linha));
		linha = lerArq.readLine();							// setBanco()
		Controller.setBanco(Integer.parseInt(linha));
		while(j<Controller.getQtdPlayers()) {
			linha = lerArq.readLine();
			if(linha.equals("Preto")) {
				Controller.setVez(j, "Preto");
				Controller.setJogador("Preto","");
			}else if(linha.equals("Amarelo")) {
				Controller.setVez(j, "Amarelo");
				Controller.setJogador("Amarelo","");
			}else if(linha.equals("Azul")) {
				Controller.setVez(j, "Azul");
				Controller.setJogador("Azul","");
			}else if(linha.equals("Roxo")) {
				Controller.setVez(j, "Roxo");
				Controller.setJogador("Roxo","");
			}else if(linha.equals("Vermelho")) {
				Controller.setVez(j, "Vermelho");
				Controller.setJogador("Vermelho","");
			}else if(linha.equals("Laranja")) {
				Controller.setVez(j, "Laranja");
				Controller.setJogador("Laranja","");
			}
	    	j++;
	    }
		while(m<12) {
			linha = lerArq.readLine();
	    	Controller.setPosicaoini(m, Integer.parseInt(linha));
	    	m++;
	    }
		while(i<Controller.getQtdPlayers()) {
			linha = lerArq.readLine();
			Controller.setJNome(linha, Controller.getVez(i));
			linha = lerArq.readLine();							// setPrision
			Controller.setPrison(Integer.parseInt(linha));
			linha = lerArq.readLine();
			Controller.setJPosicao(Controller.getVez(i), Integer.parseInt(linha));
			linha = lerArq.readLine();
			Controller.setDinheiro(Integer.parseInt(linha), Controller.getVez(i));
			linha = lerArq.readLine();
			Controller.setEstado_Preso(Integer.parseInt(linha), Controller.getVez(i));
			linha = lerArq.readLine();
			Controller.setTem_liberdade(Integer.parseInt(linha), Controller.getVez(i));
			linha = lerArq.readLine();
			Controller.setJProp(Controller.getVez(i), Integer.parseInt(linha));
	    	++i;
		}
		while(k<40) {
			linha = lerArq.readLine();
			Controller.setNcasas(Integer.parseInt(linha), k);
			linha = lerArq.readLine();
			Controller.setHotel(Integer.parseInt(linha), k);
			linha = lerArq.readLine();
			if(linha.equals("Preto")) {
				Controller.setDono("Preto", k);
			}else if(linha.equals("Amarelo")) {
				Controller.setDono("Amarelo", k);
			}else if(linha.equals("Azul")) {
				Controller.setDono("Azul", k);
			}else if(linha.equals("Roxo")) {
				Controller.setDono("Roxo", k);
			}else if(linha.equals("Vermelho")) {
				Controller.setDono("Vermelho", k);
			}else if(linha.equals("Laranja")) {
				Controller.setDono("Laranja", k);
			}
			Controller.setDono(linha, k);
    		++k;
	    }
		arq.close();
	}
	
	static void salvaJogo(int qtdPlayers, String[] vez,int turno,int turno2,int repete,int [] posicaoini) throws IOException {
		String caminho = procuraArquivo(1);
		FileWriter arq = new FileWriter(caminho);
		grava = new PrintWriter(arq);
	    int i = 0, k = 1, tam = 0,j=0,m=0;
	    grava.println(repete);
	    grava.println(turno);
	    grava.println(turno2);
	    grava.println(qtdPlayers);
	    grava.println(Controller.getBanco());
	    while(j<qtdPlayers) {
	    	grava.println(vez[j]);
	    	j++;
	    }
	    while(m<12) {
	    	grava.println(posicaoini[m]);
	    	m++;
	    }
	    while(i<qtdPlayers) {
	    	grava.println(Controller.getJNome(vez[i]));
	    	grava.println(Controller.getPrison());
	    	grava.println(Controller.getJPosicao(vez[i]));
	    	grava.println(Controller.getDinheiro(vez[i]));
	    	grava.println(Controller.getEstado_Preso(vez[i]));
	    	grava.println(Controller.getTem_liberdade(vez[i]));
	    	while(k<40) {
				if ( Controller.getTTabDono(k) == vez[i]) {
					tam++;
				}
				++k;
			}
			grava.println(tam); 
			k=1;
	    	++i;
	    }
	    while(k<40) {
    		grava.println(Controller.getNcasas(k));
    		grava.println(Controller.getHotel(k));
    		grava.println(Controller.getDono(k));
    		++k;
	    }
	    arq.close();
	}
	
	static String procuraArquivo(int x) { 	// x==1: salvar // x==0: carregar
		int retorno=-1;
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos de texto (.txt)", "txt");
		
		String diretorioBase = System.getProperty("user.home")+"/Desktop";
		File dir = new File(diretorioBase);
		
		JFileChooser escolha = new JFileChooser();
		escolha.setCurrentDirectory(dir);
		escolha.setFileSelectionMode(JFileChooser.FILES_ONLY);
		escolha.setAcceptAllFileFilterUsed(false);
		escolha.addChoosableFileFilter(filtro);
		String caminhoArquivo = "";
		if (x==1) {
			retorno = escolha.showSaveDialog(null);
		}else if (x==0) {
			retorno = escolha.showOpenDialog(null);
		}
		if(retorno == JFileChooser.APPROVE_OPTION) {
			return caminhoArquivo = escolha.getSelectedFile().getAbsolutePath();
		}else {
			return null;
		}
	}
	
	static Jogador getJogador (String cor) {			
		switch(cor) {
		  case "Preto":
			  return preto;
		  case "Amarelo":
			  return amarelo;
		  case "Roxo":
			  return roxo;
		  case "Azul":
			  return azul;
		  case "Vermelho":
			  return vermelho;
		  case "Laranja":
			  return laranja;
		  default:
		}
		return null;
	}
	
	static void setJogador (String setCor, String setNome) {
		switch(setCor) {
		  case "Preto":
			  preto = new Jogador(setCor, setNome);
		    break;
		  case "Amarelo":
			  amarelo = new Jogador(setCor, setNome);
		    break;
		  case "Roxo":
			  roxo = new Jogador(setCor, setNome);
			break;
		  case "Azul":
			  azul = new Jogador(setCor, setNome);
			break;
		  case "Vermelho":
			  vermelho = new Jogador(setCor, setNome);
			break;
		  case "Laranja":
			  laranja = new Jogador(setCor, setNome);
			break;
		  default:
		    //System.out.println("setJogador: Jogador "+setCor+" não pode ser criado. Jogo será finalizado.");
		    //System.exit(1);
		}
	}
	
	static void setJPosicao (String setCor, int setPosicao) {
		switch(setCor) {
		  case "Preto":
//			  System.out.println(preto.getPosicao()+" "+amarelo.getPosicao()+" "+roxo.getPosicao()+" "+azul.getPosicao()+" "+vermelho.getPosicao()+" "+laranja.getPosicao());
			  preto.setPosicao(setPosicao);
//			  System.out.println(preto.getPosicao()+" "+amarelo.getPosicao()+" "+roxo.getPosicao()+" "+azul.getPosicao()+" "+vermelho.getPosicao()+" "+laranja.getPosicao());
		    break;
		  case "Amarelo":
			  amarelo.setPosicao(setPosicao);
		    break;
		  case "Roxo":
			  roxo.setPosicao(setPosicao);
			break;
		  case "Azul":
			  azul.setPosicao(setPosicao);
			break;
		  case "Vermelho":
			  vermelho.setPosicao(setPosicao);
			break;
		  case "Laranja":
			  laranja.setPosicao(setPosicao);
			break;
		  default:
		    //System.out.println("setJPosicao: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
	}
	
	static int getJPosicao (String setCor) {
		switch(setCor) {
		  case "Preto":
			  return preto.getPosicao();
		  case "Amarelo":
			  return amarelo.getPosicao();
		  case "Roxo":
			  return roxo.getPosicao();
		  case "Azul":
			  return azul.getPosicao();
		  case "Vermelho":
			  return vermelho.getPosicao();
		  case "Laranja":
			  return laranja.getPosicao();
		  default:
		    //System.out.println("getJPosicao: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
		return -1;
	}
	
	static int getOrdem (String setCor) {
		switch(setCor) {
		  case "Preto":
			  //System.out.println(preto.getOrdem());
			  return preto.getOrdem();
		  case "Amarelo":
			  //System.out.println(amarelo.getOrdem());
			  return amarelo.getOrdem();
		  case "Roxo":
			  //System.out.println(roxo.getOrdem());
			  return roxo.getOrdem();
		  case "Azul":
			  //System.out.println(azul.getOrdem());
			  return azul.getOrdem();
		  case "Vermelho":
			  //System.out.println(vermelho.getOrdem());
			  return vermelho.getOrdem();
		  case "Laranja":
			  //System.out.println(laranja.getOrdem());
			  return laranja.getOrdem();
		  default:
		    //System.out.println("getOrdem: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
		return -1;
	}
	
	public static void setOrdem(String setCor, int numero) {
		switch(setCor) {
		  case "Preto":
			  preto.setOrdem(numero);
		    break;
		  case "Amarelo":
			  amarelo.setOrdem(numero);
		    break;
		  case "Roxo":
			  roxo.setOrdem(numero);
			break;
		  case "Azul":
			  azul.setOrdem(numero);
			break;
		  case "Vermelho":
			  vermelho.setOrdem(numero);
			break;
		  case "Laranja":
			  laranja.setOrdem(numero);
			break;
		  default:
		    //System.out.println("setOrdem: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
	}
	
	static String getNome (String setCor) {
		switch(setCor) {
		  case "Preto":
			  return preto.getJNome();
		  case "Amarelo":
			  return amarelo.getJNome();
		  case "Roxo":
			  return roxo.getJNome();
		  case "Azul":
			  return azul.getJNome();
		  case "Vermelho":
			  return vermelho.getJNome();
		  case "Laranja":
			  return laranja.getJNome();
		  default:
		    //System.out.println("getNome: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
		return setCor;
	}
	
	static String getCor (String setCor) {
		switch(setCor) {
		  case "Preto":
			  return preto.getJCor();
		  case "Amarelo":
			  return amarelo.getJCor();
		  case "Roxo":
			  return roxo.getJCor();
		  case "Azul":
			  return azul.getJCor();
		  case "Vermelho":
			  return vermelho.getJCor();
		  case "Laranja":
			  return laranja.getJCor();
		  default:
		    //System.out.println("getCor: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
		return setCor;
	}
	
	static int getJProp (String setCor) {
		switch(setCor) {
		  case "Preto":
			  return preto.getJProp();
		  case "Amarelo":
			  return amarelo.getJProp();
		  case "Roxo":
			  return roxo.getJProp();
		  case "Azul":
			  return azul.getJProp();
		  case "Vermelho":
			  return vermelho.getJProp();
		  case "Laranja":
			  return laranja.getJProp();
		  default:
		    //System.out.println("getCor: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
		return -1;
	}
	
	static void setJProp (String setCor,int n) {
		switch(setCor) {
		  case "Preto":
			  preto.setJProp(n);
			  break;
		  case "Amarelo":
			  amarelo.setJProp(n);
			  break;
		  case "Roxo":
			  roxo.setJProp(n);
			  break;
		  case "Azul":
			  azul.setJProp(n);
			  break;
		  case "Vermelho":
			  vermelho.setJProp(n);
			  break;
		  case "Laranja":
			  laranja.setJProp(n);
			  break;
		  default:
		    //System.out.println("getCor: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
	}
	
	static void pagaValorImovel (Tabuleiro t, Jogador j) {
		j.setDinheiro(j.getDinheiro()-t.Tab[j.getPosicao()].aluguel[6]);
		t.banco+=t.Tab[j.getPosicao()].aluguel[6];
		System.out.println("Você pagou "+t.Tab[j.getPosicao()].aluguel[6]+" por construir este imóvel.");
	}
	
	static void custoPropriedade(Jogador j, String c){
		int total, aluguel = Controller.getEAluguel(Controller.getNcasas(Controller.getJPosicao(c)), Controller.getJPosicao(c));
		System.out.println("Esta propriedade é do jogador "+Controller.getDono(Controller.getJPosicao(c))+".");
		if(Controller.getNcasas(Controller.getJPosicao(c))==0)
			System.out.println("O aluguel do Terreno custa: "+aluguel);
		else {
			if(Controller.getNcasas(Controller.getJPosicao(c))>0) {
				System.out.println("O aluguel da(s) "+Controller.getNcasas(Controller.getJPosicao(c))+" Casa(s) custa(m): "+aluguel);
			}
			if(Controller.getHotel(Controller.getJPosicao(c))==1) {
				total = ( aluguel+ Controller.getEAluguel(5, Controller.getJPosicao(c)) );
				System.out.println( "O aluguel do Hotel custa: "+Controller.getEAluguel(5, Controller.getJPosicao(c)) );
				System.out.printf("Seu gasto total nesta propriedade foi de: %d\n", total);
			}
		}
	}
	
	static void pagaAluguelCasaHotel (String c, String cx, int nSomaDados) {
		Jogador j = Facade.getJogador(c);
		Jogador jx = Facade.getJogador(cx);
		
		int jPosicao = Controller.getJPosicao(c), jPosicao2 = Controller.getJPosicao(c), tNCasas=Controller.getNcasas(Controller.getJPosicao(c));
		
		if(Controller.getECor(jPosicao)=="cinza") {
			System.out.println("Terreno "+Controller.getNome(Controller.getJPosicao(c))+" pertence ao jogador "+jPosicao2+" ("+cx+"), ele receberá de você "+(Controller.getEAluguel(0, jPosicao)*nSomaDados)+".");
			Controller.setDinheiro(Controller.getDinheiro(cx)+(Controller.getEAluguel(0, jPosicao)*nSomaDados), cx);
			Controller.setDinheiro(Controller.getDinheiro(c) -(Controller.getEAluguel(0, jPosicao)*nSomaDados), c);
		}
		else {
			custoPropriedade(j, c);
			if (Controller.getHotel(jPosicao)==0) {
				Controller.setDinheiro(Controller.getDinheiro(cx)+(Controller.getEAluguel(tNCasas, jPosicao)), cx);
				Controller.setDinheiro(Controller.getDinheiro(c) -(Controller.getEAluguel(tNCasas, jPosicao)), c);
			} else {
				Controller.setDinheiro(Controller.getDinheiro(cx)+(Controller.getEAluguel(tNCasas, jPosicao)+Controller.getEAluguel(5, jPosicao)), cx);
				Controller.setDinheiro(Controller.getDinheiro(c) -(Controller.getEAluguel(tNCasas, jPosicao)+Controller.getEAluguel(5, jPosicao)), c);
			}
		}
	}
	
	static void rodada(Jogador j, Tabuleiro t, Cartas c,Jogador j1,Jogador j2,Jogador j3,Jogador j4,Jogador j5,Jogador j6, int qtd) {	
		if(t.estado==0) {
			System.out.println("Vez do jogador: "+j.getJCor()+". Dinheiro disponível: "+j.getDinheiro()+". Posição atual: "+j.getPosicao());

			// Condição falido //
			if(j.getDinheiro()<=0) {
				return;
			}
			
			/////// Rolando os Dados ///////
			Dados d= new Dados();
			j.setPosicao(j.getPosicao()+d.total);
			
			// Tratamento de prisão 1//	
			if(j.getEstado_Preso()==1 && j.getTem_liberdade()==1) {
				j.setEstado_Preso(0);
				j.setTem_liberdade(0);
				System.out.println("Jogador "+j.getJCor()+" usa a carta saída livre da prisão.");
			}
			
			System.out.printf("Rolando os dados: 1º Dado: "+d.valorD1+" | 2º Dado: "+d.valorD2+" | Valor final: "+d.total);
			if(j.getPosicao()>39) {
				j.setPosicao(j.getPosicao()-40);
				j.setDinheiro(j.getDinheiro()+200);
				System.out.println(" | Nova posição: "+j.getPosicao()+"\nPassou o ponto de Partida! Jogador recebe + $200 do banco. Dinheiro atualizado = "+j.getDinheiro());
				t.banco-=200;
			}else {				
				if(j.getEstado_Preso()==0)
					System.out.println(" | Nova posição: "+j.getPosicao());
			}
			if(j.getEstado_Preso()==0)
				System.out.println("Jogador "+j.getJCor()+" caiu no terreno: "+t.Tab[j.getPosicao()].nome);
			if(j.getPosicao()==30) {
				j.setEstado_Preso(1);
				j.setPosicao(10);
				d.setPrison(0);
				////pressioneEnter();
				return;
			}
			
			if(d.getIguais()!=0) {	//tirou dupla! --> d.prison++
				if(d.getPrison()==1) {
					if(j.getEstado_Preso()==1) {
						System.out.println("Liberdade! Jogador tirou dupla nos dados, acumulou 1 dupla e se somar 3 seguidas voltará para a prisão.");
					} else {
						System.out.println("Jogador tem 1 dupla acumulada, se somar 3 vai para a prisão.");
						j.setEstado_Preso(0);
					}
				}
				if(d.getPrison()==2) {
					System.out.println("Jogador tem 2 duplas acumuladas, se somar 3 vai para a prisão.");
					j.setEstado_Preso(0);
				}
				if(d.getPrison()==3) {
					j.setEstado_Preso(1);
					j.setPosicao(10);	
					d.setPrison(0);
					System.out.println(j.getJCor()+" foi para a prisão, tirou 3 duplas seguidas.");
					//pressioneEnter();
					return;
				}
			}
			
			// Tratamento de prisão 2//
			if(j.getEstado_Preso()==1 && j.getTem_liberdade()==0) {
				if(d.getIguais()==1) {
					j.setEstado_Preso(0);
					d.setPrison(1);
					System.out.println("Jogador tirou uma dupla e está livre! Ficou 1 rodada preso.");
					System.out.println("Jogador tem 1 dupla acumulada, se somar 3 volta para a prisão.");
				}
				else {
					System.out.println("Jogador preso por 1 rodada.");
					j.setEstado_Preso(j.getEstado_Preso()+1);
					j.setPosicao(10);
					//pressioneEnter();
					return;
				}
				
			}
			if(j.getEstado_Preso()==2) {
				if(d.getIguais()==1) {
					j.setEstado_Preso(0);
					d.setPrison(1);
					System.out.println("Jogador tirou uma dupla e está livre! Ficou 2 rodadas preso.");
					System.out.println("Jogador tem 1 dupla acumulada, se somar3 volta para a prisão.");
				}
				else {
					j.setEstado_Preso(j.getEstado_Preso()+1);
					d.setPrison(0);
					j.setPosicao(10);
					System.out.println("Jogador preso por 2 rodadas.");
					//pressioneEnter();
					return;	
				}
			}
			if(j.getEstado_Preso()==3) {
				if(d.getIguais()==1) {
					j.setEstado_Preso(0);
					d.setPrison(1);
					System.out.println("Jogador tirou uma dupla e está livre! Ficou 3 rodadas preso.");
					System.out.println("Jogador tem 1 dupla acumulada, se somar 3 volta para a prisão.");
				}
				else {
					j.setEstado_Preso(j.getEstado_Preso()+1);
					d.setPrison(0);
					j.setPosicao(10);
					System.out.println("Jogador preso por 3 rodadas. Será libertado na próxima rodada.");
					//pressioneEnter();
					return;
				}
			}
			if(j.getEstado_Preso()==4){
				j.setEstado_Preso(0);
				t.banco+=50;
				j.setDinheiro(j.getDinheiro()-50);
				System.out.println("Jogador "+j.getJCor()+" cumpriu seu tempo na prisão, pagou $50 de multa e está livre.");
				System.out.println("Jogador "+j.getJCor()+" caiu no terreno: "+t.Tab[j.getPosicao()].nome);
			}
			
			///  Position ////
			if(t.Tab[j.getPosicao()].dono == "Prisao") {
				j.setEstado_Preso(1);
			}
			else if(t.Tab[j.getPosicao()].dono == "Nada") {	
			}
			else if(t.Tab[j.getPosicao()].dono == "Lucros") {
				System.out.println("Jogador ganhou $200.");
				t.banco-=200;
				j.setDinheiro(j.getDinheiro()+200);
			}
			else if(t.Tab[j.getPosicao()].dono == "Imposto") {
				System.out.println("Jogador perdeu $200.");
				t.banco+=200;
				j.setDinheiro(j.getDinheiro()-200);
			}
			else if(t.Tab[j.getPosicao()].dono == "void") {
				Scanner ent=new Scanner(System.in);
				System.out.printf("Você gostaria de comprar este terreno? ($"+t.Tab[j.getPosicao()].aluguel[7]+") Você possui em sua conta $"+j.getDinheiro()+" ");
				String escolha= ent.nextLine();
				if(escolha.equals("Sim")||escolha.equals("sim")||escolha.equals("S")||escolha.equals("s")) {	
					System.out.println("Propriedade comprada: Pagou: "+t.Tab[j.getPosicao()].aluguel[7]);
					t.Tab[j.getPosicao()].dono = j.getJCor();
					j.setDinheiro(j.getDinheiro()-t.Tab[j.getPosicao()].aluguel[7]);
					t.banco+=t.Tab[j.getPosicao()].aluguel[7];
				}
			}
			else if(t.Tab[j.getPosicao()].dono == "Preto") {
				//terrenoCompraOuAluguel (j, j1, d.total);
			}
			else if(t.Tab[j.getPosicao()].dono == "Amarelo") {
				//terrenoCompraOuAluguel (j, j2, d.total);
			}
			else if(t.Tab[j.getPosicao()].dono == "Roxo") {
				//terrenoCompraOuAluguel (j, j3, d.total);
			}
			else if(t.Tab[j.getPosicao()].dono == "Azul") {
				//terrenoCompraOuAluguel (j, j4, d.total);
			}
			else if(t.Tab[j.getPosicao()].dono == "Vermelho") {
				//terrenoCompraOuAluguel (j, j5, d.total);
			}
			else if(t.Tab[j.getPosicao()].dono == "Laranja") {
				//terrenoCompraOuAluguel (j, j6, d.total);
			}
			else if(t.Tab[j.getPosicao()].dono == "SorteRevez") {
				if(c.efeitos[c.baralho[c.verificador]]<500) {
					if(c.efeitos[c.baralho[c.verificador]]>0) {
						System.out.println("Voce recebeu: "+c.efeitos[c.baralho[c.verificador]]);
					}else {
						System.out.println("Você pagou: "+c.efeitos[c.baralho[c.verificador]]);
					}
					j.setDinheiro(j.getDinheiro()+c.efeitos[c.baralho[c.verificador]]);
					t.banco-=c.efeitos[c.baralho[c.verificador]];
					c.verificador++;
					if(c.verificador==29) {
						c=new Cartas();
					}
				}
				else if(c.efeitos[c.baralho[c.verificador]]==500) {		//Pegou passe livre da prisão
					System.out.println("Saída livre da prisão. Guarde este cartão com você.");
					j.setTem_liberdade(1);
					c.verificador++;
					if(c.verificador==29) {
						c=new Cartas();
					}
				}
				else if(c.efeitos[c.baralho[c.verificador]]==550) {		//Receba 50 de cada um
					j.setDinheiro(j.getDinheiro()+50*qtd);
					System.out.println("Você apostou com os parceiros deste jogo e ganhou. Receba $50 de cada um.");
					switch (qtd) {
						case 2:
							if(j.getJCor()==j1.getJCor())			retira50 (j2);
							else						retira50 (j1);
						break;
						case 3:
							if(j.getJCor()==j1.getJCor()) {	 		retira50 (j2, j3);
							}else if(j.getJCor()==j2.getJCor()) { 	retira50 (j1, j3);
							}else { 					retira50 (j1, j2);
							}
						break;
						case 4:
							if(j.getJCor()==j1.getJCor()) { 		retira50 (j2, j3, j4);
							}else if(j.getJCor()==j2.getJCor()) { 	retira50 (j1, j3, j4);
							}else if(j.getJCor()==j3.getJCor()){ 	retira50 (j1, j2, j4);
							}else{ 						retira50 (j1, j2, j3);
							}
						break;
						case 5:
							if(j.getJCor()==j1.getJCor()) { 		retira50 (j2, j3, j4, j5);
							}else if(j.getJCor()==j2.getJCor()) { 	retira50 (j1, j3, j4, j5);
							}else if(j.getJCor()==j3.getJCor()){ 	retira50 (j1, j2, j4, j5);
							}else if(j.getJCor()==j4.getJCor()){ 	retira50 (j1, j2, j3, j5);
							}else{ 						retira50 (j1, j2, j3, j4);
							}
						break;
						case 6:
							if(j.getJCor()==j1.getJCor()) { 		retira50 (j2, j3, j4, j5, j6);
							}else if(j.getJCor()==j2.getJCor()) { 	retira50 (j1, j3, j4, j5, j6);
							}else if(j.getJCor()==j3.getJCor()){ 	retira50 (j1, j2, j4, j5, j6);
							}else if(j.getJCor()==j4.getJCor()){ 	retira50 (j1, j2, j3, j5, j6);
							}else if(j.getJCor()==j5.getJCor()){	retira50 (j1, j2, j3, j4, j6);
							}else{ 						retira50 (j1, j2, j3, j4, j5);
							}
						break;
						default:
							//System.out.println("Erro no sorte/revez: Receba 50 de cada um.");
					}
					c.verificador++;
					if(c.verificador==29) {
						c=new Cartas();
					}
				}
				else if(c.efeitos[c.baralho[c.verificador]]==600) {		//Go to the prison
					System.out.println("Vá para a prisão sem receber nada. (Talvez eu lhe faça uma visita...)");
					j.setEstado_Preso(1);
					j.setPosicao(10);
					c.verificador++;
					if(c.verificador==29) {
						c=new Cartas();
					}
					if(d.getIguais()!=0) {
						d.setPrison(d.getPrison() - 1);
						System.out.println("\nComo o jogador "+j.getJCor()+" tirou números iguais, vai jogar novamente.");
						//pressioneEnter();
						rodada(j,t,c,j1,j2,j3,j4,j5,j6, qtd);
					}
					return;
				}
			}

			if(d.getIguais()!=0) {
				d.setPrison(d.getPrison() - 1);
				System.out.println("\n"+j.getJCor()+" tirou números iguais e jogará novamente. Você possui na conta $"+j.getDinheiro() );
				//pressioneEnter();
				rodada(j,t,c,j1,j2,j3,j4,j5,j6, qtd);
			}
			else {
				System.out.println("Fim do turno do Jogador "+j.getJCor()+". Quantidade atualizada da conta: $"+j.getDinheiro() );
				//pressioneEnter();
			}
		}
	}
	
	static void retira50 (Jogador x) {
		x.setDinheiro(x.getDinheiro()-50);
	}
	
	static void retira50 (Jogador x, Jogador y) {
		x.setDinheiro(x.getDinheiro()-50); y.setDinheiro(x.getDinheiro()-50);
	}
	
	static void retira50 (Jogador x, Jogador y, Jogador z) {
		x.setDinheiro(x.getDinheiro()-50); y.setDinheiro(x.getDinheiro()-50);	z.setDinheiro(x.getDinheiro()-50);
	}
	
	static void retira50 (Jogador x, Jogador y, Jogador z, Jogador w) {
		x.setDinheiro(x.getDinheiro()-50);	y.setDinheiro(x.getDinheiro()-50);	z.setDinheiro(x.getDinheiro()-50);	w.setDinheiro(x.getDinheiro()-50);
	}
	
	static void retira50 (Jogador x, Jogador y, Jogador z, Jogador w, Jogador k) {
		x.setDinheiro(x.getDinheiro()-50); y.setDinheiro(x.getDinheiro()-50);	z.setDinheiro(x.getDinheiro()-50);	w.setDinheiro(x.getDinheiro()-50);	k.setDinheiro(x.getDinheiro()-50);
	}
	
	// Class Model.Cartas
	static int getCEfeitos(int x) {
		return c.getCEfeitos(x);
	}
	
	static int getCBaralho(int x) {
		return c.getCBaralho(x);
	}
	
	static int getCVerificador() {
		return c.getCVerificador();
	}
	static void setVerificador(int verifica) {
		c.setVerificador(verifica);
		return;
	}
	
	static void newC() {
		c=new Cartas();
		return;
	}
	
	static int getCNum() {
		return c.getCNum();
	}
	
	// Class Model.Dados
	static int getDValorD1() {
		return d.getDValorD1();
	}
	static int getDValorD2() {
		return d.getDValorD2();
	}
	static void setDValorD1(int num) {
		d.setDValorD1(num);
	}
	static void setDValorD2(int num) {
		d.setDValorD2(num);
	}
	static int getTotal() {
		return d.getTotal();
	}
	static void setTotal(int num) {
		d.setTotal(num);
	}
	static int getPrison() {
		return d.getPrison();
	}
	static void setPrison(int nprison) {
		d.setPrison(nprison);
		return;
	}
	static int getIguais() {
		return d.getIguais();
	}
	static void reroll() {
		d.reroll();
		//d=new Dados();
		return ;
	}
	
	// Class Model.Espaço
	static int getNcasas(int i) {
		return t.Tab[i].getNcasas();
	}
	static void setNcasas(int ncasas,int i) {
		t.Tab[i].setNcasas(ncasas);
		return ;
	}
	static int getHotel(int i) {
		return t.Tab[i].getHotel();
	}
	static void setHotel(int hotel,int i) {
		t.Tab[i].setHotel(hotel);
		return ;
	}
	static String getECor(int i) {
		return t.Tab[i].getECor();
	}
	static void setECor(String cor,int i) {
		t.Tab[i].setECor(cor);
		return ;
	}
	static String getDono(int i) {
		return t.Tab[i].getDono();
	}
	static void setDono(String dono,int i) {
		t.Tab[i].setDono(dono);
		return ;
	}
	static String getNome(int i) {
		return t.Tab[i].getNome();
	}
	static void setNome(String nome,int i) {
		t.Tab[i].setNome(nome);
		return ;
	}
	static int getEAluguel(int pos,int i) {
		return t.Tab[i].aluguel[pos];
	}
	static void setEAluguel(int pos, int vAluguel,int i) {
		t.Tab[i].aluguel[pos] = vAluguel;
		return ;
	}
	
	// Class Model.Tabuleiro
	static void setBanco(int banco) {
		t.setBanco(banco);
		return ;
	}
	static int getBanco() {
		return t.getBanco();
	}	
	static void setEstado(int estado) {
		t.setEstado(estado);
		return ;
	}	
	static int getEstado() {
		return t.getEstado();
	}
	static String getTTabNome(int pos) {
		return t.getTTabNome(pos);
	}
	static String getTTabDono(int pos) {
		return t.getTTabDono(pos);
	}
	static void setTTabDono(int pos, String nome) {
		t.setTTabDono(pos, nome);
	}
		
	// Class Model.Jogador
	static void setJCor(String cor) {
		w.setJCor(cor);
		return ;
	}
	static String getJCor() {
		return w.getJCor();
	}
	static void  setJNome(String nome, String setCor) {
		switch(setCor) {
		  case "Preto":
			  preto.setJNome(nome);
			  return ;
		  case "Amarelo":
			  amarelo.setJNome(nome);
			  return ;
		  case "Roxo":
			  roxo.setJNome(nome);
			  return ;
		  case "Azul":
			  azul.setJNome(nome);
			  return ;
		  case "Vermelho":
			  vermelho.setJNome(nome);
			  return ;
		  case "Laranja":
			  laranja.setJNome(nome);
			  return ;
		  default:
		    //System.out.println("setJNome: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
	}
	static String getJNome(String setCor) {
		switch(setCor) {
		  case "Preto":
			  return preto.getJNome();
		  case "Amarelo":
			  return amarelo.getJNome();
		  case "Roxo":
			  return roxo.getJNome();
		  case "Azul":
			  return azul.getJNome();
		  case "Vermelho":
			  return vermelho.getJNome();
		  case "Laranja":
			  return laranja.getJNome();
		  default:
		    //System.out.println("getJNome: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
		return null;
	}
	static void setDinheiro(int dinheiro,String Jogador) {
		switch(Jogador) {
		  case "Preto":
			  preto.setDinheiro(dinheiro);
			  return ;
		  case "Amarelo":
			  amarelo.setDinheiro(dinheiro);
			  return ;
		  case "Roxo":
			  roxo.setDinheiro(dinheiro);
			  return ;
		  case "Azul":
			  azul.setDinheiro(dinheiro);
			  return ;
		  case "Vermelho":
			  vermelho.setDinheiro(dinheiro);
			  return ;
		  case "Laranja":
			  laranja.setDinheiro(dinheiro);
			  return ;
		  default:
		    //System.out.println("setDinheiro: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
	}
	static int getDinheiro(String setCor) {
		switch(setCor) {
		  case "Preto":
			  return preto.getDinheiro();
		  case "Amarelo":
			  return amarelo.getDinheiro();
		  case "Roxo":
			  return roxo.getDinheiro();
		  case "Azul":
			  return azul.getDinheiro();
		  case "Vermelho":
			  return vermelho.getDinheiro();
		  case "Laranja":
			  return laranja.getDinheiro();
		  default:
		    //System.out.println("getDinheiro: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
		return -1;
	}
	static void setTem_liberdade(int setTem_liberdade, String setCor) {
		switch(setCor) {
		  case "Preto":
			  preto.setTem_liberdade(setTem_liberdade);
			  return ;
		  case "Amarelo":
			  amarelo.setTem_liberdade(setTem_liberdade);
			  return ;
		  case "Roxo":
			  roxo.setTem_liberdade(setTem_liberdade);
			  return ;
		  case "Azul":
			  azul.setTem_liberdade(setTem_liberdade);
			  return ;
		  case "Vermelho":
			  vermelho.setTem_liberdade(setTem_liberdade);
			  return ;
		  case "Laranja":
			  laranja.setTem_liberdade(setTem_liberdade);
			  return ;
		  default:
		    //System.out.println("setTem_liberdade: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
	}
	static int getTem_liberdade(String setCor) {
		switch(setCor) {
		  case "Preto":
			  return preto.getTem_liberdade();
		  case "Amarelo":
			  return amarelo.getTem_liberdade();
		  case "Roxo":
			  return roxo.getTem_liberdade();
		  case "Azul":
			  return azul.getTem_liberdade();
		  case "Vermelho":
			  return vermelho.getTem_liberdade();
		  case "Laranja":
			  return laranja.getTem_liberdade();
		  default:
		    //System.out.println("getTem_liberdade: Jogador "+setCor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
		return -1;
	}
	static void setEstado_Preso(int Estado_Preso, String cor) {
		switch(cor) {
		  case "Preto":
			  preto.setEstado_Preso(Estado_Preso);
			  return ;
		  case "Amarelo":
			  amarelo.setEstado_Preso(Estado_Preso);
			  return ;
		  case "Roxo":
			  roxo.setEstado_Preso(Estado_Preso);
			  return ;
		  case "Azul":
			  azul.setEstado_Preso(Estado_Preso);
			  return ;
		  case "Vermelho":
			  vermelho.setEstado_Preso(Estado_Preso);
			  return ;
		  case "Laranja":
			  laranja.setEstado_Preso(Estado_Preso);
			  return ;
		  default:
		    //System.out.println("setTem_liberdade: Jogador "+cor+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
	}
	static int getEstado_Preso(String cor) {
		switch(cor) {
		  case "Preto":
			  return preto.getEstado_Preso();
		  case "Amarelo":
			  return amarelo.getEstado_Preso();
		  case "Roxo":
			  return roxo.getEstado_Preso();
		  case "Azul":
			  return azul.getEstado_Preso();
		  case "Vermelho":
			  return vermelho.getEstado_Preso();
		  case "Laranja":
			  return laranja.getEstado_Preso();
		  default:
		    //System.out.println("getTem_liberdade: Jogador "+Jogador+" não pode ser encontrado. Jogo será finalizado.");
		    //System.exit(1);
		}
		return -1;
	}
}