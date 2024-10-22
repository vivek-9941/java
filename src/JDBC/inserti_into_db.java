package JDBC;
import java.sql.*;

public class inserti_into_db {
    public static void main(String[] args)throws Exception {


        {
            String url = "jdbc:mysql://localhost:3306/temp";
            String usr = "root";
            String pass = "vivek9941";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, usr, pass);
            Statement st = con.createStatement();
            //to insert do not use executeQuery;
            //exexute query is used for fetching the data;

            //ddl for changing sttructure of table;
            //DML is used for modifying the values and changing them;
            //DQL fire query for fetching the data
//no need for the resultsset beaciuse we are not saving anything that is being fetched
            int id = 17;
            String name =  "poppy";

            int count = st.executeUpdate("INSERT INTO student VALUES("+id+",'"+name+"')") ;
            //in such senario we use prepared statements where weknow the query but dont knowt he values


//returns the number of rows being affected
            System.out.println(count + "rows affected");

        }
    }
}