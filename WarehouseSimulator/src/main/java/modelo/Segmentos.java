/** @file Segmentos.java
 *  @brief Class to create the segments object
 *  @authors
 *  Name          | Suname         | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  @date 28/11/2018
 */

/** @brief package modelo
 */
package modelo;

/** @brief Libraries
 */
import java.util.List;

/**
* @brief Class Segmentos extends Posicion
*/
public class Segmentos extends Posicion{
	
	/**
	 * @brief Attributes
	 */
	static int distancia = 200;
	
	

	/**
	 * @brief Constructor
	 * @param nombre position name
	 * @param pos Position ID or position
	 */
	public Segmentos(int pos, String nombre) {
		super(pos, nombre);
	}

	/**
	 * @brief Method for determine which positions you can go to
	 * @param pos list of next positions
	 */
	@Override
	public void addNextPosition(Posicion... pos) {
		for(Posicion p : pos){
			nextPosition.add(p);
		}
	}
	
	/**
	 * @brief Method for get  the values of the nextPosition variable
	 * @return Position
	 */
	public List<Posicion> getNextPosition(){
		return nextPosition;
	}
	
	/**
	 * @brief Method for get  the values of the distancia variable
	 * @return int
	 */
	public int getDistancia() {
		return distancia;
	}

}
