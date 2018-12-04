/** @file ArticulosTest.java
 *  @brief Class to test the Articulos class
 *  @authors
 *  Name          | Suname         | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  @date 30/11/2018
 *  
 */

/** @brief package modeloTest
 */
package modeloTest;

/** @brief Libraries
 */
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelo.Articulos;

/**
* @brief Class ArticulosTest
*/
public class ArticulosTest {
	/**
	 * @brief Attributes
	 */
	private Articulos articulo;
	
	/**
	 * @brief Method to cretate objects
	 */
	@Before
	public void crearArticulo()
	{
		articulo = new Articulos(1, "Calzado", "Bota Soul", "Bota de monte marron y negro");
	}
	
	/**
	 * @brief method that tests the method getId
	 */
	@Test
	public void getIdTest() {
		int result = articulo.getId();
		 assertEquals("Id debe ser 1", 1,(Object)result);
	}
	
	/**
	 * @brief method that tests the method getNombre
	 */
	@Test
	public void getNombreTest() {
		String result = articulo.getNombre();
		assertEquals("Nombre debe ser Bota Soul", "Bota Soul",(Object)result);
	}
	
	/**
	 * @brief method that tests the method getTipo
	 */
	@Test
	public void getTipoTest() {
		String result = articulo.getTipo();
		assertEquals("Tipo debe ser Calzado", "Calzado",(Object)result);
	}
	
	/**
	 * @brief method that tests the method getDesc
	 */
	@Test
	public void getDescTest() {
		String result = articulo.getDesc();
		assertEquals("Tipo debe ser: Bota de monte marron y negro", "Bota de monte marron y negro",(Object)result);
	}
	
	
}
