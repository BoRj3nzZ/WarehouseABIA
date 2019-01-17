/** @file CarControllerTest.java
 *  @brief Class to test the AdministradorCoches class
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 16/01/2019
 *  
 */

/** @brief package controllerTest
 */
package controllerTest;

/** @brief Libraries
 */
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import controlador.AdministradorCaminos;
import controlador.AdministradorCoches;
import modelo.Almacen;
import modelo.Posicion;
import modelo.Vehiculo;

/**
* @brief Class CarControllerTest
*/
public class CarControllerTest {
	/**
	 * @brief Attributes
	 */
	private Almacen almacen;
	private AdministradorCoches carController;
	
	/**
	 * @brief Method to create objects
	 */
	@Before
	public void crearCarController()
	{
		almacen = new Almacen();
		carController = almacen.getAdminCoches();
	}
	
	/**
	 * @brief method that tests the method getListaCoches
	 */
	@Test
	public void getListaCochesTest() {
		List<Vehiculo> lista = almacen.getListaVehiculo();		
		List<Vehiculo> result = carController.getListaCoches();
	    assertEquals("Lists are the same", lista, (Object)result);
	}
	
	/**
	 * @brief method that tests the method getFirstFreeCar
	 */
	@Test
	public void getFreeCarTest() {
		Vehiculo v = carController.getFirstFreeCar();
		String result = "moving";
	    assertEquals("Vehicles is in state moving", v.getEstado(), (Object)result);
	}
	
	/**
	 * @brief method that tests the method setCarData
	 */
	@Test
	public void setCarDataTest() {
		Posicion actualPos = almacen.getPosicionById(102);
		Posicion takeItemPos = almacen.getPosicionById(109);
		Posicion leaveItemPos = almacen.getPosicionById(114);
		int itemId = 9;
		Vehiculo v = new Vehiculo(2, "stopped", almacen.getPosicionById(102));
		carController.setCarData(v, actualPos, takeItemPos, leaveItemPos, itemId);
		int result = 9;
	    assertEquals("The item inside the car has an id of 9", v.getItemInside().getId(), (Object)result);
	}
	
	
}
