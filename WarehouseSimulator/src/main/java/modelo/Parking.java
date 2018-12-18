/** @file Parking.java
 *  @brief Class to create the Parking object
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Ander	      | Olaso          | ander.olaso@alumni.mondragon.edu     |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 28/11/2018
 */

/** @brief package modelo
 */
package modelo;

/**
 * @brief Class WorkStation extends Posicion
 */
public class Parking extends Posicion{
	
	/**
	 * @brief Constructor
	 * @param nombre position name
	 * @param pos Position ID or position
	 */
	public Parking(int pos, String nombre) {
		super(pos, nombre);
	}

	/**
	 * @brief Method for waiting at parking, only one thread can access at a time
	 */
	public synchronized void waitAtParking(){
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @brief Method for waking up from the parking, only one thread can access at a time
	 */
	public synchronized void wakeUpFromParking(){
		notify();
	}
	
	/**
	 * @brief Method for exiting from the parking, only one thread can access at a time
	 */
	public synchronized void exitFromParking(){
		full=false;
	}
	
	/**
	 * @brief Method for determine which positions you can go to
	 * @param pos list of next positions
	 */
	@Override
	public void addNextPosition(Posicion... pos) {
		for(Posicion p : pos){
			nextPositionList.add(p);
		}
	}
	
	/**
	 * @brief Method for get the value of the nextPosition variable
	 * @return Posicion
	 */
	public Posicion getNextPosition(){
		for(Posicion p : nextPositionList){
			return p;
		}
		return null;
	}
	/**
	 * @brief Method for printing the parking in a custom way
	 * @return String
	 */
	@Override
	public String toString() {
		String cadena;
		cadena = "Parking "+ this.id +" - Full: "+this.full;
		return cadena;
	}

}
