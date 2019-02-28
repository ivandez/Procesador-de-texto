package graficos;

import javax.swing.*;

import java.awt.*;

public class LaminaLateral extends JPanel{
	
	public LaminaLateral(String fuenteSelecionada, String estiloSelecionado, String tamagnoSelecionado) {
		
		setBackground(new Color(250,247,179));
		
		setLayout(new GridLayout(3, 3));

		fuenteSelec=new JLabel(fuenteSelecionada);
		
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

	protected void setEstiloSelec(String texto) {
		estiloSelec.setText(texto);
	}

	protected JLabel getTamagnoSelec() {
		return tamagnoSelec;
	}

	protected void setTamagnoSelec(String texto) {
		tamagnoSelec.setText(texto);
	}

	 JLabel fuenteSelec;
	
	 JLabel estiloSelec;
	
	 JLabel tamagnoSelec;
}
