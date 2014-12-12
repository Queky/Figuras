import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FiguraTest {
	Figura a, b, c, d;
	@Before
	public void setUp() throws Exception {
		a = new Figura("DDBB", "figura1");
		b = new Figura("IIDD", "figura2");
		c = new Figura("DBIS", "figura3");
		d = new Figura("DDII", "figura1");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFigura() {
		assertNotNull(new Figura("DDBB", "figura1"));
	
	
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
		tr1.add(new Trazo('D'));
		tr1.add(new Trazo('B'));
		tr1.add(new Trazo('B'));
		assertEquals(tr1, a.getTrazos());	
	}
	@Test
	public void testAnadirTrazo(){	
		Figura t = new Figura("DDB");
		t.anadirTrazo('B');
		assertEquals(t.getTrazos(), a.getTrazos());
	}
	@Test
	public void testFusionar(){
		Figura t = new Figura("DD");
		t.fusionar(new Figura("BB"));
		assertEquals(t.getTrazos(), a.getTrazos());	
	}
	@Test
	public void insertar(){
		Figura t = new Figura("DBB");
		t.insertar(0, new Figura("D"));
		assertEquals(t.getTrazos(), a.getTrazos());
	}
	@Test
	public void eliminarDesdeUltimoTrazo(){
		Figura t = new Figura("DDBBS");
		t.eliminarDesdeUltimoTrazo('B');
		assertEquals(t.getTrazos(),a.getTrazos() );
	}
	@Test
	public void sustituir(){
		Figura t = new Figura("DDS");
		t.sustituir('S', "BB");
		assertEquals(t.getTrazos(), a.getTrazos());
	}
	@Test
	public void girarDerecha(){
		Figura t = new Figura("BBSS");
		t.girarDerecha();
		assertEquals(t.getTrazos(),a.getTrazos() );
	}
	
	
	
	
}
