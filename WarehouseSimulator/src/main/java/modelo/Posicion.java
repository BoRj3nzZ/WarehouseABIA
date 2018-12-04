/** @file Posicion.java
 *  @brief Class to create the Positions
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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * @brief Class Posicion
 */
public abstract class Posicion {
	
	/**
	 * @brief Attributes
	 */
	int id;
	boolean lleno;
	String nombre;
	List<Posicion> nextPositionList;
	Semaphore sMutEx;
	Semaphore sEntry;
	
	/**
	 * @brief Constructor
	 * @param nombre position name
	 * @param pos Position ID or position
	 */
	public Posicion(int id, String nombre){
		this.id = id;
		this.nombre = nombre;
		nextPositionList = new ArrayList<Posicion>();
		lleno = false;
	}
	
	/**
<<<<<<< HEAD
	 * @brief Method for getting the value of the pos variable
=======
	 * @brief Method for get the value of the id variable
>>>>>>> 470e8f96cdd0c2b172650e2780c1fbac13bcb197
	 * @return int
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @brief Method for getting the value of the lleno variable
	 * @return boolean
	 */
	public boolean isLleno() {
		return lleno;
	}
	
	/**
	 * @brief Method for setting the state of the position 
	 * @param lleno state of the position
	 */
	public void setLleno(boolean lleno) {
		this.lleno = lleno;
	}
	
	/**
	 * @brief Method for getting the value of the nombre variable
	 * @return String
	 */
	public String getNombre() {
		return nombre; 
	}

	/**
	 * @brief Method for determining if this position is connected to a destination
	 * @return boolean
	 */
	public boolean connectsTo(Posicion destino) {
		boolean isConnected = false;
		for(Posicion p:this.nextPositionList){
			if(p==destino) isConnected=true;
		}
		return isConnected;
	}
	
	/**
	 * @brief Method for determine which positions you can go to
	 * @param pos list of next positions
	 */
	public abstract void addNextPosition(Posicion...pos);

}
