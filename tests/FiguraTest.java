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
		t1.anadirTrazo('B', false);
		t1.anadirTrazo('I', false);
		t1.anadirTrazo('S',false);
		assertEquals(t1.getTrazos(), a.getTrazos());
		Figura t2 = new Figura("");
		t2.anadirTrazo('B', true);
		t2.anadirTrazo('D', false);
		t2.anadirTrazo('B', false);
		t2.anadirTrazo('D', false);
		Figura prueba1 = new Figura("BDBD");
		assertEquals(t2.getTrazos(), prueba1.getTrazos());
		Figura t3 = new Figura("");
		t3.anadirTrazo('I', true);
		t3.anadirTrazo('B', false);
		Figura prueba2 = new Figura("IB");
		assertEquals(t3.getTrazos(), prueba2.getTrazos());
		Figura t4 = new Figura("");
		t4.anadirTrazo('S', true);
		t4.anadirTrazo('D', false);
		Figura prueba3 = new Figura("SD");
		assertEquals(t4.getTrazos(), prueba3.getTrazos());
		

		
		
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
		Figura t1 = new Figura("");
		t1.sustituir('S', "");
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
		assertEquals(a.longitud(), 4);
		assertEquals(b.longitud(), 8);
		assertFalse(a.longitud() != 4);
		
	}
	@Test
	public void testAltura(){
		assertEquals(a.altura(), 1);
		assertEquals(b.altura(), 2);
		assertEquals(c.altura(), 3);
		Figura f = new Figura("SSSBBBBBB");
		assertEquals(f.altura(), 6);
		Figura f1 = new Figura("SSSBBBBBBB");
		assertEquals(f1.altura(), 7);
		Figura f2 = new Figura("BBBSSSSSS");
		assertEquals(f2.altura(), 6);
		Figura f3 = new Figura("BBBSSSSSSS");
		assertEquals(f3.altura(), 7);
		Figura f4 = new Figura("SSS");
		assertEquals(f4.altura(), 3);
		Figura f5 = new Figura("");
		assertEquals(f5.altura(), 0);
		Figura f6 = new Figura ("BBS");
		assertEquals(f6.altura(), 2);
		Figura f7 = new Figura("SSB");
		assertEquals(f7.altura(), 2);
	}
	
	@Test
	public void testEsHomotetica(){
		assertTrue(a.esHomotetica(b));
		assertTrue(b.esHomotetica(a));
		assertFalse(a.esHomotetica(c));
		assertTrue(d.esHomotetica(d));
		Figura f = new Figura("DDDDDDDDDDDDDDDDBBBBBBBBIIIISSSS");
		assertFalse(a.esHomotetica(f));
		assertFalse(f.esHomotetica(a));
		assertTrue(a.esHomotetica(a));
	}
	
	@Test
	public void testSuperficie(){
		assertEquals(a.superficie(), 1);
		assertEquals(b.superficie(), 4);
		assertEquals(c.superficie(), 12);
		assertEquals(d.superficie(), 1);
	}

	@Test
	public void testAnchura(){
		assertEquals(a.anchura(), 1);
		assertEquals(b.anchura(), 2);
		Figura f = new Figura ("DDDIIIIII");
		assertEquals(f.anchura(), 6);
		Figura f1 = new Figura ("DDDIIIIIII");
		assertEquals(f1.anchura(), 7);
		Figura f2 = new Figura ("IIIDDDDDD");
		assertEquals(f2.anchura(), 6);
		Figura f3 = new Figura("IIIDDDDDDD");
		assertEquals(f3.anchura(), 7);
	}
	
	@Test
	public void testEsSemejante(){
		Figura t = new Figura("BISD");
		assertTrue(t.esSemejante(b));
		assertTrue(a.esSemejante(b));
		assertTrue(b.esSemejante(a));
		t.girarDerecha();
		assertTrue(t.esSemejante(t));
		Figura f = new Figura("BBISSSSSSD");
		assertFalse(f.esSemejante(a));
		Figura f1 = new Figura("BBBBDD");
		Figura f2 = new Figura("DBDBBB");
		assertFalse(f1.esSemejante(f2));
	}
	
	@Test
	public void testClone() throws CloneNotSupportedException{
		Figura f = (Figura) a.clone();
		assertEquals(f.getTrazos(), a.getTrazos());
	}
	
	@Test
	public void testToString(){
		String n1 = "DBIS";
		assertEquals(n1, a.toString());
	}
}