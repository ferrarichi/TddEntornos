package Logica;

/*
 * By Paco Gomez
 * Esta clase realiza el calculo
 * 
 * */
public class CalcularLetra {
	
	private String dni="12345678";
	private int dni_numero=0;
	private char letra='J';
	
	//El constructor recibe el DNI en formato String
	public CalcularLetra(String dni) {
		this.dni=dni;
	}
	
	//Realiza el calculo
	public char devolverLetra(){
		return this.letra;
	}

}
