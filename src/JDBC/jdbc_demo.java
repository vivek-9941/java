package JDBC;

import java.sql.*;

public class jdbc_demo {
    public static void main(String[] args) throws Exception
    {

        //load and reister driver to memory mysql.jdbc.Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
//The driver registers itself with DriverManager, making it available to establish database connections.
//Enables Connections: When you later call DriverManager.getConnection(),
// the correct driver is used to connect to the database based on the URL you provide.
        String url = "jdbc:mysql://localhost:3306/ORG";
        String usr = "root";
        String pass = "vivek9941";

//        Step 2: Load the JDBC Driver
//        This step loads the driver that connects to your database. For example, for MySQL:
//
//    java
//        Copy code
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Step 3: Establish a Connection
//        Use the DriverManager to connect to the database:
//
//        java
//        Copy code
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "username", "password");
//        Replace "dbname", "username", and "password" with your actual database details.
//            Step 4: Create a Statement
//        Once connected, you need a Statement object to send SQL queries to the database:
//
//    java
//        Copy code
//        Statement stmt = conn.createStatement();
//        Step 5: Execute SQL Queries
//        You can execute different types of SQL queries, such as SELECT, INSERT, UPDATE, and DELETE.
//
//            For a SELECT query:
//
//    java
//        Copy code
//        ResultSet rs = stmt.executeQuery("SELECT * FROM tablename");
//        For an INSERT query:
//
//        java
//        Copy code
//        stmt.executeUpdate("INSERT INTO tablename (column1, column2) VALUES ('value1', 'value2')");
//        Step 6: Process the Result
//        If you execute a SELECT query, you will get a ResultSet that contains the data:
//
//        java
//        Copy code
//        while (rs.next()) {
//            System.out.println(rs.getString("column1") + " " + rs.getString("column2"));
//        }
//        Step 7: Close the Resources
//        Once you're done, it's important to close the ResultSet, Statement, and Connection to avoid memory leaks:
//
//    java
//        Copy code
//        rs.close();
//        stmt.close();
//        conn.close();
//        Example: Connecting to a MySQL Database
//        Here's a complete example:

        Connection con  = DriverManager.getConnection(url , usr, pass);
        Statement st = con.createStatement();
        //rs is a set that stores the set

        //by default the pointer is before the starting of the table

        ResultSet rs =  st.executeQuery("SELECT * FROM worker");
       while( rs.next() ) {
           String name = rs.getString("FIRST_NAME") +" "+rs.getString( "LAST_NAME") +" "+ rs.getInt("SALARY");
           System.out.println(name);
       }
        //close
        st.close();
        con.close();

    }
}
