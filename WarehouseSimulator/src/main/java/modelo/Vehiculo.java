/** @file Vehiculo.java
 *  @brief Class to create the vehicles
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
	Posicion actualPosicion, waitingPosicion;
	Articulos itemInside;
	int itemId;
	List<Posicion> takingItemRoute, returnRoute;
	
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
		this.waitingPosicion = null;
		this.leaveItemPos = null;
		this.takeItemPos = null;
		this.itemInside = null;
		this.takingItemRoute = null;
		this.returnRoute = null;
	}
	
	/**
	 * @brief Method to move to a segment
	 * @param seg The segment to be entered
	 */
	public void moveToSegment(Segmentos seg){
		if(seg.connectsTo(leaveItemPos)){
			System.out.println("Segment connects to ws("+seg.getId()+") which is full("+leaveItemPos.isFull()+")");
			while(leaveItemPos.isFull() || seg.isFull()) ((WorkStation) leaveItemPos).wakeUpFromWorkStation();
		}
		if(seg.connectsTo(takeItemPos)){
			System.out.println("Segment connects to ws("+seg.getId()+") which is full("+leaveItemPos.isFull()+")");
			while(takeItemPos.isFull() || seg.isFull()) ((WorkStation) takeItemPos).wakeUpFromWorkStation();
		}
		System.out.println("Car "+id+" exiting from : "+actualPosicion.getId());
		seg.enterSegment();
		if(actualPosicion instanceof Segmentos) ((Segmentos) actualPosicion).exitSegment();
		actualPosicion = seg;
		System.out.println("Car "+id+" entering segment: "+actualPosicion.getId());
		//Travel across segment.
		//This segment will be locked until another "move()" is called so the car moves to another position.
	}
	
	/**
	 * @brief Method to enter to a workstation in order to take an item
	 * @param ws The workstation to be entered
	 */
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
	
	/**
	 * @brief Method to enter a final workstation and wait until called again
	 * @param ws The workstation to be entered
	 */
	public void enterFinalWorkStation(WorkStation ws){
		((Segmentos) actualPosicion).exitSegment();
		actualPosicion = ws;
		ws.enterWorkStation();
		System.out.println("Car "+id+" entering workstation: "+actualPosicion.getId()+" and waiting");
		deliverItemInside(ws);
		this.setEstado("Espera");
		ws.waitAtWorkStation();
		System.out.println("Car "+this.id+" wakes from ws with status: "+estado);
		if(estado.equals("Espera")){
			if(waitingPosicion instanceof Parking) ((Parking) waitingPosicion).waitAtParking();
			else ((WorkStation) waitingPosicion).waitAtWorkStation();
		}
	}
	
	/**
	 * @brief Method to move through a defined route, if the next position is full, it goes slower
	 * @param route The route that needs to be followed
	 */
	public void move(List<Posicion> route){
		for(Posicion p:route.subList(1, route.size())){
			try {
				this.sleep(1000);
				if(p.isFull())this.sleep(10000);
				else this.sleep(1000);
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
	
	/**
	 * @brief Method to start an order with all the data
	 * @param routeIda The route that needs to be followed to get the item
	 * @param routeVuelta The route that needs to be followed to deliver the item
	 * @param itemId The id of the item that needs to be delivered
	 * @param takeItemPos The workstation from which the car has to take the item
	 * @param leaveItemPos The workstation to which the car delivers the item
	 */
	public void startOrder(List<Posicion> routeIda, List<Posicion> routeVuelta, int itemId, Posicion takeItemPos, Posicion leaveItemPos) {
		move(routeIda);	
		itemInside = ((WorkStation) takeItemPos).getArticulo(itemId);
		move(routeVuelta);
		deliverItemInside((WorkStation) leaveItemPos);
	}

	/**
	 * @brief Method to run the thread
	 */
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
				move(takingItemRoute);
				itemInside = ((WorkStation) takeItemPos).getArticulo(itemId);
				move(returnRoute);
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
	 * @brief Method for setting the value of the itemInside variable
	 * @param itemInside The item to be set
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
	 * @param destino The position to be set
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
	/**
	 * @brief Method for setting the leaveItemPos of the vehicle 
	 * @param leaveItemPos The position to be set
	 */
	public void setLeaveItemPos(Posicion leaveItemPos) {
		this.leaveItemPos = leaveItemPos;
	}
	/**
	 * @brief Method for setting the takeItemPos of the vehicle 
	 * @param takeItemPos The position to be set
	 */
	public void setTakeItemPos(Posicion takeItemPos) {
		this.takeItemPos = takeItemPos;
	}
	/**
	 * @brief Method for setting the itemId of the vehicle 
	 * @param itemId The id of the item to be set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/**
	 * @brief Method for setting the takingItemRoute of the vehicle 
	 * @param takingItemRoute The route to be set
	 */
	public void setTakingItemRoute(List<Posicion> takingItemRoute) {
		this.takingItemRoute = takingItemRoute;
	}
	/**
	 * @brief Method for setting the returnRoute of the vehicle 
	 * @param returnRoute The route to be set
	 */
	public void setReturnRoute(List<Posicion> returnRoute) {
		this.returnRoute = returnRoute;
	}	
	/**
	 * @brief Method for setting the waitingPosicion of the vehicle 
	 * @param waitingPosicion The position to be set
	 */
	public void setWaitingPosicion(Posicion waitingPosicion) {
		this.waitingPosicion = waitingPosicion;
	}

	/**
	 * @brief Method for printing the object in a custom way
	 * @return string
	 */
	@Override
	public String toString() {
		String cadena;
		cadena = "Car "+this.getIdal()+" - Position: "+this.getActualPosicion().getId()+
				" - State: "+this.getEstado()+" - Item: "+this.getItemInsideDesc();
		return cadena;
	}
	
}
