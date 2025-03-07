/*Escreva um programa em java que receba um inteiro. Realize a soma do
número 1 até o valor informado pelo usuário. Apresente o resultado em
tela. */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite o número final: ");
        int numFinal = scanner1.nextInt();
        int soma = 0;
        for (int x = 0; x <= numFinal; x++){
            soma = x + soma;
        }
        System.out.println("O resultado da soma dos números de 1 a " + numFinal + " é " + soma);
    }    
}
