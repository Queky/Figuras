
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class GestorFiguras {
	//TODO Representacion de una coleccion de figuras
	private Hashtable<String, Figura> gFigura; 
	
	/**
	 * Crea un gestor de figuras vacia
	 */
	public GestorFiguras(){
		// TODO
		gFigura=new Hashtable<String, Figura>();
	}
	
	/**
	 * Anade una nueva figura
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
		if(gFigura.containsKey(nombre))
			return true;
		else
			return false;
	}
	
	/**
	 * Devuelve una lista de figuras que tengan los mismos nombres que contiene el array 'nombres'
	 * @param nombres, una lista de nombres
	 * @return una lista de figuras
	 */
	public List<Figura> recuperarLista(String [] nombres){
		//TODO
		// Que devuelva solo una lista con figuras, sinmas??
		ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
		for(String n : nombres){
			if(gFigura.containsKey(n)){
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
		// Solo se puede acceder a los trazos con un nombre, si no tengo nombre como accedo al dato...?
		ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
		int pos=0, cont=0;
		while(cont<=gFigura.size()){
			if(existe(figura.getNombre()) && gFigura.get(figura.getNombre()).equals(figura.getTrazos())){
				listaFiguras.add(gFigura.get(figura.getNombre()));
				pos++;
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
		return null;
	}

}
