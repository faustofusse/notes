package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBoton extends JPanel implements ActionListener{
	public int numero;
	private JButton btnTitulo = new JButton();
	
	public PanelBoton(String titulo){
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(430,60));
		
		btnTitulo.setText(titulo);
		btnTitulo.setBorder(null);   
		btnTitulo.setBackground(Color.blue);
		btnTitulo.addActionListener(this);
		btnTitulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		add(btnTitulo, BorderLayout.CENTER);
	}
	
	public void cambiarTitulo(String titulo2){
		removeAll();
		btnTitulo = new JButton(titulo2);
		btnTitulo.setBorder(null);
		btnTitulo.addActionListener(this);
		btnTitulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		add(btnTitulo, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		PanelNotas.notaAbierta = numero;
		Main.ventana1.panelNuevo.abrirNota(numero);
		
	}
}
