package org.inv.testPersona;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.inv.packPrueba.Persona;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class pruebaPersona {

	Persona p1,p2,p3,p4,p5;
	ArrayList<Persona> lista;
	

	@Before
	public void setUp() {
		p1= new Persona("Oskar",30);
		p2= new Persona("Juan", 16);
		p3= new Persona("Jorge",29);
		p4= new Persona("Maria",15);
		p5= new Persona("Alberto",17);
		
		lista = new ArrayList<Persona>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
    }
 
    @After
    public void tearDown() {
    	p1= null;
    	p2= null;
    	p3= null;
    	p4= null;
    	p5= null;
    	lista=null;
    }
	
	
	@Test
	public void testPersona() {
		assertNotNull(p1);
		assertNotNull(p2);
		assertNotNull(p3);
		assertNotNull(p4);
		assertNotNull(p5);
	}

	@Test
	public void testPuedeConducir() {
		for(Persona p: lista){
			p.puedeConducir();
		}
	}

	
	@Test
	public void conduce() {
		System.out.println("Este es un cambio de version :D ");
		System.out.println("Cambio en nueva rama");
	}
	
	

}
