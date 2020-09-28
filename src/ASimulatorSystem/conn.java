//Conn is a connection class that make connection with the database.

package ASimulatorSystem;

import java.sql.*;  // This SQl package allows me to perform CRUD data in SQL.

public class conn{
    Connection c;
    Statement s; 
    public conn(){  // Assigning constructor conn
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  // Registering JDBC driver in the program 
            c =DriverManager.getConnection("jdbc:mysql:///project2","root","");   // To establish a connection. This allows me to pass a database URL, username & password.
            s =c.createStatement(); // Used to access my database. Useful when I am using static SQL statement at runtime.    
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  