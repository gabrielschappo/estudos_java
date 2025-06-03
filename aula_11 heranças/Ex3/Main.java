package Ex3;

/* Implemente um sistema orientado a objetos para representar produtos
usando herança e sobrescrita por extensão. Crie uma classe base chamada Produto,
que contenha atributos como nome e preco, e um método exibirInfo() que exibe essas
informações básicas. Depois, crie pelo menos duas subclasses que representem tipos específicos de produtos, por exemplo:
• Livro, que possui informações como autor, número de páginas, capa dura, etc;
• Camisa, que possui informações cor, tamanho, material, etc.
Em cada subclasse, sobrescreva o método exibirInfo() para exibir as informações básicas
do produto (nome e preço) e, além disso, as informações extras específicas do tipo de
produto. Use a sobrescrita por extensão, ou seja, dentro do método sobrescrito chame
super.exibirInfo() para reaproveitar a exibição dos dados básicos antes de mostrar os
dados adicionais. No programa principal, crie objetos de cada tipo de produto e invoque
o método exibirInfo() para verificar a saída completa. Por fim, desenhe o diagrama de
classes UML, mostrando a relação de herança entre as classes. */

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto genérico", 15);
        Livro livro1 = new Livro("Livro O Pequeno Princípe", 28.50, "Antoine de Saint-Exupéry", 120);
        Camisa camisa1 = new Camisa("Camisa básica", 59.90, "G", "Branco");

        produto1.exibirInfo();
        livro1.exibirInfo();
        camisa1.exibirInfo();
    }    
}
