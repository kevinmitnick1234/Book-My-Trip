package book.my.trip;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///bookmytrip","root","12345@");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
