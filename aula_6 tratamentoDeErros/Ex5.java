/* Escreva um programa que receba um texto e realize a conversão para o
tipo double. Realize o tratamento de erro quando houver problemas na
conversão de tipos. */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String input = scanner.nextLine();

        try{
            double num = Double.parseDouble(input);
            System.out.println("Valor convertido para double: " + num);
        } catch (NumberFormatException e){
            System.out.println("Erro: Entrada inválida. Informe um número válido.");
        }
    }
}
