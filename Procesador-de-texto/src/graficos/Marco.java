package graficos;

import javax.swing.*;

import java.awt.*;

public class Marco extends JFrame{
	
	public Marco() {
		
		setTitle("Procesador de texto básico");
		
		setBounds(ancho/4,alto/4,400,400);
		
		ImageIcon icono = new ImageIcon(getClass().getResource("../recursos/icono.png"));
		
        Image imagen = icono.getImage(); // averiguar que hace este metodo
        
        setIconImage(imagen);
		
		Lamina miLamina=new Lamina();
		
		add(miLamina);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);  
		
	}
	
	private Toolkit t=Toolkit.getDefaultToolkit();
	
	private int alto=(int)t.getScreenSize().getHeight();
	
	private int ancho=(int)t.getScreenSize().getWidth();
	
	
	

}
