/** @file Segmentos.java
 *  @brief Class to create the segments object
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 28/11/2018
 */

/** @brief package modelo
 */
package modelo;

/** @brief Libraries
 */
import java.util.List;
import java.util.concurrent.Semaphore;

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
		sMutEx = new Semaphore(1, true);
		sEntry = new Semaphore(1, true);
	}
	
	/**
	 * @brief Method for getting sMutEx
	 */
	public Semaphore getSMutEx(){
		return sMutEx;
	}
	
	/**
	 * @brief Method for getting sEntry
	 */
	public Semaphore getSEntry(){
		return sEntry;
	}

	/**
	 * @brief Method for determining which positions you can go to
	 * @param pos list of next positions
	 */
	@Override
	public void addNextPosition(Posicion... pos) {
		for(Posicion p : pos){
			nextPositionList.add(p);
		}
	}
	
	/**
	 * @brief Method for getting the values of the nextPositionList variable
	 * @return Position
	 */
	public List<Posicion> getNextPositionList(){
		return nextPositionList;
	}
	
	/**
	 * @brief Method for getting the values of the distancia variable
	 * @return int
	 */
	public int getDistancia() {
		return distancia;
	}
	

}
