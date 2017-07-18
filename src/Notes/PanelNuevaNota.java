package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelNuevaNota extends JPanel{
	private JPanel pTitulo = new JPanel();
	public static JTextField titulo = new JTextField("Titulo de la nota");
	public static boolean tCambiado = false;
	
	private JPanel pParrafo = new JPanel();
	public static JTextArea parrafo = new JTextArea("Escribe el texto aqui");
	public static boolean pCambiado = false; 
	
	public PanelNuevaNota(){
		setBackground(Color.white);
		setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		
		iniciar();
	}
	
	private void iniciar(){
		add(new Espacio(300,10,Color.WHITE));
		
		pTitulo.setLayout(new BorderLayout(15,15));
		titulo.setBorder(null);
		titulo.setForeground(Color.gray);
		titulo.addFocusListener(new Focus());
		titulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		pTitulo.add(titulo);
		pTitulo.setPreferredSize(new Dimension(425,40));
		add(pTitulo);
		
		add(new Espacio(425,1,Color.gray));
		add(new Espacio(425,10,Color.white));
		
		pParrafo.setLayout(new BorderLayout(15,15));
		parrafo.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		parrafo.setForeground(Color.gray);
		parrafo.addFocusListener(new Focus());
		pParrafo.add(parrafo);
		pParrafo.setPreferredSize(new Dimension(425,400));
		add(pParrafo);
	}
}
