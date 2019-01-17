/** @file TaskManagerTest.java
 *  @brief Class to test the TaskManager class
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
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import controlador.TaskManager;
import modelo.Almacen;
import modelo.Articulos;
import modelo.Posicion;


/**
* @brief Class TaskManagerTest
*/
public class TaskManagerTest {
	/**
	 * @brief Attributes
	 */
	private Almacen almacen;
	private TaskManager taskManager;
	
	/**
	 * @brief Method to create objects
	 */
	@Before
	public void crearTaskManager()
	{
		almacen = new Almacen();
		taskManager = new TaskManager(almacen);
	}

	/**
	 * @brief method that tests the method getWorkStationWithItemInside
	 */
	@Test
	public void getRouteTest() {
		Articulos a = almacen.getArticleById(10);
		Posicion ws = taskManager.getWorkStationWithItemInside(a.getId());
		
	    assertNotNull("Workstation is taken", ws);
	}
	
	
}
