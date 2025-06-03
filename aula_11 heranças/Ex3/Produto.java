package Ex3;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}
