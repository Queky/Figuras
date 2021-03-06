import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GestorFiguraTest {
	
	GestorFiguras gF;
	Figura a, b, c, d, e;
	@Before
	public void setUp() throws Exception{
		gF = new GestorFiguras();
		a = new Figura("DBIS", "nombre1");
		b = new Figura("DDBBIISS", "nombre2");
		c = new Figura("DBDBDBDS", "nombre3");
		d = new Figura("DBI", "nombre4");
		e = new Figura("DBI", "nombre5");

	}
	
	@After
	public void tearDown () throws Exception{	
	}
	
	@Test
	public void testGestorFigura(){
		assertNotNull(new GestorFiguras());
	}
	
	@Test
	public void testGuardar(){
		gF.guardar(a);
		gF.guardar(b);
		gF.guardar(c);
		gF.guardar(d);
		assertEquals(gF.recuperar(a.getNombre()), a);
		assertEquals(gF.recuperar(b.getNombre()), b);
		assertEquals(gF.recuperar(c.getNombre()), c);
		assertEquals(gF.recuperar(d.getNombre()), d);
	}
	
	@Test
	public void testRecuperar(){
		gF.guardar(a);
		gF.guardar(b);
		gF.guardar(c);
		gF.guardar(d);		
		assertEquals(gF.recuperar(a.getNombre()), a);
		assertEquals(gF.recuperar(b.getNombre()), b);
		assertEquals(gF.recuperar(c.getNombre()), c);
		assertEquals(gF.recuperar(d.getNombre()), d);
	}
	
	@Test
	public void testCambiar(){
		Figura f = new Figura("DBI", "nombre1");
		gF.guardar(a);
		gF.guardar(b);
		gF.cambiar(f);
		assertEquals(gF.recuperar(a.getNombre()), gF.recuperar(f.getNombre()));
	}
	
	@Test
	public void testExiste(){
		gF.guardar(a);
		gF.guardar(b);
		gF.guardar(c);
		gF.guardar(d);
		assertTrue(gF.existe(a.getNombre()));
		assertTrue(gF.existe(b.getNombre()));
		assertTrue(gF.existe(c.getNombre()));
		assertTrue(gF.existe(d.getNombre()));
	}
	
	@Test
	public void testRecuperarLista(){
		String[] nombres = new String[3];
		nombres[0]="nombre1";
		nombres[1]="nombre3";
		nombres[2]="nombre5";
		ArrayList<Figura> nombresContenidos = new ArrayList<Figura>();
		nombresContenidos.add(a);
		nombresContenidos.add(c);
		gF.guardar(a);
		gF.guardar(b);
		gF.guardar(c);
		gF.guardar(d);
		assertEquals(gF.recuperarLista(nombres).get(0).getNombre(), nombresContenidos.get(0).getNombre());
		assertEquals(gF.recuperarLista(nombres).get(1).getNombre(), nombresContenidos.get(1).getNombre());
	}
	
	@Test
	public void testRecuperarIguales(){
		gF.guardar(a);
		gF.guardar(b);
		gF.guardar(c);
		gF.guardar(d);
		gF.guardar(e);
		Figura f = new Figura("DBI", "nombre6");
		List<Figura> nombresContenidos = new ArrayList<Figura>();
		nombresContenidos.add(d);
		nombresContenidos.add(e);
		assertEquals(nombresContenidos.get(0).getTrazos(), gF.recuperarIguales(f).get(0).getTrazos());
		assertEquals(nombresContenidos.get(1).getTrazos(), gF.recuperarIguales(f).get(1).getTrazos());
	}
	
	@Test
	public void testRecuperarSemejantes(){
		Figura f1 = new Figura("BIS", "nombre5");
		Figura f2 = new Figura("BBIISS", "nombre6");
		gF.guardar(a);
		gF.guardar(b);
		gF.guardar(c);
		gF.guardar(d);
		ArrayList<Figura> nombresFigura = new ArrayList<Figura>();
		nombresFigura.add(d);
		assertEquals(nombresFigura, gF.recuperarSemejantes(f1));
		assertEquals(nombresFigura, gF.recuperarSemejantes(f2));
	}
}
