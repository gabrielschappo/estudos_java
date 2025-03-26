/* Escreva um programa que receba dois números e realize a divisão. Quando
ocorrer a divisão por zero, realize o tratamento e peça ao usuário digitar
novamente. */

import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numerador, denominador;
        System.out.print("Digite o numerador: ");
        numerador = scanner.nextDouble();
        while (true){
            System.out.print("Digite o denominador: ");
            denominador = scanner.nextDouble();
            if (denominador == 0){
                System.out.println("Erro: divisão por zero não é permitida. Digite um denominador diferente de zero.");
            }else{
                break;
            }
        }
        double resultado = numerador / denominador;
        System.out.println("Resultado da divisão: " + resultado);
    }
}