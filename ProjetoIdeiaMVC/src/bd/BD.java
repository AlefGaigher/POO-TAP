/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;


import java.util.ArrayList;
import java.util.List;
import modelo.IdeiaInovadora;

/**
 *
 * @author Alef Gaigher
 */
public class BD {
    
    public static List<IdeiaInovadora> bdIdeias = new ArrayList<>();
    public static void cadastrarItem(IdeiaInovadora item) {
        bdIdeias.add(item);
    }
    public static List<IdeiaInovadora> retornaBD(){
        return bdIdeias;
    }

    public static IdeiaInovadora recuperarItemPeloCodigo(int codigo) {
        IdeiaInovadora aux = new IdeiaInovadora();
        aux.setCodIdeia(codigo);
       
       if(bdIdeias.contains(aux)){
           return bdIdeias.get(bdIdeias.indexOf(aux));
       }
        return null;  
    }

}
