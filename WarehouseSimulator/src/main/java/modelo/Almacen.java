/** @file Almacen.java
 *  @brief Class to create the WorkStation 
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 17/12/2018
 */

/** @brief package modelo
 */
package modelo;

/** @brief Libraries
 */
import java.util.ArrayList;
import java.util.List;

/**
* @brief Class Almacen
*/
public class Almacen {

	/**
	 * @brief Attributes
	 */
	List<Vehiculo> listaVehiculo;
	List<Order>	listaOrdenes;
	List<Posicion> listaPosicion;
	List<Recorrido> listaRecorridos;
	Recorrido recorrido;
	/**
	 * @brief Constructor
	 */
	public Almacen(){
		listaVehiculo = new ArrayList<Vehiculo>();
		listaOrdenes = new ArrayList<Order>();
		listaPosicion = new ArrayList<Posicion>();
		listaRecorridos = new ArrayList<Recorrido>();
		leerListaPosiciones();
		leerListaVehiculos();
		leerListaArticulos();
		leerListaRecorridos();
	}
	
	/**
	 * @brief Method for initializing the routes between every position
	 */
	private void leerListaRecorridos() {
		recorrido = new Recorrido();//102-205
		recorrido.añadirPosicion(listaPosicion.get(4));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(0));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//102-108
		recorrido.añadirPosicion(listaPosicion.get(4));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(6));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//102-211
		recorrido.añadirPosicion(listaPosicion.get(4));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(2));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//102-114
		recorrido.añadirPosicion(listaPosicion.get(4));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(8));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//102-115
		recorrido.añadirPosicion(listaPosicion.get(4));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(9));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//102-212
		recorrido.añadirPosicion(listaPosicion.get(4));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(3));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//102-109
		recorrido.añadirPosicion(listaPosicion.get(4));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(7));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//102-206
		recorrido.añadirPosicion(listaPosicion.get(4));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(1));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//102-103
		recorrido.añadirPosicion(listaPosicion.get(4));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(13));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(5));
		listaRecorridos.add(recorrido);
		//
		recorrido = new Recorrido();//103-205
		recorrido.añadirPosicion(listaPosicion.get(5));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(0));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//103-108
		recorrido.añadirPosicion(listaPosicion.get(5));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(6));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//103-211
		recorrido.añadirPosicion(listaPosicion.get(5));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(2));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//103-114
		recorrido.añadirPosicion(listaPosicion.get(5));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(8));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//103-115
		recorrido.añadirPosicion(listaPosicion.get(5));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(9));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//103-212
		recorrido.añadirPosicion(listaPosicion.get(5));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(3));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//103-109
		recorrido.añadirPosicion(listaPosicion.get(5));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(7));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//103-206
		recorrido.añadirPosicion(listaPosicion.get(5));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(1));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//103-102
		recorrido.añadirPosicion(listaPosicion.get(5));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(4));
		listaRecorridos.add(recorrido);
		//
		recorrido = new Recorrido();//108-211
		recorrido.añadirPosicion(listaPosicion.get(6));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(2));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//108-114
		recorrido.añadirPosicion(listaPosicion.get(6));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(8));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//108-115
		recorrido.añadirPosicion(listaPosicion.get(6));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(9));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//108-212
		recorrido.añadirPosicion(listaPosicion.get(6));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(3));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//108-109
		recorrido.añadirPosicion(listaPosicion.get(6));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(7));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//108-206
		recorrido.añadirPosicion(listaPosicion.get(6));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(1));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//108-103
		recorrido.añadirPosicion(listaPosicion.get(6));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(5));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//108-102
		recorrido.añadirPosicion(listaPosicion.get(6));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(4));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//108-205
		recorrido.añadirPosicion(listaPosicion.get(6));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(0));
		listaRecorridos.add(recorrido);
		//
		recorrido = new Recorrido();//109-211
		recorrido.añadirPosicion(listaPosicion.get(7));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(2));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//109-114
		recorrido.añadirPosicion(listaPosicion.get(7));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(8));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//109-115
		recorrido.añadirPosicion(listaPosicion.get(7));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(9));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//109-212
		recorrido.añadirPosicion(listaPosicion.get(7));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(3));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//109-108
		recorrido.añadirPosicion(listaPosicion.get(7));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(6));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//109-206
		recorrido.añadirPosicion(listaPosicion.get(7));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(1));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//109-103
		recorrido.añadirPosicion(listaPosicion.get(7));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(5));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//109-102
		recorrido.añadirPosicion(listaPosicion.get(7));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(4));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//109-205
		recorrido.añadirPosicion(listaPosicion.get(7));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(0));
		listaRecorridos.add(recorrido);
		//
		recorrido = new Recorrido();//114-115
		recorrido.añadirPosicion(listaPosicion.get(8));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(9));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//114-212
		recorrido.añadirPosicion(listaPosicion.get(8));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(3));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//114-109
		recorrido.añadirPosicion(listaPosicion.get(8));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(7));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//114-206
		recorrido.añadirPosicion(listaPosicion.get(8));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(1));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//114-103
		recorrido.añadirPosicion(listaPosicion.get(8));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(5));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//114-102
		recorrido.añadirPosicion(listaPosicion.get(8));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(4));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//114-205
		recorrido.añadirPosicion(listaPosicion.get(8));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(0));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//114-108
		recorrido.añadirPosicion(listaPosicion.get(8));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(6));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//114-211
		recorrido.añadirPosicion(listaPosicion.get(8));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(2));
		listaRecorridos.add(recorrido);
		//
		recorrido = new Recorrido();//115-114
		recorrido.añadirPosicion(listaPosicion.get(9));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(8));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//115-212
		recorrido.añadirPosicion(listaPosicion.get(9));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(3));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//115-109
		recorrido.añadirPosicion(listaPosicion.get(9));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(7));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//115-206
		recorrido.añadirPosicion(listaPosicion.get(9));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(1));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//115-103
		recorrido.añadirPosicion(listaPosicion.get(9));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(5));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//115-102
		recorrido.añadirPosicion(listaPosicion.get(9));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(4));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//115-205
		recorrido.añadirPosicion(listaPosicion.get(9));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(0));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//115-108
		recorrido.añadirPosicion(listaPosicion.get(9));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(6));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//115-211
		recorrido.añadirPosicion(listaPosicion.get(9));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(2));
		listaRecorridos.add(recorrido);
		//
		recorrido = new Recorrido();//205-108
		recorrido.añadirPosicion(listaPosicion.get(0));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(6));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//205-114
		recorrido.añadirPosicion(listaPosicion.get(0));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(8));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//205-115
		recorrido.añadirPosicion(listaPosicion.get(0));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(9));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//205-109
		recorrido.añadirPosicion(listaPosicion.get(0));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(7));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//205-103
		recorrido.añadirPosicion(listaPosicion.get(0));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(5));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//205-102
		recorrido.añadirPosicion(listaPosicion.get(0));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(4));
		listaRecorridos.add(recorrido);
		//
		recorrido = new Recorrido();//206-108
		recorrido.añadirPosicion(listaPosicion.get(1));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(6));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//206-114
		recorrido.añadirPosicion(listaPosicion.get(1));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(8));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//206-115
		recorrido.añadirPosicion(listaPosicion.get(1));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(9));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//206-109
		recorrido.añadirPosicion(listaPosicion.get(1));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(14));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(19));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(7));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//206-103
		recorrido.añadirPosicion(listaPosicion.get(1));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(5));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//206-102
		recorrido.añadirPosicion(listaPosicion.get(0));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(4));
		listaRecorridos.add(recorrido);
		//
		recorrido = new Recorrido();//211-108
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(6));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//211-114
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(8));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//211-115
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(9));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//211-109
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(7));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//211-103
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(5));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//211-102
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(4));
		listaRecorridos.add(recorrido);
		//
		recorrido = new Recorrido();//212-108
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(6));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//212-114
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(8));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//212-115
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(16));
		recorrido.añadirPosicion(listaPosicion.get(17));
		recorrido.añadirPosicion(listaPosicion.get(20));
		recorrido.añadirPosicion(listaPosicion.get(23));
		recorrido.añadirPosicion(listaPosicion.get(25));
		recorrido.añadirPosicion(listaPosicion.get(24));
		recorrido.añadirPosicion(listaPosicion.get(9));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//212-109
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(7));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//212-103
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(5));
		listaRecorridos.add(recorrido);
		recorrido = new Recorrido();//212-102
		recorrido.añadirPosicion(listaPosicion.get(2));
		recorrido.añadirPosicion(listaPosicion.get(21));
		recorrido.añadirPosicion(listaPosicion.get(18));
		recorrido.añadirPosicion(listaPosicion.get(15));
		recorrido.añadirPosicion(listaPosicion.get(12));
		recorrido.añadirPosicion(listaPosicion.get(10));
		recorrido.añadirPosicion(listaPosicion.get(11));
		recorrido.añadirPosicion(listaPosicion.get(4));
		listaRecorridos.add(recorrido);
	}

	/**
	 * @brief Version sin BBDD
	 */
	private void leerListaArticulos() {
		((WorkStation) listaPosicion.get(4)).addArticulo(new Articulos(1, "Calzado", "Bota Soul 26", "Bota de monte, marron"));
		((WorkStation) listaPosicion.get(4)).addArticulo(new Articulos(2, "Camisa", "Camisa Cocodrile 40", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(4)).addArticulo(new Articulos(3, "Vaqueros", "Vaquero Levis 45", "Vaqueros rotos"));
		((WorkStation) listaPosicion.get(4)).addArticulo(new Articulos(4, "Calzado", "Bota Soul 36", "Bota de monte, marron"));
		((WorkStation) listaPosicion.get(4)).addArticulo(new Articulos(5, "Calzado", "Bota Soul 26", "Bota de monte, marron"));
		((WorkStation) listaPosicion.get(4)).addArticulo(new Articulos(6, "Calzado", "Bota Soul 36", "Bota de monte, marron"));
		((WorkStation) listaPosicion.get(4)).addArticulo(new Articulos(7,  "Vaqueros", "Vaquero Levis 45", "Vaqueros rotos"));
		
		((WorkStation) listaPosicion.get(5)).addArticulo(new Articulos(8, "Calzado", "Bota Soul 26", "Bota de monte, marron"));
		((WorkStation) listaPosicion.get(5)).addArticulo(new Articulos(9, "Calzado", "Bota Soul 26", "Bota de monte, marron"));
		((WorkStation) listaPosicion.get(5)).addArticulo(new Articulos(10, "Vaqueros", "Vaquero Levis 45", "Vaqueros rotos"));
		((WorkStation) listaPosicion.get(5)).addArticulo(new Articulos(11, "Vaqueros", "Vaquero Levis 45", "Vaqueros rotos"));
		((WorkStation) listaPosicion.get(5)).addArticulo(new Articulos(12, "Vaqueros", "Vaquero Levis 35", "Vaqueros rotos"));
		((WorkStation) listaPosicion.get(5)).addArticulo(new Articulos(13, "Camisa", "Camisa Cocodrile 40", "Camisa lisa, blanca"));
		
		((WorkStation) listaPosicion.get(6)).addArticulo(new Articulos(14, "Camisa", "Camisa Cocodrile 40", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(6)).addArticulo(new Articulos(15, "Camisa", "Camisa Cocodrile 40", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(6)).addArticulo(new Articulos(16, "Calzado", "Bota Soul 46", "Bota de monte, marron"));
		((WorkStation) listaPosicion.get(6)).addArticulo(new Articulos(17, "Calzado", "Bota Soul 46", "Bota de monte, marron"));
		((WorkStation) listaPosicion.get(6)).addArticulo(new Articulos(18, "Calzado", "Bota Soul 46", "Bota de monte, marron"));
		
		((WorkStation) listaPosicion.get(7)).addArticulo(new Articulos(19, "Calzado", "Bota Soul 46", "Bota de monte, marron"));
		((WorkStation) listaPosicion.get(7)).addArticulo(new Articulos(20, "Camisa", "Camisa Cocodrile 50", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(7)).addArticulo(new Articulos(21, "Vaqueros", "Vaquero Levis 45", "Vaqueros rotos"));
		((WorkStation) listaPosicion.get(7)).addArticulo(new Articulos(22, "Camisa", "Camisa Cocodrile 50", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(7)).addArticulo(new Articulos(23, "Vaqueros", "Vaquero Levis 45", "Vaqueros rotos"));
		
		((WorkStation) listaPosicion.get(8)).addArticulo(new Articulos(24, "Camisa", "Camisa Cocodrile 50", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(8)).addArticulo(new Articulos(25, "Camisa", "Camisa Cocodrile 50", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(8)).addArticulo(new Articulos(26, "Camisa", "Camisa Cocodrile 40", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(8)).addArticulo(new Articulos(27, "Camisa", "Camisa Cocodrile 40", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(8)).addArticulo(new Articulos(28, "Camisa", "Camisa Cocodrile 40", "Camisa lisa, blanca")); 
		
		((WorkStation) listaPosicion.get(9)).addArticulo(new Articulos(29, "Camisa", "Camisa Cocodrile 50", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(9)).addArticulo(new Articulos(30, "Camisa", "Camisa Cocodrile 50", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(9)).addArticulo(new Articulos(31, "Camisa", "Camisa Cocodrile 40", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(9)).addArticulo(new Articulos(32, "Camisa", "Camisa Cocodrile 40", "Camisa lisa, blanca"));
		((WorkStation) listaPosicion.get(9)).addArticulo(new Articulos(33, "Camisa", "Camisa Cocodrile 40", "Camisa lisa, blanca")); 
	}

	/**
	 * @brief Version sin BBDD
	 */
	private void leerListaPosiciones() {
		listaPosicion.add(new Parking(205, "Parking 1")); //0
		listaPosicion.add(new Parking(206, "Parking 2")); //1
		listaPosicion.add(new Parking(211, "Parking 3")); //2
		listaPosicion.add(new Parking(212, "Parking 4")); //3
		listaPosicion.add(new WorkStation(102, "WorkStation 1")); //4
		listaPosicion.add(new WorkStation(103, "WorkStation 2")); //5
		listaPosicion.add(new WorkStation(108, "WorkStation 3")); //6
		listaPosicion.add(new WorkStation(109, "WorkStation 4")); //7
		listaPosicion.add(new WorkStation(114, "WorkStation 5")); //8
		listaPosicion.add(new WorkStation(115, "WorkStation 6")); //9
		listaPosicion.add(new Segmentos(1, "Segmento 1")); //10
		listaPosicion.add(new Segmentos(2, "Segmento 2")); //11
		listaPosicion.add(new Segmentos(3, "Segmento 3")); //12
		listaPosicion.add(new Segmentos(4, "Segmento 4")); //13
		listaPosicion.add(new Segmentos(5, "Segmento 5")); //14
		listaPosicion.add(new Segmentos(6, "Segmento 6")); //15
		listaPosicion.add(new Segmentos(7, "Segmento 7")); //16
		listaPosicion.add(new Segmentos(8, "Segmento 8")); //17
		listaPosicion.add(new Segmentos(9, "Segmento 9")); //18
		listaPosicion.add(new Segmentos(10, "Segmento 10")); //19
		listaPosicion.add(new Segmentos(11, "Segmento 11")); //20
		listaPosicion.add(new Segmentos(12, "Segmento 12")); //21
		listaPosicion.add(new Segmentos(13, "Segmento 13")); //22
		listaPosicion.add(new Segmentos(14, "Segmento 14")); //23
		listaPosicion.add(new Segmentos(15, "Segmento 15")); //24
		listaPosicion.add(new Segmentos(16, "Segmento 16")); //25
		initializeConnectedPositions();		
	}
	
	/**
	 * @brief Method for initializing the positions connected to each other
	 */
	private void initializeConnectedPositions(){
		/*Parkings*/
		listaPosicion.get(0).addNextPosition(listaPosicion.get(14));
		listaPosicion.get(1).addNextPosition(listaPosicion.get(15));
		listaPosicion.get(2).addNextPosition(listaPosicion.get(20));
		listaPosicion.get(3).addNextPosition(listaPosicion.get(21));	
		/*WorkStations*/
		listaPosicion.get(4).addNextPosition(listaPosicion.get(11));		
		listaPosicion.get(5).addNextPosition(listaPosicion.get(12));		
		listaPosicion.get(6).addNextPosition(listaPosicion.get(17));		
		listaPosicion.get(7).addNextPosition(listaPosicion.get(18));		
		listaPosicion.get(8).addNextPosition(listaPosicion.get(23));	
		listaPosicion.get(9).addNextPosition(listaPosicion.get(24));
		/*Segments*/
		listaPosicion.get(10).addNextPosition(listaPosicion.get(11));//1-2
		listaPosicion.get(11).addNextPosition(listaPosicion.get(4),listaPosicion.get(13),listaPosicion.get(14));//2-102,4,5
		listaPosicion.get(12).addNextPosition(listaPosicion.get(5),listaPosicion.get(10));//3-103,1
		listaPosicion.get(13).addNextPosition(listaPosicion.get(12));//4-3
		
		listaPosicion.get(14).addNextPosition(listaPosicion.get(0),listaPosicion.get(17));//5-205,8
		listaPosicion.get(15).addNextPosition(listaPosicion.get(1),listaPosicion.get(12));//6-206,3
		listaPosicion.get(16).addNextPosition(listaPosicion.get(17));//7-8
		
		listaPosicion.get(17).addNextPosition(listaPosicion.get(6),listaPosicion.get(19),listaPosicion.get(20));//8-108,10,11
		listaPosicion.get(18).addNextPosition(listaPosicion.get(7),listaPosicion.get(15),listaPosicion.get(16));//9-109,6,7
		listaPosicion.get(19).addNextPosition(listaPosicion.get(18));//10-9
		
		listaPosicion.get(20).addNextPosition(listaPosicion.get(2),listaPosicion.get(23));//11-211,14
		listaPosicion.get(21).addNextPosition(listaPosicion.get(3),listaPosicion.get(18));//12-212,9	
		listaPosicion.get(22).addNextPosition(listaPosicion.get(23));//13-14
		
		listaPosicion.get(23).addNextPosition(listaPosicion.get(8),listaPosicion.get(25));//14-114,16
		listaPosicion.get(24).addNextPosition(listaPosicion.get(9),listaPosicion.get(21),listaPosicion.get(22));//15-115,12,13
		listaPosicion.get(25).addNextPosition(listaPosicion.get(24));//16-15
	}

	/**
	 * @brief Version sin BBDD
	 */
	private void leerListaVehiculos() {
		listaVehiculo.add(new Vehiculo(1, "Espera", listaPosicion.get(0)));
		listaVehiculo.add(new Vehiculo(2, "Espera", listaPosicion.get(1)));
		listaVehiculo.add(new Vehiculo(3, "Espera", listaPosicion.get(2)));
		listaVehiculo.add(new Vehiculo(4, "Espera", listaPosicion.get(3)));
		listaVehiculo.add(new Vehiculo(5, "Espera", listaPosicion.get(4)));
		listaPosicion.get(0).setLleno(true);
		listaPosicion.get(1).setLleno(true);
		listaPosicion.get(2).setLleno(true);
		listaPosicion.get(3).setLleno(true);
		listaPosicion.get(4).setLleno(true);
		
	}
	
	/**
	 * @brief Method for getting the values of the listaVehiculo variable
	 * @return List<Recorrido>
	 */
	public List<Recorrido> getListaRecorridos() {
		List<Recorrido> copia = new ArrayList<Recorrido>();
		copia.addAll(listaRecorridos);
		return copia;
	}
	/**
	 * @brief Method for getting the values of the listaVehiculo variable
	 * @return List<Vehiculo>
	 */
	public List<Vehiculo> getListaVehiculo() {
		List<Vehiculo> copia = new ArrayList<Vehiculo>();
		copia.addAll(listaVehiculo);
		return copia;
	}

	/**
	 * @brief Method for getting the values of the listaOrdenes variable
	 * @return List<Order>
	 */
	public List<Order> getListaOrdenes() {
		return listaOrdenes;
	}

	/**
	 * @brief Method for getting the values of the listaPosicion variable
	 * @return List<Posicion>
	 */
	public List<Posicion> getListaPosicion() {
		return listaPosicion;
	}
	
	/**
	 * @brief Method for deleting one value of the listaOrdenes variable
	 * @param index Index of the element you want to delete 
	 */
	public void borrarOrden(int index){
		listaOrdenes.remove(index);
	}
	/**
	 * @brief Method for deleting one value of the listaOrdenes variable
	 * @param orden the element you want to delete 
	 */
	public void borrarOrden(Order orden){
		listaOrdenes.remove(orden);
	}
	
	/**
	 * @brief Method for adding one value of the listaOrdenes variable
	 * @param orden the element you want to add 
	 */
	public void añadirOrden(Order orden){
		listaOrdenes.add(orden);
	}
}
