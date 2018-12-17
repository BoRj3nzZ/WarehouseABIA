/** @file AdministradorCoches.java
 *  @brief Class to create the AdministradorCoches object
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 17/12/2018
 */

/** @brief package controlador
 */
package controlador;

import java.util.List;

import modelo.Almacen;
import modelo.Parking;
import modelo.Posicion;
import modelo.Vehiculo;
import modelo.WorkStation;

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
		Posicion actualPosition;
		updateFreeCarList();
		car = listaCochesLibres.get(0);
		actualPosition = car.getActualPosicion();
		if(actualPosition instanceof Parking) ((Parking) actualPosition).wakeUpFromParking();
		else ((WorkStation) actualPosition).wakeUpFromWorkStation();
		car.setEstado("Processing");
		listaCochesLibres.remove(0);
		return car;
	}	
	/**
	 * @brief Method for updating the list of free cars
	 */
	public void updateFreeCarList(){
		listaCochesLibres.clear();
		for(Vehiculo v:listaCoches){
			if(v.getEstado().equalsIgnoreCase("Espera")){
				listaCochesLibres.add(v);
			}
		}
	}
	/**
	 * @brief Method for adding a car to the listaCochesLibres list 
	 * @param v the vehicle to be added
	 */
	public void setCarOnFreeList(Vehiculo v){
		listaCochesLibres.add(v);
	}
	
}
