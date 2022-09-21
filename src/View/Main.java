package View;

import Model.Facade;
import Control.Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("deprecation")
class Main extends Frame implements Observer, CartasObserver {
	
	static int VetorPosJ1[] = new int[]{
			860,
			860-70,860-125,860-180,860-235,860-290,860-345,860-400,860-455,860-510,860-580,
			585-70,585-125,585-180,585-235,585-290,585-345,585-400,585-455,585-510,585-580,
			860-510,860-455,860-400,860-345,860-290,860-235,860-180,860-125,860-70,860,
			585-510,585-455,585-400,585-345,585-290,585-235,585-180,585-125,585-70,585
			
			};
	
	static int VetorPosJ2[] = new int[]{
			875,
			875-70,875-125,875-180,875-235,875-290,875-345,875-400,875-455,875-510,875-580,
			585-70,585-125,585-180,585-235,585-290,585-345,585-400,585-455,585-510,585-580,
			875-510,875-455,875-400,875-345,875-290,875-235,875-180,875-125,875-70,875,
			585-510,585-455,585-400,585-345,585-290,585-235,585-180,585-125,585-70,585
			
			};
	
	static int VetorPosJ3[] = new int[]{
			890,
			890-70,890-125,890-180,890-235,890-290,890-345,890-400,890-455,890-510,890-580,
			585-70,585-125,585-180,585-235,585-290,585-345,585-400,585-455,585-510,585-580,
			890-510,890-455,890-400,890-345,890-290,890-235,890-180,890-125,890-70,890,
			585-510,585-455,585-400,585-345,585-290,585-235,585-180,585-125,585-70,585
			
			};
	
	static int VetorPosJ4[] = new int[]{
			860,
			860-70,860-125,860-180,860-235,860-290,860-345,860-400,860-455,860-510,860-580,
			600-70,600-125,600-180,600-235,600-290,600-345,600-400,600-455,600-510,600-580,
			860-510,860-455,860-400,860-345,860-290,860-235,860-180,860-125,860-70,860,
			600-510,600-455,600-400,600-345,600-290,600-235,600-180,600-125,600-70,600
			
			};
	
	static int VetorPosJ5[] = new int[]{
			875,
			875-70,875-125,875-180,875-235,875-290,875-345,875-400,875-455,875-510,875-580,
			600-70,600-125,600-180,600-235,600-290,600-345,600-400,600-455,600-510,600-580,
			875-510,875-455,875-400,875-345,875-290,875-235,875-180,875-125,875-70,875,
			600-510,600-455,600-400,600-345,600-290,600-235,600-180,600-125,600-70,600
			
			};
	
	static int VetorPosJ6[] = new int[]{
			890,
			890-70,890-125,890-180,890-235,890-290,890-345,890-400,890-455,890-510,890-580,
			600-70,600-125,600-180,600-235,600-290,600-345,600-400,600-455,600-510,600-580,
			890-510,890-455,890-400,890-345,890-290,890-235,890-180,890-125,890-70,890,
			600-510,600-455,600-400,600-345,600-290,600-235,600-180,600-125,600-70,600
			
			};
	
	static int posicaoini[] = new int[]{860,585,875,585,890,585,860,600,875,600,890,600};
	static int tabWidth = 1200;
	static int tabHeight = 700;
	static int qtdPlayers = 0;
	static int limitedType = 8;
	static int vetEntrada[] = new int[] {0,0,0,0,0,0};
	static int vetSalesControl[] = new int[40];
	static String vez[] = new String[6];
	static int turno = 0;
	static String nome1=null, nome2=null, nome3=null, nome4=null, nome5=null, nome6=null;
	
	static Tabuleiro 	t = Tabuleiro.getTabuleiro();
	static Companhias 	comp = Companhias.getCompanhias();
	static Dados 		d = Dados.getDados();
	static Jogadores 	j = Jogadores.getJogadores();
	static Cartas 		c = Cartas.getCartas();
	static Territorio 	ter = Territorio.getTerritorio();
	
	static Frame frameTab = new Frame();
	static Frame frameWellcome = new Frame();
	static Frame sorteioInicial = new Frame();
	static Frame poucosJogadores = new Frame();
	static Frame Vende = new Frame();
	static Frame Terminar = new Frame();
	
	//static JLabel imagemPrisao, imagemPartida;
	
	static TextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
	static Label l0, l1, l2, erro1, labelVender;
	static Button b1, b2, bDado,bTerreno, bCasa, bHotel, bSalvar, bVenderProp, bResgataDin,bFim;
	static Checkbox ck1,ck2,ck3,ck4,ck5,ck6,ck7,cv1,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv11,cv13,cv14,cv15,cv17,cv19,cv21,cv23,cv25,cv26,cv28,cv29,cv31,cv32,cv33,cv34,cv35,cv36,cv38,cv39;
	
	static boolean checa = false;
	static int prisaoPartida;
	static int grafico=0;
	static int valorD1;
	static int valorD2;
	static int turno2;
	static int repete=0; 
	static int din;
	static int somaVenda = 0;
	static int carregamento;			// posicionamento jogador atual após carregamento
	static int carregaProp=0;			// propriedades apos carregamento
	static String p;
	static char c1, c2;
	
	//Observador
	static Main prisaoPartidaMain = new Main();
	 //Observado
	static Facade prisaoPartidaCartas = new Facade();		//Usado Facade pois Model.Cartas não é visível
	
	public void vaParaPrisao() {
		prisaoPartida = 22;
		grafico = 1;
		System.out.println("129: vaParaPrisao - prisaoPartida: "+prisaoPartida);
	}

	public void avanceAtePontoDePartida() {
		prisaoPartida = 9;
		grafico = 2;
		System.out.println("140: avanceAtePontoDePartida - prisaoPartida: "+prisaoPartida);
	}
	
	public void update(Observable o, Object arg) {
		@SuppressWarnings("unused")
		Facade cartaPrisaoPartida = (Facade)o;
		String acao = String.valueOf(arg);
		if(acao.equals("vaParaPrisao")){
			this.vaParaPrisao();
		}
		if(acao.equals("avanceAtePontoDePartida")){
			this.avanceAtePontoDePartida();
		}
	}
	
