package Ex2;

public class Estado {
    private String codigo;
    private String nome;
    private Pais pais;
    private Cidade capital;

    public Estado(String codigo, String nome, Pais pais){
        this.codigo = codigo;
        this.nome = nome;
        this.pais = pais;
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Cidade getCapital() {
        return capital;
    }
}
