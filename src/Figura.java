
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Figura {
	// TODO Representa una figura mediante trazos echos a mano
	private	LinkedList<Trazo> trazos;
	private String nombre;
	/**
	 * Crea una figura con los trazos indicados
	 * @param trazos, una secuencia de trazos
	 */
	public Figura(String trazo){
		//TODO
		trazos =  new LinkedList<Trazo>();
		for (int i = 0; i < trazo.length(); i++) {
			switch (trazo.charAt(i)) {
			case 'D':
				trazos.add(new Trazo('D'));
				break;
			case 'B':
				trazos.add(new Trazo('B'));
				break;	
			case 'I':
				trazos.add(new Trazo('I'));
				break;
			case 'S':
				trazos.add(new Trazo('S'));
				break;
			}
			
		}
			
		}
	
	
	/**
	 * Crea una figura con los trazos indicados y lo nombra con el nombre dado
	 * @param trazos, una secuencia de trazos 
	 * @param nombre, un nombre 
	 */
	public Figura(String trazo, String nombre){
		//TODO
		this.nombre = nombre;
		trazos =  new LinkedList<Trazo>();
		for (int i = 0; i < trazo.length(); i++) {
			switch (trazo.charAt(i)) {
			case 'D':
				trazos.add(new Trazo('D'));
				break;
			case 'B':
				trazos.add(new Trazo('B'));
				break;	
			case 'I':
				trazos.add(new Trazo('I'));
				break;
			case 'S':
				trazos.add(new Trazo('S'));
				break;
			}

	}
	}
	
	/**
	 * Devuelve el nombre e la figura
	 * @return el nombre
	 */
	public String getNombre(){
		//TODO
		return nombre;
	}
	
	/**
	 * Devuelve una lista de trazos
	 * @return lista de trazos
	 */
	public List<Trazo> getTrazos(){
		//TODO
		return trazos;
	}
	
	/**
	 * A�ade un trazo al final de los trazos de la figura
	 * @param c, letra que indica un trazo
	 */
	public void anadirTrazo(char c){
		//TODO
		LinkedList<Trazo> tr1 = (LinkedList<Trazo>)getTrazos();
		switch (c) {
		case 'D':
			tr1.add(new Trazo('D'));
			break;
		case 'B':
			tr1.add(new Trazo('B'));
			break;	
		case 'I':
			tr1.add(new Trazo('I'));
			break;
		case 'S':
			tr1.add(new Trazo('S'));
			break;
		}
		
	}
	
	/**
	 * A�ade un trazo al inicio o al final de los trazos de la figura
	 * @param c, letra que indica un trazo
	 * @param alInicio, si True indica al inicio y False, al final
	 */
	public void anadirTrazo(char c, boolean alInicio){
		//TODO
		LinkedList<Trazo> tr1 = (LinkedList<Trazo>)getTrazos();
		if(alInicio = false){
		switch (c) {
		case 'D':
			tr1.add(new Trazo('D'));
			break;
		case 'B':
			tr1.add(new Trazo('B'));
			break;	
		case 'I':
			tr1.add(new Trazo('I'));
			break;
		case 'S':
			tr1.add(new Trazo('S'));
			break;
		}
	
	}else{
		switch (c) {
		case 'D':
			tr1.addFirst(new Trazo('D'));
			break;
		case 'B':
			tr1.addFirst(new Trazo('B'));
			break;	
		case 'I':
			tr1.addFirst(new Trazo('I'));
			break;
		case 'S':
			tr1.addFirst(new Trazo('S'));
			break;
		}	
	}
}
	/**
	 * Fusiona la figura 'f' al final de la figura actual
	 * @param f, una figura
	 */
	public void fusionar(Figura f){
		//TODO	
		LinkedList<Trazo> tr1 = (LinkedList<Trazo>)getTrazos();
		ListIterator<Trazo> Itr1= f.getTrazos().listIterator();
		while(Itr1.hasNext()){
			tr1.add(Itr1.next());
		}
	}
	
	/**
	 * Inserta la figura 'f' despues del trazo en la posicion 'pos'.
	 * Pre: La figura 'f' debe ser una secuencia cerrada, es decir, debe terminar en el punto donde empieza. 
	 * Porque si no repercute en la anchura y altura.
	 * @param pos, posicion entre [1..longitud(figura)]
	 * @param f, una figura
	 */
	public void insertar(int pos, Figura f){
		//TODO
		LinkedList<Trazo> tr1 = (LinkedList<Trazo>)getTrazos();
		ListIterator<Trazo> Itr1= f.getTrazos().listIterator();
		while(Itr1.hasNext()){
			tr1.add(pos, Itr1.next());
			pos++;
	}
	}
	/**
	 * Elimina la secuencia de trazos desde la �ltima ocurrencia del trazo de tipo 'c'
	 * @param c, un tipo de trazo
	 */
	public void eliminarDesdeUltimoTrazo(char c){
		//TODO
		LinkedList<Trazo> tr1 = (LinkedList<Trazo>)getTrazos();
		ListIterator<Trazo> Itr1= tr1.listIterator();
		Trazo trazo1 = new Trazo(c);
		int pos = 0;
		while(Itr1.hasNext()){
			if(Itr1.next().equals(trazo1)){
				pos = pos;
			}
			pos++;
		}
		for(int i = pos+1 ; i<tr1.size() ; i++){
			tr1.remove(i);
			
		}
	}
	
	/**
	 * Sustituye el primer trazo de tipo 'c' con los trazos dados en 'trazos'
	 * Pre: Loz trazos dados deben de formar una secuencia casi-cerrada-1, es decir, le falta un trazo para que sea cerrada y
	 * deber�a de seguir correctamente la secuencia con el siguinte trazo a 'c'. Porque si no repercute en la anchura y altura.
	 * @param c, un tipo de trazo
	 * @param trazos
	 */
	public void sustituir(char c, String trazos){
		//TODO
	}
	
	/**
	 * Gira la figura 90� a la derecha
	 */
	public void girarDerecha(){
		//TODO		
	}
	
	/**
	 * Aplica una homotecia de factor 2 a la figura
	 */
	public void homotecia2(){
		//TODO		
	}
	
	/**
	 * Devuelve la longitud de la figura, es decir, el numero de trazos que componen la figura
	 * @return longitud de la figura
	 */
	public int longitud(){
		//TODO
		return 0;
	}
	
	/**
	 * Devuelve la altura de la figura
	 * @return altura de la figura
	 */
	public int altura(){
		return 0;
	}
	
	/**
	 * Devuelve la anchura de la figura
	 * @return anchura de la figura
	 */
	public int anchura(){
		//TODO
		return 0;
	}
	
	/**
	 * Calcula y devuelve la superficie de la figura
	 * @return superficie de la figura
	 */
	public int superficie(){
		return 0;
	}

	/**
	 * Verifica si la figura actual y la fgura dada por parametro 'obj' son iguales
	 * @paramm obj, una figura
	 * @return True si son iguales y False, en caso contrario
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// NOTA: No se puede utilizar la comparacion entre Strings.
		return super.equals(obj);
	}

	/**
	 * Verifica si la figura actual y la figura 'f' son homoteticas. Es homotetica si las dos figuras tienen la misma orientaci�n 
	 * y aplicando una secuencia de homotecias del factor 2 a una de las figuras se obtiene la otra.
	 * @param f, una figura
	 * @return True si es homotetica y False, en caso contrario
	 */
	public boolean esHomotetica(Figura f){
		// TODO 
		// NOTA: No se puede utilizar la comparacion entre Strings.
		return false;
	}
	
	/**
	 * Verifica si la figura actual y la figura 'f' son semejantes. Es semejante si aplicando una secuencia de homotecias del 
	 * factor 2 y giros a la derecha a una de las figuras se obtiene la otra.
	 * @param f, una figura
	 * @return True si es semejante y False, en caso contrario
	 */
	public boolean esSemejante(Figura f){
		// TODO
		// NOTA: No se puede utilizar la comparacion entre Strings.
		return false;
	}
	
	/**
	 * Devuelve una copia exacta a la figura actual
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/** 
	 * Devuelve la representacion de una figura de trazos como una cadena de caracteres
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}