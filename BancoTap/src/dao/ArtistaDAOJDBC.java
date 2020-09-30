/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Artista;
import tools.DAOBaseJDBC;

/**
 *
 * @author Alef Gaigher
 */
public class ArtistaDAOJDBC extends DAOBaseJDBC implements ArtistaDAO{

    @Override
    public void salvar(Artista artista){
        Statement stm = null;
        
        
        try{
            String sql01 = "Insert into Artista (NOME,PAIS) values(?,?)";
            stm = con.createStatement();
            stm.executeUpdate(sql01);
            
        }catch(SQLException ex){
            System.out.println("Erro!");
            Logger.getLogger(ArtistaDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
    }

    @Override
    public void excluir(Artista artista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection obterTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection obterPorPais(String pais) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
