package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelNuevo extends JPanel{
	private JPanel pTitulo = new JPanel();
	public static Focus focus = new Focus();
	public static Titulo titulo = new Titulo();
	
	public static boolean tCambiado = false;
	
	private JPanel pParrafo = new JPanel();
	public static Parrafo parrafo = new Parrafo();
	public static boolean pCambiado = false; 
	
	public PanelNuevo(){
		setBackground(Color.white);
		setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		setPreferredSize(new Dimension(Const.WIDTH_VENTANA, Const.HEIGHT_VENTANA-75));
		
		iniciar();
	}
	
	public void iniciar(){
		pTitulo.setLayout(new BorderLayout(15,15));
		pParrafo.setLayout(new BorderLayout(15,15));
		
		pTitulo.setPreferredSize(new Dimension(425,40));
		pParrafo.setPreferredSize(new Dimension(425,400));
		
		pTitulo.add(titulo);
		pParrafo.add(parrafo);
		
		add(new Espacio(300,10,Color.WHITE));
		add(pTitulo);
		add(new Espacio(425,1,Color.gray));
		add(new Espacio(425,10,Color.white));
		add(pParrafo);
	}

	public void reiniciar() {		
		titulo.setText("Titulo de la nota");
		parrafo.setText("Escribe el texto aqui");
		
		titulo.setBorder(null);
		parrafo.setBorder(null);
		
		titulo.setForeground(Color.gray);
		parrafo.setForeground(Color.gray);
		
		tCambiado=false;
		pCambiado=false;
	}
	
	public void abrirNota(int numero){
		
		Main.ventana1.setPanelNuevo();
		titulo.setForeground(Color.black);
		tCambiado=true;
		parrafo.setForeground(Color.black);
		pCambiado=true;
		titulo.setText(PanelNotas.titulos.get(numero));
		parrafo.setText(PanelNotas.parrafos.get(numero));
		
	}
	
	public void guardarNota(){
		
		if (PanelNotas.notaAbierta < PanelNotas.botones.size()){
			
			PanelNotas.titulos.set(PanelNotas.notaAbierta, titulo.getText());
			PanelNotas.parrafos.set(PanelNotas.notaAbierta, parrafo.getText());
			Main.ventana1.panelNotas.botones.get(PanelNotas.notaAbierta).cambiarTitulo(titulo.getText());;
			Main.ventana1.setPanelNotas();
			
		}else{
			
			Main.ventana1.panelNotas.addBtn(titulo.getText(), parrafo.getText());
			Main.ventana1.setPanelNotas();
			
		}
		
	}
}
