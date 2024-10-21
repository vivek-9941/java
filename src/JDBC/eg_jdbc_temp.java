package JDBC;
import java.sql.*;

public class eg_jdbc_temp {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/temp";
        String name  = "root";
        String pass = "vivek9941";


        Connection con = DriverManager.getConnection(url ,name,pass);
        Statement st  = con.createStatement();


        ResultSet rs = st.executeQuery("SELECT * FROM student");

        int rows =0;

        while(rs.next()){
            rows = rs.getRow();
            String str  = rs.getString("name");
            int id = rs.getInt("id");
            System.out.println(id+" " + str);

        }
        System.out.println("total rows : " + rows);
        st.close();
        con.close();

    }
}
