/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gabriela
 */
public class DAOBaseJDBC {
    
    protected static Connection con = null;
            
    public DAOBaseJDBC() throws ClassNotFoundException, SQLException{
        Class.forName(Config.NOME_DRIVER);
        con = DriverManager.getConnection(Config.BD_URL,Config.BD_LOGIN,Config.BD_PASS);
    }
}
