package graficos;

import javax.swing.*;

import java.awt.*;

public class LaminaLateral extends JPanel{
	
	public LaminaLateral(String fuenteSelecionada, String estiloSelecionado, String tamagnoSelecionado) {
		
		setBackground(new Color(250,247,179));
		
		setLayout(new GridLayout(3, 3));
		
//		fuenteSelec=new JLabel("Fuente: Arial"); //hacer que el parametro se conecto con la clase lamina
//		
//		estiloSelec=new JLabel("Estilo: Plano");
//		
//		tamagnoSelec=new JLabel("Tamaño: 12");
//		
		
		fuenteSelec=new JLabel(fuenteSelecionada); //hacer que el parametro se conecto con la clase lamina
		
		estiloSelec=new JLabel(estiloSelecionado);
		
		tamagnoSelec=new JLabel(tamagnoSelecionado);
		add(fuenteSelec);
		
		add(estiloSelec);
		
		add(tamagnoSelec);
	}
	
	 public JLabel getFuenteSelec() {
		return fuenteSelec;
	}

	public void setFuenteSelec(String texto) {

		fuenteSelec.setText(texto);
	}

	protected JLabel getEstiloSelec() {
		return estiloSelec;
	}

	protected void setEstiloSelec(JLabel estiloSelec) {
		this.estiloSelec = estiloSelec;
	}

	protected JLabel getTamagnoSelec() {
		return tamagnoSelec;
	}

	protected void setTamagnoSelec(JLabel tamagnoSelec) {
		this.tamagnoSelec = tamagnoSelec;
	}

	 JLabel fuenteSelec;
	
	 JLabel estiloSelec;
	
	 JLabel tamagnoSelec;
}
