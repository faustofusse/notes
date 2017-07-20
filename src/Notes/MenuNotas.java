package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuNotas extends JPanel implements ActionListener{

	private JButton btnMas = new JButton(new ImageIcon("src/Notes/img/mas2.png"));
	private JLabel titulo = new JLabel("Notes");
	
	private JPanel panelIzquierda = new JPanel();
	private JPanel panelDerecha = new JPanel();
	
	public MenuNotas(){
		setLayout(new BorderLayout(0,0));
		setBackground(Const.COLOR_FONDO);
		setPreferredSize(new Dimension(444,60));
		
		ponerComponentes();
	}
	
	private void ponerComponentes(){
		panelIzquierda.setLayout(new FlowLayout(FlowLayout.LEFT,15,7));
		panelIzquierda.setBackground(Const.COLOR_FONDO);
		panelDerecha.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
		
		btnMas.addActionListener(this);
		btnMas.setBorder(null);
		
		titulo.setForeground(Color.white);
		titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		panelIzquierda.add(titulo);
		panelDerecha.add(btnMas);
		
		add(panelIzquierda, BorderLayout.WEST);
		add(panelDerecha, BorderLayout.EAST);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		PanelNotas.notaAbierta = PanelNotas.botones.size();
		Main.ventana1.setPanelNuevo();
		
	}
	
}
