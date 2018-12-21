/** @file Principal.java
 *  @brief Class to create the Principal object
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 17/12/2018
 */

/** @brief package vista
 */
package vista;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import controlador.AdministradorCaminos;
import controlador.AdministradorCoches;
import controlador.DBManager;
/** @brief Libraries
 */
import modelo.Almacen;
import modelo.Articulos;
import modelo.Parking;
import modelo.Posicion;
import modelo.Vehiculo;
import modelo.WorkStation;

/**
 * @brief Class Principal extends Thread
 */
public class Principal extends Thread{
	
	/**
	 * @brief Attributes
	 */
	Almacen almacen;
	Scanner teclado;
	AdministradorCaminos adminCaminos;
	AdministradorCoches adminCoches;

	/**
	 * @brief Constructor
	 */
	private Principal() {
		teclado = new Scanner(System.in);
		almacen = new Almacen();
		adminCaminos = new AdministradorCaminos(almacen);
		adminCoches = new AdministradorCoches(almacen);
		for(Vehiculo v:adminCoches.getListaCoches()){
			if(v.getIdal()!=1){
				v.setWaitingPosicion(adminCaminos.getEmptyParking());
				v.setRouteToParking(adminCaminos.getShortestRoute(v.getActualPosicion(), adminCaminos.getEmptyParking()));;
			}
			v.start();
		}
	}
	/**
	 * @brief Method for printing the options of the menu
	 * @return int
	 */
	public int menu(){
		int opcion= 0;
		
		System.out.println("1.- Create order");
		System.out.println("2.- View vehicles");
		System.out.println("3.- View workstations");
		System.out.println("4.- View parkings");
		System.out.println("0.- Exit");
		System.out.print("Select option: ");
		opcion = teclado.nextInt(); teclado.nextLine();
		return opcion;

	}
	/**
	 * @brief Method for running the main thread
	 */
	@Override
	public void run() {
		int opcion = 0;
		do{
			try{
				opcion = menu(); 
				
				switch (opcion){
				case 1: crearOrden();break;
				case 2: verCoches(); break;
				case 3: verWorkStations(); break;
				case 4: verParkings(); break;
				
				case 0: break;
				default: System.out.println("Option not valid");
				}
				
			}catch (InputMismatchException e){
				System.out.println("Select an opction with a correct number");
			}
		}while (opcion != 0);
		
	}
	/**
	 * @brief Method for creating a order
	 */
	private void crearOrden() {
		int leaveItemWsId, takeItemWsId, actualPosWsId, itemId, index = 0;
		Posicion leaveItemPos, takeItemPos, actualPos;
		Parking waitingParking;
		Vehiculo car;
		List<Posicion> routeTake, routeLeave, routeToParking;
		String opcion="S";
		do{
			try{
				System.out.print("From which workstation do you want to order:");
				leaveItemWsId = teclado.nextInt();teclado.nextLine();
				leaveItemPos = getPositionById(leaveItemWsId);
				System.out.print("From which workstation do you want to take an item: ");
				takeItemWsId = teclado.nextInt();teclado.nextLine();
				takeItemPos = getPositionById(takeItemWsId);
				for(Articulos a:((WorkStation) takeItemPos).getListProductos()){
					System.out.println(++index+" - "+a);
				}
				index=0;
				System.out.print("What item do you want to take: ");
				itemId = teclado.nextInt();teclado.nextLine();
				car = adminCoches.getFirstFreeCar();
				actualPos = car.getActualPosicion();
				routeTake = adminCaminos.getShortestRoute(actualPos, takeItemPos);
				routeLeave = adminCaminos.getShortestRoute(takeItemPos, leaveItemPos);
				System.out.println(leaveItemPos);
				waitingParking = adminCaminos.getEmptyParking();
				System.out.println("AAAAAAAAAAAAAAAA Parking selected: "+waitingParking);
				routeToParking = adminCaminos.getShortestRoute(leaveItemPos, waitingParking);
				car.setRouteToParking(routeToParking);
				car.setWaitingPosicion(waitingParking);
				car.setLeaveItemPos(leaveItemPos);
				car.setTakeItemPos(takeItemPos);
				car.setTakingItemRoute(routeTake);
				car.setReturnRoute(routeLeave);
				car.setItemId(itemId);
				System.out.print("More (Y/N)?");
				opcion = teclado.nextLine();
			}catch (InputMismatchException e){
				System.out.println("Incorrect format");
			}
		}while (!opcion.equalsIgnoreCase("N"));		
	}
	/**
	 * @brief Method for getting the position by the id of it 
	 * @return Posicion
	 */
	private Posicion getPositionById(int id) {
		Posicion posicion = null;
		for(Posicion p:almacen.getListaPosicion()){
			if(p.getId()==id) posicion = p;
		}
		return posicion;
	}
	/**
	 * @brief Method for printing the cars in a custom way 
	 */
	private void verCoches() {
		for(Vehiculo v:adminCoches.getListaCoches()){
			System.out.println(v);
		}
		System.out.println("-------------------------------------------------");		
	}	
	/**
	 * @brief Method for printing the workstations in a custom way
	 */
	private void verWorkStations() {
		for(Posicion ws:almacen.getListaPosicion()){
			if(ws instanceof WorkStation){
				System.out.println(ws);
			}
		}
		System.out.println("-------------------------------------------------");		
	}
	/**
	 * @brief Method for printing the parkings in a custom way
	 */
	private void verParkings() {
		for(Posicion pk:almacen.getListaPosicion()){
			if(pk instanceof Parking){
				System.out.println(pk);
			}
		}
		System.out.println("-------------------------------------------------");		
	}

	/**
	 * @brief main
	 * @param args String[]
	 */
	public static void main(String[] args) {
		Principal ariketa = new Principal();
		ariketa.start();
	}



}
