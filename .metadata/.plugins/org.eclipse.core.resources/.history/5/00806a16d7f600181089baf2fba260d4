/** @file WorkStationTest.java
 *  @brief Class to test the WorkStation class
 *  @authors
 *  Name          | Suname         | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  @date 1/12/2018
 *  
 */

/** @brief package modeloTest
 */
package modeloTest;

/** @brief Libraries
 */
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import modelo.Articulos;
import modelo.Posicion;
import modelo.Segmentos;
import modelo.WorkStation; 

/**
* @brief Class WorkStationTest
*/
public class WorkStationTest {
	
	/**
	 * @brief Attributes
	 */
	WorkStation workStation;
	Articulos articulo;
	
	/**
	 * @brief Method to cretate objects
	 */
	@Before
	public void crearVehiculo()
	{
		workStation = new WorkStation(10, "Parking 1");
		articulo = new Articulos(1, workStation, "Calzado", "Bota Soul", "Bota de monte marron y negro");
	}
	
	/**
	 * @brief method that tests the method addNextPosition
	 */
	@Test
	public void addNextPositionTest() {
		Segmentos seg = new Segmentos(5, "Parking 2");
		workStation.addNextPosition(seg);
		Posicion result = workStation.getNextPosition();
	    assertEquals("posocion debe ser seg", seg,(Object)result);
	}
	
	/**
	 * @brief method that tests the method getNextPosition
	 */
	@Test
	public void getNextPositionTest() {
		Posicion result = workStation.getNextPosition();
	    assertEquals("posocion debe ser null", null,(Object)result);
	}

	/**
	 * @brief method that tests the method addArticulo
	 */
	@Test
	public void addArticuloTest() {
		workStation.addArticulo(articulo);
		List<Articulos> lista = workStation.getListProductos();
		boolean result = false;
		for(Articulos a : lista){
			if (a == articulo)result = true;
		}
	    assertEquals("true", true,(Object)result);
	}
	/**
	 * @brief method that tests the method deleteArticulo  with article
	 */
	@Test
	public void deleteArticuloTest() {
		workStation.addArticulo(articulo);
		workStation.deleteArticulo(articulo);
		List<Articulos> lista = workStation.getListProductos();
		boolean result = false;
		for(Articulos a : lista){
			if (a == articulo)result = true;
		}
	    assertEquals("false", false,(Object)result);
	}
	/**
	 * @brief method that tests the method deleteArticulo  with index
	 */
	@Test
	public void deleteArticulo2Test() {
		workStation.addArticulo(articulo);
		workStation.deleteArticulo(0);
		List<Articulos> lista = workStation.getListProductos();
		boolean result = false;
		for(Articulos a : lista){
			if (a == articulo)result = true;
		}
	    assertEquals("false", false,(Object)result);
	}
	
	/**
	 * @brief method that tests the method getListProductos 
	 */
	@Test
	public void getListProductosTest() {
		List<Articulos> result = workStation.getListProductos();
	   // assertEquals("false", null,(Object)result);
	}

}
