/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import bd.BD;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Alef Gaigher
 */
public class IdeiaInovadora {
    private String area, descricao;
    private Float custo;
    private Integer codIdeia;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.codIdeia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final IdeiaInovadora other = (IdeiaInovadora) obj;
        if (!Objects.equals(this.codIdeia, other.codIdeia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IdeiaInovadora{" + "area=" + area + ", descricao=" + descricao + ", custo=" + custo + ", codIdeia=" + codIdeia + '}';
    }
    
    
    
    public List<IdeiaInovadora> recuperarTodasIdeiasInovadoras(){
       return BD.retornaBD();
   
    }
    
    public IdeiaInovadora recuperarTodasIdeiasPeloCodigo(int codigo){
       return BD.recuperarItemPeloCodigo(codigo);
   
    }
    
    
    public void cadastrarIdeiaInovadora(IdeiaInovadora item){
        BD.cadastrarItem(item);
    }
    
    public IdeiaInovadora(){
    
    }

    public IdeiaInovadora(String area, String descricao, Float custo) {
        this.area = area;
        this.descricao = descricao;
        this.custo = custo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getCusto() {
        return custo;
    }

    public void setCusto(Float custo) {
        this.custo = custo;
    }

    public Integer getCodIdeia() {
        return codIdeia;
    }

    public void setCodIdeia(Integer codIdeia) {
        this.codIdeia = codIdeia;
    }

    public List<IdeiaInovadora> recuperarTodasIdeiaInovadora() {
        return BD.retornaBD();
    }

    public IdeiaInovadora recuperarTodasIdeiasInovadoraPeloCodigo(int codigo) {
        return BD.recuperarItemPeloCodigo(codigo);
    }

   
         
}
