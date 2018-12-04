/** @file Vehiculo.java
 *  @brief Class to create the vehicles
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 4/12/2018
 */

/** @brief package modelo
 */
package modelo;

import java.util.List;

/**
 * @brief Class Vehiculo
 */
public class Vehiculo {
	/**
	 * @brief Attributes
	 */
	

	int id;
	String nombre, estado;
	Posicion destino;
	Posicion actualPosicion;
	Articulos itemInside;
	
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
		this.destino = null;
		this.itemInside = null;
	}
	
	/**
	 * @brief Method move vehicle to next segment
	 * @param seg segment to where the vehicle is moving
	 */
	/*public void enterSegment(Segmentos seg){
		while(seg.connectsTo(destino) && destino.isLleno()){
			destino.getMonitor.notify();
		}
		seg.getSMutEx().wait();
		seg.getSEntry().wait();
		((Segmentos) this.actualPosicion).getSEntry().release();
		this.actualPosicion = seg;
		seg.getSMutEx().acquire();
	}	*/
	
	public void enterSegment(Segmentos seg){
		if(!seg.connectsTo(destino)){
			while(seg.isLleno()){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			notifyAll();
			this.actualPosicion = seg;
		}else{
			while(seg.isLleno() || destino.isLleno()){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			notifyAll();
		}
	}
	
	/**
	 * @brief Method move vehicle to workstation
	 * @param ws WorkStation the vehicle is entering
	 */
	public void enterWorkStation(WorkStation ws){
		if(this.actualPosicion.connectsTo(ws)){
			((Segmentos) this.actualPosicion).getSEntry().release();
			this.actualPosicion = ws;
			if(this.itemInside!=null){
				ws.addArticulo(this.itemInside);
				this.itemInside=null;
			}else{
				waitInWorkStation(ws);
			}
		}
	}
	
	/**
	 * @brief Method move vehicle to workstation at the end of the task, stays asleep until notified.
	 * @param ws WorkSation the vehicle is entering
	 */
	public void waitInWorkStation(WorkStation ws){
		Posicion nearParking;
		List<Posicion> route;
		ws.getMonitor().wait();
		if(this.itemInside==null){
			nearParking = ws.getNearEmptyParking();
			route = getShortestRoute(ws, nearParking);
			move(route);
			waitInParking(nearParking);
		}else{
			deliverItem((WorkStation) destino);
		}
	}
	
	/**
	 * @brief Method move vehicle to parking when a vehicle needs the workstation it was at, stays asleep until notified.
	 * @param ws WorkSation the vehicle is entering
	 */
	private void waitInParking(Parking parking) {
		parking.getMonitor().wait();		
	}

	/**
	 * @brief Method to move across a defined route
	 * @param route The route that needs to be followed
	 */
	public void move(List<Posicion> route){
		for(Posicion p:route){
			if(p instanceof Segmentos) enterSegment((Segmentos) p);
			if(p instanceof WorkStation && this.itemInside!=null) enterWorkStation((WorkStation)p);
			else waitInWorkStation((WorkStation) p);
		}
	}
	
	/**
	 * @brief Method to deliver an item to a workstation
	 * @param ws WorkSation the vehicle is delivering the item to
	 */
	public void deliverItem(WorkStation ws){
		List<Posicion> route;
		Posicion initialPos = this.actualPosicion;
		route = getShortestRoute(initialPos, ws);
		move(route);
	}
	
	/**
	 * @brief Method move vehicle to next position
	 * @param posicion position of the vehicle
	 */
	public void mover(Posicion posicion){
		if (this.actualPosicion instanceof Segmentos){
			try {
	            Thread.sleep(((Segmentos)this.actualPosicion).getDistancia());
	            
			} catch (InterruptedException ie)
	        {
	            System.out.println("Scanning...");
	        }
		}
		this.actualPosicion=posicion;
	}
	
	/**
	 * @brief Method for getting the value of the itemInside variable
	 */
	public Articulos getItemInside() {
		return itemInside;
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
		return destino;
	}
	
	/**
	 * @brief Method for setting the value of the destino variable
	 */
	public void setDestino(Posicion destino) {
		this.destino = destino;
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
	public int getId() {
		return id;
	}

	/**
	 * @brief Method for getting the value of the nombre variable
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	
}
