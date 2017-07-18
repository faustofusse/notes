package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBoton extends JPanel implements ActionListener{
	public int numero;
	public String titulo;
	public static int cant = 0;
	public PanelBoton(String titulo){
		setLayout(new BorderLayout());
		//setPreferredSize(new Dimension(Main.ventana1.getSize().width, 60));
		setPreferredSize(new Dimension(430,60));
		
		System.out.println();
		
		JButton btnTitulo = new JButton(titulo);
		btnTitulo.setBackground(Color.WHITE);
		btnTitulo.setBorder(null);        
		btnTitulo.addActionListener(this);
		add(btnTitulo, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(this.numero);
		
	}
}
