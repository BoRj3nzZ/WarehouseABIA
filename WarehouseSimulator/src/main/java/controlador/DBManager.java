/** @file DBManager.java
 *  @brief Class to create the Database Manager
 *  @authors
 *  Name          | Surname        | Email                                |
 *  ------------- | -------------- | ------------------------------------ |
 *  Borja	      | Garcia         | borja.garciag@alumni.mondragon.edu   |
 *  @date 19/12/2018
 */

/** @brief package controlador
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	static String USER = "abia";
	static String PASS = "warehouse";
	static String DBNAME = "warehouse";

	public static Connection getConnection() {
		Connection connect = null;
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection(
					"jdbc:mysql://localhost/" + DBNAME + "?" + "user=" + USER + "&password=" + PASS);
			return connect;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error conectando la base de datos");
		}
		return connect;
	}

}
