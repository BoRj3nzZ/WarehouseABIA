/** @brief package modelo
 */
package modelo;

/** @brief Libraries
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @brief Class Recorrido
 */
public class Recorrido {
	
	/**
	 * @brief Attributes
	 */
	List<Posicion> recorrido;
	
	/**
	 * @brief Constructor
	 */
	public Recorrido(){
		recorrido = new ArrayList<Posicion>();
	}
	
	/**
	 * @brief Method that adds position to the route
	 * @param pos Position to be added to the route
	 */
	public void añadirPosicion(Posicion pos){
		recorrido.add(pos);
	}
	
	/**
	 * @brief Method that returns you the following position of the route
	 * @param pos Position you are in
	 * @return Posicion
	 */
	public Posicion getSiguiente(Posicion pos){
		Posicion siguiente = null;
		int i = 0;
		for (Posicion actual:recorrido){
			i++;
			if(actual == pos){
				siguiente = recorrido.get(i);
			}
		}
		return siguiente;
	}
	
	/**
	 * @brief Method that returns position in which the route begins
	 * @return Posicion
	 */
	public Posicion getInicio(){
		return recorrido.get(0);
	}
	
	/**
	 * @brief Method that returns position in which the route ends
	 * @return Posicion
	 */
	public Posicion getFinal(){
		return recorrido.get(recorrido.size());
	}
}
