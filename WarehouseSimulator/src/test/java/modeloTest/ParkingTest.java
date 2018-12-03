/** @file ParkingTest.java
 *  @brief Class to test the Parking class
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

import modelo.Parking;
import modelo.Posicion;

/**
* @brief Class ParkingTest
*/
public class ParkingTest {
	
	/**
	 * @brief Attributes
	 */
	private Parking parking;
	
	/**
	 * @brief Method to cretate objects
	 */
	@Before
	public void crearParkin()
	{
		parking = new Parking(10, "Parking 1");
	}
	
	/**
	 * @brief method that tests the getPos method
	 */
	@Test
	public void getPosTest() {
	    int result = parking.getId();
	    assertEquals("posocion debe ser 10", 10,(Object)result);
	}
	
	/**
	 * @brief method that tests the getNombre method
	 */
	@Test
	public void getNombreTest() {
	    String result = parking.getNombre();
	    assertEquals("posocion debe ser Parking 1", "Parking 1",(Object)result);
	}
	
	/**
	 * @brief method that tests the IsLleno method
	 */
	@Test
	public void IsLlenoTest() {
	    boolean result = parking.isLleno();
	    assertEquals("posocion debe ser false", false,(Object)result);
	}
	
	/**
	 * @brief method that tests the setLleno method
	 */
	@Test
	public void setLlenoTest() {
		parking.setLleno(true);
	    boolean result = parking.isLleno();
	    assertEquals("posocion debe ser true", true,(Object)result);
	}
	
	/**
	 * @brief method that tests the addNextPosition method
	 */
	@Test
	public void addNextPositionTest() {
		Parking parkin2 = new Parking(5, "Parking 2");
		parking.addNextPosition(parkin2);
		Posicion result = parking.getNextPosition();
	    assertEquals("posocion debe ser true", parkin2,(Object)result);
	}
	
	/**
	 * @brief method that tests the getNextPosition method
	 */
	@Test
	public void getNextPositionTest() {
		Posicion result = parking.getNextPosition();
	    assertEquals("posocion debe ser null", null,(Object)result);
	}
	
}
