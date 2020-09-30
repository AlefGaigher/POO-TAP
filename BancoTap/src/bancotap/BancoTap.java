package bancotap;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class BancoTap {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Class.forName("org.hsqldb.jdbcDriver");
       
        Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/javadiscos","sa","");
        Statement stm = con.createStatement();
        String sql01 = "Insert into Artista (NOME, PAIS) values ('TAP', 'ES')";
        stm.execute(sql01);
    }    
}
