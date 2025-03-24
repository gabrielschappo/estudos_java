/*Escreva um programa que calcule a sequência Fibonacci solicitada pelo
usuário. */

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int prox = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Informe uma posição na sequência de fibonacci: ");
        int pos = scanner1.nextInt();
        for (int x = 0; x < pos; x++){
            System.out.print(num1 + " ");
            prox = num1 + num2;
            num1 = num2;
            num2 = prox;
        }
    }
}
