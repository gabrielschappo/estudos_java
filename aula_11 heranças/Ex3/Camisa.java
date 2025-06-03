package Ex3;

public class Camisa extends Produto{
    private String tamanho;
    private String cor;

    public Camisa(String nome, double preco, String tamanho, String cor){
        super(nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor da camisa: " + cor);
    }
}
