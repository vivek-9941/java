package JDBC;
//class.forname;
//classname is Class and forname is method

import java.sql.Connection;
import java.sql.DriverManager;

public class use_of_forname {
    public static void main(String[] args)throws Exception {


//        pqr obj = new pqr();
        //before createing the object it will first load the class ;

        //load class to use satic without using obj
//        Class.forName("JDBC.pqr");


        //whenever we work weith jdbc code
        //register driver
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //instead of this we use this as they are same
        Class.forName("com.mysql.jdbc.Driver");
            //because the driver contains a statoc block which contwains the same thing
        //on loading tthe static bolk will be executed
        
    }
}


class pqr{
    //this doesnt require the objrct
    static{
        System.out.println("static block");
    }

    //instance block
    {
        System.out.println("in instance");

    }
}