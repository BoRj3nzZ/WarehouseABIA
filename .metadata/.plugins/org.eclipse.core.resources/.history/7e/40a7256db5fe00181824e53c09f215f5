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
	String tipo, nombre, desc;
	
	/**
	 * @brief Constructor
	 * @param id product ID
	 * @param tipo product type
	 * @param nombre product name
	 * @param desc product description
	 */
	public Articulos(int id, String tipo, String nombre, String desc){
		this.id=id;
		this.tipo = tipo;
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
	 * @brief Method for get the value of the tipo variable
	 * @return String
	 */
	public String getTipo() {
		return tipo;
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
	
	@Override
	public String toString() {
		String cadena;
		cadena = tipo + " - " + nombre + " - " + desc;
		return cadena;
	}
}
