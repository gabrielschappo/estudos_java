/*Escreva um programa que gere aleatóriamente um número ( por exemplo,
entre 1 e 10) e peça para o usuário adivinhar. O programa deve dizer se o
número informado pelo usuário é maior ou menor que o número sorteado.
O programa finaliza quando acaba as tentativas ou quando o usúario
acerta o número sorteado. Utilize a classe Random para sortear o número. */

import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        System.out.println(x);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você deve acertar o número aleatório de 1 a 10 em até 3 tentativas.");
        for (int y = 0; y < 3; y++) {
            System.out.println("Digite um número entre 1 e 10: ");
            int num = scanner.nextInt();
            if (num == x){
                System.out.println("Parabéns, você acertou!");
                break;
            }else if (y == 2){
                System.out.println("Fim das tentativas, você perdeu!");
            }else if (num > x){
                System.out.println("O número é menor.");
            }else{
                System.out.println("O número é maior.");
            }
        }

    }
}
