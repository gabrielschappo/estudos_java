/* Crie um metodo estatico para calcular o desconto baseado na quantidade de
produtos comprados. O metodo deve receber o valor unitario e a
quantidade de produtos. O metodo deve retornar o total da compra com o
valor de desconto aplicado, conforme a tabela abaixo. Crie os testes
unitarios para garantir a corretude do metodo.
Quantidade de Produtos | Desconto
1-5 | 5%
6-10 | 10%
> 11 | 15%
*/

public class Ex2 {
    public static double calcularDesconto(double valor, int quantidade){
        double valorTotal = valor * (double)quantidade;
        double percentual = 0.05;
        if (quantidade > 5 && quantidade < 11){
            percentual = 0.1;
        }else if (quantidade >= 11){
            percentual = 0.15;
        }
        return valorTotal - (valorTotal * percentual);
    }
}
