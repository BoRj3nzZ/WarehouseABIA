/** @file Circuito.java
 *  @brief Class to create the WorkState object
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
import java.util.ArrayList;


/**
 * @brief Class WorkStation extends Posicion
 */
public class WorkStation extends Posicion{
	
	/**
	 * @brief Attributes
	 */
	List<Articulos> listProductos;
	
	/**
	 * @brief Constructor
	 * @param nombre position name
	 * @param pos Position ID or position
	 */
	public WorkStation(int pos, String nombre){
		super(pos, nombre);
		listProductos = new ArrayList<Articulos>();
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
	 * @brief Method for get the value of the nextPosition variable
	 * @return Position
	 */
	public Posicion getNextPosition(){
		for(Posicion p : nextPosition){
			return p;
		}
		return null;
	}
	
	/**
	 * @brief Method for add an Articulos to the listProductos
	 * @param new Article
	 */
	public void addArticulo(Articulos a){
		listProductos.add(a);
	}
	
	/**
	 * @brief Method for delete an product to the listProductos
	 * @param delete product index
	 */
	public void deleteArticulo(int index){
		listProductos.remove(index);
	}
	/**
	 * @brief Method for delete an product to the listProductos
	 * @param delete product
	 */
	public void deleteArticulo(Articulos a){
		listProductos.remove(a);
	}

	/**
	 * @brief Method for get the List of the listProductos
	 * @return List<Articulos>
	 */
	public List<Articulos> getListProductos() {
		return listProductos;
	}
	

}
