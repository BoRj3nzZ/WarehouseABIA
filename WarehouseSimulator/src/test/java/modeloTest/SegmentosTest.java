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

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import modelo.Parking;
import modelo.Posicion;
import modelo.Segmentos;

/**
* @brief Class ArticulosTest
*/
public class SegmentosTest {
	
	/**
	 * @brief Attributes
	 */
		private Segmentos segmento;
		
		/**
		 * @brief Method to cretate objects
		 */
		@Before
		public void crearSegmentos()
		{
			segmento = new Segmentos(10, "Segmento 1");
		}
		
		/**
		 * @brief method that tests the NextPosition method
		 */
		@Test
		public void NextPositionTest() {
			Posicion pos1 = new Parking(5, "Posicion 2");
			Posicion pos2 = new Parking(5, "Posicion 3");
			segmento.addNextPosition(pos1);
			segmento.addNextPosition(pos2);
			List<Posicion> result = segmento.getNextPosition();
		    assertEquals("posocion debe ser pos1", pos1,(Object)result.get(0));
		    assertEquals("posocion debe ser pos2", pos2,(Object)result.get(1));
		}
		/**
		 * @brief method that tests the getDistancia method
		 */
		@Test
		public void getDistanciaTest(){
			int result = segmento.getDistancia();
			assertEquals("posocion debe ser 200", 200,(Object)result);
		}
}
