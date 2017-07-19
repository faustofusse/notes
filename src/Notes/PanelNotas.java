package Notes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PanelNotas extends JPanel{
	public static ArrayList<PanelBoton> botones = new ArrayList<PanelBoton>();
	public static boolean hayNotas = false;
	
	public PanelNotas(){
		setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		setBackground(Color.white);
		
		add(new Espacio(444, 5, Color.white));
		
		agregarBotones();
	}
	
	public void addBtn(String texto){
		PanelBoton newBtn = new PanelBoton(texto);
		botones.add(newBtn);
		add(botones.get(botones.size()-1));
		agregarBotones();
	}
	
	public void agregarBotones(){
		for(int i =0;i< botones.size(); i++){
			botones.get(i).numero = i;
			add(botones.get(i));
		}
		setPreferredSize(new Dimension(300,botones.size()*70));
	}

}
