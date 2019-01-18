/** @file Order.java
 *  @brief Class to create the Orders
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 14/01/2019
 */

/** @brief package modelo
 */
package modelo;

import java.util.ArrayList;
/** @brief Libraries
 */
import java.util.List;

/**
 * @brief Class Order
 */
public class Order {
	
	/**
	 * @brief Attributes
	 */
	int id;
	Posicion posicionFinal;
	List<Task> listaTask;
	String estado;
	
	/**
	 * @brief Constructor
	 * @param id Order ID
	 * @param posicionFinal Position in which the products must be finished
	 */
	public Order(int id,Posicion posicionFinal, String estado){
		this.id = id;
		this.posicionFinal = posicionFinal;
		listaTask = new ArrayList<Task>();
		this.estado = estado;
	}

	/**
	 * @brief Method for adding tasks to the list
	 */
	public void addTaskToList(Task task){
		this.listaTask.add(task);
	}
	
	/**
	 * @brief Method for get the value of the estado variable
	 * @return String
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @brief Method for determine the estado of the Order 
	 * @param estado Status of the order
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @brief Method for get the value of the id variable
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * @brief Method for get the value of the posicionFinal variable
	 * @return Posicion
	 */
	public Posicion getPosicionFinal() {
		return posicionFinal;
	}

	/**
	 * @brief Method for get the value of the listaTask variable
	 * @return List<Task>
	 */
	public List<Task> getListaTask() {
		List<Task> copia = new ArrayList<Task>();
		copia.addAll(listaTask);
		return copia;
	}
	

}
