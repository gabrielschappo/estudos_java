package Ex2;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void exibirCarrinho() {
        double total = 0;
        System.out.println("Produtos no carrinho: ");
        for (Produto p : produtos){
            System.out.println("- " + p.getNome() + " | Preço: R$" + p.getPreco() + " | Quantidade: " + p.getQuantidade());
            total += p.getSubtotal();
        }
        System.out.println("Total: R$" + String.format("%.2f", total));
    }
}
