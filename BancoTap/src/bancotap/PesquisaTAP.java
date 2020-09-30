/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotap;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PesquisaTAP {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         // conectar ao banco*/
         Class.forName("org.hsqldb.jdbcDriver");
         
         Connection con= DriverManager("jdbc:hsqldb:hsql://localhost/javadiscos","sa","");
   try{
         con.setAutoCommit(false);
         Statement stm = con.createStatement();
         //define inserção, update, já que o banco está conectado/
         
         String sql01 = "Insert into Artista (NOME,PAIS) values(?,?)";
         
         PreparedStatement pstm = con.prepareStatement(sql01);
         pstm.setString(1,"Pancadao Parametrizado");
         pstm.setString(2,"Brazil");
         pstm.executeUpdate();
         
         stm.executeQuery(sql01);
         
         String  sql02 = "select id, nome, pais from artista";
         ResultSet rs = stm.executeQuery(sql02);
         
         while(rs.next()){
             System.out.println(rs.getInt("id")+ " | " +
             rs.getString("nome")+ " | " +
             rs.getString("pais"));
         
         }
         con.commit();
    }
    catch(Exception e){
       con.rollback();
    
    }
   }

    private static Connection DriverManager(String jdbchsqldbhsqllocalhostjavadiscos, String sa, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}