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

public class MenuNuevo extends JPanel implements ActionListener{
	private JButton btnMenu = new JButton(new ImageIcon("src/Notes/img/menu.png"));
	private JButton btnSave = new JButton(new ImageIcon("src/Notes/img/save.png"));
	private JLabel titulo = new JLabel("Notes");
	private JPanel panelIzquierda = new JPanel();
	private JPanel panelDerecha = new JPanel();
	
	public MenuNuevo(){
		setLayout(new BorderLayout());
		setBackground(Const.COLOR_FONDO);
		setPreferredSize(new Dimension(444,60));
		
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		panelIzquierda.setLayout(new FlowLayout(FlowLayout.LEFT,15,7));
		panelIzquierda.setBackground(Const.COLOR_FONDO);
		panelDerecha.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
		panelDerecha.setBackground(Const.COLOR_FONDO);
		
		//BOTON MENU
		btnMenu.setBorder(null);
		btnMenu.setPreferredSize(new Dimension(50,60));
		btnMenu.addActionListener(this);
		btnMenu.addMouseListener(new Mouse());
		//add(btnMenu);
		
		btnSave.setBorder(null);
		btnSave.setBackground(Const.COLOR_FONDO);
		btnSave.setPreferredSize(new Dimension(60,60));
		btnSave.addActionListener(this);
		btnSave.addMouseListener(new Mouse());
		panelDerecha.add(btnSave);
		
		titulo.setForeground(Color.white);
		titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		panelIzquierda.add(titulo);
		
		add(panelIzquierda, BorderLayout.WEST);
		add(panelDerecha, BorderLayout.EAST);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Main.ventana1.panelNuevo.guardarNota();
		PanelNotas.notaAbierta = -1;
		
	}
}
