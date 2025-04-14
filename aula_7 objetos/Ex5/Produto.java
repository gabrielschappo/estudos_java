package Ex5;

public class Produto {
    String nome;
    int quantAtual;
    int quatMin;

    public Produto(String nome, int quantAtual, int quantMin){
        this.nome = nome;
        this.quantAtual = quantAtual;
        this.quatMin = quantMin;
    }

    public void repor(int quantidade){
        if (quantidade > 0){
            quantAtual += quantidade;
            System.out.println(quantidade + " unidades de " + nome + " foram repostas.");
        }else{
            System.out.println("Quantidade inválida para reposição.");
        }
    }

    public void vender(int quantidade){
        if (quantidade > 0 && quantidade <= quantAtual){
            quantAtual -= quantidade;
            System.out.println(quantidade + "unidade(s) de " + nome + " foram vendida(s).");
        }else if (quantidade > quantAtual){
            System.out.println("Não há estoque disponível para realizar a venda de " + quantidade + " unidade(s) de " + nome);
        }else{
            System.out.println("Quantidade inválida para venda.");
        }
    }

    public boolean precisaRepor(){
        return quantAtual <= quatMin;
    }

    public void exibirStatus(){
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade atual: " + quantAtual);
        System.out.println("Quantidade mínima: " + quatMin);
        System.out.println("Precisa repor: " + precisaRepor());
    }
}
