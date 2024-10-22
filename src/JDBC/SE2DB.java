package JDBC;
import java.sql.*;
import java.util.*;
public class SE2DB {
    public static void main(String[] args)throws Exception {
        String url = "jdbc:mysql://localhost:3306/se2";
        String usr = "root";
        String pass = "vivek9941";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,usr,pass);
        String query  = "INSERT INTO students VALUES(?,?)";
        Scanner sc = new Scanner(System.in);
        for(int  i =0 ; i< 10; i++){
            System.out.println("enter the roll no.");
            int roll = sc.nextInt();

            //consume the leftover newline charcater
            sc.nextLine();
            System.out.println("enter the name");
            String name  = sc.nextLine();
            PreparedStatement st  = con.prepareStatement(query);
            st.setInt(1,roll);
            st.setString(2,name);
            int count = st.executeUpdate();
            System.out.println(count+ "number of rows affected");


        }
        Statement newst = con.createStatement();

        ResultSet rs = newst.executeQuery("SELECT * FROM students");

        System.out.println("for display of data");
        while(rs.next()){
            System.out.println( rs.getInt(1)+" "+rs.getString(2)  + " ");
        }
        newst.close();
        con.close();

    }


}
