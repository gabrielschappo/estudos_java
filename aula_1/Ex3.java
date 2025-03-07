//Escreva um programa em java que receba dois inteiros. Realize a divisão
//entre os números e apresente o resultado em tela. 

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int inteiro1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite outro número inteiro: ");
        int inteiro2 = scanner2.nextInt();
        int resultado = inteiro1 / inteiro2;
        System.out.println("O resultado da operação " + inteiro1 + "/" + inteiro2 + " é igual a: " + resultado);
    }
}
