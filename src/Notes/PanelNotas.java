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
	public static ArrayList<String> titulos = new ArrayList<String>();
	public static ArrayList<String> parrafos = new ArrayList<String>();
	
	public static boolean hayNotas = false;
	public static int notaAbierta = -1;
	
	public PanelNotas(){
		setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		setBackground(Color.white); 
		
		add(new Espacio(444, 5, Color.white));
		agregarBotones();
	}
	
	public void addBtn(String titulo, String parrafo){
		PanelBoton newBtn = new PanelBoton(titulo);
		botones.add(newBtn);
		titulos.add(titulo);
		parrafos.add(parrafo);
		add(botones.get(botones.size()-1));
		hayNotas=true;
		agregarBotones();
	}
	
	public void agregarBotones(){
		for(int i =0;i< botones.size(); i++){
			if (!botones.get(i).isEliminado){
				botones.get(i).numero = i;
				botones.get(i).addBtnEliminar(i);
				add(botones.get(i));
			}
		}
		setPreferredSize(new Dimension(300,botones.size()*70));
	}
	
	private int cantNoEliminados(){
		int cant =0;
		
		for (PanelBoton e: botones){
			if (!e.isEliminado){
				cant++;
			}
		}
		
		return cant;
	}

	public void refresh(){
		for (PanelBoton e: botones){
			remove(e);
		}
		agregarBotones();
		setPreferredSize(new Dimension(300,cantNoEliminados()*70));
		if (cantNoEliminados()==0){
			hayNotas = false;
			botones.clear();
		}
	}
}
