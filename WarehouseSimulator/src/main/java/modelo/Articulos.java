/** @file Articulos.java
 *  @brief Class to create the Products object
 *  @authors
 *  Name          | Suname         | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  @date 28/11/2018
 */

/** @brief package modelo
 */
package modelo;

/**
* @brief Class Articulos
*/
public class Articulos {
	
	/**
	 * @brief Attributes
	 */
	int id;
	Posicion posicion;
	String nombre, desc;
	
	/**
	 * @brief Constructor
	 * @param id product ID
	 * @param nombre product name
	 * @param desc product description
	 */
	public Articulos(int id, String nombre, String desc){
		this.id=id;
		this.nombre = nombre;
		this.desc=desc;
	}
	
	/**
	 * @brief Method for get the value of the id variable
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * @brief Method for get the value of the nombre variable
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @brief Method for get the value of the desc variable
	 * @return String
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @brief Method for printing the item in a custom way
	 * @return String
	 */
	@Override
	public String toString() {
		String cadena;
		cadena = nombre + " - " + desc;
		return cadena;
	}
}
