/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Livro;

/**
 *
 * @author Gabriela
 */
public interface LivroDAO {
    public boolean salvar(Livro livro);
    public Livro consultarPeloTitulo(String titulo);
}
