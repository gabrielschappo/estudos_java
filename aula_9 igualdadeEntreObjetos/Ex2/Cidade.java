package Ex2;

public class Cidade {
    private String nome;
    private Estado estado;
    private boolean capitalDoEstado;
    private boolean capitalDoPais;

    public Cidade(String nome, Estado estado, boolean capitalDoEstado, boolean capitalDoPais){
        this.nome = nome;
        this.estado = estado;
        this.capitalDoEstado = capitalDoEstado;
        this.capitalDoPais = capitalDoPais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isCapitalDoEstado() {
        return capitalDoEstado;
    }

    public void setCapitalDoEstado(boolean capitalDoEstado) {
        this.capitalDoEstado = capitalDoEstado;
    }

    public boolean isCapitalDoPais() {
        return capitalDoPais;
    }

    public void setCapitalDoPais(boolean capitalDoPais) {
        this.capitalDoPais = capitalDoPais;
    }
}
