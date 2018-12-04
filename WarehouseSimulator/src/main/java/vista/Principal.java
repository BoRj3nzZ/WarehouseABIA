/** @brief package vista
 */
package vista;

/** @brief Libraries
 */
import modelo.Almacen;

/**
 * @brief Class Principal
 */
public class Principal {
	
	/**
	 * @brief Attributes
	 */
	Almacen almacen;

	/**
	 * @brief Constructor
	 */
	private void Principal() {
		almacen = new Almacen();
	}
	
	/**
	 * @brief main
	 * @param args String[]
	 */
	public static void main(String[] args) {
		Principal ariketa = new Principal();
		ariketa.Principal();
	}



}
