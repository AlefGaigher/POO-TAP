
package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOBaseJDBC {
    protected static Connection con = null;
    
    public DAOBaseJDBC() throws SQLException, ClassNotFoundException{
        Class.forName(Config.NOME_DRIVER);
        con = DriverManager.getConnection(Config.BD_URL,Config.BD_LOGIN,Config.BD_PASS);
    
    }
}
