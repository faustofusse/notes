package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ventana extends JFrame{
	
	public PanelNotas panelNotas = new PanelNotas();
	public PanelNada panelNada = new PanelNada();
	public PanelNuevo panelNuevo = new PanelNuevo();
	public MenuNuevo menuNuevo = new MenuNuevo();
	public MenuNotas menuNotas = new MenuNotas();
	public JScrollPane scroll = new JScrollPane();
	public Espacio espacioNada = new Espacio(0,0,Color.blue);
	
	public Ventana (){
		setSize(Const.WIDTH_VENTANA, Const.HEIGHT_VENTANA);
		setResizable(true);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(0,0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		scroll.setViewportView(panelNotas);
		scroll.setBorder(null);
		
		setPanelNotas();
	}

	public void setPanelNotas(){
		removePaneles();
		add(menuNotas, BorderLayout.NORTH); 
		if (PanelNotas.hayNotas){
			add(scroll, BorderLayout.CENTER);
		}else{
			add(panelNada, BorderLayout.CENTER);
		}
		reload();
	}
	
	public void setPanelNuevo(){
		removePaneles();
		panelNuevo.reiniciar();
		add(menuNuevo, BorderLayout.NORTH);
		add(panelNuevo, BorderLayout.CENTER);
		reload();
	}
	
	public void removePaneles(){
		this.remove(menuNotas);
		this.remove(scroll);
		this.remove(panelNada);
		this.remove(panelNotas);
		this.remove(menuNuevo);
		this.remove(panelNuevo);
	}
	
	public void reload(){
		invalidate();
		validate();
		repaint();
	}

}
