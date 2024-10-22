package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class jdbc_3 {


    public static void main(String[] args) throws Exception {


        {
            String url = "jdbc:mysql://localhost:3306/temp";
            String usr = "root";
            String pass = "vivek9941";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, usr, pass);
            String query = "INSERT INTO student VALUES(?,?)";
            int id = 18;
            String name = "ganpati";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, id);
            //1 for 1st ?
            //2 for second ? in values

            st.setString(2, name);


//            use of prepared statement

            int count = st.executeUpdate();
            //in such senario we use prepared statements where weknow the query but dont knowt he values


//returns the number of rows being affected
            System.out.println(count + "rows affected");

        }


    }
}
