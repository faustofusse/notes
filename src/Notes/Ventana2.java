package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ventana2 extends JFrame{
	private static boolean control = false;
	public PanelNotas notas = new PanelNotas();
	public JScrollPane scroll = new JScrollPane();
	public JScrollPane scrollNuevo = new JScrollPane();
	public PanelNada nada = new PanelNada();
	
	private MenuNuevo menuNuevo = new MenuNuevo();
	private MenuNotas menuNotas = new MenuNotas();
	public PanelNuevaNota nuevo = new PanelNuevaNota();
	
	public Ventana2(){
		setSize(Const.WIDTH_VENTANA, Const.HEIGHT_VENTANA);
		setResizable(true);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		agregarComponentes();
	}
	
	private void agregarComponentes(){
		scroll.setViewportView(notas);
		scroll.setBorder(null);
		
		setPanelNotas();
	}
	
	public void reload(){
		invalidate();
		validate();
		repaint();
	}
	
	public void setPanelNotas(){
		removePaneles();
		add(menuNotas, BorderLayout.NORTH);
		if (PanelNotas.hayNotas){
			add(scroll, BorderLayout.CENTER);
		}else{
			add(nada, BorderLayout.CENTER);
		}
		PanelNuevaNota.pCambiado = false;
		reload();
	}
	
	public void setPanelNuevo(){
		removePaneles();
		add(menuNuevo, BorderLayout.NORTH);
		add(nuevo, BorderLayout.CENTER);
		reload();
	}
	
	public void removePaneles(){
		this.remove(menuNotas);
		this.remove(scroll);
		this.remove(nada);
		this.remove(notas);
		this.remove(menuNuevo);
		this.remove(nuevo);
		this.remove(scrollNuevo);
	}
}