	static class CustomPaintComponent extends Component {
		public void paint(Graphics g) {
			Graphics2D g2d = (Graphics2D)g;

			g2d.drawImage(Controller.getTab(), 250, -10, 700, 670, this);
			g2d.drawRect(1055, 490, 125, 67);
			g2d.drawRect(955, 490, 100, 67);
			if(Controller.getCompany(Controller.getJPosicao(vez[turno2]))!=null) {
				g2d.drawImage(Controller.getCompany(Controller.getJPosicao(vez[turno2])), 30, 230, 170, 250, this);
			}
			if(Controller.getTerritory(Controller.getJPosicao(vez[turno2]))!=null) {
				g2d.drawString("Dono do terreno:"+Controller.getDono(Controller.getJPosicao(vez[turno2])),30,140);
				g2d.drawString("Numero de casas nesse territorio:"+Controller.getNcasas(Controller.getJPosicao(vez[turno2])),30,160);
				g2d.drawString("Numero de hoteis nesse territorio:"+Controller.getHotel(Controller.getJPosicao(vez[turno2])),30,180);
				g2d.drawImage(Controller.getTerritory(Controller.getJPosicao(vez[turno2])), 30, 230, 170, 250, this);
			}
			if(Controller.getJPosicao(vez[turno2])==12 || Controller.getJPosicao(vez[turno2])==2 || Controller.getJPosicao(vez[turno2])==16 || Controller.getJPosicao(vez[turno2])==22 || Controller.getJPosicao(vez[turno2])==27 || grafico == 1 || grafico == 2 || Controller.getJPosicao(vez[turno2])==37) {
				if(Controller.getCVerificador()==0) {
					g2d.drawImage(Controller.getCarta(Controller.getCBaralho(29)), 30, 230, 170, 250, this);
				}
				else if(Controller.getCEfeitos(Controller.getCBaralho(Controller.getCVerificador()))==600 || grafico == 1 ) {
					System.out.println("182: entrou prisao, valor de prisaoPartida: "+prisaoPartida);
					g2d.drawImage(Controller.getCarta(prisaoPartida), 30, 230, 170, 250, this);
					
				}
				else if(Controller.getCEfeitos(Controller.getCBaralho(Controller.getCVerificador()))==650 || grafico == 2 ) {
					System.out.println("187: vá ao ponto de partida, valor de prisaoPartida: "+prisaoPartida);
					System.out.println();
					g2d.drawImage(Controller.getCarta(prisaoPartida), 30, 230, 170, 250, this);
				}
				else
					System.out.println("CARTA["+Controller.getCBaralho(Controller.getCVerificador()-1 )+"] <<--");
					g2d.drawImage(Controller.getCarta(Controller.getCBaralho(Controller.getCVerificador()-1 )), 30, 230, 170, 250, this);
			}
			
			for (int y=0; y<6; y++) {	
				//System.out.println("Cor jogador: "+vez[y]);
				if (vez[y] == "Preto") {
					//System.out.println("Cor jogador: "+vez[y]+" - Dinheiro do jogador: "+Controller.getDinheiro(vez[y]));
					if (Controller.getDinheiro(vez[y]) > 0) {
						g2d.drawImage(Controller.getPino("Preto"), posicaoini[0], posicaoini[1], 20, 30, this);		//System.out.println("\n\nPreto entrou\n\n");
					}
				}
				if (vez[y] == "Amarelo") {
					//System.out.println("Cor jogador: "+vez[y]+" - Dinheiro do jogador: "+Controller.getDinheiro(vez[y]));
					if (Controller.getDinheiro(vez[y]) > 0) {
						g2d.drawImage(Controller.getPino("Amarelo"), posicaoini[2], posicaoini[3], 20, 30, this);		//System.out.println("\n\nAmarelo entrou\n\n");
					}
				}
				if (vez[y] == "Roxo") {
					//System.out.println("Cor jogador: "+vez[y]+" - Dinheiro do jogador: "+Controller.getDinheiro(vez[y]));
					if (Controller.getDinheiro(vez[y]) > 0) {
						g2d.drawImage(Controller.getPino("Roxo"), posicaoini[4], posicaoini[5], 20, 30, this);		//System.out.println("\n\nRoxo entrou\n\n");
					}
				}
				if (vez[y] == "Azul") {
					//System.out.println("Cor jogador: "+vez[y]+" - Dinheiro do jogador: "+Controller.getDinheiro(vez[y]));
					if (Controller.getDinheiro(vez[y]) > 0) {
						g2d.drawImage(Controller.getPino("Azul"), posicaoini[6], posicaoini[7], 20, 30, this);		//System.out.println("\n\nAzul entrou\n\n");
					}
				}
				if (vez[y] == "Vermelho") {
					//System.out.println("Cor jogador: "+vez[y]+" - Dinheiro do jogador: "+Controller.getDinheiro(vez[y]));
					if (Controller.getDinheiro(vez[y]) > 0) {
						g2d.drawImage(Controller.getPino("Vermelho"), posicaoini[8], posicaoini[9], 20, 30, this);		//System.out.println("\n\nVermelho entrou\n\n");
					}
				}
				if (vez[y] == "Laranja") {
					//System.out.println("Cor jogador: "+vez[y]+" - Dinheiro do jogador: "+Controller.getDinheiro(vez[y]));
					if (Controller.getDinheiro(vez[y]) > 0) {
						g2d.drawImage(Controller.getPino("Laranja"), posicaoini[10], posicaoini[11], 20, 30, this);		//System.out.println("\n\nLaranja entrou\n\n");
					}
				}
			}
			
			switch(vez[turno2]) {
		 	case "Preto":
		 		din = Controller.getDinheiro("Preto");
				p = ""+din;
				g2d.drawString("Montante do jogador Preto:"+p,30,200);
		 		g2d.setColor(Color.black);
		 		break;
		 	case "Amarelo":
		 		din = Controller.getDinheiro("Amarelo");
				p = ""+din;
				g2d.drawString("Montante do jogador Amarelo:"+p,30,200);
		 		g2d.setColor(Color.yellow);
			    break;
		 	case "Roxo":
		 		din = Controller.getDinheiro("Roxo");
				p = ""+din;
				g2d.drawString("Montante do jogador Roxo:"+p,30,200);
		 		g2d.setColor(Color.magenta);
				break;
		 	case "Azul":
		 		din = Controller.getDinheiro("Azul");
				p = ""+din;
				g2d.drawString("Montante do jogador Azul:"+p,30,200);
		 		g2d.setColor(Color.blue);
				break;
		 	case "Vermelho":
		 		din = Controller.getDinheiro("Vermelho");
				p = ""+din;
				g2d.drawString("Montante do jogador Vermelho:"+p,30,200);
		 		g2d.setColor(Color.red);
				break;
		 	case "Laranja":
		 		din = Controller.getDinheiro("Laranja");
				p = ""+din;
				g2d.drawString("Montante do jogador Laranja:"+p,30,200);
		 		g2d.setColor(Color.orange);
				break;
		 	default:
			}
			
			if(checa==true) {
				g2d.fillRect(990,90,100,100);
				g2d.fillRect(990,190,100,100);
			
				if(valorD1==1) {
					g2d.drawImage(Controller.getDado(1), 1000, 100, 80, 80, this);	
				}
				else if(valorD1==2) {
					g2d.drawImage(Controller.getDado(2), 1000, 100, 80, 80, this);	
				}
				else if(valorD1==3) {
					g2d.drawImage(Controller.getDado(3), 1000, 100, 80, 80, this);	
				}
				else if(valorD1==4) {
					g2d.drawImage(Controller.getDado(4), 1000, 100, 80, 80, this);	
				}
				else if(valorD1==5) {
					g2d.drawImage(Controller.getDado(5), 1000, 100, 80, 80, this);	
				}
				else {
					g2d.drawImage(Controller.getDado(6), 1000, 100, 80, 80, this);	
				}
				
				if(valorD2==1) {
					g2d.drawImage(Controller.getDado(1), 1000, 200, 80, 80, this);	
				}
				else if(valorD2==2) {
					g2d.drawImage(Controller.getDado(2), 1000, 200, 80, 80, this);	
				}
				else if(valorD2==3) {
					g2d.drawImage(Controller.getDado(3), 1000, 200, 80, 80, this);	
				}
				else if(valorD2==4) {
					g2d.drawImage(Controller.getDado(4), 1000, 200, 80, 80, this);	
				}
				else if(valorD2==5) {
					g2d.drawImage(Controller.getDado(5), 1000, 200, 80, 80, this);	
				}
				else {
					g2d.drawImage(Controller.getDado(6), 1000, 200, 80, 80, this);	
				}
			}
		} 
	}
	
