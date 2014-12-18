import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FiguraTest {
	Figura a, b, c, d;
	@Before
	public void setUp() throws Exception {
		a = new Figura("DBIS", "figura1");
		b = new Figura("DDBBIISS", "figura2");
		c = new Figura("DBDBDBDS", "figura3");
		d = new Figura("DBI", "figura4");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFigura() {
		assertNotNull(new Figura("DBIS", "figura1"));
	
	
	}
	@Test
	public void testGetNombre(){
		assertEquals("figura1", a.getNombre());
		assertEquals("figura2", b.getNombre());
	}
	@Test
	public void testGetTrazos(){
		LinkedList<Trazo> tr1 = new LinkedList<Trazo>();
		tr1.add(new Trazo('D'));
		tr1.add(new Trazo('B'));
		tr1.add(new Trazo('I'));
		tr1.add(new Trazo('S'));
		assertEquals(tr1, a.getTrazos());	
	}
	@Test
	public void testAnadirTrazo(){
		Figura t = new Figura("");
		t.anadirTrazo('D');
		t.anadirTrazo('B');
		t.anadirTrazo('I');
		t.anadirTrazo('S');
		assertEquals(t.getTrazos(), a.getTrazos());
		Figura t1 = new Figura("");
		t1.anadirTrazo('D', true);
		t1.anadirTrazo('B');
		t1.anadirTrazo('I');
		t1.anadirTrazo('S',false);
		assertEquals(t.getTrazos(), a.getTrazos());
		
	}
	@Test
	public void testFusionar(){
		Figura t = new Figura("DB");
		t.fusionar(new Figura("IS"));
		assertEquals(t.getTrazos(), a.getTrazos());	
	}
	@Test
	public void testInsertar(){
		Figura t = new Figura("DIS");
		t.insertar(1, new Figura("B"));
		assertEquals(t.getTrazos(), a.getTrazos());
	}
	@Test
	public void testEliminarDesdeUltimoTrazo(){
		Figura t = new Figura("DBISD");
		t.eliminarDesdeUltimoTrazo('S');
		assertEquals(t.getTrazos(),a.getTrazos() );
	}
	@Test
	public void testSustituir(){
		Figura t = new Figura("DBS");
		t.sustituir('S', "IS");
		assertEquals(t.getTrazos(), a.getTrazos());
	}
	@Test
	public void testGirarDerecha(){
		Figura t = new Figura("BISD");
		t.girarDerecha();
		assertEquals(t.getTrazos(),a.getTrazos() );
	}
	@Test
	public void testHomotecia2(){
		Figura t = new Figura("");
		t.anadirTrazo('D');
		t.anadirTrazo('B');
		t.anadirTrazo('I');
		t.anadirTrazo('S');
		t.homotecia2();
		assertEquals(t.getTrazos(),b.getTrazos());
	}
	@Test
	public void testLongitud(){
		assertTrue(a.longitud() == 4);
		assertTrue(b.longitud() == 8);
		assertFalse(a.longitud() != 4);
		
	}
	@Test
	public void testAltura(){
<<<<<<< HEAD
		assertEquals(a.altura(), 1);
		assertEquals(b.altura(), 2);
		assertEquals(c.altura(), 3);
		assertNotEquals(a.altura(), 2);
		
	}
	
	@Test
	public void testEsHomotetica(){
		assertTrue(a.esHomotetica(b));
	}
	
	@Test
	public void superficie(){
		assertEquals(a.superficie(), 1);
		assertEquals(b.superficie(), 4);
		assertEquals(c.superficie(), 12);
		assertEquals(d.superficie(), 1);
	}
	
	
=======
		assertTrue(a.altura() == 1);
		assertTrue(b.altura() == 2);
		assertFalse(a.altura() != 1);
		
	}
	@Test
	public void testAnchura(){
		assertTrue(a.anchura() == 1);
		assertTrue(b.anchura() == 2);
		assertFalse(a.altura() != 1);
		
	}
	@Test
	public void testEsSemejante(){
		Figura t = new Figura("BISD");
		assertTrue(t.esSemejante(b));
		
	}
	@Test
	public void testSuperficie(){
		assertTrue(a.superficie() == 1);
		//assert
		
	}
>>>>>>> origin/ulimas-modificaciones
}
