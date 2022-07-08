package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryAndFinally {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{

      try
      {
    	  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    	// This defines the data source for the driver
    	String sourceURL = new String("Jdbc:Odbc:signup");
    	// Create connection through the DriverManager
    	Connection databaseConnection = DriverManager.getConnection(sourceURL);
    	
    	/*A abnormal temination is how to handle is dont no then use try after finally*/
      }
      finally
      {
    	  System.out.println("DataBase Connection is Closed Succesfully");
    	  System.exit(0);
      }

	}

}
