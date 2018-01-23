package Calcu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * 
 * @author Ernesto Jara Olveda
 *
 */
public class Controlador {
	
	private Vista view;
	private Modelo model;
	private int operacion;
	private double num1;
	private double num2;
	
	public Controlador()
	{
		model= new Modelo();
		view = new Vista();
		
		operacion=0;
		num1=0;
		num2=0;
		
		view.ver();
		
		ActionListener oyenteBuno;
		oyenteBuno = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setTxtEntrada("1");
			}
		};
		

		ActionListener oyenteBdos;
		oyenteBdos = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setTxtEntrada("2");
			}
		};
		

		ActionListener oyenteBtres;
		oyenteBtres= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setTxtEntrada("3");
			}
		};
		

		ActionListener oyenteBcuatro;
		oyenteBcuatro= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setTxtEntrada("4");
			}
		};
		

		ActionListener oyenteBcinco;
		oyenteBcinco= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setTxtEntrada("5");
			}
		};
		

		ActionListener oyenteBseis;
		oyenteBseis= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setTxtEntrada("6");
			}
		};
		

		ActionListener oyenteBsiete;
		oyenteBsiete= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setTxtEntrada("7");
			}
		};
		

		ActionListener oyenteBocho;
		oyenteBocho= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setTxtEntrada("8");
			}
		};
		

		ActionListener oyenteBnueve;
		oyenteBnueve= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setTxtEntrada("9");
			}
		};
		

		ActionListener oyenteBcero;
		oyenteBcero= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setTxtEntrada("0");
			}
		};
		
		ActionListener oyenteBnegativo;
		oyenteBnegativo= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					double aux=Double.parseDouble(view.getTxtEntrada());
					view.borrarTodo();
					view.setTxtEntrada(String.valueOf(model.negativo(aux)));
				}
				catch(Exception ex){JOptionPane.showMessageDialog(null,"operacion incorrecta trate de nuevo");}
			}
		};
		
		ActionListener oyenteBpunto;
		oyenteBpunto= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!view.getTxtEntrada().contains("."))
				{
					view.setTxtEntrada(".");
				}
					
			}
		};
		
		ActionListener oyenteBmas;
		oyenteBmas= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					num1=Double.parseDouble(view.getTxtEntrada());
					view.desHabilitar();
					view.borrarTodo();
					operacion=1;
				}
				catch(Exception ex){JOptionPane.showMessageDialog(null,"operacion incorrecta trate de nuevo");}
			}
		};
		
		ActionListener oyenteBmenos;
		oyenteBmenos= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{	
					num1=Double.parseDouble(view.getTxtEntrada());
					view.desHabilitar();
					view.borrarTodo();
					operacion=2;
				}catch(Exception ex){JOptionPane.showMessageDialog(null,"operacion incorrecta trate de nuevo");}
			}
		};
		

		ActionListener oyenteBmulti;
		oyenteBmulti= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					num1=Double.parseDouble(view.getTxtEntrada());
					view.desHabilitar();
					view.borrarTodo();
					operacion=3;
				}catch(Exception ex){JOptionPane.showMessageDialog(null,"operacion incorrecta trate de nuevo");}
			}
		};
		
		ActionListener oyenteBdiv;
		oyenteBdiv= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{	
					num1=Double.parseDouble(view.getTxtEntrada());
					view.desHabilitar();
					view.borrarTodo();
					operacion=4;
				}catch(Exception ex){JOptionPane.showMessageDialog(null,"operacion incorrecta trate de nuevo");}
			}
		};
		

		ActionListener oyenteBexp;
		oyenteBexp= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					num1=Double.parseDouble(view.getTxtEntrada());
					view.desHabilitar();
					view.borrarTodo();
					operacion=5;
				}catch(Exception ex){JOptionPane.showMessageDialog(null,"operacion incorrecta trate de nuevo");}
			}
		};
		
		ActionListener oyenteBborrarTodo;
		oyenteBborrarTodo= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.borrarTodo();
			}
		};
		
		ActionListener oyenteBborrarUltimo;
		oyenteBborrarUltimo= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.borrarUltimo();
			}
		};
		
		ActionListener oyenteBigual;
		oyenteBigual= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					num2=Double.parseDouble(view.getTxtEntrada());
					switch (operacion)
					{
						case 1:
							view.borrarTodo();
							view.setTxtEntrada(String.valueOf(model.sumar(num1, num2)));
							break;
						case 2:
							view.borrarTodo();
							view.setTxtEntrada(String.valueOf(model.restar(num1, num2)));
							break;
						case 3:
							view.borrarTodo();
							view.setTxtEntrada(String.valueOf(model.multiplicar(num1, num2)));
							break;
						case 4:
							view.borrarTodo();
							view.setTxtEntrada(String.valueOf(model.dividir(num1, num2)));
							break;
						case 5:
							view.borrarTodo();
							view.setTxtEntrada(String.valueOf(model.exponenete(num1, num2)));
							break;
						default:
							break;
					}
					view.habilitar();
					num1=0;
					num2=0;
					operacion=0;
				}catch(Exception ex){JOptionPane.showMessageDialog(null,"operacion incorrecta trate de nuevo");}
			}
		};
		/***************************************************************************************************************************************/
		view.getBtnCero().addActionListener(oyenteBcero);
		view.getBtnUno().addActionListener(oyenteBuno);
		view.getBtnDos().addActionListener(oyenteBdos);
		view.getBtnTres().addActionListener(oyenteBtres);
		view.getBtnCuatro().addActionListener(oyenteBcuatro);
		view.getBtnCinco().addActionListener(oyenteBcinco);
		view.getBtnSeis().addActionListener(oyenteBseis);
		view.getBtnSiete().addActionListener(oyenteBsiete);
		view.getBtnOcho().addActionListener(oyenteBocho);
		view.getBtnNueve().addActionListener(oyenteBnueve);
		
		view.getBtnNegativo().addActionListener(oyenteBnegativo);
		view.getBtnPunto().addActionListener(oyenteBpunto);
		view.getBtnIgual().addActionListener(oyenteBigual);
		view.getBtnBorrarUlti().addActionListener(oyenteBborrarUltimo);
		view.getBtnBorrarTodo().addActionListener(oyenteBborrarTodo);
		
		view.getBtnMas().addActionListener(oyenteBmas);
		view.getBtnMenos().addActionListener(oyenteBmenos);
		view.getBtnMulti().addActionListener(oyenteBmulti);
		view.getBtnDiv().addActionListener(oyenteBdiv);
		view.getBtnExpo().addActionListener(oyenteBexp);
	}
}
