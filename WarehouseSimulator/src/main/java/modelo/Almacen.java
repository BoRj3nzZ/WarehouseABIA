/** @file Almacen.java
 *  @brief Class to create the WorkStation 
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 21/12/2018
 */

/** @brief package modelo
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/** @brief Libraries
 */
import java.util.ArrayList;
import java.util.List;

import controlador.DBManager;

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
		leerPosicionesDesdeDB();
		leerVehiculosDesdeDB();
		leerArticulosDesdeDB();
		initializeRoutes();
	}
	
	/**
	 * @brief Method for initializing the routes between every position
	 */
	private void initializeRoutes(){
		Segmentos s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16;
		WorkStation ws2, ws3, ws8, ws9, ws14, ws15;
		Parking pk5, pk6, pk11, pk12;
		
		s1=(Segmentos) listaPosicion.get(0);
		s2=(Segmentos) listaPosicion.get(1);
		s3=(Segmentos) listaPosicion.get(2);
		s4=(Segmentos) listaPosicion.get(3);
		s5=(Segmentos) listaPosicion.get(4);
		s6=(Segmentos) listaPosicion.get(5);
		s7=(Segmentos) listaPosicion.get(6);
		s8=(Segmentos) listaPosicion.get(7);
		s9=(Segmentos) listaPosicion.get(8);
		s10=(Segmentos) listaPosicion.get(9);
		s11=(Segmentos) listaPosicion.get(10);
		s12=(Segmentos) listaPosicion.get(11);
		s13=(Segmentos) listaPosicion.get(12);
		s14=(Segmentos) listaPosicion.get(13);
		s15=(Segmentos) listaPosicion.get(14);
		s16=(Segmentos) listaPosicion.get(15);
		
		ws2=(WorkStation) listaPosicion.get(16);
		ws3=(WorkStation) listaPosicion.get(17);
		ws8=(WorkStation) listaPosicion.get(18);
		ws9=(WorkStation) listaPosicion.get(19);
		ws14=(WorkStation) listaPosicion.get(20);
		ws15=(WorkStation) listaPosicion.get(21);
		
		pk5=(Parking) listaPosicion.get(22);
		pk6=(Parking) listaPosicion.get(23);
		pk11=(Parking) listaPosicion.get(24);
		pk12=(Parking) listaPosicion.get(25);
		
		listaRecorridos.add(new Recorrido(ws2,s2,s5,pk5));//102-205
		listaRecorridos.add(new Recorrido(ws2,s2,s5,s8,ws8));//102-108
		listaRecorridos.add(new Recorrido(ws2,s2,s5,s8,s11,pk11));//102-211
		listaRecorridos.add(new Recorrido(ws2,s2,s5,s8,s11,s14,ws14));//102-114
		listaRecorridos.add(new Recorrido(ws2,s2,s5,s8,s11,s14,s16,s15,ws15));//102-115
		listaRecorridos.add(new Recorrido(ws2,s2,s5,s8,s11,s14,s16,s15,s12,pk12));//102-212
		listaRecorridos.add(new Recorrido(ws2,s2,s5,s8,s10,s9,ws9));//102-109
		listaRecorridos.add(new Recorrido(ws2,s2,s5,s8,s10,s9,s6,pk6));//102-206
		listaRecorridos.add(new Recorrido(ws2,s2,s4,s3,ws3));//102-103
		
		listaRecorridos.add(new Recorrido(ws3,s3,s1,s2,ws2));//103-102
		listaRecorridos.add(new Recorrido(ws3,s3,s1,s2,s5,pk5));//103-205
		listaRecorridos.add(new Recorrido(ws3,s3,s1,s2,s5,s8,ws8));//103-108
		listaRecorridos.add(new Recorrido(ws3,s3,s1,s2,s5,s8,s11,pk11));//103-211
		listaRecorridos.add(new Recorrido(ws3,s3,s1,s2,s5,s8,s11,s14,ws14));//103-114
		listaRecorridos.add(new Recorrido(ws3,s3,s1,s2,s5,s8,s11,s14,s16,s15,ws15));//103-115
		listaRecorridos.add(new Recorrido(ws3,s3,s1,s2,s5,s8,s11,s14,s16,s15,s12,pk12));//103-212
		listaRecorridos.add(new Recorrido(ws3,s3,s1,s2,s5,s8,s10,s9,ws9));//103-109
		listaRecorridos.add(new Recorrido(ws3,s3,s1,s2,s5,s8,s10,s9,s6,pk6));//103-206
		
		listaRecorridos.add(new Recorrido(ws8,s8,s11,pk11));//108-211
		listaRecorridos.add(new Recorrido(ws8,s8,s11,s14,ws14));//108-114
		listaRecorridos.add(new Recorrido(ws8,s8,s11,s14,s16,s15,ws15));//108-115
		listaRecorridos.add(new Recorrido(ws8,s8,s11,s14,s16,s15,s12,pk12));//108-212
		listaRecorridos.add(new Recorrido(ws8,s8,s10,s9,ws9));//108-109
		listaRecorridos.add(new Recorrido(ws8,s8,s10,s9,s6,pk6));//108-206
		listaRecorridos.add(new Recorrido(ws8,s8,s10,s9,s6,s3,ws3));//108-103
		listaRecorridos.add(new Recorrido(ws8,s8,s10,s9,s6,s3,s1,s2,ws2));//108-102
		listaRecorridos.add(new Recorrido(ws8,s8,s10,s9,s6,s3,s1,s2,s5,pk5));//108-205
		
		listaRecorridos.add(new Recorrido(ws9,s9,s6,pk6));//109-206
		listaRecorridos.add(new Recorrido(ws9,s9,s6,s3,ws3));//109-103
		listaRecorridos.add(new Recorrido(ws9,s9,s6,s3,s1,s2,ws2));//109-102
		listaRecorridos.add(new Recorrido(ws9,s9,s6,s3,s1,s2,s5,pk5));//109-205
		listaRecorridos.add(new Recorrido(ws9,s9,s7,s8,ws8));//109-108
		listaRecorridos.add(new Recorrido(ws9,s9,s7,s8,s11,pk11));//109-211
		listaRecorridos.add(new Recorrido(ws9,s9,s7,s8,s11,s14,ws14));//109-114
		listaRecorridos.add(new Recorrido(ws9,s9,s7,s8,s11,s14,s16,s15,ws15));//109-115
		listaRecorridos.add(new Recorrido(ws9,s9,s7,s8,s11,s14,s16,s15,s12,pk12));//109-212
		
		listaRecorridos.add(new Recorrido(ws14,s14,s16,s15,ws15));//114-115
		listaRecorridos.add(new Recorrido(ws14,s14,s16,s15,s12,pk12));//114-212
		listaRecorridos.add(new Recorrido(ws14,s14,s16,s15,s12,s9,ws9));//114-109
		listaRecorridos.add(new Recorrido(ws14,s14,s16,s15,s12,s9,s6,pk6));//114-206
		listaRecorridos.add(new Recorrido(ws14,s14,s16,s15,s12,s9,s6,s3,ws3));//114-103
		listaRecorridos.add(new Recorrido(ws14,s14,s16,s15,s12,s9,s6,s3,s1,s2,ws2));//114-102
		listaRecorridos.add(new Recorrido(ws14,s14,s16,s15,s12,s9,s6,s3,s1,s2,s5,pk5));//114-205
		listaRecorridos.add(new Recorrido(ws14,s14,s16,s15,s12,s9,s7,s8,ws8));//114-108
		listaRecorridos.add(new Recorrido(ws14,s14,s16,s15,s12,s9,s7,s8,s11,pk11));//114-211
		
		listaRecorridos.add(new Recorrido(ws15,s15,s12,pk12));//115-212
		listaRecorridos.add(new Recorrido(ws15,s15,s12,s9,ws9));//115-109
		listaRecorridos.add(new Recorrido(ws15,s15,s12,s9,s6,pk6));//115-206
		listaRecorridos.add(new Recorrido(ws15,s15,s12,s9,s6,s3,ws3));//115-103
		listaRecorridos.add(new Recorrido(ws15,s15,s12,s9,s6,s3,s1,s2,ws2));//115-102
		listaRecorridos.add(new Recorrido(ws15,s15,s12,s9,s6,s3,s1,s2,s5,pk5));//115-205
		listaRecorridos.add(new Recorrido(ws15,s15,s12,s9,s7,s8,ws8));//115-108
		listaRecorridos.add(new Recorrido(ws15,s15,s12,s9,s7,s8,s11,pk11));//115-211
		listaRecorridos.add(new Recorrido(ws15,s15,s13,s14,ws14));//115-114
		
		listaRecorridos.add(new Recorrido(pk5,s5,s8,ws8));//205-108
		listaRecorridos.add(new Recorrido(pk5,s5,s8,s11,s14,ws14));//205-114
		listaRecorridos.add(new Recorrido(pk5,s5,s8,s11,s14,s16,s15,ws15));//205-115
		listaRecorridos.add(new Recorrido(pk5,s5,s8,s10,s9,ws9));//205-109
		listaRecorridos.add(new Recorrido(pk5,s5,s8,s10,s9,s6,s3,ws3));//205-103
		listaRecorridos.add(new Recorrido(pk5,s5,s8,s10,s9,s6,s3,s1,s2,ws2));//205-102
		
		listaRecorridos.add(new Recorrido(pk6,s6,s3,ws3));//206-103
		listaRecorridos.add(new Recorrido(pk6,s6,s3,s1,s2,ws2));//206-102
		listaRecorridos.add(new Recorrido(pk6,s6,s3,s1,s2,s5,s8,ws8));//206-108
		listaRecorridos.add(new Recorrido(pk6,s6,s3,s1,s2,s5,s8,s11,s14,ws14));//206-114
		listaRecorridos.add(new Recorrido(pk6,s6,s3,s1,s2,s5,s8,s11,s14,s16,s15,ws15));//206-115
		listaRecorridos.add(new Recorrido(pk6,s6,s3,s1,s2,s5,s8,s10,s9,ws9));//206-109
		
		listaRecorridos.add(new Recorrido(pk11,s11,s14,ws14));//211-114
		listaRecorridos.add(new Recorrido(pk11,s11,s14,s16,s15,ws15));//211-115
		listaRecorridos.add(new Recorrido(pk11,s11,s14,s16,s15,s12,s9,ws9));//211-109
		listaRecorridos.add(new Recorrido(pk11,s11,s14,s16,s15,s12,s9,s6,s3,ws3));//211-103
		listaRecorridos.add(new Recorrido(pk11,s11,s14,s16,s15,s12,s9,s6,s3,s1,s2,ws2));//211-102
		listaRecorridos.add(new Recorrido(pk11,s11,s14,s16,s15,s12,s9,s7,s8,ws8));//211-108
		
		listaRecorridos.add(new Recorrido(pk12,s12,s9,ws9));//212-109
		listaRecorridos.add(new Recorrido(pk12,s12,s9,s6,s3,ws3));//212-103
		listaRecorridos.add(new Recorrido(pk12,s12,s9,s6,s3,s1,s2,ws2));//212-102
		listaRecorridos.add(new Recorrido(pk12,s12,s9,s7,s8,ws8));//212-108
		listaRecorridos.add(new Recorrido(pk12,s12,s9,s7,s8,s11,s14,ws14));//212-114
		listaRecorridos.add(new Recorrido(pk12,s12,s9,s7,s8,s11,s14,s16,s15,ws15));//212-115
	}
	
	/**
	 * @brief Method for reading the articles from the database
	 */
	private void leerArticulosDesdeDB(){
		// Declare the JDBC objects.
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String articleName, articleDesc;
		int articleId, posId;
		/*select p.idProduct, pt.NAME, pt.DESCRIPTION, p.POSITION from 
		product p join producttype pt on p.producttype=pt.idProducttype;*/
		try {
			connection = DBManager.getConnection();
			String selectSql = "select p.idProduct, pt.NAME, pt.DESCRIPTION, p.POSITION from "
					+ "product p join producttype pt on p.producttype=pt.idProducttype";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(selectSql);
			while (resultSet.next()) {
				articleId = resultSet.getInt(1);
				articleName = resultSet.getString(2);
				articleDesc = resultSet.getString(3);
				posId = resultSet.getInt(4);
				((WorkStation) getPosicionById(posId)).addArticulo(new Articulos(articleId, articleName, articleDesc));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null)
				try {
					resultSet.close();
				} catch (Exception e) {
				}
			if (statement != null)
				try {
					statement.close();
				} catch (Exception e) {
				}
			if (connection != null)
				try {
					connection.close();
				} catch (Exception e) {
				}
		}
	}
	
	/**
	 * @brief Method for reading the positions from the database
	 */
	private void leerPosicionesDesdeDB(){
		// Declare the JDBC objects.
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String posName;
		int posType, posId;
		try {
			connection = DBManager.getConnection();
			String selectSql = "select idPosition, idPosType, POSNAME from position";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(selectSql);
			while (resultSet.next()) {
				posId = resultSet.getInt(1);
				posType = resultSet.getInt(2);
				posName = resultSet.getString(3);
				if(posType==1) listaPosicion.add(new Segmentos(posId, posName));
				if(posType==2) listaPosicion.add(new Parking(posId, posName));
				if(posType==3) listaPosicion.add(new WorkStation(posId, posName));
				initializeConnectionsOfPositionFromDatabase(posId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null)
				try {
					resultSet.close();
				} catch (Exception e) {
				}
			if (statement != null)
				try {
					statement.close();
				} catch (Exception e) {
				}
			if (connection != null)
				try {
					connection.close();
				} catch (Exception e) {
				}
		}
	}
	
	/**
	 * @brief Method for reading the connections of a position from the database
	 */
	private void initializeConnectionsOfPositionFromDatabase(int originId){
		// Declare the JDBC objects.
				Connection connection = null;
				Statement statement = null;
				ResultSet resultSet = null;
				String posName;
				int posType, posId;
				try {
					connection = DBManager.getConnection();
					String selectSql = "select idDestino from positionrelation where idOrigen="+originId;
					statement = connection.createStatement();
					resultSet = statement.executeQuery(selectSql);
					while (resultSet.next()) {
						getPosicionById(originId).addNextPosition(getPosicionById(resultSet.getInt(1)));
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (resultSet != null)
						try {
							resultSet.close();
						} catch (Exception e) {
						}
					if (statement != null)
						try {
							statement.close();
						} catch (Exception e) {
						}
					if (connection != null)
						try {
							connection.close();
						} catch (Exception e) {
						}
				}
	}
	
	/**
	 * @brief Method for reading the vehicles from the database
	 */
	private void leerVehiculosDesdeDB(){
		// Declare the JDBC objects.
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String vehicleStatus;
		int posId, vehicleId;
		try {
			connection = DBManager.getConnection();
			String selectSql = "select v.idVehicle, vs.statusname, v.idPosition from "
					+ "vehicle v join vehiclestatus vs on v.idVehicleStatus=vs.idVehicleStatus";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(selectSql);
			while (resultSet.next()) {
				vehicleId = resultSet.getInt(1)-5;
				vehicleStatus = resultSet.getString(2);
				posId = resultSet.getInt(3);
				listaVehiculo.add(new Vehiculo(vehicleId, vehicleStatus,getPosicionById(posId)));
				getPosicionById(posId).setLleno(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null)
				try {
					resultSet.close();
				} catch (Exception e) {
				}
			if (statement != null)
				try {
					statement.close();
				} catch (Exception e) {
				}
			if (connection != null)
				try {
					connection.close();
				} catch (Exception e) {
				}
		}
	}
	
	/**
	 * @brief Method for getting a position knowing its id
	 * @param id the id of the position
	 * @return pos the position with the needed id
	 */
	public Posicion getPosicionById(int id){
		Posicion pos = null;
		for(Posicion p:listaPosicion){
			if(p.getId()==id) pos=p;
		}
		return pos;
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
