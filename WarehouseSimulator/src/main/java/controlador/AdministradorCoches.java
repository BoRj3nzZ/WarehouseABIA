/** @file AdministradorCoches.java
 *  @brief Class to create the AdministradorCoches object
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 11/12/2018
 */

/** @brief package controlador
 */
package controlador;

import java.util.List;

import modelo.Almacen;
import modelo.Vehiculo;

public class AdministradorCoches {

	Almacen almacen;
	List<Vehiculo> listaCoches;
	List<Vehiculo> listaCochesLibres;
	
	/**
	 * @brief Constructor
	 * @param almacen The warehouse
	 */
	public AdministradorCoches(Almacen almacen) {
		this.almacen = almacen;
		listaCoches = almacen.getListaVehiculo();
		listaCochesLibres = almacen.getListaVehiculo();
	}
	
	public List<Vehiculo> getListaCoches(){
		return listaCoches;
	}
	
	public Vehiculo getFirstFreeCar(){
		Vehiculo car;
		car = listaCochesLibres.get(0);
		listaCochesLibres.remove(0);
		return car;
	}
	
	public void setCarOnFreeList(Vehiculo v){
		listaCochesLibres.add(v);
	}
	
}
