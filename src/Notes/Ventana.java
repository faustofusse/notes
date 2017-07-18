package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ventana extends JFrame implements KeyListener{
	private static boolean control = false;
	public PanelNotas notas = new PanelNotas();
	public JScrollPane scroll = new JScrollPane();
	public PanelNada nada = new PanelNada();
	private Menu menu = new Menu();
	public PanelNuevaNota nuevo = new PanelNuevaNota();
	
	public Ventana(){

		setVisible(true);
		setSize(465,444);
		setResizable(true);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		agregarComponentes();
		
		addKeyListener(this);
	}
	
	private void agregarComponentes(){
		add(menu, BorderLayout.NORTH);
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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Holaaaaa");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
