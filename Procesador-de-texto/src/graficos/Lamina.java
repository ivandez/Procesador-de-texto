package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Lamina extends JPanel{

	public Lamina() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu=new JPanel();
		
		laminaMenu.setBackground(new Color(67,144,248));
		
		
				
		JMenuBar barraMenu=new JMenuBar();
		
		areaTexto=new JTextPane();
				
		//--Menu
		
		fuente=new JMenu("Fuente");
		
		estilo=new JMenu("Estilo");
		
		tam=new JMenu("Tamaño");
		
		
		//--Creando los elementos
		
		creaMenu("Arial", "fuente", "Arial", 9, 10);
		
		creaMenu("Courier", "fuente", "Courier", 9, 10);
		
		creaMenu("Verdana", "fuente", "Verdana", 9, 10);
		
		creaMenu("Negrita", "estilo", "", Font.BOLD, 10);
		
		creaMenu("Cursiva", "estilo", "", Font.ITALIC, 10);
		
		creaMenu("12", "tamagno", "", 9, 12);
		
		creaMenu("14", "tamagno", "", 9, 14);
		
		creaMenu("16", "tamagno", "", 9, 16);
		
		creaMenu("18", "tamagno", "", 9, 18);
		
		creaMenu("20", "tamagno", "", 9, 20);
		
		creaMenu("24", "tamagno", "", 9, 24);
		
		
		//--Agregando el menu al JMenuBar
		
		barraMenu.add(fuente);
		
		barraMenu.add(estilo);
		
		barraMenu.add(tam);
				
		//--Agregando el menu bar al jPane
		
		laminaMenu.add(barraMenu);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		add(menuLateral, BorderLayout.EAST);
		
		add(areaTexto, BorderLayout.CENTER);
	}
	
	//este metodo crea los JMenuItem
	public void creaMenu(String rotulo, String agregarAMenu, String tipoLetra, int estiloLetra, int tamagno) {
		/* rotulo: sirve para especificar el nombre que tendra el menu
		 * agregarAMenu: sirve para especificar a que menu ira el elemento
		 * tipoLetra: se refiere a negrita o cursiva 
		 * tipoLetra: que tipo de letra tendra, verdana, arial... 
		 * tamagno: el tamaño que tendra la letra		  
		 * */
		
		JMenuItem elementoMenu= new JMenuItem(rotulo);
		
		if(agregarAMenu=="fuente") {
			
			fuente.add(elementoMenu);
			
		}
		
		else if(agregarAMenu=="estilo") {
			
			estilo.add(elementoMenu);
			
		}
		
		else if(agregarAMenu=="tamagno") {
			
			tam.add(elementoMenu);
												
		}
		
		elementoMenu.addActionListener(new GetionaEventos(rotulo, tipoLetra, estiloLetra, tamagno ));
		
		
		
		
	}
	
	private class GetionaEventos implements ActionListener{
		
		GetionaEventos(String elemento, String texto, int estiloLetra, int tamagnoLetra){
			/* elemento: se refiere al JMenuItem pulado
			 * texto: se refiere a arial, verdana o cursiva 
			 * estiloLetra: se refiere a negrita o cursiva
			 * tamagnoLetra: al tamaño de la letra 12,14,16,18,20*/
			
			menu=elemento;
			
			tipoFuente=texto;
			
			this.estiloLetra=estiloLetra;
			
			this.tamagnoLetra=tamagnoLetra;
			
		}
		

		@Override
		public void actionPerformed(ActionEvent e) { // modificar todo lo de abajo
			// TODO Auto-generated method stub
			
			letras=areaTexto.getFont();
			
			if(menu=="Arial" || menu=="Verdana" || menu=="Courier") {
				
				estiloLetra=letras.getStyle();
				
				tamagnoLetra=letras.getSize();
				
				if(menu=="Arial") {
					
					//fuenteSelec.setText("Fuente: Arial");
					menuLateral.setFuenteSelec("test");
					System.out.println("si funciona");
				}
				
				else if(menu=="Verdana") {
					
					//fuenteSelec.setText("Fuente: Verdana");
					
					menuLateral.setFuenteSelec("asdasd");
					
				}

				else if(menu=="Courier") {
	
					//fuenteSelec.setText("Fuente: Courier");
				}
				
				
				System.out.println(letras.getFontName());
				
							
			}
			
			if(menu=="Cursiva" || menu=="Negrita") {
				
				if(letras.getStyle()==1 || letras.getStyle()==2) {
					
					estiloLetra=3;
					
				}
				
				tipoFuente=letras.getFontName();
				
				tamagnoLetra=letras.getSize();
				
				if(menu=="Cursiva") {
					
					//estiloSelec.setText("Estilo: Cursiva");
					
				}
				
				else if(menu=="Negrita") {
					
					//estiloSelec.setText("Estilo: Negrita");
					
				}
				
				
			}
			
			if(menu=="12" || menu=="14" || menu=="16" || menu=="18" || menu=="20" || menu=="24") {
				
				estiloLetra=letras.getStyle();
				
				tipoFuente=letras.getFontName();
				
				if(menu=="12") {
					
					//tamagnoSelec.setText("Tamaño: 12");
					
				}
				
				else if(menu=="14") {
					
					//tamagnoSelec.setText("Tamaño: 14");
					
				}
				
				else if(menu=="16") {
					
					//tamagnoSelec.setText("Tamaño: 16");
					
				}
				
				else if(menu=="18") {
					
					//tamagnoSelec.setText("Tamaño: 18");
					
				}
				
				else if(menu=="20") {
					
					//tamagnoSelec.setText("Tamaño: 20");
					
				}
				
				else if(menu=="24") {
					
					//tamagnoSelec.setText("Tamaño: 24");
					
				}
				
			}
			
			areaTexto.setFont(new Font(tipoFuente, estiloLetra, tamagnoLetra));
			
		}
		
		private String tipoFuente, menu;
		
		private int estiloLetra, tamagnoLetra;
		
	}
	
	LaminaLateral menuLateral=new LaminaLateral("Fuente: Arial","Estilo: Plano","Tamaño: 12");
	private JTextPane areaTexto;
	
	private JMenu fuente;
	
	private JMenu estilo;
	
	private JMenu tam;
	
	private Font letras;
	
	/*private JLabel fuenteSelec;
	
	private JLabel estiloSelec;
	
	private JLabel tamagnoSelec;*/
}








