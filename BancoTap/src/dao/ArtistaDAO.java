package dao;

import java.util.Collection;
import modelo.Artista;

public interface ArtistaDAO {
    
    public void salvar (Artista artista);
    public void excluir(Artista artista);
    public Collection obterTodos();
    public Collection obterPorPais(String pais);
    
    
}
