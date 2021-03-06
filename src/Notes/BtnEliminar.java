package Notes;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BtnEliminar extends JButton implements ActionListener{
	private int numero;
	public BtnEliminar(int num){
		numero=num;
		setIcon(new ImageIcon("src/Notes/img/delete.png"));
		setBackground(Const.COLOR_GRIS);
		setBorder(null);
		setPreferredSize(new Dimension(60,60));
		addActionListener(this);
		addMouseListener(new Mouse());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PanelNotas.botones.get(numero).isEliminado = true;
		Main.ventana1.setPanelNotas();
		Main.ventana1.reload();
		
	}
	
}
