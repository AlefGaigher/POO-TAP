/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.SQLException;
import dao.ArtistaDAO;
import dao.ArtistaDAOJDBC;
import modelo.Artista;

/**
 *
 * @author Alef Gaigher
 */
public class ControleCrudArtista {
    
    ArtistaDAO dao = null;
    
    public void controleSalvarArtista() throws ClassNotFoundException, SQLException{
        Artista artista = new Artista();
        artista.setNome("Pancadao");
        artista.setPais("China");
        artista.setBanda(true);
        
        System.out.println("Salvando artista no BD....");        
        dao = new ArtistaDAOJDBC();
        dao.salvar(artista);
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ControleCrudArtista executar = new ControleCrudArtista();
        executar.controleSalvarArtista();
    }
    
}
