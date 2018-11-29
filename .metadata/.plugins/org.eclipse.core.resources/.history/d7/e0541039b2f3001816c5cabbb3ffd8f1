/** @file Circuito.java
 *  @brief Master class for all item categories
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
import java.util.Date;

/**
 * @brief Class Task
 */
public class Task {

	/**
	 * @brief Attributes
	 */
	int id;
	Vehiculo vehiculo;
	Articulos articulo;
	Date fecha;
	String estado;
	Posicion posicionFinal;
	
	/**
	 * @brief Constructor
	 * @param id Task ID
	 * @param articulo Task product
	 * @param estado Task state
	 * @param posicionFinal Task final position
	 */
	public Task(int id, Articulos articulo, String estado, Posicion posicionFinal){
		this.id = id;
		this.articulo = articulo;
		this.estado = estado;
		this.posicionFinal = posicionFinal;
		fecha = new Date();
	}

	/**
	 * @brief Method for get the value of the posicionFinal variable
	 * @return Posicion
	 */
	public Posicion getPosicionFinal() {
		return posicionFinal;
	}

	/**
	 * @brief Method for get the value of the posicionFinal variable
	 * @return Posicion
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	/**
	 * @brief Method for determine the vehicle of the Task 
	 * @param vehiculo the vehicle that will do the task
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	/**
	 * @brief Method for get the value of the posicionFinal variable
	 * @return Posicion
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @brief Method for determine the date when end the Task
	 * @param fecha the date when end the work
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @brief Method for get the value of the estado variable
	 * @return String
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @brief Method for determine the estado of the Task 
	 * @param estado state of the task
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
	 * @brief Method for get the value of the articulo variable
	 * @return Articulos
	 */
	public Articulos getArticulo() {
		return articulo;
	}
	
	
}
