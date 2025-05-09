package Ex2;

public class Pais {
    private String codigo;
    private String nome;
    private Cidade capital;
    
    public Pais(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setCapital(Cidade capital){
        this.capital = capital;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCapital() {
        return capital;
    }
}