	static void wellcome() {
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl=screenSize.width;
		int sa=screenSize.height;
		int k=sl/2-600/2;
		int l=sa/2-300/2;
		frameWellcome.setBounds(k, l, 600, 300);	
		frameWellcome.setTitle("Banco Imobiliário");
		frameWellcome.setVisible(true);
		
		frameWellcome.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frameWellcome.dispose();
		}});
		
		l0 = new Label("Novo jogo:");
		l0.setBounds(42, 50, 80, 20);
		
		l1 = new Label("Nome jogador:");
		l1.setBounds(167, 50, 90, 20);
		
		l2 = new Label("Continuar ultimo jogo salvo?");    
		l2.setBounds(400, 50, 350, 20);
		
		// //////////////////// CAMPOS ////////////////////	
		
		t1 = new TextField();
		t1.setEditable(false);
		t1.setBounds(170, 75, 100, 20);
		ck1 = new Checkbox("Jogador Preto:");
		ck1.setBounds(45, 75, 125, 20);
		       
		t2 = new TextField();
		t2.setEditable(false);
		t2.setBounds(170, 100, 100, 20);
		ck2 = new Checkbox("Jogador Amarelo:");
		ck2.setBounds(45, 100, 125, 20);
		
		t3 = new TextField();
		t3.setEditable(false);
		t3.setBounds(170, 125, 100, 20);
		ck3 = new Checkbox("Jogador Roxo:");
		ck3.setBounds(45, 125, 125, 20);
		
		t4 = new TextField();
		t4.setEditable(false);
		t4.setBounds(170, 150, 100, 20);
		ck4 = new Checkbox("Jogador Azul:");
		ck4.setBounds(45, 150, 125, 20);
		
		t5 = new TextField();
		t5.setEditable(false);
		t5.setBounds(170, 175, 100, 20);
		ck5 = new Checkbox("Jogador Vermelho:");
		ck5.setBounds(45, 175, 125, 20);
		
		t6 = new TextField();
		t6.setEditable(false);
		t6.setBounds(170, 200, 100, 20);
		ck6 = new Checkbox("Jogador Laranja:");
		ck6.setBounds(45, 200, 125, 20);
		
		// //////////////// BOTOES ///////////////////		
		
        b1 = new Button("Novo jogo");    
        b1.setBounds(42,225,70,30);
        b1.addActionListener(new RegraB1());
        
        b2 = new Button("Carregar jogo");
        b2.setBounds(400,75,90,30);
        b2.addActionListener(new RegraB2());
		
        frameWellcome.add(b1);  frameWellcome.add(b2);
        frameWellcome.add(l0);  frameWellcome.add(l1);  frameWellcome.add(l2);
		frameWellcome.add(t1);  frameWellcome.add(t2);  frameWellcome.add(t3);  frameWellcome.add(t4);  frameWellcome.add(t5);  frameWellcome.add(t6);
		frameWellcome.add(ck1); frameWellcome.add(ck2); frameWellcome.add(ck3); frameWellcome.add(ck4); frameWellcome.add(ck5); frameWellcome.add(ck6); 

		frameWellcome.setLayout(null);		//se nao remover o layout, Label l1.setBounds não funcionará
		
		// ///////// Checkbox libera seu textfield associado ////////////// 
		
		ck1.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBox(ck1, t1); } } );
		
		ck2.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBox(ck2, t2); } } );
		
		ck3.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBox(ck3, t3); } } );
		
		ck4.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBox(ck4, t4); } } );
		
		ck5.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBox(ck5, t5); } } );
		
		ck6.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBox(ck6, t6); } } );
		
		// ///////// Permite inserir caracteres alfanuméricos até 8 ////////////// 
		
		t1.addKeyListener(new java.awt.event.KeyAdapter() { public void keyTyped(java.awt.event.KeyEvent e) { keyTypedFunction(t1, e); } } );
		
		t2.addKeyListener(new java.awt.event.KeyAdapter() { public void keyTyped(java.awt.event.KeyEvent e) { keyTypedFunction(t2, e); } } );
		
		t3.addKeyListener(new java.awt.event.KeyAdapter() { public void keyTyped(java.awt.event.KeyEvent e) { keyTypedFunction(t3, e); } } );
		
		t4.addKeyListener(new java.awt.event.KeyAdapter() { public void keyTyped(java.awt.event.KeyEvent e) { keyTypedFunction(t4, e); } } );
		
		t5.addKeyListener(new java.awt.event.KeyAdapter() { public void keyTyped(java.awt.event.KeyEvent e) { keyTypedFunction(t5, e); } } );
		
		t6.addKeyListener(new java.awt.event.KeyAdapter() { public void keyTyped(java.awt.event.KeyEvent e) { keyTypedFunction(t6, e); } } );
	}
	
	static void keyTypedFunction(TextField t, java.awt.event.KeyEvent e) {
	    if (t.getText().length() <= limitedType - 1) { } 
	    else 
	        e.setKeyChar((char) KeyEvent.VK_CLEAR);
	}
	
	static void stateOfCheckBox(Checkbox ck, TextField t) {
		if( ck.getState()==true ) {
            t.setEditable(true);
		}else
        	t.setEditable(false);
	}
	
	static class RegraB1 implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	    	if(ck1.getState()==true) { 
	    		qtdPlayers++; 
	    		nome1 = t1.getText(); 
	    		vetEntrada[0]=1; 
	    		Controller.setJogador("Preto",nome1); 
	    	}
	    	if(ck2.getState()==true) { qtdPlayers++; nome2 = t2.getText(); vetEntrada[1]=1; Controller.setJogador("Amarelo",nome2); }
	    	if(ck3.getState()==true) { qtdPlayers++; nome3 = t3.getText(); vetEntrada[2]=1; Controller.setJogador("Roxo",nome3); }
	    	if(ck4.getState()==true) { qtdPlayers++; nome4 = t4.getText(); vetEntrada[3]=1; Controller.setJogador("Azul",nome4); }
	    	if(ck5.getState()==true) { qtdPlayers++; nome5 = t5.getText(); vetEntrada[4]=1; Controller.setJogador("Vermelho",nome5); }
	    	if(ck6.getState()==true) { qtdPlayers++; nome6 = t6.getText(); vetEntrada[5]=1; Controller.setJogador("Laranja",nome6); }
	    	
	    	if(qtdPlayers > 2) {
	    		frameWellcome.dispose();
	    		frameTab.setVisible(true);
	    		Toolkit tk=Toolkit.getDefaultToolkit();
        		Dimension screenSize=tk.getScreenSize();
	    		int sl=screenSize.width;
	    		int sa=screenSize.height;
	    		int k=sl/2-460/2;
	    		int l=sa/2-100+(qtdPlayers*25)/2;
	    		
	    		sorteioInicial.addWindowListener(new WindowAdapter() {
	    			public void windowClosing(WindowEvent e) {
	    				sorteioInicial.dispose();
	    		}});
	    		
	    		sorteioInicial.setTitle("Definição da ordem dos jogadores");
	    		sorteioInicial.setLayout(new FlowLayout());
	    		Label labelSorteio = new Label("Sorteio da ordem dos jogadores:");
	    		
	    		sorteioInicial.add(labelSorteio);
	    		sorteioInicial.setVisible(true);
	    		int sorteio = 0;
	    		Random geradorOrdem = new Random();
	    		int vetOrdem[] = new int[qtdPlayers];
	    		while(sorteio<qtdPlayers) {
	    			int valor=geradorOrdem.nextInt(qtdPlayers)+1;
	    			for(int i=0;i<sorteio;i++) {
	    				if(valor==vetOrdem[i]) {
	    					valor=geradorOrdem.nextInt(qtdPlayers)+1;
	    					i=-1;
	    				}
	    			}
	    			vetOrdem[sorteio]=valor;
	    			sorteio++;
	    		}
	    		sorteio = 0;
	    		for(int g = 0; g<6; g++) {
	    			switch(g) {
	    			  case 0:
	    				  if(vetEntrada[0]==1) {
	    					  Controller.setOrdem("Preto", vetOrdem[sorteio]);	//System.out.println(Controller.getOrdem("Preto"));
	    					  //Label labelSorteioPreto = new Label("Jogador "+Controller.getJNome("Preto")+" vai usar o peão Preto e foi sorteado como "+Controller.getOrdem("Preto")+"º a jogar.");
	    					  Label labelSorteioPreto = new Label("Jogador "+nome1+" vai usar o peão Preto e foi sorteado como "+Controller.getOrdem("Preto")+"º a jogar.");
	    					  labelSorteioPreto.setBounds(50, 125+(g*25), 450, 20);
	    					  sorteioInicial.add(labelSorteioPreto);
	    					  vez[Controller.getOrdem("Preto")-1] = "Preto";
	    					  sorteio++;
	    				  }
	    			    break;
	    			  case 1:
	    				  if(vetEntrada[1]==1) {
	    					  Controller.setOrdem("Amarelo", vetOrdem[sorteio]);	//System.out.println(Controller.getOrdem("Amarelo"));
	    					  //Label labelSorteioAmarelo = new Label("Jogador "+Controller.getJNome("Amarelo")+" vai usar o peão Amarelo e foi sorteado como "+Controller.getOrdem("Amarelo")+"º a jogar.");
	    					  Label labelSorteioAmarelo = new Label("Jogador "+nome2+" vai usar o peão Amarelo e foi sorteado como "+Controller.getOrdem("Amarelo")+"º a jogar.");
	    					  labelSorteioAmarelo.setBounds(50, 125+(g*25), 450, 20);
	    					  sorteioInicial.add(labelSorteioAmarelo);
	    					  vez[Controller.getOrdem("Amarelo")-1] = "Amarelo";
	    					  sorteio++;
	    				  }
	    				  
	    			    break;
	    			  case 2:
	    				  if(vetEntrada[2]==1) {
	    					  Controller.setOrdem("Roxo", vetOrdem[sorteio]);	//System.out.println(Controller.getOrdem("Roxo"));
	    					  //Label labelSorteioRoxo = new Label("Jogador "+Controller.getJNome("Roxo")+" vai usar o peão Roxo e foi sorteado como "+Controller.getOrdem("Roxo")+"º a jogar.");
	    					  Label labelSorteioRoxo = new Label("Jogador "+nome3+" vai usar o peão Roxo e foi sorteado como "+Controller.getOrdem("Roxo")+"º a jogar.");
	    					  labelSorteioRoxo.setBounds(50, 125+(g*25), 450, 20);
	    					  sorteioInicial.add(labelSorteioRoxo);
	    					  vez[Controller.getOrdem("Roxo")-1] = "Roxo";
	    					  sorteio++;
	    				  }
	    				break;
	    			  case 3:
	    				  if(vetEntrada[3]==1) {
	    					  Controller.setOrdem("Azul", vetOrdem[sorteio]);		//System.out.println(Controller.getOrdem("Azul"));
	    					  //Label labelSorteioAzul = new Label("Jogador "+Controller.getJNome("Azul")+" vai usar o peão Azul e foi sorteado como "+Controller.getOrdem("Azul")+"º a jogar.");
	    					  Label labelSorteioAzul = new Label("Jogador "+nome4+" vai usar o peão Azul e foi sorteado como "+Controller.getOrdem("Azul")+"º a jogar.");
	    					  labelSorteioAzul.setBounds(50, 125+(g*25), 450, 20);
	    					  sorteioInicial.add(labelSorteioAzul);
	    					  vez[Controller.getOrdem("Azul")-1] = "Azul";
	    					  sorteio++;
	    				  }
	    				break;
	    			  case 4:
	    				  if(vetEntrada[4]==1) {
	    					  Controller.setOrdem("Vermelho", vetOrdem[sorteio]);	//System.out.println(Controller.getOrdem("Vermelho"));
	    					  //Label labelSorteioVermelho = new Label("Jogador "+Controller.getJNome("Vermelho")+" vai usar o peão Vermelho e foi sorteado como "+Controller.getOrdem("Vermelho")+"º a jogar.");
	    					  Label labelSorteioVermelho = new Label("Jogador "+nome5+" vai usar o peão Vermelho e foi sorteado como "+Controller.getOrdem("Vermelho")+"º a jogar.");
	    					  labelSorteioVermelho.setBounds(50, 125+(g*25), 450, 20);
	    					  sorteioInicial.add(labelSorteioVermelho);
	    					  vez[Controller.getOrdem("Vermelho")-1] = "Vermelho";
	    					  sorteio++;
	    				  }
	    				break;
	    			  case 5:
	    				  if(vetEntrada[5]==1) {
	    					  Controller.setOrdem("Laranja", vetOrdem[sorteio]);	//System.out.println(Controller.getOrdem("Laranja"));
	    					  //Label labelSorteioLaranja = new Label("Jogador "+Controller.getJNome("Laranja")+" vai usar o peão Laranja e foi sorteado como "+Controller.getOrdem("Laranja")+"º a jogar.");
	    					  Label labelSorteioLaranja = new Label("Jogador "+nome6+" vai usar o peão Laranja e foi sorteado como "+Controller.getOrdem("Laranja")+"º a jogar.");
	    					  labelSorteioLaranja.setBounds(50, 125+(g*25), 450, 20);
	    					  sorteioInicial.add(labelSorteioLaranja);
	    					  vez[Controller.getOrdem("Laranja")-1] = "Laranja";
	    					  sorteio++;
	    				  }
	    				break;
	    			  default:
	    			}
	    		}
	    		sorteioInicial.setBounds(k, l, 450, 100+(qtdPlayers*25));
	    	} else {
	    		b1.setEnabled(false);
	    		Toolkit tk=Toolkit.getDefaultToolkit();
        		Dimension screenSize=tk.getScreenSize();
	    		int sl=screenSize.width;
	    		int sa=screenSize.height;
	    		int k=sl/2-460/2;
	    		int l=sa/2-90/2;
	    		poucosJogadores.setBounds(k, l, 450, 90);
	    		
	    		poucosJogadores.addWindowListener(new WindowAdapter() {
	    			public void windowClosing(WindowEvent e) {
	    				poucosJogadores.dispose();
	    				ck1.setState(false);ck2.setState(false);ck3.setState(false);ck4.setState(false);ck5.setState(false);ck6.setState(false);
	    				t1.setEditable(false);t2.setEditable(false);t3.setEditable(false);t4.setEditable(false);t5.setEditable(false);t6.setEditable(false);
	    				b1.setEnabled(true);
	    				frameWellcome.repaint();
	    		}});
	    		
	    		poucosJogadores.setTitle("Jogadores insuficientes");
	    		frameWellcome.setLayout(new FlowLayout());
	    		Label labelPoucosJogadores = new Label("Poucos jogadores, deve-se escolher entre 3 e 6 jogadores. Tente novamente.");
	    		labelPoucosJogadores.setBounds(50, 100, 450, 20);
	    		poucosJogadores.add(labelPoucosJogadores);
	    		poucosJogadores.setVisible(true);
	    	}
	    }
	}

	static class RegraB2 implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	    	try {
				Controller.carregaJogo();
				carregaProp++;
				int carregamento = turno-1;
				if (carregamento < 0) {
					carregamento = qtdPlayers-1;
				}
				if (Controller.getDinheiro(vez[carregamento]) > 0){
					System.out.println("maior que zero - vez[turno]: "+vez[carregamento]+" - turno: "+carregamento);
					bVenderProp.setEnabled(false);
					bDado.setEnabled(true);
				}else {
					System.out.println("igual/menor que zero - vez[turno]: "+vez[carregamento]+" - turno: "+carregamento);
					bVenderProp.setEnabled(true);
					bDado.setEnabled(false);
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	    	frameWellcome.dispose();
	    	frameTab.repaint();
    		frameTab.setVisible(true);
	    }
	}
	
	static void keyTypedFunction2(TextField t, java.awt.event.KeyEvent e) {
		String a = t.getText().toString();
		
	    if (t.getText().length() <= 0) {} 
	    else 
	        e.setKeyChar((char) KeyEvent.VK_CLEAR);
	}
	
	static void stateOfCheckBoxDados(Checkbox ck, TextField t) {
		if( ck.getState()==true ) {
            t.setEditable(true);
			bDado.setEnabled(false);
		}else {
        	t.setEditable(false);
			bDado.setEnabled(true);
		}
	}
	
	static void EscolherDados() {
		
		ck7 = new Checkbox("Escolher numeros");
		ck7.setBounds(1068,525,117,20);
		
		t7 = new TextField();
		t8 = new TextField();
		
		t7.setEditable(false);
		t7.setBounds(1145,550,35,35);
		
		t8.setEditable(false);
		t8.setBounds(1095,550,35,35);
		ck7.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxDados(ck7, t7); } } );
		ck7.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxDados(ck7, t8); } } );
		
		t7.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				keyTypedFunction2(t7, e);
				c1 = e.getKeyChar();
				if (!((c1 >= '1') && (c1 <= '6') || (c1 == KeyEvent.VK_BACK_SPACE) || (c1 == KeyEvent.VK_DELETE))) {
					e.consume();
				}else
					bDado.setEnabled(true);
		}});
		
		t8.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				keyTypedFunction2(t8, e);
				c2 = e.getKeyChar();
				if (!((c2 >= '1') && (c2 <= '6') || (c2 == KeyEvent.VK_BACK_SPACE) || (c2 == KeyEvent.VK_DELETE))) {
					e.consume();
				}else
					bDado.setEnabled(true);
		}});

		frameTab.add(ck7);	frameTab.add(t7);	frameTab.add(t8);
    	frameTab.repaint();
	}
	
	static void BCompraTerreno() {
		 bTerreno = new Button ("Comprar terreno");
	     bTerreno.setBounds(970,600,120,25);
	     bTerreno.addActionListener(new CompraTerreno());
	     bTerreno.setEnabled(false);
	}
	static class CompraTerreno implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			Vende.dispose();
			bDado.setEnabled(true);
			bSalvar.setEnabled(true);
			bVenderProp.setEnabled(false);
			ck7.setEnabled(true);
			if(Controller.getDono(Controller.getJPosicao(vez[turno2])).equals("void")) {
				System.out.println("Propriedade comprada: "+Controller.getJPosicao(vez[turno2])+ " Pagou: "+Controller.getEAluguel(7, Controller.getJPosicao(vez[turno2])));
				Controller.setDono(vez[turno2], Controller.getJPosicao(vez[turno2]));
				Controller.setDinheiro(Controller.getDinheiro(vez[turno2])-Controller.getEAluguel(7, Controller.getJPosicao(vez[turno2])), vez[turno2]);
				Controller.setBanco(Controller.getBanco()+Controller.getEAluguel(7, Controller.getJPosicao(vez[turno2])));
			}
			bTerreno.setEnabled(false);
			frameTab.repaint();
		}
	}
	
	static void BCompraCasa() {
		 bCasa = new Button ("Comprar casa");
		 bCasa.setBounds(970,627,120,25);
		 bCasa.addActionListener(new CompraCasa());
		 bCasa.setEnabled(false);
	}
	static class CompraCasa implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			Vende.dispose();
			bDado.setEnabled(true);
			bSalvar.setEnabled(true);
			bVenderProp.setEnabled(false);
			ck7.setEnabled(true);
			if( Controller.getNcasas(Controller.getJPosicao( vez[turno2] ) ) < 4 ) {
				if (Controller.getECor(Controller.getJPosicao(vez[turno])) != "cinza") {
					System.out.println("Você comprou uma casa nesta propriedade e seu gasto foi de "+Controller.getEAluguel(6, Controller.getJPosicao(vez[turno2]))+".");
					Controller.setDinheiro(Controller.getDinheiro(vez[turno2])-Controller.getEAluguel(6, Controller.getJPosicao(vez[turno2])), vez[turno2]);
					Controller.setBanco(Controller.getBanco()+Controller.getEAluguel(6, Controller.getJPosicao(vez[turno2])));
					Controller.setNcasas(Controller.getNcasas(Controller.getJPosicao(vez[turno2]))+1, Controller.getJPosicao(vez[turno2]));
					bCasa.setEnabled(false);
				}
			}
			frameTab.repaint();
		}
	}
	
	static void BVenderProp() {
		 bVenderProp = new Button ("Vender imóvel");
		 bVenderProp.setBounds(966,525,95,25);
		 bVenderProp.addActionListener(new bVendePropriedade());
	}
	
	static void stateOfCheckBoxVenda(Checkbox ck) {
		ck.setEnabled(true);
	}
	
	static void stateOfCheckBoxSoma(Checkbox ck, int num, TextField t9) {
		if( ck.getState()==true ) {
			if (vetSalesControl[num] == 0) {
				somaVenda=somaVenda+(((int)(Controller.getEAluguel(7,num)*0.9))+((int)(((Controller.getEAluguel(6,num))*(Controller.getNcasas(num)))*0.9))+(int)((Controller.getHotel(num)*Controller.getEAluguel(6,num))*0.9));
				t9.setText(Integer.toString(somaVenda));
				vetSalesControl[num]=1;
			}
		}else {
			if (vetSalesControl[num] == 1) {
				somaVenda=somaVenda-(((int)(Controller.getEAluguel(7,num)*0.9))+((int)(((Controller.getEAluguel(6,num))*(Controller.getNcasas(num)))*0.9))+(int)((Controller.getHotel(num)*Controller.getEAluguel(6,num))*0.9));
				t9.setText(Integer.toString(somaVenda));
				vetSalesControl[num]=0;
			}
		}
	}
	
	static class ConvertYourPropertiesIntoCash implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			int h, k=0, controle = 0, pos=turno2;
			for (int i = 1; i < 40; i++) {						// quantas propriedades quer vender?
				if(vetSalesControl[i] == 1) {
					Controller.setDono("void", i);
					vetSalesControl[i] = 0;
				}
			}
			Controller.setDinheiro((Controller.getDinheiro(vez[turno2])+somaVenda), vez[turno2]);	//// recupera dinheiro
			while(k<40) {	// quantas propriedades ainda tenho?
		    	if ( Controller.getTTabDono(k) == vez[turno2] ) {
		    		controle++;
		    	}
		    	++k;
		    }
			System.out.println("\nAntes:");
			System.out.println("Controle: "+controle+", dinheiro:"+Controller.getDinheiro(vez[turno2])+" Controller.getOrdem(vez[turno2]): "+Controller.getOrdem(vez[turno2]));
			System.out.println("turno2: "+turno2);
			System.out.println("vez[turno2]: "+vez[turno2]);
			System.out.println("vez[pos]: "+vez[pos]);
			System.out.println("pos: "+pos);
			System.out.println("turno: "+turno);
			System.out.println("vez[turno]: "+vez[turno]);
			System.out.println("qtdPlayers: "+qtdPlayers);
			k=0;
			while (k < qtdPlayers) {
				System.out.println("vez["+k+"]: "+vez[k]+" Controller.getOrdem(vez["+k+"])"+Controller.getOrdem(vez[k]));
				k++;
			}
			if (controle == 0 && Controller.getDinheiro(vez[turno2]) <= 0) {	// se nao tenho mais propriedades e ainda tenho dinheiro negativo, game over para mim
				if ((pos)==qtdPlayers-1) {
					qtdPlayers--;
					turno=0;
					turno2=turno;
				}else {
					while (pos<(qtdPlayers-1)) {
						vez[pos] = vez[pos+1];
						Controller.setOrdem(vez[pos], Controller.getOrdem(vez[pos+1]));
						pos++;
					}
					qtdPlayers--;
					turno=turno2;
				}
				if(qtdPlayers ==1) {
					terminarjogo2();
				}
				System.out.println("\nDepois:");
				System.out.println("turno2: "+turno2);
				System.out.println("vez[turno2]: "+vez[turno2]);
				System.out.println("vez[pos]: "+vez[pos]);
				System.out.println("pos: "+pos);
				System.out.println("turno: "+turno);
				System.out.println("vez[turno]: "+vez[turno]);
				System.out.println("qtdPlayers: "+qtdPlayers);
				for ( h = 0; h<qtdPlayers; h++) {
					System.out.println("vez["+h+"]: "+vez[h]+" Controller.getOrdem(vez["+h+"])"+Controller.getOrdem(vez[h]));
				}
			}
			continuarJogo();
			bTerreno.setEnabled(false);
		}
	}
	
	static void continuarJogo () {
		ResetDados();
		Vende.dispose();
		RemoveDadosVenda();
		bDado.setEnabled(true);
		bSalvar.setEnabled(true);
		bVenderProp.setEnabled(false);
		bTerreno.setEnabled(true);
		ck7.setEnabled(true);
		Vende.dispose();
		frameTab.repaint();
		Terminar.repaint();	
	}
	
	static class bVendePropriedade implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			int d = 1;
			sorteioInicial.dispose();
			frameWellcome.dispose();
			poucosJogadores.dispose();
			
			bDado.setEnabled(false);
			bSalvar.setEnabled(false);
			bVenderProp.setEnabled(false);
			ck7.setEnabled(false);
			
			Toolkit tk=Toolkit.getDefaultToolkit();
    		Dimension screenSize=tk.getScreenSize();
    		int sl=screenSize.width;
    		int sa=screenSize.height;
    		int k=sl/2-460/2;
    		int l=sa/2-460/2;
    		Vende.setBounds(k, l, 460, 460);
    		
    		Vende.addWindowListener(new WindowAdapter() {
    			public void windowClosing(WindowEvent e) {
    				ResetDados();
    				Vende.dispose();
    				RemoveDadosVenda();
    				bDado.setEnabled(true);
    				bSalvar.setEnabled(true);
    				bVenderProp.setEnabled(false);
    				ck7.setEnabled(true);
    		}});
    		Vende.setTitle("Escolhas as propriedades que você deseja vender");    
    		t9 = new TextField();
    		t9.setEditable(false);
    		t9.setBounds(330, 400, 100, 20);
    		AdicionaDadosVenda();
    		ResetDados();
    		Label vendendo = new Label("O valor total da(s) propriedade(s), casa(s) e hotel(is):");
    		vendendo.setBounds(30, 400, 300, 20);
    		Vende.add(vendendo);
    		bResgataDin = new Button ("Vender");
    		bResgataDin.setBounds(330,425,95,20);
    		bResgataDin.addActionListener(new ConvertYourPropertiesIntoCash());
    		Vende.add(bResgataDin);
    		
    		d=1;
    		while(d<40) {
				if ( Controller.getTTabDono(d).equals(vez[turno2]) ) {
    	    		switch(Controller.getTTabNome(d)) {
	    			 	case "Leblon":							stateOfCheckBoxVenda( cv1 );	break;
	    			 	case "Av. Presidente Vargas":			stateOfCheckBoxVenda( cv3 );    break;
	    			 	case "Av. Nossa Senhora de Copacabana":	stateOfCheckBoxVenda( cv4 );	break;
	    			 	case "Companhia Ferroviária":	 		stateOfCheckBoxVenda( cv5 );	break;
	    			 	case "Av. Brigadeiro Faria Lima": 		stateOfCheckBoxVenda( cv6 );	break;
	    			 	case "Companhia de Viação":		 		stateOfCheckBoxVenda( cv7 );	break;
	    			 	case "Av. Rebouças":   			 		stateOfCheckBoxVenda( cv8 );	break;
	    			 	case "Av. 9 de Julho": 			 		stateOfCheckBoxVenda( cv9 );	break;
	    			 	case "Av. Europa": 			 			stateOfCheckBoxVenda( cv11 );	break;
	    			 	case "Rua Augusta": 			 		stateOfCheckBoxVenda( cv13 );	break;
	    			 	case "Av. Pacaembu": 			 		stateOfCheckBoxVenda( cv14 );	break;
	    			 	case "Companhia de Táxi": 			 	stateOfCheckBoxVenda( cv15 );	break;
	    			 	case "Interlagos": 			 			stateOfCheckBoxVenda( cv17 );	break;
	    			 	case "Morumbi": 			 			stateOfCheckBoxVenda( cv19 );	break;
	    			 	case "Flamengo": 			 			stateOfCheckBoxVenda( cv21 );	break;
	    			 	case "Botafogo": 			 			stateOfCheckBoxVenda( cv23 );	break;
	    			 	case "Companhia de Navegação": 			stateOfCheckBoxVenda( cv25 );	break;
	    			 	case "Av. Brasil": 			 			stateOfCheckBoxVenda( cv26 );	break;
	    			 	case "Av. Paulista": 			 		stateOfCheckBoxVenda( cv28 );	break;
	    			 	case "Jardim Europa": 			 		stateOfCheckBoxVenda( cv29 );	break;
	    			 	case "Copacabana": 			 			stateOfCheckBoxVenda( cv31 );	break;
	    			 	case "Companhia de Aviação": 			stateOfCheckBoxVenda( cv32 );	break;
	    			 	case "Av. Vieira Souto": 			 	stateOfCheckBoxVenda( cv33 );	break;
	    			 	case "Av. Atlântica": 			 		stateOfCheckBoxVenda( cv34 );	break;
	    			 	case "Companhia de Táxi Aéreo": 		stateOfCheckBoxVenda( cv35 );	break;
	    			 	case "Ipanema": 			 			stateOfCheckBoxVenda( cv36 );	break;
	    			 	case "Jardim Paulista": 			 	stateOfCheckBoxVenda( cv38 );	break;
	    			 	case "Brooklin": 			 			stateOfCheckBoxVenda( cv39 );	break;
	    			 	default:
	    			 }
    	    	}
    	    	
    	    	cv1.addItemListener(new ItemListener() {  public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma(  cv1,1,t9 ); } } );
    	    	cv3.addItemListener(new ItemListener() {  public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma(  cv3,3,t9 ); } } );
    	    	cv4.addItemListener(new ItemListener() {  public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma(  cv4,4,t9 ); } } );
    	    	cv5.addItemListener(new ItemListener() {  public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma(  cv5,5,t9 ); } } );
    	    	cv6.addItemListener(new ItemListener() {  public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma(  cv6,6,t9 ); } } );
    	    	cv7.addItemListener(new ItemListener() {  public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma(  cv7,7,t9 ); } } );
    	    	cv8.addItemListener(new ItemListener() {  public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma(  cv8,8,t9 ); } } );
    	    	cv9.addItemListener(new ItemListener() {  public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma(  cv9,9,t9 ); } } );
    	    	cv11.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv11,11,t9); } } );
    	    	cv13.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv13,13,t9 ); } } );
    	    	cv14.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv14,14,t9 ); } } );
    	    	cv15.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv15,15,t9 ); } } );
    	    	cv17.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv17,17,t9); } } );
    	    	cv19.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv19,19,t9 ); } } );
    	    	cv21.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv21,21,t9 ); } } );
    	    	cv23.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv23,23,t9 ); } } );
    	    	cv25.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv25,25,t9 ); } } );
    	    	cv26.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv26,26,t9 ); } } );
    	    	cv28.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv28,28,t9 ); } } );
    	    	cv29.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv29,29,t9 ); } } );
    	    	cv31.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv31,31,t9 ); } } );
    	    	cv32.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv32,32,t9 ); } } );
    	    	cv33.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv33,33,t9 ); } } );
    	    	cv34.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv34,34,t9 ); } } );
    	    	cv35.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv35,35,t9 ); } } );
    	    	cv36.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv36,36,t9 ); } } );
    	    	cv38.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv38,38,t9 ); } } );
    	    	cv39.addItemListener(new ItemListener() { public void itemStateChanged(ItemEvent e) { stateOfCheckBoxSoma( cv39,39,t9 ); } } );
    	    	
    	    	++d;
    	    	Vende.repaint();
    	    }
    		d=1;
    		Vende.setLayout(null);
    		Vende.setVisible(true);
    		Vende.repaint();
		}
	}
	
	static void RemoveDadosVenda() {
		Vende.remove(cv1);		Vende.remove(cv3);		Vende.remove(cv4);		Vende.remove(cv5);		Vende.remove(cv6);		Vende.remove(cv7);
		Vende.remove(cv8);		Vende.remove(cv9);		Vende.remove(cv11);		Vende.remove(cv13);		Vende.remove(cv14);		Vende.remove(cv15);
		Vende.remove(cv17);		Vende.remove(cv19);		Vende.remove(cv21);		Vende.remove(cv23);		Vende.remove(cv25);		Vende.remove(cv26);
		Vende.remove(cv28);		Vende.remove(cv29);		Vende.remove(cv31);		Vende.remove(cv32);		Vende.remove(cv33);		Vende.remove(cv34);
		Vende.remove(cv35);		Vende.remove(cv36);		Vende.remove(cv38);		Vende.remove(cv39);		Vende.remove(t9);		somaVenda=0;
		Vende.repaint();
	}
	
	static void AdicionaDadosVenda() {
		cv1  = new Checkbox("Leblon"); 							cv1.setBounds(20, 40, 200, 20); Vende.add(cv1);
		cv3  = new Checkbox("Av. Presidente Vargas"); 			cv3.setBounds(20, 60, 200, 20); Vende.add(cv3);
		cv4  = new Checkbox("Av. Nossa Sra. De Copacabana"); 	cv4.setBounds(20, 80, 200, 20); Vende.add(cv4);
		cv5  = new Checkbox("Companhia Ferroviária"); 			cv5.setBounds(20, 100, 200, 20); Vende.add(cv5);
		cv6  = new Checkbox("Av. Brigadeiro Faria Lima"); 		cv6.setBounds(20, 120, 200, 20); Vende.add(cv6);
		cv7  = new Checkbox("Companhia de Viação"); 			cv7.setBounds(20, 140, 200, 20); Vende.add(cv7);
		cv8  = new Checkbox("Av. Rebouças"); 					cv8.setBounds(20, 160, 200, 20); Vende.add(cv8);
		cv9  = new Checkbox("Av. 9 de Julho"); 					cv9.setBounds(20, 180, 200, 20); Vende.add(cv9);
		cv11 = new Checkbox("Av. Europa"); 						cv11.setBounds(20, 200, 200, 20); Vende.add(cv11);
		cv13 = new Checkbox("Rua Augusta"); 					cv13.setBounds(20, 220, 200, 20); Vende.add(cv13);
		cv14 = new Checkbox("Av. Pacaembú"); 					cv14.setBounds(20, 240, 200, 20); Vende.add(cv14);
		cv15 = new Checkbox("Companhia de Táxi"); 				cv15.setBounds(20, 260, 200, 20); Vende.add(cv15);
		cv17 = new Checkbox("Interlagos"); 						cv17.setBounds(20, 280, 200, 20); Vende.add(cv17);
		cv19 = new Checkbox("Morumbi"); 						cv19.setBounds(20, 300, 200, 20); Vende.add(cv19);
		cv21 = new Checkbox("Flamengo"); 						cv21.setBounds(225, 40, 200, 20); Vende.add(cv21);
		cv23 = new Checkbox("Botafogo"); 						cv23.setBounds(225, 60, 200, 20); Vende.add(cv23);
		cv25 = new Checkbox("Companhia de Navegação"); 			cv25.setBounds(225, 80, 200, 20); Vende.add(cv25);
		cv26 = new Checkbox("Av. Brasil"); 						cv26.setBounds(225, 100, 200, 20); Vende.add(cv26);
		cv28 = new Checkbox("Av. Paulista"); 					cv28.setBounds(225, 120, 200, 20); Vende.add(cv28);
		cv29 = new Checkbox("Jardim Europa"); 					cv29.setBounds(225, 140, 200, 20); Vende.add(cv29);
		cv31 = new Checkbox("Copacabana"); 						cv31.setBounds(225, 160, 200, 20); Vende.add(cv31);
		cv32 = new Checkbox("Companhia de Aviação"); 			cv32.setBounds(225, 180, 200, 20); Vende.add(cv32);
		cv33 = new Checkbox("Av. Vieira Souto"); 				cv33.setBounds(225, 200, 200, 20); Vende.add(cv33);
		cv34 = new Checkbox("Av. Atlântica"); 					cv34.setBounds(225, 220, 200, 20); Vende.add(cv34);
		cv35 = new Checkbox("Companhia de Táxi Aéreo"); 		cv35.setBounds(225, 240, 200, 20); Vende.add(cv35);
		cv36 = new Checkbox("Ipanema"); 						cv36.setBounds(225, 260, 200, 20); Vende.add(cv36);
		cv38 = new Checkbox("Jardim Paulista"); 				cv38.setBounds(225, 280, 200, 20); Vende.add(cv38);
		cv39 = new Checkbox("Brooklin"); 						cv39.setBounds(225, 300, 200, 20); Vende.add(cv39);
		Vende.add(t9);
		Vende.repaint();
	}
	
	static void ResetDados() {
		cv1.setState(false);  cv1.setEnabled(false);
		cv3.setState(false);  cv3.setEnabled(false);
		cv4.setState(false);  cv4.setEnabled(false);
		cv5.setState(false);  cv5.setEnabled(false); 
		cv6.setState(false);  cv6.setEnabled(false); 
		cv7.setState(false);  cv7.setEnabled(false); 
		cv8.setState(false);  cv8.setEnabled(false); 
		cv9.setState(false);  cv9.setEnabled(false); 
		cv11.setState(false); cv11.setEnabled(false); 
		cv13.setState(false); cv13.setEnabled(false); 
		cv14.setState(false); cv14.setEnabled(false); 
		cv15.setState(false); cv15.setEnabled(false); 
		cv17.setState(false); cv17.setEnabled(false); 
		cv19.setState(false); cv19.setEnabled(false); 
		cv21.setState(false); cv21.setEnabled(false);
		cv23.setState(false); cv23.setEnabled(false);
		cv25.setState(false); cv25.setEnabled(false);
		cv26.setState(false); cv26.setEnabled(false);
		cv28.setState(false); cv28.setEnabled(false); 
		cv29.setState(false); cv29.setEnabled(false);
		cv31.setState(false); cv31.setEnabled(false); 
		cv32.setState(false); cv32.setEnabled(false); 
		cv33.setState(false); cv33.setEnabled(false);
		cv34.setState(false); cv34.setEnabled(false); 
		cv35.setState(false); cv35.setEnabled(false); 
		cv36.setState(false); cv36.setEnabled(false); 
		cv38.setState(false); cv38.setEnabled(false); 
		cv39.setState(false); cv39.setEnabled(false);
		Vende.repaint();
	}
	
	static void BCompraHotel() {
		 bHotel = new Button ("Comprar hotel");
		 bHotel.setBounds(970,653,120,25);
		 bHotel.addActionListener(new CompraHotel());
		 bHotel.setEnabled(false);
	}
	static class CompraHotel implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			Vende.dispose();
			bDado.setEnabled(true);
			bSalvar.setEnabled(true);
			bVenderProp.setEnabled(false);
			ck7.setEnabled(true);
			if (Controller.getNcasas(Controller.getJPosicao(vez[turno2])) > 0 && Controller.getNcasas(Controller.getJPosicao(vez[turno2])) <= 4 ) {
				if (Controller.getHotel(Controller.getJPosicao(vez[turno2])) <= 0 ) {
					System.out.println("Você comprou um hotel nesta propriedade e seu gasto foi de "+Controller.getEAluguel(6, Controller.getJPosicao(vez[turno2]))+".");
					Controller.setDinheiro(Controller.getDinheiro(vez[turno2])-Controller.getEAluguel(6, Controller.getJPosicao(vez[turno2])), vez[turno2]);
					Controller.setBanco(Controller.getBanco()+Controller.getEAluguel(6, Controller.getJPosicao(vez[turno2])));
					Controller.setHotel(1, Controller.getJPosicao(vez[turno2]));
					bHotel.setEnabled(false);
				}else {
					bHotel.setEnabled(false);					
				}
			}
			frameTab.repaint();
		}
	}
	
	static void BSalvarJogo() {
		 bSalvar = new Button ("Salvar Jogo");
		 bSalvar.setBounds(1100,50,80,40);
		 bSalvar.addActionListener(new SalvarJogo());
	}
	static class SalvarJogo implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			try {
				Controller.salvaJogo(qtdPlayers,vez,turno,turno2,repete,posicaoini);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	static void BFinalizarJogo() {
		 bFim = new Button ("Terminar o Jogo");
		 bFim.setBounds(970,50,120,40);
		 bFim.addActionListener(new TerminarJogo());
	}
	
	static class TerminarJogo implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			frameTab.dispose();
			Terminar.setTitle("Vencedor do jogo");
			
			Terminar.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					frameTab.dispose();
					sorteioInicial.dispose();
					frameWellcome.dispose();
					poucosJogadores.dispose();
					Vende.dispose();
					Terminar.dispose();
			}});
			
			Toolkit tk=Toolkit.getDefaultToolkit();
			Dimension screenSize=tk.getScreenSize();
			int sl=screenSize.width;
			int sa=screenSize.height;
			int k=sl/2-tabWidth/2;
			int l=sa/2-tabHeight/2;
			
			Terminar.setBounds(k, l, tabWidth, tabHeight);		
			Terminar.setVisible(true);
		}
	}
	
	static void terminarjogo2 () {
		frameTab.dispose();
		Terminar.setTitle("Vencedor do jogo");
		
		Terminar.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frameTab.dispose();
				sorteioInicial.dispose();
				frameWellcome.dispose();
				poucosJogadores.dispose();
				Vende.dispose();
				Terminar.dispose();
		}});
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl=screenSize.width;
		int sa=screenSize.height;
		int k=sl/2-tabWidth/2;
		int l=sa/2-tabHeight/2;
		
		Terminar.setBounds(k, l, tabWidth, tabHeight);		
		Terminar.setVisible(true);
	}
	
	static class Ranking2D extends Component {
		public void paint(Graphics g) {
			String vetor[] = new String[qtdPlayers];
			vetor=ranking();
			Graphics2D g2d = (Graphics2D)g;
			String i;
			for (int n = 0; n < qtdPlayers; n++) {
				i = ""+(n+1);
				g2d.drawString("Jogador:"+vetor[n]+" posição "+i,500,100*(n+1));			
			}
		}
	}
	static String[] ranking() {
		String vetor[] = new String[qtdPlayers];
		int vetorInt[] = new int[qtdPlayers];
		int t;
		String p1;
		// Inicializando o vetorInt // 
		for (int n = 0; n < qtdPlayers; n++) {
			vetorInt[n]=Controller.getDinheiro(vez[n]);
			vetor[n]=vez[n];
		}
		for (int i = 0; i < qtdPlayers; i++) {
			for(int j = 0; j < qtdPlayers; j++) {
				if(vetorInt[j]>vetorInt[i] && j>i) {
					p1 = vetor[i];
					vetor[i]=vetor[j];  
					vetor[j]=p1;
					t = vetorInt[i];
					vetorInt[i]=vetorInt[j];
					vetorInt[j]=t;
				}
			}
		}
		return vetor;
	}
	
	static void Butao() {
		 bDado = new Button ("Rolar Dados");
	     bDado.setBounds(1100,600,80,79);
	     bDado.addActionListener(new RegraDado());
	}
	
	static class RegraDado implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			 prisaoPartida = 0;
		     grafico = 0;
			 System.out.printf("Turno: "+turno+"- vez: "+vez[turno]+
					 " - Posicão inicial: "+Controller.getJPosicao(vez[turno]));
			 sorteioInicial.dispose();
			 frameWellcome.dispose();
			 poucosJogadores.dispose();
			 Vende.dispose();
			 
			 switch(vez[turno]) {
			 	case "Preto":
			 		Rodada(vez[turno], VetorPosJ1);
			 		break;
			 	case "Amarelo":
			 		Rodada(vez[turno], VetorPosJ2);
				    break;
			 	case "Roxo":
			 		Rodada(vez[turno], VetorPosJ3);
					break;
			 	case "Azul":
			 		Rodada(vez[turno], VetorPosJ4);
					break;
			 	case "Vermelho":
			 		Rodada(vez[turno], VetorPosJ5);
					break;
			 	case "Laranja":
			 		Rodada(vez[turno], VetorPosJ6);
					break;
			 	default:
			 }
			 if (repete==0) {
				 turno2 = turno - 1;
				 turno2++;
				 if (turno2 >= qtdPlayers)
					 turno2 = 0;
			 }
			 repete=0;
			 turno++;
			 if (turno >= qtdPlayers) {
				 sorteioInicial.dispose();
				 turno = 0;
			 }
			 frameTab.repaint();
		 }
	}
	
	static void Rodada (String JogadorDaVez, int VetorPos[]) {
		bTerreno.setEnabled(false);
		bCasa.setEnabled(false);
		bHotel.setEnabled(false);
		frameTab.repaint();
		somaVenda = 0;
		checa = true;
		Controller.reroll();
		valorD1=Controller.getDValorD1();
		valorD2=Controller.getDValorD2();
		
		if(ck7.getState()==true) {
	        try {
	        	valorD1 = Integer.parseInt(t7.getText());
	        	valorD2 = Integer.parseInt(t8.getText());
	        }
	        catch (NumberFormatException ex) {
	            ex.printStackTrace();
	        }
	        Controller.setDValorD1(valorD1);
	        Controller.setDValorD2(valorD2);
	        Controller.setTotal(valorD1+valorD2);
		}
		
		int i=0, num = 0;
		
		if(JogadorDaVez=="Amarelo") {	
			num = 2;
			i = 1;
		}
		else if(JogadorDaVez=="Roxo") {
			num=4;
			i = 2;
		}
		else if(JogadorDaVez=="Azul"){
			num=6;
			i = 3;
		}
		else if(JogadorDaVez=="Vermelho"){
			num=8;
			i = 4;
		}
		else if(JogadorDaVez=="Laranja"){
			num=10;
			i = 5;	
		}
		// Tratamento de prisão 1
		if ( (Controller.getTem_liberdade(JogadorDaVez)) ==1 && (Controller.getEstado_Preso(JogadorDaVez)==1) ) {
			Controller.setTem_liberdade(0, JogadorDaVez);
			Controller.setEstado_Preso(0, JogadorDaVez);
			System.out.println("\nJogador "+Controller.getJNome(JogadorDaVez)+" ("+JogadorDaVez+") usa a carta saída livre da prisão."); // Mudar para apresentar no tabuleiro
		}
		if (Controller.getIguais()!=0) {			//tirou dupla! --> d.prison++
			if (Controller.getPrison()==1) {
				if (Controller.getEstado_Preso(JogadorDaVez)==1 || Controller.getEstado_Preso(JogadorDaVez)==2 || Controller.getEstado_Preso(JogadorDaVez)==3) {
					Controller.setEstado_Preso(0, JogadorDaVez);
					System.out.print("\nLiberdade! Jogador tirou dupla nos dados, acumulou 1 dupla e se somar 3 seguidas voltará para a prisão.");
				}
			}
			else if (Controller.getPrison()==2) {
				Controller.setEstado_Preso(0, JogadorDaVez);
			}
			else if (Controller.getPrison()==3) {
				Controller.setEstado_Preso(1, JogadorDaVez);
				Controller.setJPosicao(JogadorDaVez, 10);
				Controller.setPrison(0);
				System.out.println("\nJogador "+Controller.getJNome(JogadorDaVez)+" ("+JogadorDaVez+") foi para a prisão, tirou 3 duplas seguidas.");
				posicaoini[num+1]=VetorPos[40];
	            posicaoini[num]=VetorPos[Controller.getJPosicao(JogadorDaVez)];
				frameTab.repaint();
				return;
			}
		}
		
		// Tratamento de prisão 2
		if (Controller.getEstado_Preso(JogadorDaVez)==1 && Controller.getTem_liberdade(JogadorDaVez)==0) {
			if (Controller.getIguais()==1) {
				Controller.setEstado_Preso(0, JogadorDaVez);
				Controller.setPrison(1);
				System.out.println("\nJogador tirou uma dupla e está livre! Ficou 1 rodada preso.");
                System.out.println("Jogador tem 1 dupla acumulada, se somar 3 volta para a prisão.");
			}else {
				System.out.println("Jogador "+Controller.getJNome(JogadorDaVez)+" ("+JogadorDaVez+")  preso por 1 rodada.");
				Controller.setEstado_Preso(Controller.getEstado_Preso(JogadorDaVez)+1, JogadorDaVez);
				Controller.setJPosicao(JogadorDaVez, 10);
				return;
			}
		}else if (Controller.getEstado_Preso(JogadorDaVez)==2) {
			if (Controller.getIguais()==1) {
				Controller.setEstado_Preso(0, JogadorDaVez);
				Controller.setPrison(1);
				System.out.println("\nJogador tirou uma dupla e está livre! Ficou 2 rodadas preso.");
                System.out.println("Jogador tem 1 dupla acumulada, se somar 3 volta para a prisão.");
			}else {
				System.out.println("Jogador preso por 2 rodadas.");
				Controller.setEstado_Preso(Controller.getEstado_Preso(JogadorDaVez)+1, JogadorDaVez);
				Controller.setJPosicao(JogadorDaVez, 10);
				return;
			}
		}else if (Controller.getEstado_Preso(JogadorDaVez)==3) {
			if (Controller.getIguais()==1) {
				Controller.setEstado_Preso(0, JogadorDaVez);
				Controller.setPrison(1);
				System.out.println("\nJogador tirou uma dupla e está livre! Ficou 3 rodadas preso.");
                System.out.println("Jogador tem 1 dupla acumulada, se somar 3 volta para a prisão.");
			}else {
				System.out.println("Jogador preso por 3 rodadas, ele será libertado na próxima rodada.");
				Controller.setJPosicao(JogadorDaVez, 10);
				Controller.setEstado_Preso(0, JogadorDaVez);
				Controller.setPrison(0);
				return;
			}
		}
		frameTab.repaint();
		
		if (Controller.getEstado_Preso(JogadorDaVez)==0) {
			Controller.setJPosicao(JogadorDaVez, (Controller.getJPosicao(JogadorDaVez)+valorD1+valorD2) ); 
			if(Controller.getJPosicao(JogadorDaVez)>39) {
				Controller.setJPosicao(JogadorDaVez, Controller.getJPosicao(JogadorDaVez)-40);
				Controller.setDinheiro(Controller.getDinheiro(JogadorDaVez)+200, JogadorDaVez);
			}
			System.out.println(" - Posicão final: "+Controller.getJPosicao(JogadorDaVez));
			System.out.println("Jogador "+Controller.getJNome(JogadorDaVez)+" ("+JogadorDaVez+") possui, no inicio dessa rodada, $"+Controller.getDinheiro(JogadorDaVez)+".");
		}
		if (Controller.getJPosicao(JogadorDaVez)<=10) {
			posicaoini[num+1]=VetorPos[40];
            posicaoini[num]=VetorPos[Controller.getJPosicao(JogadorDaVez)];
        }
        else if (Controller.getJPosicao(JogadorDaVez)>10 && Controller.getJPosicao(JogadorDaVez)<=20) {
       	 	posicaoini[num+1]=VetorPos[Controller.getJPosicao(JogadorDaVez)];
            posicaoini[num]=VetorPos[10];
        }
        else if (Controller.getJPosicao(JogadorDaVez)>20 && Controller.getJPosicao(JogadorDaVez)<=30) {
       	 	posicaoini[num+1]=VetorPos[20];
            posicaoini[num]=VetorPos[Controller.getJPosicao(JogadorDaVez)];
        }
        else if (Controller.getJPosicao(JogadorDaVez)>30 && Controller.getJPosicao(JogadorDaVez)<=40) {
       	 	posicaoini[num+1]=VetorPos[Controller.getJPosicao(JogadorDaVez)];
            posicaoini[num]=VetorPos[0];
        }
		
		///  Position ////
		
        if(Controller.getDono(Controller.getJPosicao(JogadorDaVez)).equals("Nada")) {
        }
        else if(Controller.getDono(Controller.getJPosicao(JogadorDaVez)).equals("Lucros")) {
            System.out.println("Jogador "+JogadorDaVez+" ganhou $200.");
            Controller.setBanco(Controller.getBanco()-200);
            Controller.setDinheiro( ((Controller.getDinheiro(JogadorDaVez))+200), JogadorDaVez);
        }
        else if(Controller.getDono(Controller.getJPosicao(JogadorDaVez)).equals("Imposto")) {
            System.out.println("Jogador "+JogadorDaVez+" perdeu $200.");
            Controller.setBanco(Controller.getBanco()+200);
            Controller.setDinheiro( ((Controller.getDinheiro(JogadorDaVez))-200), JogadorDaVez);
        }
        else if(Controller.getDono(Controller.getJPosicao(JogadorDaVez)).equals("SorteRevez")) {
        	System.out.println("SorteReves valor: "+Controller.getCEfeitos(Controller.getCBaralho(Controller.getCVerificador())));
        	if(Controller.getCEfeitos(Controller.getCBaralho(Controller.getCVerificador()))<500) {
        		Controller.setDinheiro((Controller.getDinheiro(JogadorDaVez))+Controller.getCEfeitos(Controller.getCBaralho(Controller.getCVerificador())), JogadorDaVez);
        		Controller.setBanco(Controller.getBanco()-Controller.getCEfeitos(Controller.getCBaralho(Controller.getCVerificador())));
			}
			else if(Controller.getCEfeitos(Controller.getCBaralho(Controller.getCVerificador()))==500) {		//Pegou passe livre da prisão
				Controller.setTem_liberdade(1, JogadorDaVez);
			}else if(Controller.getCEfeitos(Controller.getCBaralho(Controller.getCVerificador()))==550) {		//Receba 50 de cada um
				Controller.setDinheiro(Controller.getDinheiro(JogadorDaVez)+(50*(qtdPlayers-1)), JogadorDaVez);
				System.out.println("Você apostou com os parceiros deste jogo e ganhou. Receba $50 de cada um.");
				switch (qtdPlayers) {
					case 2:
						if (vez[turno] == vez[0]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
						}else if (vez[turno] == vez[1]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);
						}
						break;
					case 3:
						if (vez[turno] == vez[0]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);
						}else if (vez[turno] == vez[1]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);
						}else if (vez[turno] == vez[2]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
						}
						break;
					case 4:
						if (vez[turno] == vez[0]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);
							Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);
						}else if (vez[turno] == vez[1]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);
							Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);
						}else if (vez[turno] == vez[2]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
							Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);
						}else if (vez[turno] == vez[3]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
							Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);
						}
						break;
					case 5:
						if (vez[turno] == vez[0]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);
							Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);Controller.setDinheiro((Controller.getDinheiro(vez[4])-50),vez[4]);
						}else if (vez[turno] == vez[1]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);
							Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);Controller.setDinheiro((Controller.getDinheiro(vez[4])-50),vez[4]);
						}else if (vez[turno] == vez[2]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
							Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);Controller.setDinheiro((Controller.getDinheiro(vez[4])-50),vez[4]);
						}else if (vez[turno] == vez[3]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
							Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);Controller.setDinheiro((Controller.getDinheiro(vez[4])-50),vez[4]);
						}else if (vez[turno] == vez[4]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
							Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);
						}
						break;
					case 6:
						if (vez[turno] == vez[0]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);
							Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);Controller.setDinheiro((Controller.getDinheiro(vez[4])-50),vez[4]);
							Controller.setDinheiro((Controller.getDinheiro(vez[5])-50),vez[5]);
						}else if (vez[turno] == vez[1]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);
							Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);Controller.setDinheiro((Controller.getDinheiro(vez[4])-50),vez[4]);
							Controller.setDinheiro((Controller.getDinheiro(vez[5])-50),vez[5]);
						}else if (vez[turno] == vez[2]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
							Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);Controller.setDinheiro((Controller.getDinheiro(vez[4])-50),vez[4]);
							Controller.setDinheiro((Controller.getDinheiro(vez[5])-50),vez[5]);
						}else if (vez[turno] == vez[3]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
							Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);Controller.setDinheiro((Controller.getDinheiro(vez[4])-50),vez[4]);
							Controller.setDinheiro((Controller.getDinheiro(vez[5])-50),vez[5]);
						}else if (vez[turno] == vez[4]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
							Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);
							Controller.setDinheiro((Controller.getDinheiro(vez[5])-50),vez[5]);
						}else if (vez[turno] == vez[5]) {
							Controller.setDinheiro((Controller.getDinheiro(vez[0])-50),vez[0]);Controller.setDinheiro((Controller.getDinheiro(vez[1])-50),vez[1]);
							Controller.setDinheiro((Controller.getDinheiro(vez[2])-50),vez[2]);Controller.setDinheiro((Controller.getDinheiro(vez[3])-50),vez[3]);
							Controller.setDinheiro((Controller.getDinheiro(vez[4])-50),vez[4]);
						}
						break;
					default:
				}
			}else if(Controller.getCEfeitos(Controller.getCBaralho(Controller.getCVerificador()))==600) {		//Go to the prison
				//grafico = 1;
				if(Controller.getTem_liberdade(JogadorDaVez)==1) {
					Controller.setTem_liberdade(0, JogadorDaVez);
				}
				else {
					Controller.setEstado_Preso(1, JogadorDaVez);
					Controller.setJPosicao(JogadorDaVez, 10);
					posicaoini[num+1]=VetorPos[40];
		            posicaoini[num]=VetorPos[Controller.getJPosicao(JogadorDaVez)];
		            prisaoPartidaCartas.vaParaPrisao();
		            frameTab.repaint();
					Controller.setVerificador(Controller.getCVerificador()+1);
					if(Controller.getCVerificador()==29) {
						Controller.newC();
					}
					//frameTab.repaint();
					return;
				}
			}else if(Controller.getCEfeitos(Controller.getCBaralho(Controller.getCVerificador()))==650) {		//Go to start line
				//grafico = 2;
				frameTab.repaint();
				Controller.setJPosicao(JogadorDaVez, 0);
				posicaoini[num+1]=VetorPos[40];
	            posicaoini[num]=VetorPos[Controller.getJPosicao(JogadorDaVez)];
	            Controller.setDinheiro((Controller.getDinheiro(JogadorDaVez)+200), JogadorDaVez);
	            prisaoPartidaCartas.avanceAtePontoDePartida();
	            frameTab.repaint();
			}
        	Controller.setVerificador(Controller.getCVerificador()+1);
			if(Controller.getCVerificador()==29) {
				Controller.newC();
			}
        }
        else if(Controller.getDono(Controller.getJPosicao(JogadorDaVez)).equals("void")) {
        	bTerreno.setEnabled(true);
        	bCasa.setEnabled(false);
        	bHotel.setEnabled(false);
			frameTab.repaint();
        }
        else if (Controller.getDono(Controller.getJPosicao(JogadorDaVez)).equals("Prisao")) {
        	Controller.setEstado_Preso(1, JogadorDaVez);
        	Controller.setJPosicao(JogadorDaVez, 10);
        	posicaoini[num+1]=VetorPos[40];
            posicaoini[num]=VetorPos[Controller.getJPosicao(JogadorDaVez)];
			frameTab.repaint();
			System.out.println("\nJogador "+Controller.getJNome(JogadorDaVez)+" ("+JogadorDaVez+") foi para a prisão!");
			return;
        }
        else if(!Controller.getDono(Controller.getJPosicao(JogadorDaVez)).equals(JogadorDaVez)) {
        	Controller.pagaAluguelCasaHotel(JogadorDaVez,Controller.getDono(Controller.getJPosicao(JogadorDaVez)),Controller.getTotal());
        }
        else if(Controller.getDono(Controller.getJPosicao(JogadorDaVez)).equals(JogadorDaVez )) {
    		bTerreno.setEnabled(false);
        	if (Controller.getNcasas(Controller.getJPosicao(JogadorDaVez)) >= 1 && Controller.getHotel(Controller.getJPosicao(JogadorDaVez)) == 0 ) {
        		bHotel.setEnabled(true);
        	}
        	if (Controller.getNcasas(Controller.getJPosicao(JogadorDaVez)) >= 4 || Controller.getECor(Controller.getJPosicao(JogadorDaVez)).equals("cinza")) {
        		bCasa.setEnabled(false);
        	}else {
        		bCasa.setEnabled(true);
        	}
			frameTab.repaint();
        }
        
        	
        if(Controller.getIguais()!=0) {
        	Controller.setPrison( (Controller.getPrison())-1 );
			System.out.println(JogadorDaVez+" tirou numeros iguais e jogara novamente. Contagem: "+Controller.getPrison());
        	turno--;
			if (turno < 0) {
				turno = qtdPlayers-1;
			}
			turno2=turno;
			turno2++;
			if (turno2 == qtdPlayers) {
				turno2 = 0;
			}
			repete=1;
			return;
        }
		
		if (Controller.getDinheiro(vez[turno]) <= 0) {
			bVenderProp.setEnabled(true);
			bDado.setEnabled(false);
			frameTab.repaint();
		}
	}
	
	public static void main(String[] args) {		
		wellcome();
		EscolherDados();
		Butao();
		BCompraTerreno();
		BCompraCasa();
		BCompraHotel();
		BSalvarJogo();
		BFinalizarJogo();
		BVenderProp();
		frameTab.add(bVenderProp);
		bVenderProp.setEnabled(false);
		frameTab.add(bDado);
		frameTab.add(bTerreno);
		frameTab.add(bCasa);
		frameTab.add(bHotel);
		frameTab.add(bSalvar);
		frameTab.add(bFim);
		frameTab.add(new CustomPaintComponent());
		Terminar.add(new Ranking2D());
		Vende.setVisible(false);
		frameTab.setSize(tabWidth, tabHeight);
		frameTab.setTitle("Banco Imobiliário");
		frameTab.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frameTab.dispose();
				sorteioInicial.dispose();
				frameWellcome.dispose();
				poucosJogadores.dispose();
				Vende.dispose();
		}});
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl=screenSize.width;
		int sa=screenSize.height;
		int k=sl/2-tabWidth/2;
		int l=sa/2-tabHeight/2;
		frameTab.setBounds(k, l, tabWidth, tabHeight);
		frameTab.setVisible(false);
		
		//adicionar o observador ao abservado
		prisaoPartidaCartas.addObserver(prisaoPartidaMain);
		
		//imagem SorteReves prisao Partida
		
	}
	
	public void windowClosing(WindowEvent e) {
		this.dispose();
	}
	//Cartas
	public static Image getCarta(int tag) {
		return c.getCarta(tag);
	}
	//Companhias
	public static Image getCompany(int tag) {
		return comp.getCompany(tag);
	}
	//Dados
	public static Image getDado(int x) {
		return d.getDado(x);
	}
	//Jogadores
	public static Image getPino(String cor) {
		return j.getPino(cor);
	}
	//Tabuleiro
	public static Image getTab() {
		return t.getTab();
	}
	//Territorio
	public static Image getTerritory(int tag) {
		return ter.getTerritory(tag);
	}
	//Main
	public static void setQtdPlayers (int n) {
		qtdPlayers = n;
	}
	public static int getQtdPlayers () {
		return qtdPlayers;
	}
	public static void setTurno (int n) {
		turno = n;
	}
	public static void setTurno2 (int n) {
		turno2 = n;
	}
	public static void setPosicaoini (int indice, int pos) {
		posicaoini[indice] = pos;
	}
	public static void setVez (int n, String cor) {
		vez[n] = cor;
	}
	public static String getVez(int n) {
		return vez[n];
	}
	public static int getRepete() {
		return repete;
	}
	public static void setRepete (int n) {
		repete = n;
	}	
}