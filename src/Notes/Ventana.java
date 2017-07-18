package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ventana extends JFrame{
	private static boolean control = false;
	public PanelNotas notas = new PanelNotas();
	public JScrollPane scroll = new JScrollPane();
	public PanelNada nada = new PanelNada();
	
	public Ventana(){
		setSize(465,444);
		setResizable(true);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		agregarComponentes();
	}
	
	private void agregarComponentes(){
		add(new Menu(), BorderLayout.NORTH);
		scroll.setViewportView(notas);
		scroll.setBorder(null);
		add(scroll, BorderLayout.CENTER);
		
	
		if (PanelNotas.hayNotas){
			add(scroll, BorderLayout.CENTER);
		}else{
			add(nada, BorderLayout.CENTER);
		}
	}
	
	public void reload(){
		invalidate();
		validate();
		repaint();
	}

}
