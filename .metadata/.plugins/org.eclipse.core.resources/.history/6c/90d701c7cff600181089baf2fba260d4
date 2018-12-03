/** @file Almacen.java
 *  @brief Class to create the WorkStation 
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
import java.util.ArrayList;
import java.util.List;

/**
* @brief Class Almacen
*/
public class Almacen {

	/**
	 * @brief Attributes
	 */
	List<Vehiculo> listaVehiculo;
	List<Order>	listaOrdenes;
	List<Posicion> listaPosicion;
	
	/**
	 * @brief Constructor
	 */
	public Almacen(){
		listaVehiculo = new ArrayList<Vehiculo>();
		listaOrdenes = new ArrayList<Order>();
		listaPosicion = new ArrayList<Posicion>();
		leerListaVehiculos();
		leerListaPosiciones();
		
	}

	
	private void leerListaPosiciones() {
		// TODO Auto-generated method stub
		
	}

	private void leerListaVehiculos() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @brief Method for get  the values of the listaVehiculo variable
	 * @return List<Vehiculo>
	 */
	public List<Vehiculo> getListaVehiculo() {
		return listaVehiculo;
	}

	/**
	 * @brief Method for get  the values of the listaOrdenes variable
	 * @return List<Order>
	 */
	public List<Order> getListaOrdenes() {
		return listaOrdenes;
	}

	/**
	 * @brief Method for get  the values of the listaPosicion variable
	 * @return List<Posicion>
	 */
	public List<Posicion> getListaPosicion() {
		return listaPosicion;
	}
	
	public void buscarOrdenNueva(){
				
	}
	
	/**
	 * @brief Method for delete one value of the listaOrdenes variable
	 * @param index Index of the element you want to delete 
	 */
	public void borrarOrden(int index){
		listaOrdenes.remove(index);
	}
	/**
	 * @brief Method for delete one value of the listaOrdenes variable
	 * @param orden the element you want to delete 
	 */
	public void borrarOrden(Order orden){
		listaOrdenes.remove(orden);
	}
	
	/**
	 * @brief Method for add one value of the listaOrdenes variable
	 * @param orden the element you want to add 
	 */
	public void añadirOrden(Order orden){
		listaOrdenes.add(orden);
	}
}
