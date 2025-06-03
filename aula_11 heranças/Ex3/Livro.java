package Ex3;

public class Livro extends Produto {
    private String autor;
    private int numPaginas;

    public Livro(String nome, double preco, String autor, int numPaginas){
        super(nome, preco);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Autor do livro: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
}
