package Ex2;

/* Um sistema de e-commerce precisa gerenciar os itens adicionados ao
carrinho de compras. O carrinho pode conter vários produtos, e cada
produto tem um nome, um preço e uma quantidade. Crie um pequeno
programa orientado a objetos que:
Represente um produto.
Represente um carrinho de compras.
Simule o uso do carrinho de compras no método main.
Separe bem as responsabilidades de cada classe e a utilização do carrinho
de compra deve ser feito a partir do método main. Crie o diagrama de
classes da UML. */

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto p1 = new Produto("Sapato", 179.90, 1);
        Produto p2 = new Produto("Camisa", 74.90, 3);
        Produto p3 = new Produto("Meia", 14.90, 2);
        
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        carrinho.exibirCarrinho();
    }
}
