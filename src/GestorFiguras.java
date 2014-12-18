
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class GestorFiguras {
	//TODO Representacion de una coleccion de figuras
	private Hashtable<String, Figura> gFigura; 
	
	/**
	 * Crea un gestor de figuras vacia
	 * @param fiigura 
	 * @param nombre 
	 */
	public GestorFiguras(){
		// TODO
		gFigura=new Hashtable<String, Figura>();
	}
	
	/**
	 * Anade una nueva figura
	 * @param string 
	 * @param figura
	 */
	public void guardar(Figura figura){
		// TODO		
		gFigura.put(figura.getNombre(), figura);
 	}
	
	/**
	 * Devuelve la figura que tiene el nombre 'nombre' y si no null
	 * @param nombre, el nombre de una figura
	 * @return la figura
	 */
	public Figura recuperar(String nombre){
		// TODO
		return gFigura.get(nombre);
	}
	
	/**
	 * Cambia la figura que tiene el mismo nombre que la figura dada
	 * @param figura, una figura 
	 */
	public void cambiar(Figura figura){
		//TODO		
		gFigura.remove(figura.getNombre());
		gFigura.put(figura.getNombre(), figura);
	}
	
	/**
	 * Verifica si existe o no una figura con el mismo nombre que el parametro 'nombre'
	 * @param nombre, el nombre de una figura
	 * @return devuelve True si existe y False, en caso contrario
	 */
	public boolean existe(String nombre){
		//TODO
		Enumeration<String> e = gFigura.keys();
		boolean existe = false;
		String n;
		while(e.hasMoreElements()){
			n = e.nextElement();
			if(n == nombre)
				existe = true;
		}
		return existe;
	}
	
	/**
	 * Devuelve una lista de figuras que tengan los mismos nombres que contiene el array 'nombres'
	 * @param nombres, una lista de nombres
	 * @return una lista de figuras
	 */
	public List<Figura> recuperarLista(String [] nombres){
		//TODO
		List<Figura> listaFiguras = new ArrayList<Figura>();
		Enumeration<String> e;
		String k;
		for(String n : nombres){
			e = gFigura.keys();
			while(e.hasMoreElements()){
				k=e.nextElement();
				if(k.equals(n))
					listaFiguras.add(gFigura.get(n));
			}
		}
		return listaFiguras;
	}

	/**
	 * Devuelve una lista de figuras que son iguales a la figura dada 
	 * @param figura, una figura
	 * @return una lista de figuras
	 */
	public List<Figura> recuperarIguales(Figura figura){
		//TODO
		List<Figura> listaFiguras = new ArrayList<Figura>();
		Enumeration<Figura> e = gFigura.elements();
		Figura f;
		while(e.hasMoreElements()){
			f=e.nextElement();
			if(f.getTrazos().equals(figura.getTrazos())){
				listaFiguras.add(f);
			}
		}
		return listaFiguras;
	}

	/**
	 * Devuelve una lista de figuras que son semejantes a la figura dada 
	 * @param figura, una figura
	 * @return una lista de figuras
	 */
	public List<Figura> recuperarSemejantes(Figura figura){
		//TODO
		ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
		Enumeration<Figura> e = gFigura.elements();
		Figura f;
		f=e.nextElement();
		while(e.hasMoreElements()){
			if(f.esSemejante(figura)){
				listaFiguras.add(f);
				f=e.nextElement();
			}else
				f=e.nextElement();
		}
		return listaFiguras;
	}
}
