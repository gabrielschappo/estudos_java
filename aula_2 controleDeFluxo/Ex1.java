/*Escreva um programa em java que realize a soma dos números entre 1 e
1000. Utilize uma estrutura de repetição e apresente o resultado em tela. */

public class Ex1 {
    public static void main(String[] args) {
        int soma = 0;
        for (int x = 0; x <= 1000; x++) {
            soma = x + soma;
        }
        System.out.println("O resultado da soma de todos os números entre 1 e 1000 é: " + soma);
    }
}
