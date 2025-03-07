/*Escreva um programa em java que receba um número. O programa deve
encerrar quando o usuário informar -1. Caso contrário o programa deverá
pedir novamente um número. */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int x = 0;
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.print("Digite o valor correto: ");
            x = scanner1.nextInt();
        } while (x != -1);
        System.out.println("Valor correto digitado.");
    }
}
