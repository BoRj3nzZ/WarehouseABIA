/** @file AdministradorCoches.java
 *  @brief Class to create the AdministradorCoches object
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 12/12/2018
 */

/** @brief package controlador
 */
package controlador;

import java.util.List;

import modelo.Almacen;
import modelo.Vehiculo;

public class AdministradorCoches {
	/**
	 * @brief Attributes
	 */
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
	/**
	 * @brief Method for getting the list of cars 
	 * @return List<Vehiculo>
	 */
	public List<Vehiculo> getListaCoches(){
		return listaCoches;
	}
	/**
	 * @brief Method for getting the first element of listaCochesLibres 
	 * @return Vehiculo
	 */
	public Vehiculo getFirstFreeCar(){
		Vehiculo car;
		car = listaCochesLibres.get(0);
		listaCochesLibres.remove(0);
		return car;
	}
	/**
	 * @brief Method for adding a car to the listaCochesLibres list 
	 * @param v the vehicle to be added
	 */
	public void setCarOnFreeList(Vehiculo v){
		listaCochesLibres.add(v);
	}
	
}
