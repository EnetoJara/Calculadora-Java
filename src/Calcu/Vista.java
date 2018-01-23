package Calcu;
/**
 * 
 * @author Ernesto Jara Olveda
 *
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Vista extends JFrame {

	/**
	 * objetos de nuestra ventana
	 */
	
	private JPanel jpPrincipal;
	private JPanel jpEntrada;
	private JPanel jpOperaciones;
	private JPanel jpNumeros;
	private JPanel jpCero;
	private JButton btnBorrarTodo;
	private JButton btnBorrarUlti;
	private JButton btnNegativo;
	private JButton btnSiete;
	private JButton btnOcho;
	private JButton btnNueve;
	private JButton btnCuatro;
	private JButton btnCinco;
	private JButton btnSeis;
	private JButton btnUno;
	private JButton btnDos;
	private JButton btnTres;
	private JTextField txtEntrada;
	private JButton btnExpo;
	private JButton btnMulti;
	private JButton btnDiv;
	private JButton btnMenos;
	private JButton btnMas;
	private JButton btnCero;
	private JButton btnPunto;
	private JButton btnIgual;
	/**
 	*Constructor de la ventana 
 	*/
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		jpPrincipal = new JPanel();
		jpPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		jpPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(jpPrincipal);
		
		jpEntrada = new JPanel();
		jpPrincipal.add(jpEntrada, BorderLayout.NORTH);
		jpEntrada.setLayout(new BorderLayout(0, 0));
		
		txtEntrada = new JTextField();
		jpEntrada.add(txtEntrada, BorderLayout.NORTH);
		txtEntrada.setColumns(10);
		
		jpOperaciones = new JPanel();
		jpPrincipal.add(jpOperaciones, BorderLayout.EAST);
		jpOperaciones.setLayout(new GridLayout(6, 0, 0, 0));
		
		btnExpo = new JButton("exp.");
		jpOperaciones.add(btnExpo);
		
		btnMulti = new JButton("*");
		jpOperaciones.add(btnMulti);
		
		btnDiv = new JButton("/");
		jpOperaciones.add(btnDiv);
		
		btnMenos = new JButton("-");
		jpOperaciones.add(btnMenos);
		
		btnMas = new JButton("+");
		jpOperaciones.add(btnMas);
		
		btnIgual = new JButton("=");
		jpOperaciones.add(btnIgual);
		
		jpNumeros = new JPanel();
		jpPrincipal.add(jpNumeros, BorderLayout.CENTER);
		jpNumeros.setLayout(new GridLayout(4, 3, 0, 0));
		
		btnBorrarTodo = new JButton("C");
		jpNumeros.add(btnBorrarTodo);
		
		btnBorrarUlti = new JButton("CE");
		jpNumeros.add(btnBorrarUlti);
		
		btnNegativo = new JButton("-");
		jpNumeros.add(btnNegativo);
		
		btnSiete = new JButton("7");
		jpNumeros.add(btnSiete);
		
		btnOcho = new JButton("8");
		jpNumeros.add(btnOcho);
		
		btnNueve = new JButton("9");
		jpNumeros.add(btnNueve);
		
		btnCuatro = new JButton("4");
		jpNumeros.add(btnCuatro);
		
		btnCinco = new JButton("5");
		jpNumeros.add(btnCinco);
		
		btnSeis = new JButton("6");
		jpNumeros.add(btnSeis);
		
		btnUno = new JButton("1");
		jpNumeros.add(btnUno);
		
		btnDos = new JButton("2");
		jpNumeros.add(btnDos);
		
		btnTres = new JButton("3");
		jpNumeros.add(btnTres);
		
		jpCero = new JPanel();
		jpPrincipal.add(jpCero, BorderLayout.SOUTH);
		jpCero.setLayout(new GridLayout(0, 2, 0, 0));
		
		btnCero = new JButton("0");
		jpCero.add(btnCero);
		
		btnPunto = new JButton(".");
		jpCero.add(btnPunto);
	}

	public void ver()
	{
		this.setVisible(true);
	}
	
	public void desHabilitar()
	{
		this.btnDiv.setEnabled(false);
		this.btnMas.setEnabled(false);
		this.btnMenos.setEnabled(false);
		this.btnExpo.setEnabled(false);
		this.btnMulti.setEnabled(false);
	}
	
	public void habilitar()
	{
		this.btnDiv.setEnabled(true);
		this.btnMas.setEnabled(true);
		this.btnMenos.setEnabled(true);
		this.btnExpo.setEnabled(true);
		this.btnMulti.setEnabled(true);
	}
	
	public void borrarTodo()
	{
		this.txtEntrada.setText("");
	}
	
	public void borrarUltimo()
	{
		if(txtEntrada.getText().length()>=1)
			this.txtEntrada.setText(this.txtEntrada.getText().substring(0,txtEntrada.getText().length()-1));
	}
	
	public JButton getBtnBorrarTodo() {
		return btnBorrarTodo;
	}

	public void setBtnBorrarTodo(JButton btnBorrarTodo) {
		this.btnBorrarTodo = btnBorrarTodo;
	}

	public JButton getBtnBorrarUlti() {
		return btnBorrarUlti;
	}

	public void setBtnBorrarUlti(JButton btnBorrarUlti) {
		this.btnBorrarUlti = btnBorrarUlti;
	}

	public JButton getBtnNegativo() {
		return btnNegativo;
	}

	public void setBtnNegativo(JButton btnNegativo) {
		this.btnNegativo = btnNegativo;
	}

	public JButton getBtnSiete() {
		return btnSiete;
	}

	public void setBtnSiete(JButton btnSiete) {
		this.btnSiete = btnSiete;
	}

	public JButton getBtnOcho() {
		return btnOcho;
	}

	public void setBtnOcho(JButton btnOcho) {
		this.btnOcho = btnOcho;
	}

	public JButton getBtnNueve() {
		return btnNueve;
	}

	public void setBtnNueve(JButton btnNueve) {
		this.btnNueve = btnNueve;
	}

	public JButton getBtnCuatro() {
		return btnCuatro;
	}

	public void setBtnCuatro(JButton btnCuatro) {
		this.btnCuatro = btnCuatro;
	}

	public JButton getBtnCinco() {
		return btnCinco;
	}

	public void setBtnCinco(JButton btnCinco) {
		this.btnCinco = btnCinco;
	}

	public JButton getBtnSeis() {
		return btnSeis;
	}

	public void setBtnSeis(JButton btnSeis) {
		this.btnSeis = btnSeis;
	}

	public JButton getBtnUno() {
		return btnUno;
	}

	public void setBtnUno(JButton btnUno) {
		this.btnUno = btnUno;
	}

	public JButton getBtnDos() {
		return btnDos;
	}

	public void setBtnDos(JButton btnDos) {
		this.btnDos = btnDos;
	}

	public JButton getBtnTres() {
		return btnTres;
	}

	public void setBtnTres(JButton btnTres) {
		this.btnTres = btnTres;
	}

	public String getTxtEntrada() {
		return txtEntrada.getText();
	}

	public void setTxtEntrada(String txt) {
		this.txtEntrada.setText(txtEntrada.getText()+ txt);
	}

	public JButton getBtnExpo() {
		return btnExpo;
	}

	public void setBtnExpo(JButton btnExpo) {
		this.btnExpo = btnExpo;
	}

	public JButton getBtnMulti() {
		return btnMulti;
	}

	public void setBtnMulti(JButton btnMulti) {
		this.btnMulti = btnMulti;
	}

	public JButton getBtnDiv() {
		return btnDiv;
	}

	public void setBtnDiv(JButton btnDiv) {
		this.btnDiv = btnDiv;
	}

	public JButton getBtnMenos() {
		return btnMenos;
	}

	public void setBtnMenos(JButton btnMenos) {
		this.btnMenos = btnMenos;
	}

	public JButton getBtnMas() {
		return btnMas;
	}

	public void setBtnMas(JButton btnMas) {
		this.btnMas = btnMas;
	}

	public JButton getBtnCero() {
		return btnCero;
	}

	public void setBtnCero(JButton btnCero) {
		this.btnCero = btnCero;
	}

	public JButton getBtnPunto() {
		return btnPunto;
	}

	public void setBtnPunto(JButton btnPunto) {
		this.btnPunto = btnPunto;
	}

	public JButton getBtnIgual() {
		return btnIgual;
	}

	public void setBtnIgual(JButton btnIgual) {
		this.btnIgual = btnIgual;
	}
	
	
}
