package org.inv.packPrueba;

public class Persona {

	private String nombre;
	private int edad;
	private boolean puedeConducir;
	
	public Persona(String pNom,int pEdad){
		this.nombre = pNom;
		if(pEdad<18){
			this.puedeConducir=false;
		}
		else{
			this.puedeConducir=true;
		}
	}
	
	public void puedeConducir(){
		
		String puede;
		if(puedeConducir){
			puede= "puede";
		}
		else{
			puede= "no puede";
		}
	
		System.out.println("Esta persona llamada "+this.nombre+" "+ puede+" conducir en España.");
	}
	
}
