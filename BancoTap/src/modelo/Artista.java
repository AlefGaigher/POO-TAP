package modelo;

public class Artista {
    private Long id;
    private String nome;
    private Boolean banda;
    private String pais;

    public Artista() {
    }
       
    public Artista(Long id, String nome, Boolean banda, String pais) {
        this.id = id;
        this.nome = nome;
        this.banda = banda;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Artista{" + "id=" + id + ", nome=" + nome + ", banda=" + banda + ", pais=" + pais + '}';
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getBanda() {
        return banda;
    }

    public void setBanda(Boolean banda) {
        this.banda = banda;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
