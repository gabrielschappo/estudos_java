//Escreva um programa em java que receba um inteiro. Verifique se o valor
//é par ou ímpar

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int inteiro = scanner.nextInt();
        if (inteiro % 2 == 0){
            System.out.println("O número " + inteiro + " é par.");
        } else {
            System.out.println("O número " + inteiro + " é ímpar.");
        }
    }
}
