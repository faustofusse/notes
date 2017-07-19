package Notes;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana3 extends JFrame{
	private JPanel panelBtn = new JPanel();
	private JPanel panel2 = new JPanel();
	private panel panel = new panel();
	private JButton btn = new JButton(new ImageIcon("src/Notes/img/mas.png"));
	private JTextField input = new JTextField(23);
	
	public Ventana3(){
		
		setSize(465,444);
		setResizable(true);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
//		panel2.setBackground(Color.green);
//		panel2.setBounds(0, 0, this.getWidth(), this.getHeight());
//		panel2.setLayout(null);
//		
//		panel2.add(input);
//		
//		btn.setBounds(40, 40, panel2.getWidth()-70, panel2.getHeight()-70);
//		btn.setBorder(null);
//		btn.setBackground(panel2.getBackground());
//		btn.setOpaque(true);
//		
//		panel2.add(btn);
//		panelBtn.setBounds(0, 0, this.getWidth(), this.getHeight());
//		
//		add(panel2);
//		add(panelBtn);
//		
		
		
		add(panel);
		
		
	}
	
	

}
