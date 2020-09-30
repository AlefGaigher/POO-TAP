package controle;

import java.util.List;
import modelo.IdeiaInovadora;
import visao.IdeiaInovadoraView;

public class IdeiaInovadoraControle {
    private static int cont = 0;
    public void controleCadastrarIdeiaInovadora(IdeiaInovadoraView refView){
        
        IdeiaInovadora ii= new IdeiaInovadora();
        ii.setArea(refView.getAreadeatuacao().getText());
        ii.setDescricao(refView.getDescricao().getText());
        ii.setCusto(Float.parseFloat(refView.getCusto().getText()));
        
        cont = cont+1;
        ii.setCodIdeia(cont);
        ii.cadastrarIdeiaInovadora(ii);
    }
    
     public List<IdeiaInovadora> controleRecuperarTodasIdeiasInovadoras() {
        IdeiaInovadora ii= new IdeiaInovadora();
        return ii.recuperarTodasIdeiaInovadora();
    }
    
    public IdeiaInovadora controleRecuperarTodasIdeiasInovadorasPeloCodigo(int codigo){
        IdeiaInovadora ii= new IdeiaInovadora();
        return ii.recuperarTodasIdeiasInovadoraPeloCodigo(codigo);
    } 
}
