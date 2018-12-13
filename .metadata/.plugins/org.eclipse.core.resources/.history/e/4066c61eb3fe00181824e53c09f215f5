/** @file Vehiculo.java
 *  @brief Class to create the vehicles
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 12/12/2018
 */

/** @brief package modelo
 */
package modelo;

import java.util.List;

/**
 * @brief Class Vehiculo extends Thread
 */
public class Vehiculo extends Thread{
	/**
	 * @brief Attributes
	 */	

	int id;
	String nombre, estado;
	
	Posicion leaveItemPos, takeItemPos;
	Posicion actualPosicion;
	Articulos itemInside;
	int itemId;
	List<Posicion> takingItemRoute, returnRoute;
	
	/*public void startOrder(List<Posicion> routeIda, List<Posicion> routeVuelta, int itemId, Posicion takeItemPos, Posicion leaveItemPos) {
*/
	
	/**
	 * @brief Constructor
	 * @param id vehicle ID
	 * @param estado vehicle state
	 * @param posicion vehicle position
	 */
	public Vehiculo(int id, String estado, Posicion posicion){
		this.id = id;
		nombre = "Vehiculo "+id;
		this.estado = estado;
		this.actualPosicion = posicion;
		this.leaveItemPos = null;
		this.takeItemPos = null;
		this.itemInside = null;
		this.takingItemRoute = null;
		this.returnRoute = null;
	}
	
	public void moveToSegment(Segmentos seg){
		if(seg.connectsTo(leaveItemPos)){
			while(leaveItemPos.isFull() || seg.isFull()) ((WorkStation) leaveItemPos).wakeUpFromWorkStation();
		}
		System.out.println("Car "+id+" exiting from : "+actualPosicion.getId());
		seg.enterSegment();
		if(actualPosicion instanceof Segmentos) ((Segmentos) actualPosicion).exitSegment();
		actualPosicion = seg;
		System.out.println("Car "+id+" entering segment: "+actualPosicion.getId());
		//Travel across segment.
		//This segment will be locked until another "move()" is called so the car moves to another position.
	}

	public void enterWorkStation(WorkStation ws){
		Segmentos segConnectedToWS = (Segmentos) actualPosicion;
		System.out.println("Car "+id+" exiting from segment: "+actualPosicion.getId());
		((Segmentos) actualPosicion).exitSegment();
		actualPosicion = ws;	
		ws.enterWorkStation();
		System.out.println("Car "+id+" entering workstation: "+actualPosicion.getId());
		//Take or leave item, be in workstation (also destination changes)
		ws.exitWorkStation();
	}
	
	public void enterFinalWorkStation(WorkStation ws){
		((Segmentos) actualPosicion).exitSegment();
		actualPosicion = ws;
		ws.enterWorkStation();
		System.out.println("Car "+id+" entering workstation: "+actualPosicion.getId()+" and waiting");
		//ws.waitAtWorkStation();
		//pk.waitAtParking();
	}
	
	/**
	 * @brief Method to move across a defined route
	 * @param route The route that needs to be followed
	 */
	public void move(List<Posicion> route){
		for(Posicion p:route.subList(1, route.size())){
			try {
				this.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(p instanceof Segmentos) moveToSegment((Segmentos) p);
			else {
				if(p instanceof WorkStation && this.itemInside==null) enterWorkStation((WorkStation)p);
				else enterFinalWorkStation((WorkStation) p);
			}
		}
	}
	
	public void startOrder(List<Posicion> routeIda, List<Posicion> routeVuelta, int itemId, Posicion takeItemPos, Posicion leaveItemPos) {
		move(routeIda);	
		itemInside = ((WorkStation) takeItemPos).getArticulo(itemId);
		move(routeVuelta);
		deliverItemInside((WorkStation) leaveItemPos);
	}

	
	@Override
	public void run() {
		while(true){
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(leaveItemPos!=null){
				System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAa");
				move(takingItemRoute);
				itemInside = ((WorkStation) takeItemPos).getArticulo(itemId);
				move(returnRoute);
				deliverItemInside((WorkStation) leaveItemPos);
			}
		}
	}

	/**
	 * @brief Method for getting the value of the itemInside variable
	 */
	public Articulos getItemInside() {
		return itemInside;
	}
	
	public void deliverItemInside(WorkStation ws){
		ws.addArticulo(itemInside);
		itemInside = null;
	}
	/**
	 * @brief Method for getting the value of the itemInside variable's description
	 */
	public String getItemInsideDesc() {
		return itemInside==null?"No item":itemInside.getDesc();
	}
	
	/**
	 * @brief Method for getting the value of the itemInside variable
	 * @return Articulos
	 */
	public void setItemInside(Articulos itemInside) {
		this.itemInside = itemInside;
	}

	/**
	 * @brief Method for getting the value of the destino variable
	 * @return Position
	 */
	public Posicion getDestino() {
		return leaveItemPos;
	}
	
	/**
	 * @brief Method for setting the value of the destino variable
	 */
	public void setDestino(Posicion destino) {
		this.leaveItemPos = destino;
	}

	/**
	 * @brief Method for getting the value of the estado variable
	 * @return String
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @brief Method for setting the state of the vehicle 
	 * @param estado state of the vehicle
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @brief Method for getting the value of the actualPosicion variable
	 * @return Position
	 */
	public Posicion getActualPosicion() {
		return actualPosicion;
	}

	/**
	 * @brief Method for getting the value of the id variable
	 * @return int
	 */
	public int getIdal(){
		return id;
	}
	/**
	 * @brief Method for getting the value of the nombre variable
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	
	public void setLeaveItemPos(Posicion leaveItemPos) {
		this.leaveItemPos = leaveItemPos;
	}

	public void setTakeItemPos(Posicion takeItemPos) {
		this.takeItemPos = takeItemPos;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public void setTakingItemRoute(List<Posicion> takingItemRoute) {
		this.takingItemRoute = takingItemRoute;
	}

	public void setReturnRoute(List<Posicion> returnRoute) {
		this.returnRoute = returnRoute;
	}
	
	public void setMovement(List<Posicion> routeIda, List<Posicion> routeVuelta, int itemId, Posicion takeItemPos, Posicion leaveItemPos){
		this.leaveItemPos = leaveItemPos;
		this.takeItemPos = takeItemPos;
		this.itemId = itemId;
		this.takingItemRoute = routeIda;
		this.returnRoute = routeVuelta;
	}

	@Override
	public String toString() {
		String cadena;
		cadena = "Car "+this.getIdal()+" - Position: "+this.getActualPosicion().getId()+
				" - State: "+this.getEstado()+" - Item: "+this.getItemInsideDesc();
		return cadena;
	}
	
}
