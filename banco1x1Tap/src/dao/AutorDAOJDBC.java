/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Autor;

/**
 *
 * @author Gabriela
 */
public class AutorDAOJDBC implements AutorDAO{

    @Override
    public boolean salvar(Autor autor) {

        return true;
        
    }

    @Override
    public Autor consultarPeloNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
